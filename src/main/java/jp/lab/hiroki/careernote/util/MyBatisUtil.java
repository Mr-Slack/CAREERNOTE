package jp.lab.hiroki.careernote.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * MyBatis用ユーティリティクラス
 * 
 * @author HIROKI
 *
 */
public class MyBatisUtil {

	private static SqlSessionFactory factory;
	
	// コンストラクタのprivate化=>シングルトンパターン
	private MyBatisUtil() {
	}

	// staticコンストラクタ
	// クラス生成時に一度のみprivateフィールドへの代入が行われる
	static {
		
		Reader reader = null;
		
		try {
			reader = Resources.getResourceAsReader("mybatis-config.xml");
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage());
		}
		factory = new SqlSessionFactoryBuilder().build(reader);
	}

	// publicなメソッドを介してのみfactoryフィールドの取得が可能
	// 再生成、変更は不可
	public static SqlSessionFactory getSqlSessionFactory() {
		return factory;
	}
}