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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ims.transform.v20190815.ListAppSecretIdsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAppSecretIdsResponse extends AcsResponse {

	private String requestId;

	private List<AppSecret> appSecrets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AppSecret> getAppSecrets() {
		return this.appSecrets;
	}

	public void setAppSecrets(List<AppSecret> appSecrets) {
		this.appSecrets = appSecrets;
	}

	public static class AppSecret {

		private String appId;

		private String appSecretId;

		private String createDate;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getAppSecretId() {
			return this.appSecretId;
		}

		public void setAppSecretId(String appSecretId) {
			this.appSecretId = appSecretId;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}
	}

	@Override
	public ListAppSecretIdsResponse getInstance(UnmarshallerContext context) {
		return	ListAppSecretIdsResponseUnmarshaller.unmarshall(this, context);
	}
}
