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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.MethodType;
import org.apache.commons.codec.binary.Base64;

/**
 * @author auto create
 * @version 
 */
public class DeleteItemRequest extends RoaAcsRequest<DeleteItemResponse> {

	private String itemId;
	private List<String> pictureList;
	private String instanceName;
	
	public DeleteItemRequest() {
		super("ImageSearch", "2018-01-20", "DeleteItem");
		setUriPattern("/item/delete");
		setMethod(MethodType.POST);

		itemId = "";
		pictureList = new ArrayList<String>();
	}

	public void addPicture(String deletePictureName) {
		pictureList.add(deletePictureName);
	}

	public boolean buildPostContent() {
		if (itemId == null || itemId.length() == 0) {
			return false;
		}
		Map<String, String> kv = new HashMap<String, String>();
		kv.put("item_id", itemId);
		String picListStr = "";
		Base64 base64 = new Base64();
		for (String picName : pictureList) {
			if (picListStr != null && picListStr.length() > 0) {
				picListStr += ",";
			}
			picListStr += base64.encodeToString(picName.getBytes());
		}
		kv.put("pic_list", picListStr);

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

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("instanceName", instanceName);
		}
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public List<String> getPictureList() {
		return pictureList;
	}

	@Override
	public Class<DeleteItemResponse> getResponseClass() {
		return DeleteItemResponse.class;
	}

}
