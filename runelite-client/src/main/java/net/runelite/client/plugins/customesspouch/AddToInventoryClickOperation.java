package net.runelite.client.plugins.customesspouch;

public class AddToInventoryClickOperation extends ClickOperation
{
	int amount;
	public AddToInventoryClickOperation(int tick, int amount)
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
