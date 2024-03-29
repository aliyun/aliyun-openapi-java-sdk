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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeIpControlsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIpControlsResponse extends AcsResponse {

	private Integer pageNumber;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<IpControlInfo> ipControlInfos;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<IpControlInfo> getIpControlInfos() {
		return this.ipControlInfos;
	}

	public void setIpControlInfos(List<IpControlInfo> ipControlInfos) {
		this.ipControlInfos = ipControlInfos;
	}

	public static class IpControlInfo {

		private String ipControlId;

		private String ipControlType;

		private String modifiedTime;

		private String ipControlName;

		private String description;

		private String createTime;

		private String regionId;

		public String getIpControlId() {
			return this.ipControlId;
		}

		public void setIpControlId(String ipControlId) {
			this.ipControlId = ipControlId;
		}

		public String getIpControlType() {
			return this.ipControlType;
		}

		public void setIpControlType(String ipControlType) {
			this.ipControlType = ipControlType;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getIpControlName() {
			return this.ipControlName;
		}

		public void setIpControlName(String ipControlName) {
			this.ipControlName = ipControlName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public DescribeIpControlsResponse getInstance(UnmarshallerContext context) {
		return	DescribeIpControlsResponseUnmarshaller.unmarshall(this, context);
	}
}
