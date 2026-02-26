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
import com.aliyuncs.pvtz.transform.v20180101.DescribeZoneInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeZoneInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean slaveDns;

	private String resourceGroupId;

	private String zoneId;

	private String proxyPattern;

	private String createTime;

	private String zoneType;

	private String remark;

	private String zoneName;

	private String zoneTag;

	private String updateTime;

	private Long updateTimestamp;

	private Integer recordCount;

	private Long createTimestamp;

	private Boolean isPtr;

	private String dnsGroup;

	private String creator;

	private String creatorType;

	private Boolean dnsGroupChanging;

	private List<Vpc> bindVpcs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSlaveDns() {
		return this.slaveDns;
	}

	public void setSlaveDns(Boolean slaveDns) {
		this.slaveDns = slaveDns;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getProxyPattern() {
		return this.proxyPattern;
	}

	public void setProxyPattern(String proxyPattern) {
		this.proxyPattern = proxyPattern;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getZoneType() {
		return this.zoneType;
	}

	public void setZoneType(String zoneType) {
		this.zoneType = zoneType;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getZoneName() {
		return this.zoneName;
	}

	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}

	public String getZoneTag() {
		return this.zoneTag;
	}

	public void setZoneTag(String zoneTag) {
		this.zoneTag = zoneTag;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public Long getUpdateTimestamp() {
		return this.updateTimestamp;
	}

	public void setUpdateTimestamp(Long updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public Integer getRecordCount() {
		return this.recordCount;
	}

	public void setRecordCount(Integer recordCount) {
		this.recordCount = recordCount;
	}

	public Long getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Long createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public Boolean getIsPtr() {
		return this.isPtr;
	}

	public void setIsPtr(Boolean isPtr) {
		this.isPtr = isPtr;
	}

	public String getDnsGroup() {
		return this.dnsGroup;
	}

	public void setDnsGroup(String dnsGroup) {
		this.dnsGroup = dnsGroup;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCreatorType() {
		return this.creatorType;
	}

	public void setCreatorType(String creatorType) {
		this.creatorType = creatorType;
	}

	public Boolean getDnsGroupChanging() {
		return this.dnsGroupChanging;
	}

	public void setDnsGroupChanging(Boolean dnsGroupChanging) {
		this.dnsGroupChanging = dnsGroupChanging;
	}

	public List<Vpc> getBindVpcs() {
		return this.bindVpcs;
	}

	public void setBindVpcs(List<Vpc> bindVpcs) {
		this.bindVpcs = bindVpcs;
	}

	public static class Vpc {

		private String vpcName;

		private String vpcId;

		private String vpcType;

		private String regionName;

		private Long vpcUserId;

		private String regionId;

		public String getVpcName() {
			return this.vpcName;
		}

		public void setVpcName(String vpcName) {
			this.vpcName = vpcName;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVpcType() {
			return this.vpcType;
		}

		public void setVpcType(String vpcType) {
			this.vpcType = vpcType;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public Long getVpcUserId() {
			return this.vpcUserId;
		}

		public void setVpcUserId(Long vpcUserId) {
			this.vpcUserId = vpcUserId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public DescribeZoneInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeZoneInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
