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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ons.transform.v20150701.TopicGetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TopicGetResponse extends AcsResponse {

	private List<PublishInfoDo> data;

	public List<PublishInfoDo> getData() {
		return this.data;
	}

	public void setData(List<PublishInfoDo> data) {
		this.data = data;
	}

	public static class PublishInfoDo {

		private String requestId;

		private Long id;

		private String producerId;

		private String topic;

		private Integer channelId;

		private String channelName;

		private String owner;

		private Long userId;

		private String regionId;

		private String regionName;

		private Integer relation;

		private String relationName;

		private Integer status;

		private String statusName;

		private Long createTime;

		private Long updateTime;

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getProducerId() {
			return this.producerId;
		}

		public void setProducerId(String producerId) {
			this.producerId = producerId;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public Integer getChannelId() {
			return this.channelId;
		}

		public void setChannelId(Integer channelId) {
			this.channelId = channelId;
		}

		public String getChannelName() {
			return this.channelName;
		}

		public void setChannelName(String channelName) {
			this.channelName = channelName;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public Integer getRelation() {
			return this.relation;
		}

		public void setRelation(Integer relation) {
			this.relation = relation;
		}

		public String getRelationName() {
			return this.relationName;
		}

		public void setRelationName(String relationName) {
			this.relationName = relationName;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getStatusName() {
			return this.statusName;
		}

		public void setStatusName(String statusName) {
			this.statusName = statusName;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}
	}

	@Override
	public TopicGetResponse getInstance(UnmarshallerContext context) {
		return	TopicGetResponseUnmarshaller.unmarshall(this, context);
	}
}
