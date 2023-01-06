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

package com.aliyuncs.quotas.model.v20200510;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.quotas.transform.v20200510.ModifyQuotaTemplateServiceStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyQuotaTemplateServiceStatusResponse extends AcsResponse {

	private String requestId;

	private TemplateServiceStatus templateServiceStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public TemplateServiceStatus getTemplateServiceStatus() {
		return this.templateServiceStatus;
	}

	public void setTemplateServiceStatus(TemplateServiceStatus templateServiceStatus) {
		this.templateServiceStatus = templateServiceStatus;
	}

	public static class TemplateServiceStatus {

		private Integer serviceStatus;

		private String resourceDirectoryId;

		public Integer getServiceStatus() {
			return this.serviceStatus;
		}

		public void setServiceStatus(Integer serviceStatus) {
			this.serviceStatus = serviceStatus;
		}

		public String getResourceDirectoryId() {
			return this.resourceDirectoryId;
		}

		public void setResourceDirectoryId(String resourceDirectoryId) {
			this.resourceDirectoryId = resourceDirectoryId;
		}
	}

	@Override
	public ModifyQuotaTemplateServiceStatusResponse getInstance(UnmarshallerContext context) {
		return	ModifyQuotaTemplateServiceStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
