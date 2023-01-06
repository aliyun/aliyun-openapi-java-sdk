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
import com.aliyuncs.ims.transform.v20190815.UpdateSAMLProviderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateSAMLProviderResponse extends AcsResponse {

	private String requestId;

	private SAMLProvider sAMLProvider;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SAMLProvider getSAMLProvider() {
		return this.sAMLProvider;
	}

	public void setSAMLProvider(SAMLProvider sAMLProvider) {
		this.sAMLProvider = sAMLProvider;
	}

	public static class SAMLProvider {

		private String updateDate;

		private String description;

		private String sAMLProviderName;

		private String createDate;

		private String arn;

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSAMLProviderName() {
			return this.sAMLProviderName;
		}

		public void setSAMLProviderName(String sAMLProviderName) {
			this.sAMLProviderName = sAMLProviderName;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getArn() {
			return this.arn;
		}

		public void setArn(String arn) {
			this.arn = arn;
		}
	}

	@Override
	public UpdateSAMLProviderResponse getInstance(UnmarshallerContext context) {
		return	UpdateSAMLProviderResponseUnmarshaller.unmarshall(this, context);
	}
}
