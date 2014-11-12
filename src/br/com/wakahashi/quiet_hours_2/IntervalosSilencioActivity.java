package br.com.wakahashi.quiet_hours_2;

import br.com.wakahashi.quiet_hours_2.impl.NotificacoesServiceImpl;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class IntervalosSilencioActivity extends Activity {
	
	private NotificacoesServiceImpl notificacoesServiceImpl;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_intervalos_silencio);
		
		notificacoesServiceImpl = new NotificacoesServiceImpl();
		notificacoesServiceImpl.setAudioManager((AudioManager) this.getSystemService(Context.AUDIO_SERVICE));
		
		Button botaoLigar = (Button) findViewById(R.id.botao_volume_max);
		botaoLigar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				notificacoesServiceImpl.ligarVibracao();
			}
		});
		
		
		Button botaoSilenciar = (Button) findViewById(R.id.botao_volume_min);
		botaoSilenciar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				notificacoesServiceImpl.silenciarVibracao();
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.intervalos_silencio, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
