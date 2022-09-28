package MVC;

public class Controller {
    Model model;
    View view;
    public Controller(Model model,View view) {
        this.model = model;
        this.view = view;
    }
    public void start(){
        if(model.startProgram()){
            view.start();
        }
    }
    public void nextPage(){
        if(model.nextPageInBaseOfDate()){
            view.nextPages();
        }
    }
    public void previousPage(){
        if(model.takeStoryAndFindLastPage()){
            view.previousPages();
        }
    }
    public void exit(){
        if (model.exitFromProgram()){
            view.exits();
        }
    }
}
