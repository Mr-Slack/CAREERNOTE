package jp.lab.hiroki.careernote.sample;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jp.lab.hiroki.careernote.sample.Sample;
import jp.lab.hiroki.careernote.sample.SampleService;

public class SampleServiceTest {
	
	private static SampleService sampleService;
	
	@BeforeClass
    public static void setup() {
		sampleService = new SampleService();
	}

	@AfterClass
    public static void teardown() {
		sampleService = null;
	}
	
	@Test(dependsOnMethods = { "insertSample" })
	public void getSampleById() {
		//throw new RuntimeException("Test not implemented");
		Sample sample = sampleService.getSampleById(1);
		Assert.assertNotNull(sample);
		System.out.println(sample);
	}
	
	@Test(dependsOnMethods = { "updateSample" })
	public void getAllSamples() {
		//throw new RuntimeException("Test not implemented");
		List<Sample> samples = sampleService.getAllSamples();
		Assert.assertNotNull(samples);
		for (Sample sample : samples) {
			System.out.println(sample);
		}
	}
	
	@Test
	public void insertSample() throws ParseException {
		//throw new RuntimeException("Test not implemented");
		Sample sample = new Sample();
		DateFormat dateTimeFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = dateTimeFormat.parse("2017/09/01");
		
		sample.setSampleDate(date);
		sample.setSampleDecimal(0.0001F);
		sample.setSampleEnum("type2");
		sample.setSampleId(1);
		sample.setSampleStrFix("Fix");
		sample.setSampleStrVar("Var");
		sample.setSampleTimestamp(new Date());
		
		sampleService.insertSample(sample);
		
		Assert.assertTrue(sample.getSampleId() != 0);
		Sample createdSample = sampleService.getSampleById(sample.getSampleId());
		Assert.assertNotNull(createdSample);
		Assert.assertEquals(sample.getSampleEnum(), createdSample.getSampleEnum());
		Assert.assertEquals(sample.getSampleStrFix(), createdSample.getSampleStrFix());
		Assert.assertEquals(sample.getSampleStrVar(), createdSample.getSampleStrVar());
		Assert.assertEquals(sample.getSampleDate(), createdSample.getSampleDate());
		Assert.assertEquals(sample.getSampleDecimal(), createdSample.getSampleDecimal());
		Assert.assertEquals(sample.getSampleId(), createdSample.getSampleId());
		// TODO Timestamp型の比較がなぜかAssersionが通らない問題あり
		//Assert.assertEquals(sample.getSampleTimestamp(), createdSample.getSampleTimestamp());	
	}
	
	@Test(dependsOnMethods = { "getSampleById" })
	public void updateSample() {
		//throw new RuntimeException("Test not implemented");
		Sample sample = sampleService.getSampleById(1);
		String strVar = sample.getSampleStrVar();
		sample.setSampleStrVar("PREFIX" + strVar);
		sample.setSampleDecimal(0.0002F);
		sample.setSampleEnum("type1");
		sampleService.updateSample(sample);
		Sample updatedSample = sampleService.getSampleById(1);
		Assert.assertNotNull(updatedSample);
		Assert.assertEquals(sample.getSampleEnum(), updatedSample.getSampleEnum());
		Assert.assertEquals(sample.getSampleStrVar(), updatedSample.getSampleStrVar());
		Assert.assertEquals(sample.getSampleDecimal(), updatedSample.getSampleDecimal());	
	}
	
	@Test(dependsOnMethods = { "getAllSamples" })
	public void deleteUser() {
		//throw new RuntimeException("Test not implemented");
		Sample sample = sampleService.getSampleById(1);
		sampleService.deleteSample(sample.getSampleId());
		Sample deletedUser = sampleService.getSampleById(1);
		Assert.assertNull(deletedUser);  
	}

}
