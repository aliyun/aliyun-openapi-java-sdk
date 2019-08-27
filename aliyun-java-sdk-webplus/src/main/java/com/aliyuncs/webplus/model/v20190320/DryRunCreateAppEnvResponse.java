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

package com.aliyuncs.webplus.model.v20190320;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.webplus.transform.v20190320.DryRunCreateAppEnvResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DryRunCreateAppEnvResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private DryRunInfo dryRunInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public DryRunInfo getDryRunInfo() {
		return this.dryRunInfo;
	}

	public void setDryRunInfo(DryRunInfo dryRunInfo) {
		this.dryRunInfo = dryRunInfo;
	}

	public static class DryRunInfo {

		private List<Operation> operations;

		public List<Operation> getOperations() {
			return this.operations;
		}

		public void setOperations(List<Operation> operations) {
			this.operations = operations;
		}

		public static class Operation {

			private String operationType;

			private String operationDescription;

			public String getOperationType() {
				return this.operationType;
			}

			public void setOperationType(String operationType) {
				this.operationType = operationType;
			}

			public String getOperationDescription() {
				return this.operationDescription;
			}

			public void setOperationDescription(String operationDescription) {
				this.operationDescription = operationDescription;
			}
		}
	}

	@Override
	public DryRunCreateAppEnvResponse getInstance(UnmarshallerContext context) {
		return	DryRunCreateAppEnvResponseUnmarshaller.unmarshall(this, context);
	}
}
