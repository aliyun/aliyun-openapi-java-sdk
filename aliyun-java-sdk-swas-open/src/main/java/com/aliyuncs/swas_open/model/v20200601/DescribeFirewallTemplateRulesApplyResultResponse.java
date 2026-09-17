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

package com.aliyuncs.swas_open.model.v20200601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas_open.transform.v20200601.DescribeFirewallTemplateRulesApplyResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFirewallTemplateRulesApplyResultResponse extends AcsResponse {

	private String requestId;

	private List<InstanceApplyFirewallTemplateRulesResult> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstanceApplyFirewallTemplateRulesResult> getData() {
		return this.data;
	}

	public void setData(List<InstanceApplyFirewallTemplateRulesResult> data) {
		this.data = data;
	}

	public static class InstanceApplyFirewallTemplateRulesResult {

		private String port;

		private String sourceCidrIp;

		private String errorInfo;

		private String ruleProtocol;

		private String errorCode;

		private Boolean success;

		private String remark;

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getSourceCidrIp() {
			return this.sourceCidrIp;
		}

		public void setSourceCidrIp(String sourceCidrIp) {
			this.sourceCidrIp = sourceCidrIp;
		}

		public String getErrorInfo() {
			return this.errorInfo;
		}

		public void setErrorInfo(String errorInfo) {
			this.errorInfo = errorInfo;
		}

		public String getRuleProtocol() {
			return this.ruleProtocol;
		}

		public void setRuleProtocol(String ruleProtocol) {
			this.ruleProtocol = ruleProtocol;
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

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}
	}

	@Override
	public DescribeFirewallTemplateRulesApplyResultResponse getInstance(UnmarshallerContext context) {
		return	DescribeFirewallTemplateRulesApplyResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
