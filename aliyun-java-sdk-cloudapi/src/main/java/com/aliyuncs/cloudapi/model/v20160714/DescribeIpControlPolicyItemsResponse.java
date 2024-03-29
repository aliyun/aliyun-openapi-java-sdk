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
import com.aliyuncs.cloudapi.transform.v20160714.DescribeIpControlPolicyItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIpControlPolicyItemsResponse extends AcsResponse {

	private Integer pageNumber;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<IpControlPolicyItem> ipControlPolicyItems;

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

	public List<IpControlPolicyItem> getIpControlPolicyItems() {
		return this.ipControlPolicyItems;
	}

	public void setIpControlPolicyItems(List<IpControlPolicyItem> ipControlPolicyItems) {
		this.ipControlPolicyItems = ipControlPolicyItems;
	}

	public static class IpControlPolicyItem {

		private String modifiedTime;

		private String policyItemId;

		private String cidrIp;

		private String createTime;

		private String appId;

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getPolicyItemId() {
			return this.policyItemId;
		}

		public void setPolicyItemId(String policyItemId) {
			this.policyItemId = policyItemId;
		}

		public String getCidrIp() {
			return this.cidrIp;
		}

		public void setCidrIp(String cidrIp) {
			this.cidrIp = cidrIp;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}
	}

	@Override
	public DescribeIpControlPolicyItemsResponse getInstance(UnmarshallerContext context) {
		return	DescribeIpControlPolicyItemsResponseUnmarshaller.unmarshall(this, context);
	}
}
