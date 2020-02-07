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

	private String zoneId;

	private String zoneName;

	private String remark;

	private Integer recordCount;

	private String createTime;

	private Long createTimestamp;

	private String updateTime;

	private Long updateTimestamp;

	private Boolean isPtr;

	private String proxyPattern;

	private Boolean slaveDns;

	private List<Vpc> bindVpcs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getZoneName() {
		return this.zoneName;
	}

	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getRecordCount() {
		return this.recordCount;
	}

	public void setRecordCount(Integer recordCount) {
		this.recordCount = recordCount;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Long getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Long createTimestamp) {
		this.createTimestamp = createTimestamp;
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

	public Boolean getIsPtr() {
		return this.isPtr;
	}

	public void setIsPtr(Boolean isPtr) {
		this.isPtr = isPtr;
	}

	public String getProxyPattern() {
		return this.proxyPattern;
	}

	public void setProxyPattern(String proxyPattern) {
		this.proxyPattern = proxyPattern;
	}

	public Boolean getSlaveDns() {
		return this.slaveDns;
	}

	public void setSlaveDns(Boolean slaveDns) {
		this.slaveDns = slaveDns;
	}

	public List<Vpc> getBindVpcs() {
		return this.bindVpcs;
	}

	public void setBindVpcs(List<Vpc> bindVpcs) {
		this.bindVpcs = bindVpcs;
	}

	public static class Vpc {

		private String vpcId;

		private String vpcName;

		private String regionName;

		private String regionId;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVpcName() {
			return this.vpcName;
		}

		public void setVpcName(String vpcName) {
			this.vpcName = vpcName;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
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
