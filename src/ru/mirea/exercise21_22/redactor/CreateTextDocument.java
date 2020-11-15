package ru.mirea.exercise21_22.redactor;

public class CreateTextDocument extends ICreateDocument{

    @Override
    IDocument CreateNew() {
        return new TextDocument();
    }

    @Override
    IDocument CreateOpen() {
        return new TextDocument();
    }
}
