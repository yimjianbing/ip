package src.commands;

import src.exceptions.DukeException;
import src.Storage;
import src.TaskList;
import src.Ui;

public abstract class Command {

    private boolean isExit = false;
    private String input = "";

    public Command(boolean isActive, String input) {
        this.isExit = isExit;
        this.input = input;
    }
    public abstract void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException;

    public boolean isExit() {
        return isExit;
    }

    public void setIsExit(boolean isExit) {
        this.isExit = isExit;
    }

    public String getInput() {
        return input;
    }
}
