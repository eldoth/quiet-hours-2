package br.com.wakahashi.quiet_hours_2.impl;

import android.media.AudioManager;
import br.com.wakahashi.quiet_hours_2.service.NotificacoesService;

public class NotificacoesServiceImpl implements NotificacoesService {

	private AudioManager audioManager;

	@Override
	public void silenciarTudo() {
		this.silenciarAudio();
		this.silenciarFlash();
		this.silenciarLed();
		this.silenciarVibracao();
	}

	@Override
	public void silenciarAudio() {
		// TODO Auto-generated method stub

	}

	@Override
	public void silenciarLed() {
		// TODO Auto-generated method stub

	}

	@Override
	public void silenciarFlash() {
		//TEste para review do gerrit
		// TODO Auto-generated method stub

	}

	@Override
	public void silenciarVibracao() {
		audioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
	}

	public AudioManager getAudioManager() {
		return audioManager;
	}

	public void setAudioManager(AudioManager audioManager) {
		this.audioManager = audioManager;
	}

	@Override
	public void ligarTudo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ligarAudio() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ligarFlash() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ligarVibracao() {
		audioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
	}

}
