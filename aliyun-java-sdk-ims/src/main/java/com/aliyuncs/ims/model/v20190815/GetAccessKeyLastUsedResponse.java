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

package com.aliyuncs.ims.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ims.transform.v20190815.GetAccessKeyLastUsedResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAccessKeyLastUsedResponse extends AcsResponse {

	private String requestId;

	private AccessKeyLastUsed accessKeyLastUsed;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AccessKeyLastUsed getAccessKeyLastUsed() {
		return this.accessKeyLastUsed;
	}

	public void setAccessKeyLastUsed(AccessKeyLastUsed accessKeyLastUsed) {
		this.accessKeyLastUsed = accessKeyLastUsed;
	}

	public static class AccessKeyLastUsed {

		private String lastUsedDate;

		private String serviceName;

		public String getLastUsedDate() {
			return this.lastUsedDate;
		}

		public void setLastUsedDate(String lastUsedDate) {
			this.lastUsedDate = lastUsedDate;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}
	}

	@Override
	public GetAccessKeyLastUsedResponse getInstance(UnmarshallerContext context) {
		return	GetAccessKeyLastUsedResponseUnmarshaller.unmarshall(this, context);
	}
}
