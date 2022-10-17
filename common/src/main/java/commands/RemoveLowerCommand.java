package commands;

import exeptions.IncorrectData;
import exeptions.EmptyElement;

/**
 * "remove_lower" command, remove elements which lower than current
 */
public class RemoveLowerCommand extends Command {




    @Override
    public CommandResult run(CommandEnvironment environment) throws EmptyElement, IncorrectData {

            if (environment.getCollectionManager().removeLower(environment.getSpaceMarine()))
                return new CommandResult("remove_lower","Объект удален",true);
            else
                return new CommandResult("remove_lower","Коллекция пуста",false);

    }
    @Override
    public String getName() {
        return "remove_lower";
    }

    @Override
    public String getDescription() {
        return "Удаляет все элементы коллекции меньше чем введенный";
    }
}
