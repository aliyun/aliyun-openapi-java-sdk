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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.GetCatalogListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCatalogListResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private List<DataItem> data;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String isvSubId;

		private Long parentCatalogId;

		private Long profileCount;

		private Long catalogId;

		private String catalogName;

		public String getIsvSubId() {
			return this.isvSubId;
		}

		public void setIsvSubId(String isvSubId) {
			this.isvSubId = isvSubId;
		}

		public Long getParentCatalogId() {
			return this.parentCatalogId;
		}

		public void setParentCatalogId(Long parentCatalogId) {
			this.parentCatalogId = parentCatalogId;
		}

		public Long getProfileCount() {
			return this.profileCount;
		}

		public void setProfileCount(Long profileCount) {
			this.profileCount = profileCount;
		}

		public Long getCatalogId() {
			return this.catalogId;
		}

		public void setCatalogId(Long catalogId) {
			this.catalogId = catalogId;
		}

		public String getCatalogName() {
			return this.catalogName;
		}

		public void setCatalogName(String catalogName) {
			this.catalogName = catalogName;
		}
	}

	@Override
	public GetCatalogListResponse getInstance(UnmarshallerContext context) {
		return	GetCatalogListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
