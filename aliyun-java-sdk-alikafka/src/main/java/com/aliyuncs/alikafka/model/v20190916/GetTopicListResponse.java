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

package com.aliyuncs.alikafka.model.v20190916;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alikafka.transform.v20190916.GetTopicListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTopicListResponse extends AcsResponse {

	private Integer currentPage;

	private String requestId;

	private Boolean success;

	private Integer code;

	private String message;

	private Integer pageSize;

	private Integer total;

	private List<TopicVO> topicList;

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<TopicVO> getTopicList() {
		return this.topicList;
	}

	public void setTopicList(List<TopicVO> topicList) {
		this.topicList = topicList;
	}

	public static class TopicVO {

		private Integer status;

		private Integer partitionNum;

		private String remark;

		private Long createTime;

		private String topic;

		private String statusName;

		private Boolean compactTopic;

		private String instanceId;

		private Boolean localTopic;

		private String regionId;

		private Boolean autoCreate;

		private String topicConfig;

		private List<TagVO> tags;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getPartitionNum() {
			return this.partitionNum;
		}

		public void setPartitionNum(Integer partitionNum) {
			this.partitionNum = partitionNum;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public String getStatusName() {
			return this.statusName;
		}

		public void setStatusName(String statusName) {
			this.statusName = statusName;
		}

		public Boolean getCompactTopic() {
			return this.compactTopic;
		}

		public void setCompactTopic(Boolean compactTopic) {
			this.compactTopic = compactTopic;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Boolean getLocalTopic() {
			return this.localTopic;
		}

		public void setLocalTopic(Boolean localTopic) {
			this.localTopic = localTopic;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Boolean getAutoCreate() {
			return this.autoCreate;
		}

		public void setAutoCreate(Boolean autoCreate) {
			this.autoCreate = autoCreate;
		}

		public String getTopicConfig() {
			return this.topicConfig;
		}

		public void setTopicConfig(String topicConfig) {
			this.topicConfig = topicConfig;
		}

		public List<TagVO> getTags() {
			return this.tags;
		}

		public void setTags(List<TagVO> tags) {
			this.tags = tags;
		}

		public static class TagVO {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public GetTopicListResponse getInstance(UnmarshallerContext context) {
		return	GetTopicListResponseUnmarshaller.unmarshall(this, context);
	}
}
