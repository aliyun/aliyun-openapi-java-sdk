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

package com.aliyuncs.tag.model.v20180828;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.tag.transform.v20180828.GetPolicyEnableStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPolicyEnableStatusResponse extends AcsResponse {

	private String requestId;

	private List<StatusModelsItem> statusModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<StatusModelsItem> getStatusModels() {
		return this.statusModels;
	}

	public void setStatusModels(List<StatusModelsItem> statusModels) {
		this.statusModels = statusModels;
	}

	public static class StatusModelsItem {

		private String userType;

		private String status;

		public String getUserType() {
			return this.userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public GetPolicyEnableStatusResponse getInstance(UnmarshallerContext context) {
		return	GetPolicyEnableStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
