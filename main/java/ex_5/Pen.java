package ex_5;


public class Pen {
    private Sheet sheet;

    public Pen(Sheet sheet) {
        this.sheet = sheet;
    }

    void addANote(String text){
        sheet.add(text);
    }

    void editingANote(int index, String text){
        sheet.edit(index, text);
    }

    void removeANote(int index){
        sheet.remove(index);
    }


}
