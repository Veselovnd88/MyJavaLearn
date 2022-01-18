package PlayingWClasses;

public interface Selectable {
	public default void onSelect() {
		System.out.println("Food is selected");
	}

}
