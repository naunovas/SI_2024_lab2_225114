import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

class SILab2Test {

    @Test
    void EveryBranch() {
        RuntimeException except = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 100));
        assertTrue(except.getMessage().contains("allItems list can't be null!"));

        List<Item> items = new ArrayList<>();
        items.add(new Item("", "023456", 100, 0.1f));
        SILab2.checkCart(items, 100);
        assertEquals("unknown", items.get(0).getName());

        items = new ArrayList<>();
        items.add(new Item("Item1", null, 100, 0.1f));
        List<Item> finalItems = items;
        except = assertThrows(RuntimeException.class, () -> SILab2.checkCart(finalItems, 100));
        assertTrue(except.getMessage().contains("No barcode!"));

        items = new ArrayList<>();
        items.add(new Item("Item1", "123a456", 100, 0.1f));
        List<Item> finalItems1 = items;
        except = assertThrows(RuntimeException.class, () -> SILab2.checkCart(finalItems1, 100));
        assertTrue(except.getMessage().contains("Invalid character in item barcode!"));

        items = new ArrayList<>();
        items.add(new Item("Item1", "023456", 100, -0.1f));
        boolean result = SILab2.checkCart(items, 100);
        assertTrue(result);
    }

    @Test
    void MultipleCondition() {
        /*  if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0').

T T T -> koga price>300 discount>0 charAt(0)=='0'
F T T -> koga price<300 discount>0 charAt(0)=='0'
T F T -> koga price>300 discount<0 charAt(0)=='0'
T T F -> koga price>300 discount>0 charAt(0)=!'0'
T F F -> koga price>300 discount<0 charAt(0)=!'0'
F T F -> koga price<300 discount>0 charAt(0)=!'0'
F F T -> koga price<300 discount<0 charAt(0)=='0'
F F F -> koga price<300 discount<0 charAt(0)=!'0' */
        List<Item> items;
        boolean result;

        items = new ArrayList<>();
        items.add(new Item("Item1", "012345", 350, 0.1f));
        result = SILab2.checkCart(items, 300);
        assertTrue(result);

        items = new ArrayList<>();
        items.add(new Item("Item1", "012345", 250, 0.1f));
        result = SILab2.checkCart(items, 300);
        assertTrue(result);

        items = new ArrayList<>();
        items.add(new Item("Item1", "012345", 350, 0.0f));
        result = SILab2.checkCart(items, 300);
        assertFalse(result);

        items = new ArrayList<>();
        items.add(new Item("Item1", "112345", 350, 0.1f));
        result = SILab2.checkCart(items, 300);
        assertFalse(result);


        items = new ArrayList<>();
        items.add(new Item("Item1", "112345", 350, 0.0f));
        result = SILab2.checkCart(items, 300);
        assertFalse(result);

        items = new ArrayList<>();
        items.add(new Item("Item1", "112345", 250, 0.1f));
        result = SILab2.checkCart(items, 300);
        assertTrue(result);

        items = new ArrayList<>();
        items.add(new Item("Item1", "012345", 250, 0.0f));
        result = SILab2.checkCart(items, 300);
        assertTrue(result);


        items = new ArrayList<>();
        items.add(new Item("Item1", "112345", 250, 0.0f));
        result = SILab2.checkCart(items, 300);
        assertTrue(result);
    }
}
