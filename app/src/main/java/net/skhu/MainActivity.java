package net.skhu;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // 뷰 객체들로 액티버티를 채우는 것! 그 내용이 () 안에 있다!
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_signUp) {
            Toast.makeText(this, "회원가입 메뉴 클릭", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_memo) {
            Toast.makeText(this, "메모장 메뉴 클릭", Toast.LENGTH_LONG).show();
            return true;
        }else if (id == R.id.action_spinners) {
            Intent intent = new Intent(this, SpinnersActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
