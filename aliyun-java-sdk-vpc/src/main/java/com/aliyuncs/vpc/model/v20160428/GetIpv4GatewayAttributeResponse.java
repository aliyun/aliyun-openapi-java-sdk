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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.GetIpv4GatewayAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetIpv4GatewayAttributeResponse extends AcsResponse {

	private String vpcId;

	private String status;

	private String ipv4GatewayId;

	private String requestId;

	private String ipv4GatewayDescription;

	private Boolean enabled;

	private String ipv4GatewayRouteTableId;

	private String ipv4GatewayName;

	private String createTime;

	private String resourceGroupId;

	private List<Tag> tags;

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIpv4GatewayId() {
		return this.ipv4GatewayId;
	}

	public void setIpv4GatewayId(String ipv4GatewayId) {
		this.ipv4GatewayId = ipv4GatewayId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getIpv4GatewayDescription() {
		return this.ipv4GatewayDescription;
	}

	public void setIpv4GatewayDescription(String ipv4GatewayDescription) {
		this.ipv4GatewayDescription = ipv4GatewayDescription;
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getIpv4GatewayRouteTableId() {
		return this.ipv4GatewayRouteTableId;
	}

	public void setIpv4GatewayRouteTableId(String ipv4GatewayRouteTableId) {
		this.ipv4GatewayRouteTableId = ipv4GatewayRouteTableId;
	}

	public String getIpv4GatewayName() {
		return this.ipv4GatewayName;
	}

	public void setIpv4GatewayName(String ipv4GatewayName) {
		this.ipv4GatewayName = ipv4GatewayName;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
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
	public GetIpv4GatewayAttributeResponse getInstance(UnmarshallerContext context) {
		return	GetIpv4GatewayAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
