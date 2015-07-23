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
package com.aliyuncs.ons.model.v20150701;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class TopicGetRequest extends RpcAcsRequest<TopicGetResponse> {
	
	public TopicGetRequest() {
		super("Ons", "2015-07-01", "TopicGet");
	}

	private String onsRegionId;

	private String onsUserNick;

	private String producerId;

	private String topic;

	public String getOnsRegionId() {
		return this.onsRegionId;
	}

	public void setOnsRegionId(String onsRegionId) {
		this.onsRegionId = onsRegionId;
		putQueryParameter("OnsRegionId", onsRegionId);
	}

	public String getOnsUserNick() {
		return this.onsUserNick;
	}

	public void setOnsUserNick(String onsUserNick) {
		this.onsUserNick = onsUserNick;
		putQueryParameter("OnsUserNick", onsUserNick);
	}

	public String getProducerId() {
		return this.producerId;
	}

	public void setProducerId(String producerId) {
		this.producerId = producerId;
		putQueryParameter("ProducerId", producerId);
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
		putQueryParameter("Topic", topic);
	}

	@Override
	public Class<TopicGetResponse> getResponseClass() {
		return TopicGetResponse.class;
	}

}
