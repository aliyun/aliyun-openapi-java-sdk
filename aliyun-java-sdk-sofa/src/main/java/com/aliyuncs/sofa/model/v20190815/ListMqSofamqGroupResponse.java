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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.ListMqSofamqGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMqSofamqGroupResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String requestId;

	private Data data;

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long pageNum;

		private Long pageSize;

		private Long total;

		private List<ContentItem> content;

		public Long getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Long pageNum) {
			this.pageNum = pageNum;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<ContentItem> getContent() {
			return this.content;
		}

		public void setContent(List<ContentItem> content) {
			this.content = content;
		}

		public static class ContentItem {

			private Long retryPerm;

			private String cluster;

			private String remark;

			private String instanceId;

			private Long gmtModified;

			private Long retryWriteQueueNum;

			private String deleteMark;

			private String groupId;

			private Long version;

			private Long gmtCreate;

			private Long retryReadQueueNum;

			private String scope;

			private String operator;

			private String groupType;

			private Boolean readEnable;

			private Long id;

			public Long getRetryPerm() {
				return this.retryPerm;
			}

			public void setRetryPerm(Long retryPerm) {
				this.retryPerm = retryPerm;
			}

			public String getCluster() {
				return this.cluster;
			}

			public void setCluster(String cluster) {
				this.cluster = cluster;
			}

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Long getRetryWriteQueueNum() {
				return this.retryWriteQueueNum;
			}

			public void setRetryWriteQueueNum(Long retryWriteQueueNum) {
				this.retryWriteQueueNum = retryWriteQueueNum;
			}

			public String getDeleteMark() {
				return this.deleteMark;
			}

			public void setDeleteMark(String deleteMark) {
				this.deleteMark = deleteMark;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public Long getVersion() {
				return this.version;
			}

			public void setVersion(Long version) {
				this.version = version;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getRetryReadQueueNum() {
				return this.retryReadQueueNum;
			}

			public void setRetryReadQueueNum(Long retryReadQueueNum) {
				this.retryReadQueueNum = retryReadQueueNum;
			}

			public String getScope() {
				return this.scope;
			}

			public void setScope(String scope) {
				this.scope = scope;
			}

			public String getOperator() {
				return this.operator;
			}

			public void setOperator(String operator) {
				this.operator = operator;
			}

			public String getGroupType() {
				return this.groupType;
			}

			public void setGroupType(String groupType) {
				this.groupType = groupType;
			}

			public Boolean getReadEnable() {
				return this.readEnable;
			}

			public void setReadEnable(Boolean readEnable) {
				this.readEnable = readEnable;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}
		}
	}

	@Override
	public ListMqSofamqGroupResponse getInstance(UnmarshallerContext context) {
		return	ListMqSofamqGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
