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

package com.aliyuncs.pvtz.model.v20180101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pvtz.transform.v20180101.DescribeResolverEndpointResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeResolverEndpointResponse extends AcsResponse {

	private String status;

	private String requestId;

	private String securityGroupId;

	private String createTime;

	private String name;

	private String vpcRegionName;

	private String vpcId;

	private String updateTime;

	private String vpcRegionId;

	private String vpcName;

	private Long updateTimestamp;

	private String id;

	private Long createTimestamp;

	private List<IpConfig> ipConfigs;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVpcRegionName() {
		return this.vpcRegionName;
	}

	public void setVpcRegionName(String vpcRegionName) {
		this.vpcRegionName = vpcRegionName;
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getVpcRegionId() {
		return this.vpcRegionId;
	}

	public void setVpcRegionId(String vpcRegionId) {
		this.vpcRegionId = vpcRegionId;
	}

	public String getVpcName() {
		return this.vpcName;
	}

	public void setVpcName(String vpcName) {
		this.vpcName = vpcName;
	}

	public Long getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Long updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Long createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public List<IpConfig> getIpConfigs() {
		return this.ipConfigs;
	}

	public void setIpConfigs(List<IpConfig> ipConfigs) {
		this.ipConfigs = ipConfigs;
	}

	public static class IpConfig {

		private String vSwitchId;

		private String cidrBlock;

		private String ip;

		private String azId;

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getCidrBlock() {
			return this.cidrBlock;
		}

		public void setCidrBlock(String cidrBlock) {
			this.cidrBlock = cidrBlock;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getAzId() {
			return this.azId;
		}

		public void setAzId(String azId) {
			this.azId = azId;
		}
	}

	@Override
	public DescribeResolverEndpointResponse getInstance(UnmarshallerContext context) {
		return	DescribeResolverEndpointResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
