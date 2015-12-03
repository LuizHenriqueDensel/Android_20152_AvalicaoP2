package br.com.queropizza.queropizza;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class PrincipalActivity extends Activity {

	Button btentrar, btcadastrar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
		
		btcadastrar = (Button)
				findViewById(R.id.btcadastrar);
		
		btentrar = (Button)
				findViewById(R.id.btentrar);
		
		btcadastrar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent cadastra = new
				Intent(PrincipalActivity.this,CadastroActivity.class);
				PrincipalActivity.this.startActivity(cadastra);
				PrincipalActivity.this.finish();
				
			}
		});
		
        btentrar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent entra = new
				Intent(PrincipalActivity.this,CompraActivity.class);
				PrincipalActivity.this.startActivity(entra);
				PrincipalActivity.this.finish();
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.principal, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
