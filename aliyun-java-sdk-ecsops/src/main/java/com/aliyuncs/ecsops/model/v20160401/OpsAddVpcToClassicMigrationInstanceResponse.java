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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsAddVpcToClassicMigrationInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsAddVpcToClassicMigrationInstanceResponse extends AcsResponse {

	private String requestId;

	private List<FailModelsItem> failModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FailModelsItem> getFailModels() {
		return this.failModels;
	}

	public void setFailModels(List<FailModelsItem> failModels) {
		this.failModels = failModels;
	}

	public static class FailModelsItem {

		private String instanceId;

		private List<Reason> reasons;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public List<Reason> getReasons() {
			return this.reasons;
		}

		public void setReasons(List<Reason> reasons) {
			this.reasons = reasons;
		}

		public static class Reason {

			private String errorMessage;

			private String errorCode;

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
		}
	}

	@Override
	public OpsAddVpcToClassicMigrationInstanceResponse getInstance(UnmarshallerContext context) {
		return	OpsAddVpcToClassicMigrationInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
