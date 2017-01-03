package WhackAMole;

import GUIPractice.components.Action;
import GUIPractice.components.Clickable;

public interface moleInterface extends Clickable 
{
	int getAppearanceTime();

	void setAppearanceTime(int i);

	void setAction(Action action);
}
