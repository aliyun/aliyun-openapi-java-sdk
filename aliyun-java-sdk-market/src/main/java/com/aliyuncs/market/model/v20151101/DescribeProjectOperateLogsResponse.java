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

package com.aliyuncs.market.model.v20151101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.market.transform.v20151101.DescribeProjectOperateLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeProjectOperateLogsResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private List<ProjectMessage> result;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ProjectMessage> getResult() {
		return this.result;
	}

	public void setResult(List<ProjectMessage> result) {
		this.result = result;
	}

	public static class ProjectMessage {

		private Long gmtCreate;

		private Long operator;

		private String operatorRole;

		private String description;

		private String operatorName;

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getOperator() {
			return this.operator;
		}

		public void setOperator(Long operator) {
			this.operator = operator;
		}

		public String getOperatorRole() {
			return this.operatorRole;
		}

		public void setOperatorRole(String operatorRole) {
			this.operatorRole = operatorRole;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getOperatorName() {
			return this.operatorName;
		}

		public void setOperatorName(String operatorName) {
			this.operatorName = operatorName;
		}
	}

	@Override
	public DescribeProjectOperateLogsResponse getInstance(UnmarshallerContext context) {
		return	DescribeProjectOperateLogsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
