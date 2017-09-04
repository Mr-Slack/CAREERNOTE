package jp.lab.hiroki.careernote.domain.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/**
 * アプリケーション設定ファイル（application-env.yml）ドメインクラス
 * 
 * @author HIROKI
 *
 */
@Component
public class ApplicationConfig {
	
	// @Valueアノテーションを用いることでSetterなしでもprivateフィールドへの
	// プロパティファイルからの自動代入が可能になる
	// TODO 現状サンプルソース状態
	@Value("${sample.arg1}")
	private String arg1;
	@Value("${sample.arg2}")
	private String arg2;
	
	public void testPrint() {
		System.out.println("arg1:" + arg1 + "arg2" + arg2);
	}
}
