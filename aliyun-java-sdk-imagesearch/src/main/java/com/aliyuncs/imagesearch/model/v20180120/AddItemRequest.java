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
public class AddItemRequest extends RoaAcsRequest<AddItemResponse> {
	private String itemId;
	private String catId;
	private String custContent;
	private Map<String, String> picMap;
	private String instanceName;

	public AddItemRequest() {
		super("ImageSearch", "2018-01-20", "AddItem");
		setUriPattern("/item/add");
		setMethod(MethodType.POST);

		itemId = "";
		catId = "";
		custContent = "";
		picMap = new HashMap<String, String>();
	}

	public void addPicture(String picName, byte[] picContent) {
		Base64 base64 = new Base64();
		String encodePicName = base64.encodeToString(picName.getBytes());
		String encodePicContent = base64.encodeToString(picContent);
		picMap.put(encodePicName, encodePicContent);
	}

	public boolean buildPostContent() {
		Map<String, String> kv = new HashMap<String, String>();
		if (itemId == null || itemId.length() == 0
			|| catId == null || catId.length() == 0
			|| picMap.isEmpty()) {
			return false;
		}

		if (custContent == null) {
			custContent = "";
		}

		kv.put("item_id", itemId);
		kv.put("cat_id", catId);
		kv.put("cust_content", custContent);
		StringBuilder builder = new StringBuilder();
		for (Map.Entry<String, String> entry : picMap.entrySet()) {
			if (entry.getKey() == null || entry.getKey().length() == 0
				|| entry.getValue() == null || entry.getValue().length() == 0) {
				return false;
			}
			builder.append(entry.getKey());
			builder.append(",");
			kv.put(entry.getKey(), entry.getValue());
		}

		String picListStr = builder.toString();
		kv.put("pic_list", picListStr.substring(0, picListStr.length() - 1));

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
		return meta + "^" + body;
	}

	@Override
	public Class<AddItemResponse> getResponseClass() {
		return AddItemResponse.class;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getCatId() {
		return catId;
	}

	public void setCatId(String catId) {
		this.catId = catId;
	}

	public String getCustContent() {
		return custContent;
	}

	public void setCustContent(String custContent) {
		this.custContent = custContent;
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
}
