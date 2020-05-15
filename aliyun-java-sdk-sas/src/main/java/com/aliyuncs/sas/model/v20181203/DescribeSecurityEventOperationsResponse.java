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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeSecurityEventOperationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSecurityEventOperationsResponse extends AcsResponse {

	private String requestId;

	private List<SecurityEventOperation> securityEventOperationsResponse;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SecurityEventOperation> getSecurityEventOperationsResponse() {
		return this.securityEventOperationsResponse;
	}

	public void setSecurityEventOperationsResponse(List<SecurityEventOperation> securityEventOperationsResponse) {
		this.securityEventOperationsResponse = securityEventOperationsResponse;
	}

	public static class SecurityEventOperation {

		private String operationCode;

		private String operationParams;

		private Boolean userCanOperate;

		public String getOperationCode() {
			return this.operationCode;
		}

		public void setOperationCode(String operationCode) {
			this.operationCode = operationCode;
		}

		public String getOperationParams() {
			return this.operationParams;
		}

		public void setOperationParams(String operationParams) {
			this.operationParams = operationParams;
		}

		public Boolean getUserCanOperate() {
			return this.userCanOperate;
		}

		public void setUserCanOperate(Boolean userCanOperate) {
			this.userCanOperate = userCanOperate;
		}
	}

	@Override
	public DescribeSecurityEventOperationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSecurityEventOperationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
