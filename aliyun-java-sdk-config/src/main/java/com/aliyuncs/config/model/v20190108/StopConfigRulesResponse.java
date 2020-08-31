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

package com.aliyuncs.config.model.v20190108;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.config.transform.v20190108.StopConfigRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class StopConfigRulesResponse extends AcsResponse {

	private String requestId;

	private OperateRuleResult operateRuleResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public OperateRuleResult getOperateRuleResult() {
		return this.operateRuleResult;
	}

	public void setOperateRuleResult(OperateRuleResult operateRuleResult) {
		this.operateRuleResult = operateRuleResult;
	}

	public static class OperateRuleResult {

		private List<OperateRuleItem> operateRuleItemList;

		public List<OperateRuleItem> getOperateRuleItemList() {
			return this.operateRuleItemList;
		}

		public void setOperateRuleItemList(List<OperateRuleItem> operateRuleItemList) {
			this.operateRuleItemList = operateRuleItemList;
		}

		public static class OperateRuleItem {

			private String configRuleId;

			private String errorCode;

			private Boolean success;

			public String getConfigRuleId() {
				return this.configRuleId;
			}

			public void setConfigRuleId(String configRuleId) {
				this.configRuleId = configRuleId;
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
		}
	}

	@Override
	public StopConfigRulesResponse getInstance(UnmarshallerContext context) {
		return	StopConfigRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
