package command.queue;

import command.Command;

public class PollCommand extends Command {

	public PollCommand(Integer id, String content) {
		super(id, content);
	}
	
	@Override
	public String execute() {
		return "Poll node with id '" + getId() + "' and content '"
		+ getContent() + "'";
	}

	@Override
	public String undo() {
		return "Offer node with id '" + getId() + "' and content '"
		+ getContent() + "'";
	}

}