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
import com.aliyuncs.retailbot.transform.v20210224.ListSubscriptionByPackageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSubscriptionByPackageResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private PageData pageData;

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

	public PageData getPageData() {
		return this.pageData;
	}

	public void setPageData(PageData pageData) {
		this.pageData = pageData;
	}

	public static class PageData {

		private Integer maxResults;

		private String nextToken;

		private Integer totalCount;

		private List<PackageDTO> data;

		public Integer getMaxResults() {
			return this.maxResults;
		}

		public void setMaxResults(Integer maxResults) {
			this.maxResults = maxResults;
		}

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<PackageDTO> getData() {
			return this.data;
		}

		public void setData(List<PackageDTO> data) {
			this.data = data;
		}

		public static class PackageDTO {

			private String robotCode;

			private String packageCode;

			private String packageVersion;

			public String getRobotCode() {
				return this.robotCode;
			}

			public void setRobotCode(String robotCode) {
				this.robotCode = robotCode;
			}

			public String getPackageCode() {
				return this.packageCode;
			}

			public void setPackageCode(String packageCode) {
				this.packageCode = packageCode;
			}

			public String getPackageVersion() {
				return this.packageVersion;
			}

			public void setPackageVersion(String packageVersion) {
				this.packageVersion = packageVersion;
			}
		}
	}

	@Override
	public ListSubscriptionByPackageResponse getInstance(UnmarshallerContext context) {
		return	ListSubscriptionByPackageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
