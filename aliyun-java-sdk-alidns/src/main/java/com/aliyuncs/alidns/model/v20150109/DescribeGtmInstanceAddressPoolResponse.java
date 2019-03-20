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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeGtmInstanceAddressPoolResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGtmInstanceAddressPoolResponse extends AcsResponse {

	private String requestId;

	private String addrPoolId;

	private String createTime;

	private Long createTimestamp;

	private String updateTime;

	private Long updateTimestamp;

	private Integer addrCount;

	private Integer minAvailableAddrNum;

	private String monitorConfigId;

	private String monitorStatus;

	private String name;

	private String status;

	private String type;

	private List<Addr> addrs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAddrPoolId() {
		return this.addrPoolId;
	}

	public void setAddrPoolId(String addrPoolId) {
		this.addrPoolId = addrPoolId;
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

	public Integer getAddrCount() {
		return this.addrCount;
	}

	public void setAddrCount(Integer addrCount) {
		this.addrCount = addrCount;
	}

	public Integer getMinAvailableAddrNum() {
		return this.minAvailableAddrNum;
	}

	public void setMinAvailableAddrNum(Integer minAvailableAddrNum) {
		this.minAvailableAddrNum = minAvailableAddrNum;
	}

	public String getMonitorConfigId() {
		return this.monitorConfigId;
	}

	public void setMonitorConfigId(String monitorConfigId) {
		this.monitorConfigId = monitorConfigId;
	}

	public String getMonitorStatus() {
		return this.monitorStatus;
	}

	public void setMonitorStatus(String monitorStatus) {
		this.monitorStatus = monitorStatus;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Addr> getAddrs() {
		return this.addrs;
	}

	public void setAddrs(List<Addr> addrs) {
		this.addrs = addrs;
	}

	public static class Addr {

		private Long addrId;

		private String createTime;

		private Long createTimestamp;

		private String updateTime;

		private Long updateTimestamp;

		private String value;

		private Integer lbaWeight;

		private String mode;

		private String alertStatus;

		public Long getAddrId() {
			return this.addrId;
		}

		public void setAddrId(Long addrId) {
			this.addrId = addrId;
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

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Integer getLbaWeight() {
			return this.lbaWeight;
		}

		public void setLbaWeight(Integer lbaWeight) {
			this.lbaWeight = lbaWeight;
		}

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public String getAlertStatus() {
			return this.alertStatus;
		}

		public void setAlertStatus(String alertStatus) {
			this.alertStatus = alertStatus;
		}
	}

	@Override
	public DescribeGtmInstanceAddressPoolResponse getInstance(UnmarshallerContext context) {
		return	DescribeGtmInstanceAddressPoolResponseUnmarshaller.unmarshall(this, context);
	}
}
