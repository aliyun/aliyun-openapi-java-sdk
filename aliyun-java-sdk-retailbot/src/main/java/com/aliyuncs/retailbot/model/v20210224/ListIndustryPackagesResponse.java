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

package com.aliyuncs.retailbot.model.v20210224;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailbot.transform.v20210224.ListIndustryPackagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListIndustryPackagesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private PackagePage packagePage;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public PackagePage getPackagePage() {
		return this.packagePage;
	}

	public void setPackagePage(PackagePage packagePage) {
		this.packagePage = packagePage;
	}

	public static class PackagePage {

		private Integer nextToken;

		private Integer maxResults;

		private Integer totalCount;

		private List<_Package> packages;

		public Integer getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(Integer nextToken) {
			this.nextToken = nextToken;
		}

		public Integer getMaxResults() {
			return this.maxResults;
		}

		public void setMaxResults(Integer maxResults) {
			this.maxResults = maxResults;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<_Package> getPackages() {
			return this.packages;
		}

		public void setPackages(List<_Package> packages) {
			this.packages = packages;
		}

		public static class _Package {

			private String packageName;

			private String packageCode;

			private String packageType;

			private String packageDescription;

			private String createTime;

			private String modifyTime;

			private String createUserId;

			private String modifyUserId;

			public String getPackageName() {
				return this.packageName;
			}

			public void setPackageName(String packageName) {
				this.packageName = packageName;
			}

			public String getPackageCode() {
				return this.packageCode;
			}

			public void setPackageCode(String packageCode) {
				this.packageCode = packageCode;
			}

			public String getPackageType() {
				return this.packageType;
			}

			public void setPackageType(String packageType) {
				this.packageType = packageType;
			}

			public String getPackageDescription() {
				return this.packageDescription;
			}

			public void setPackageDescription(String packageDescription) {
				this.packageDescription = packageDescription;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getModifyTime() {
				return this.modifyTime;
			}

			public void setModifyTime(String modifyTime) {
				this.modifyTime = modifyTime;
			}

			public String getCreateUserId() {
				return this.createUserId;
			}

			public void setCreateUserId(String createUserId) {
				this.createUserId = createUserId;
			}

			public String getModifyUserId() {
				return this.modifyUserId;
			}

			public void setModifyUserId(String modifyUserId) {
				this.modifyUserId = modifyUserId;
			}
		}
	}

	@Override
	public ListIndustryPackagesResponse getInstance(UnmarshallerContext context) {
		return	ListIndustryPackagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
