package com.wust.sharding.utils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * 解析JSON格式数据
 * 
 * @author Pactera
 *
 */
@Slf4j
public class JsonUtil {

	/**
	 * 以Map类型解析JSON
	 *
	 * @param jsonString
	 *            JSON格式字符串
	 * @return Map对象
	 */
	public static Map<String, Object> getJsonFromString(String jsonString) {
		Map<String, Object> jsonObj = null;
		if ( StringUtil.isNotBlank(jsonString)) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				jsonObj = mapper.readValue(jsonString, Map.class);
			} catch (IOException e) {
				log.error("JsonUtil(getJsonFromString) Error:" + e.toString());
			}
		}
		return jsonObj;
	}

	/**
	 * 以List类型解析JSON
	 *
	 * @param jsonString
	 *            JSON格式字符串
	 * @return List对象
	 */
	public static List getJsonListFromString(String jsonString) {
		List jsonObj = null;
		if (StringUtil.isNotBlank(jsonString)) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				jsonObj = mapper.readValue(jsonString, List.class);
			} catch (IOException e) {
				//log.error("JsonUtil(getJsonListFromString) error:" + e.toString());
			}
		}
		return jsonObj;
	}

	/**
	 * 以Object类型解析JSON
	 * 
	 * @param jsonString
	 *            JSON格式字符串
	 * @return Object对象
	 */
	public static Object getJsonObject(String jsonString) {
		Object jsonObj = null;
		ObjectMapper mapper = new ObjectMapper();
		try {
			jsonObj = mapper.readValue(jsonString, Object.class);
		} catch (IOException e) {
			//log.error("JsonUtil(getJsonObject) error:" + e.toString());
		}
		return jsonObj;
	}


	/**
	 * 将json字符串转换成javabean对象
	 * 
	 * @param jsonString
	 *            要转换的json字符串
	 * @param classname
	 *            javabean的classname
	 * @return javabean对象
	 */
	public static Object getBeanFromJson(String jsonString, Class<?> classname) {
		Object result = "";
		ObjectMapper mapper = new ObjectMapper();
		try {
			result = mapper.readValue(jsonString, classname);
		} catch (JsonParseException e) {
			//log.error(e);
		} catch (JsonMappingException e) {
			//log.error(e);
		} catch (IOException e) {
			//log.error(e);
		}
		return result;
	}

	/**
	 * 将javabean对象转换成json字符串
	 * 
	 * @param javaBean
	 *            javaBean对象
	 * @return JSON格式字符串
	 */
	public static String getJsonFromBean(Object javaBean) {
		String result = "";
		ObjectMapper mapper = new ObjectMapper();
		try {
			result = mapper.writeValueAsString(javaBean);
		} catch (JsonProcessingException e) {
			//log.error(e);
		}
		return result;
	}

	/**
	 * 将json字符串转换成boolean
	 * @return JSON格式字符串
	 */
	public static boolean getBooleanFromJson(String jsonString) {
		boolean result = false;
		ObjectMapper mapper = new ObjectMapper();
		try {
			result = mapper.readValue(jsonString, Boolean.class);
		} catch (JsonParseException e) {
			//log.error(e);
		} catch (JsonMappingException e) {
			//log.error(e);
		} catch (IOException e) {
			//log.error(e);
		}
		return result;
	}

}
