package com.roywmiller.contacts.actions;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.roywmiller.contacts.model.Contact;
import com.roywmiller.contacts.model.ContactsUser;

public class EditContactAction implements Action {
	private Contact contact;

	public String perform(HttpServletRequest request,
			HttpServletResponse response) {
		int contactId = Integer.parseInt(request.getParameter("id"));
		HttpSession session = request.getSession();
		ContactsUser user = (ContactsUser) session.getAttribute("user");
		List contactList = user.getContacts();
		Iterator iterator = contactList.iterator();
		while (iterator.hasNext()) {
			Contact contact = (Contact) iterator.next();
			if (contact.getId() == contactId) {
				this.contact = contact;
			}
		}
		// TODO
		return "/edit.jsp";
	}

	public Contact getContact() {
		return this.contact;
	}
}
