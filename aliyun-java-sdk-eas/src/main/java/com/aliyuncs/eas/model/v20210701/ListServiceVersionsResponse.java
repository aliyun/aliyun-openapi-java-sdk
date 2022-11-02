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

package com.aliyuncs.eas.model.v20210701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eas.transform.v20210701.ListServiceVersionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListServiceVersionsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

	private List<VersionsItem> versions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<VersionsItem> getVersions() {
		return this.versions;
	}

	public void setVersions(List<VersionsItem> versions) {
		this.versions = versions;
	}

	public static class VersionsItem {

		private String buildTime;

		private String imageAvailable;

		private Integer imageId;

		private String message;

		private String serviceRunnable;

		public String getBuildTime() {
			return this.buildTime;
		}

		public void setBuildTime(String buildTime) {
			this.buildTime = buildTime;
		}

		public String getImageAvailable() {
			return this.imageAvailable;
		}

		public void setImageAvailable(String imageAvailable) {
			this.imageAvailable = imageAvailable;
		}

		public Integer getImageId() {
			return this.imageId;
		}

		public void setImageId(Integer imageId) {
			this.imageId = imageId;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getServiceRunnable() {
			return this.serviceRunnable;
		}

		public void setServiceRunnable(String serviceRunnable) {
			this.serviceRunnable = serviceRunnable;
		}
	}

	@Override
	public ListServiceVersionsResponse getInstance(UnmarshallerContext context) {
		return	ListServiceVersionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
