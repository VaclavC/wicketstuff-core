package org.wicketstuff.egrid.component;

import org.apache.wicket.markup.repeater.Item;

public interface IItemRefreashable<T>
{	
	void refreash(Item<T> item);
}
