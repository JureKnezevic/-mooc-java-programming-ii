
public class Program {

    public static void main(String[] args) {
        
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");
        
        dictionary.add("test", "test3");

        System.out.println(dictionary.translate("lie"));
        
        System.out.println(dictionary.translate("maata"));
        
        System.out.println(dictionary.translate("bow"));
        
        System.out.println(dictionary.translate("test"));
    }
}
