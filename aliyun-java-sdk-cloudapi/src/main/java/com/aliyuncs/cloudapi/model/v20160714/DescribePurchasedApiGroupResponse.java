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
import com.aliyuncs.cloudapi.transform.v20160714.DescribePurchasedApiGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePurchasedApiGroupResponse extends AcsResponse {

	private String requestId;

	private String groupId;

	private String groupName;

	private String description;

	private String purchasedTime;

	private String regionId;

	private String status;

	private List<DomainItem> domains;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPurchasedTime() {
		return this.purchasedTime;
	}

	public void setPurchasedTime(String purchasedTime) {
		this.purchasedTime = purchasedTime;
	}

	public String getBizRegionId() {
		return this.regionId;
	}

	public void setBizRegionId(String regionId) {
		this.regionId = regionId;
	}

	/**
	 * @deprecated use getBizRegionId instead of this.
	 */
	@Deprecated
	public String getRegionId() {
		return this.regionId;
	}

	/**
	 * @deprecated use setBizRegionId instead of this.
	 */
	@Deprecated
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<DomainItem> getDomains() {
		return this.domains;
	}

	public void setDomains(List<DomainItem> domains) {
		this.domains = domains;
	}

	public static class DomainItem {

		private String domainName;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}
	}

	@Override
	public DescribePurchasedApiGroupResponse getInstance(UnmarshallerContext context) {
		return	DescribePurchasedApiGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
