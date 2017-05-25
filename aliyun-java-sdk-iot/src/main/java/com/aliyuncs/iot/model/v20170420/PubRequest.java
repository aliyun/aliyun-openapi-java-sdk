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
package com.aliyuncs.iot.model.v20170420;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class PubRequest extends RpcAcsRequest<PubResponse> {
	
	public PubRequest() {
		super("Iot", "2017-04-20", "Pub");
	}

	private String productKey;

	private Integer qos;

	private String topicFullName;

	private String messageContent;

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		putQueryParameter("ProductKey", productKey);
	}

	public Integer getQos() {
		return this.qos;
	}

	public void setQos(Integer qos) {
		this.qos = qos;
		putQueryParameter("Qos", qos);
	}

	public String getTopicFullName() {
		return this.topicFullName;
	}

	public void setTopicFullName(String topicFullName) {
		this.topicFullName = topicFullName;
		putQueryParameter("TopicFullName", topicFullName);
	}

	public String getMessageContent() {
		return this.messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
		putQueryParameter("MessageContent", messageContent);
	}

	@Override
	public Class<PubResponse> getResponseClass() {
		return PubResponse.class;
	}

}
