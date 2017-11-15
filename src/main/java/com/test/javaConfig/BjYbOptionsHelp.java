package com.test.javaConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class BjYbOptionsHelp {
	
	private Map<String, String> doseJson;// AKA070
	
	public BjYbOptionsHelp() {
		this.readYbDose();
	}

	/**
	 * @Description:读取北京医保剂型字典信息
	 * @author:王开�?
	 * @date:2017�?11�?15�?
	 */
	private void readYbDose() {
		InputStream resource = BjYbOptionsHelp.class.getResourceAsStream("AKA070.txt");
		BufferedReader buffer = null;
		try {
			buffer = new BufferedReader(new InputStreamReader(resource,"UTF-8"));
			String line = null;
			while ((line = buffer.readLine()) != null) {
				String ss[] = line.split("$");
				if (ss.length < 2) {
					continue;
				}
				String key = ss[0];
				String value = ss[1];
				this.doseJson.put(key, value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (buffer != null) {
				try {
					buffer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public String getKeyValue(String key) {
		if (doseJson == null) {
			return "";
		}
		String value = doseJson.get(key);
		System.out.println("��ȡ�ļ�====value:" + value);
		return value;
	}
	
}
