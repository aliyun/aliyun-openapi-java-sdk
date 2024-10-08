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

package com.aliyuncs.resourcecenter.model.v20221201;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcecenter.transform.v20221201.GetMultiAccountResourceConfigurationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMultiAccountResourceConfigurationResponse extends AcsResponse {

	private String accountId;

	private Map<Object,Object> configuration;

	private String createTime;

	private String expireTime;

	private String regionId;

	private String requestId;

	private String resourceGroupId;

	private String resourceId;

	private String resourceName;

	private String resourceType;

	private String zoneId;

	private List<IpAddressAttribute> ipAddressAttributes;

	private List<Tag> tags;

	private List<String> ipAddresses;

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Map<Object,Object> getConfiguration() {
		return this.configuration;
	}

	public void setConfiguration(Map<Object,Object> configuration) {
		this.configuration = configuration;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public List<IpAddressAttribute> getIpAddressAttributes() {
		return this.ipAddressAttributes;
	}

	public void setIpAddressAttributes(List<IpAddressAttribute> ipAddressAttributes) {
		this.ipAddressAttributes = ipAddressAttributes;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<String> getIpAddresses() {
		return this.ipAddresses;
	}

	public void setIpAddresses(List<String> ipAddresses) {
		this.ipAddresses = ipAddresses;
	}

	public static class IpAddressAttribute {

		private String ipAddress;

		private String networkType;

		private String version;

		public String getIpAddress() {
			return this.ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}
	}

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public GetMultiAccountResourceConfigurationResponse getInstance(UnmarshallerContext context) {
		return	GetMultiAccountResourceConfigurationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
