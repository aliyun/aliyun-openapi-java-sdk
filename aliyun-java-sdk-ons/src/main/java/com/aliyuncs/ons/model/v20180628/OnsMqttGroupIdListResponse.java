/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ons.model.v20180628;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ons.transform.v20180628.OnsMqttGroupIdListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OnsMqttGroupIdListResponse extends AcsResponse {

	private String requestId;

	private String helpUrl;

	private List<MqttGroupIdDo> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHelpUrl() {
		return this.helpUrl;
	}

	public void setHelpUrl(String helpUrl) {
		this.helpUrl = helpUrl;
	}

	public List<MqttGroupIdDo> getData() {
		return this.data;
	}

	public void setData(List<MqttGroupIdDo> data) {
		this.data = data;
	}

	public static class MqttGroupIdDo {

		private Long id;

		private Integer channelId;

		private String owner;

		private String groupId;

		private String topic;

		private Integer status;

		private Long createTime;

		private Long updateTime;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Integer getChannelId() {
			return this.channelId;
		}

		public void setChannelId(Integer channelId) {
			this.channelId = channelId;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
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
	public OnsMqttGroupIdListResponse getInstance(UnmarshallerContext context) {
		return	OnsMqttGroupIdListResponseUnmarshaller.unmarshall(this, context);
	}
}
