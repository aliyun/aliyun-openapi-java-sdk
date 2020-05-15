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

package com.aliyuncs.edas.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.ListHistoryDeployVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListHistoryDeployVersionResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<PackageVersion> packageVersionList;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
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

	public List<PackageVersion> getPackageVersionList() {
		return this.packageVersionList;
	}

	public void setPackageVersionList(List<PackageVersion> packageVersionList) {
		this.packageVersionList = packageVersionList;
	}

	public static class PackageVersion {

		private String id;

		private String packageVersion;

		private String appId;

		private String description;

		private String warUrl;

		private Long createTime;

		private Long updateTime;

		private String type;

		private String publicUrl;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getPackageVersion() {
			return this.packageVersion;
		}

		public void setPackageVersion(String packageVersion) {
			this.packageVersion = packageVersion;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getWarUrl() {
			return this.warUrl;
		}

		public void setWarUrl(String warUrl) {
			this.warUrl = warUrl;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getPublicUrl() {
			return this.publicUrl;
		}

		public void setPublicUrl(String publicUrl) {
			this.publicUrl = publicUrl;
		}
	}

	@Override
	public ListHistoryDeployVersionResponse getInstance(UnmarshallerContext context) {
		return	ListHistoryDeployVersionResponseUnmarshaller.unmarshall(this, context);
	}
}
