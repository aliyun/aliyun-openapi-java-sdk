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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListSLARulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSLARulesResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private List<SLARule> sLARuleList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<SLARule> getSLARuleList() {
		return this.sLARuleList;
	}

	public void setSLARuleList(List<SLARule> sLARuleList) {
		this.sLARuleList = sLARuleList;
	}

	public static class SLARule {

		private Long id;

		private Long dagId;

		private Long nodeId;

		private Integer ruleType;

		private Integer intervalMinutes;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getDagId() {
			return this.dagId;
		}

		public void setDagId(Long dagId) {
			this.dagId = dagId;
		}

		public Long getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(Long nodeId) {
			this.nodeId = nodeId;
		}

		public Integer getRuleType() {
			return this.ruleType;
		}

		public void setRuleType(Integer ruleType) {
			this.ruleType = ruleType;
		}

		public Integer getIntervalMinutes() {
			return this.intervalMinutes;
		}

		public void setIntervalMinutes(Integer intervalMinutes) {
			this.intervalMinutes = intervalMinutes;
		}
	}

	@Override
	public ListSLARulesResponse getInstance(UnmarshallerContext context) {
		return	ListSLARulesResponseUnmarshaller.unmarshall(this, context);
	}
}
