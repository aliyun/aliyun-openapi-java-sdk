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
package com.aliyuncs.cloudphoto.model.v20170711;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class ListRegisteredTagsRequest extends RpcAcsRequest<ListRegisteredTagsResponse> {
	
	public ListRegisteredTagsRequest() {
		super("CloudPhoto", "2017-07-11", "ListRegisteredTags", "cloudphoto");
		setProtocol(ProtocolType.HTTPS);
	}

	private String storeName;

	private List<String> langs;

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
		if(storeName != null){
			putQueryParameter("StoreName", storeName);
		}
	}

	public List<String> getLangs() {
		return this.langs;
	}

	public void setLangs(List<String> langs) {
		this.langs = langs;	
		if (langs != null) {
			for (int i = 0; i < langs.size(); i++) {
				putQueryParameter("Lang." + (i + 1) , langs.get(i));
			}
		}	
	}

	@Override
	public Class<ListRegisteredTagsResponse> getResponseClass() {
		return ListRegisteredTagsResponse.class;
	}

}
