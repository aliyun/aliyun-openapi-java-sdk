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
package com.aliyuncs.iot.model.v20170620;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PubBroadcastRequest extends RoaAcsRequest<PubBroadcastResponse> {
	
	public PubBroadcastRequest() {
		super("Iot", "2017-06-20", "PubBroadcast");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/pubBroadcast/[ProductKey]");
		setMethod(MethodType.POST);
	}

	private String productKey;

	private String topicFullName;

	private String messageContent;

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		putPathParameter("ProductKey", productKey);
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
	public Class<PubBroadcastResponse> getResponseClass() {
		return PubBroadcastResponse.class;
	}

}
