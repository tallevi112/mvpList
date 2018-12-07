package paket.talerez.mvpexample.Presenter;

import paket.talerez.mvpexample.Model.User;

public class MainActivityPresenter  {

    private User user;
    private View view;

    public MainActivityPresenter(View view) {
        this.user = new User();
        this.view = view;
    }

    public void updateFullName(String fullName)
    {
            user.setFullName(fullName);
    }

    public void updateEmail(String emailc)
    {
        user.setEmail(emailc);
        view.updateUserInfoTextView(emailc);

    }


    public interface View{

        void updateUserInfoTextView(String info);
        void showProgressBar();
        void hideProgressBar();

    }
}
