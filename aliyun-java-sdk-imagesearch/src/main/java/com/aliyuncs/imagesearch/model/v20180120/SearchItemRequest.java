/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.imagesearch.model.v20180120;

import java.util.HashMap;
import java.util.Map;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.MethodType;
import org.apache.commons.codec.binary.Base64;

/**
 * @author auto create
 * @version 
 */
public class SearchItemRequest extends RoaAcsRequest<SearchItemResponse> {

	private int start;
	private int num;
	private String catId;
	private byte[] searchPicture;
	private String instanceName;


	public SearchItemRequest() {
		super("ImageSearch", "2018-01-20", "SearchItem");
		setUriPattern("/item/search");
		setMethod(MethodType.POST);

		start = 0;
		num = 10;
		catId = "";
	}

	public void setSearchPicture(byte[] searchPicture) {
		this.searchPicture = searchPicture;
	}

	public boolean buildPostContent() {
		if (searchPicture.length == 0) {
			return false;
		}

		Map<String, String> kv = new HashMap<String, String>();

		kv.put("s", String.valueOf(start));
		kv.put("n", String.valueOf(num));
		if (catId != null && catId.length() > 0) {
			kv.put("cat_id", catId);
		}

		Base64 base64 = new Base64();
		String encodePicName = base64.encodeToString("searchPic".getBytes());
		String encodePicContent = base64.encodeToString(searchPicture);

		kv.put("pic_list", encodePicName);
		kv.put(encodePicName, encodePicContent);

		String content = buildContent(kv);
		setHttpContent(content.getBytes(), "UTF-8", FormatType.RAW);
		setAcceptFormat(FormatType.JSON);

		return true;
	}

	private static String buildContent(Map<String, String> kv) {
		String meta = "";
		String body = "";
		int start = 0;
		for (Map.Entry<String, String> entry : kv.entrySet()) {
			String value = entry.getValue();
			if (meta.length() > 0) {
				meta += "#";
			}
			meta += entry.getKey() + "," + String.valueOf(start) + "," + String.valueOf(start + value.length());
			body += value;
			start += value.length();
		}
		System.out.println(meta);
		//System.out.println(body);
		return meta + "^" + body;
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("instanceName", instanceName);
		}
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCatId() {
		return catId;
	}

	public void setCatId(String catId) {
		this.catId = catId;
	}

	public byte[] getSearchPicture() {
		return searchPicture;
	}

	@Override
	public Class<SearchItemResponse> getResponseClass() {
		return SearchItemResponse.class;
	}

}
