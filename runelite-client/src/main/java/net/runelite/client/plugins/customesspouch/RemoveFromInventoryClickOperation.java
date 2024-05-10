package net.runelite.client.plugins.customesspouch;

public class RemoveFromInventoryClickOperation extends ClickOperation
{
	int amount;
	public RemoveFromInventoryClickOperation(int tick, int amount)
	{
		super(tick);
		this.amount = amount;
	}

	@Override
	public boolean equals(Object obj)
	{
		return obj instanceof AddToInventoryClickOperation;
	}

	@Override
	public int hashCode()
	{
		return this.getClass().hashCode();
	}
}
