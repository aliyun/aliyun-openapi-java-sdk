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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.ListCoverPipelineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCoverPipelineResponse extends AcsResponse {

	private Long totalCount;

	private Long pageSize;

	private String requestId;

	private Long pageNumber;

	private List<Pipeline> pipelineList;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Pipeline> getPipelineList() {
		return this.pipelineList;
	}

	public void setPipelineList(List<Pipeline> pipelineList) {
		this.pipelineList = pipelineList;
	}

	public static class Pipeline {

		private String state;

		private Integer quotaNum;

		private Long userId;

		private String notifyConfig;

		private String extendConfig;

		private String priority;

		private String role;

		private String name;

		private String pipelineId;

		private Integer quotaUsed;

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Integer getQuotaNum() {
			return this.quotaNum;
		}

		public void setQuotaNum(Integer quotaNum) {
			this.quotaNum = quotaNum;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getNotifyConfig() {
			return this.notifyConfig;
		}

		public void setNotifyConfig(String notifyConfig) {
			this.notifyConfig = notifyConfig;
		}

		public String getExtendConfig() {
			return this.extendConfig;
		}

		public void setExtendConfig(String extendConfig) {
			this.extendConfig = extendConfig;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPipelineId() {
			return this.pipelineId;
		}

		public void setPipelineId(String pipelineId) {
			this.pipelineId = pipelineId;
		}

		public Integer getQuotaUsed() {
			return this.quotaUsed;
		}

		public void setQuotaUsed(Integer quotaUsed) {
			this.quotaUsed = quotaUsed;
		}
	}

	@Override
	public ListCoverPipelineResponse getInstance(UnmarshallerContext context) {
		return	ListCoverPipelineResponseUnmarshaller.unmarshall(this, context);
	}
}
