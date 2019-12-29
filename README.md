# SimpleDataBindingExwithEventListeners
Databinding with event listeners 

this can be acheived using inner class 
handlers = new MainActivityHandlers(this);
        mainBinding.setClickHandler(handlers);
        
public class MainActivityHandlers{
        Context context;

        public MainActivityHandlers(Context context) {
            this.context = context;
        }

        public void onEnrollButtonClicked(View view){
            Toast.makeText(context, "Enroll Button Clicked", Toast.LENGTH_SHORT).show();
        }

        public void onCancelButtonClicked(View view){
            Toast.makeText(context, "Cancel Button Clicked", Toast.LENGTH_SHORT).show();
        }
    }
    
    <layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools">
    <data>
        <variable
            name="student"
            type="com.gokul.tut.simpledatabindingex.Student" />
        <variable
            name="clickHandler"
            type="com.gokul.tut.simpledatabindingex.MainActivity.MainActivityHandlers" />
    </data>
    
    
    android:onClick="@{clickHandler::onCancelButtonClicked}"
