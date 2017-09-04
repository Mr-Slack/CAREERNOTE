package jp.lab.hiroki.careernote.sample;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import jp.lab.hiroki.careernote.util.MyBatisUtil;
/**
 * SampleテーブルCRUDクラス
 * 
 * @author HIROKI
 *
 */
public class SampleService {

	/**
	 * INSERT用メソッド
	 * 
	 * @param sample
	 */
	public void insertSample(Sample sample) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		
		try {
			SampleMapper sampleMapper = sqlSession.getMapper(SampleMapper.class);
			sampleMapper.insert(sample);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}

	/**
	 * SELECT用メソッド(Key検索)
	 * 
	 * 
	 */
	public Sample getSampleById(Integer sampleId) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			SampleMapper sampleMapper = sqlSession.getMapper(SampleMapper.class);
			return sampleMapper.selectByPrimaryKey(sampleId);
		} finally {
			sqlSession.close();
		}
	}
	
	/**
	 * SELECT用メソッド(WHERE区なし)
	 * 
	 * 
	 */
	public List<Sample> getAllSamples() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			SampleMapper sampleMapper = sqlSession.getMapper(SampleMapper.class);
			return sampleMapper.selectAll();
		} finally {
			sqlSession.close();
		}
	}
	
	/**
	 * UPDATE用メソッド
	 * 
	 * @param sample
	 */
	public void updateSample(Sample sample) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			SampleMapper sampleMapper = sqlSession.getMapper(SampleMapper.class);
			sampleMapper.updateByPrimaryKey(sample);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}

	/**
	 * DELETE用メソッド
	 * 
	 * @param sampleId
	 */
	public void deleteSample(Integer sampleId) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			SampleMapper sampleMapper = sqlSession.getMapper(SampleMapper.class);
			sampleMapper.deleteByPrimaryKey(sampleId);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}

}
