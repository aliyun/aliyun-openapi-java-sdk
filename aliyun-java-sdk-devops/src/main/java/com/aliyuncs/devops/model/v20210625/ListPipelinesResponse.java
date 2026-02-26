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

package com.aliyuncs.devops.model.v20210625;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.ListPipelinesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPipelinesResponse extends AcsResponse {

	private String requestId;

	private String errorMessage;

	private String errorCode;

	private Boolean success;

	private Long totalCount;

	private String nextToken;

	private List<Pipeline> pipelines;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<Pipeline> getPipelines() {
		return this.pipelines;
	}

	public void setPipelines(List<Pipeline> pipelines) {
		this.pipelines = pipelines;
	}

	public static class Pipeline {

		private String pipelineName;

		private Long pipelineId;

		private Long createTime;

		private String creatorAccountId;

		private Long groupId;

		public String getPipelineName() {
			return this.pipelineName;
		}

		public void setPipelineName(String pipelineName) {
			this.pipelineName = pipelineName;
		}

		public Long getPipelineId() {
			return this.pipelineId;
		}

		public void setPipelineId(Long pipelineId) {
			this.pipelineId = pipelineId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getCreatorAccountId() {
			return this.creatorAccountId;
		}

		public void setCreatorAccountId(String creatorAccountId) {
			this.creatorAccountId = creatorAccountId;
		}

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}
	}

	@Override
	public ListPipelinesResponse getInstance(UnmarshallerContext context) {
		return	ListPipelinesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
