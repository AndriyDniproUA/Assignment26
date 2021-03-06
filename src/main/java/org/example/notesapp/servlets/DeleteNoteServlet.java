package org.example.notesapp.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.notesapp.services.NotesRepository;
import org.example.notesapp.services.UberFactory;

import java.io.IOException;

public class DeleteNoteServlet extends JsonServlet {
    private final NotesRepository repository = UberFactory.instance().getRepository();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //NoteDelete noteDelete = readJson(NoteDelete.class, req);
        repository.delete(Integer.valueOf(req.getParameter("id")));
        resp.sendRedirect(req.getContextPath()+"/");
    }
}

