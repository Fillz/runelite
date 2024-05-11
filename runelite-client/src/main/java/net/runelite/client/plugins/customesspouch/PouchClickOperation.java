package net.runelite.client.plugins.customesspouch;

public class PouchClickOperation extends ClickOperation
{
	Pouch pouch;
	int delta;
	public PouchClickOperation(Pouch pouch, int tick, int delta)
	{
		super(tick);
		this.pouch = pouch;
		this.delta = delta;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof PouchClickOperation))
		{
			return false;
		}
		return ((PouchClickOperation) obj).pouch.equals(this.pouch);
	}

	@Override
	public int hashCode()
	{
		return this.pouch.hashCode();
	}
}
