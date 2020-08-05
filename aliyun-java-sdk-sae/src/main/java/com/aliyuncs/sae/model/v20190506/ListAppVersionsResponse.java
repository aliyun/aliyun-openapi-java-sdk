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

package com.aliyuncs.sae.model.v20190506;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sae.transform.v20190506.ListAppVersionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAppVersionsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private String errorCode;

	private List<PackageVersionEntity> data;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<PackageVersionEntity> getData() {
		return this.data;
	}

	public void setData(List<PackageVersionEntity> data) {
		this.data = data;
	}

	public static class PackageVersionEntity {

		private String id;

		private String createTime;

		private String warUrl;

		private String type;

		private String buildPackageUrl;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getWarUrl() {
			return this.warUrl;
		}

		public void setWarUrl(String warUrl) {
			this.warUrl = warUrl;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getBuildPackageUrl() {
			return this.buildPackageUrl;
		}

		public void setBuildPackageUrl(String buildPackageUrl) {
			this.buildPackageUrl = buildPackageUrl;
		}
	}

	@Override
	public ListAppVersionsResponse getInstance(UnmarshallerContext context) {
		return	ListAppVersionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
