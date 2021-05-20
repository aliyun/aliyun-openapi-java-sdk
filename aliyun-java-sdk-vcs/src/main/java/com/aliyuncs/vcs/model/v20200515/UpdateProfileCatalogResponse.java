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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.UpdateProfileCatalogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateProfileCatalogResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String parentCatalogId;

		private Long profileCount;

		private String isvSubId;

		private String catalogName;

		private Long catalogId;

		public String getParentCatalogId() {
			return this.parentCatalogId;
		}

		public void setParentCatalogId(String parentCatalogId) {
			this.parentCatalogId = parentCatalogId;
		}

		public Long getProfileCount() {
			return this.profileCount;
		}

		public void setProfileCount(Long profileCount) {
			this.profileCount = profileCount;
		}

		public String getIsvSubId() {
			return this.isvSubId;
		}

		public void setIsvSubId(String isvSubId) {
			this.isvSubId = isvSubId;
		}

		public String getCatalogName() {
			return this.catalogName;
		}

		public void setCatalogName(String catalogName) {
			this.catalogName = catalogName;
		}

		public Long getCatalogId() {
			return this.catalogId;
		}

		public void setCatalogId(Long catalogId) {
			this.catalogId = catalogId;
		}
	}

	@Override
	public UpdateProfileCatalogResponse getInstance(UnmarshallerContext context) {
		return	UpdateProfileCatalogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
