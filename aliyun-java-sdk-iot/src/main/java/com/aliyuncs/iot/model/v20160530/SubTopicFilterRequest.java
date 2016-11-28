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
package com.aliyuncs.iot.model.v20160530;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class SubTopicFilterRequest extends RpcAcsRequest<SubTopicFilterResponse> {
	
	public SubTopicFilterRequest() {
		super("Iot", "2016-05-30", "SubTopicFilter");
	}

	private List<String> topics;

	private Long productKey;

	private String subCallback;

	public List<String> getTopics() {
		return this.topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;	
		for (int i = 0; i < topics.size(); i++) {
			putQueryParameter("Topic." + (i + 1) , topics.get(i));
		}	
	}

	public Long getProductKey() {
		return this.productKey;
	}

	public void setProductKey(Long productKey) {
		this.productKey = productKey;
		putQueryParameter("ProductKey", productKey);
	}

	public String getSubCallback() {
		return this.subCallback;
	}

	public void setSubCallback(String subCallback) {
		this.subCallback = subCallback;
		putQueryParameter("SubCallback", subCallback);
	}

	@Override
	public Class<SubTopicFilterResponse> getResponseClass() {
		return SubTopicFilterResponse.class;
	}

}
