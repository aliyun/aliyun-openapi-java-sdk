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
import com.aliyuncs.alidns.transform.v20150109.DescribeGtmRecoveryPlanResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGtmRecoveryPlanResponse extends AcsResponse {

	private String status;

	private String lastRollbackTime;

	private Integer faultAddrPoolNum;

	private String lastExecuteTime;

	private String requestId;

	private String createTime;

	private Long lastExecuteTimestamp;

	private String remark;

	private String name;

	private Long recoveryPlanId;

	private String updateTime;

	private Long updateTimestamp;

	private Long lastRollbackTimestamp;

	private Long createTimestamp;

	private List<FaultAddrPool> faultAddrPools;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLastRollbackTime() {
		return this.lastRollbackTime;
	}

	public void setLastRollbackTime(String lastRollbackTime) {
		this.lastRollbackTime = lastRollbackTime;
	}

	public Integer getFaultAddrPoolNum() {
		return this.faultAddrPoolNum;
	}

	public void setFaultAddrPoolNum(Integer faultAddrPoolNum) {
		this.faultAddrPoolNum = faultAddrPoolNum;
	}

	public String getLastExecuteTime() {
		return this.lastExecuteTime;
	}

	public void setLastExecuteTime(String lastExecuteTime) {
		this.lastExecuteTime = lastExecuteTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Long getLastExecuteTimestamp() {
		return this.lastExecuteTimestamp;
	}

	public void setLastExecuteTimestamp(Long lastExecuteTimestamp) {
		this.lastExecuteTimestamp = lastExecuteTimestamp;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRecoveryPlanId() {
		return this.recoveryPlanId;
	}

	public void setRecoveryPlanId(Long recoveryPlanId) {
		this.recoveryPlanId = recoveryPlanId;
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

	public Long getLastRollbackTimestamp() {
		return this.lastRollbackTimestamp;
	}

	public void setLastRollbackTimestamp(Long lastRollbackTimestamp) {
		this.lastRollbackTimestamp = lastRollbackTimestamp;
	}

	public Long getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Long createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public List<FaultAddrPool> getFaultAddrPools() {
		return this.faultAddrPools;
	}

	public void setFaultAddrPools(List<FaultAddrPool> faultAddrPools) {
		this.faultAddrPools = faultAddrPools;
	}

	public static class FaultAddrPool {

		private String addrPoolId;

		private String instanceId;

		private String addrPoolName;

		private List<Addr> addrs;

		public String getAddrPoolId() {
			return this.addrPoolId;
		}

		public void setAddrPoolId(String addrPoolId) {
			this.addrPoolId = addrPoolId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getAddrPoolName() {
			return this.addrPoolName;
		}

		public void setAddrPoolName(String addrPoolName) {
			this.addrPoolName = addrPoolName;
		}

		public List<Addr> getAddrs() {
			return this.addrs;
		}

		public void setAddrs(List<Addr> addrs) {
			this.addrs = addrs;
		}

		public static class Addr {

			private String value;

			private String mode;

			private Long id;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getMode() {
				return this.mode;
			}

			public void setMode(String mode) {
				this.mode = mode;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}
		}
	}

	@Override
	public DescribeGtmRecoveryPlanResponse getInstance(UnmarshallerContext context) {
		return	DescribeGtmRecoveryPlanResponseUnmarshaller.unmarshall(this, context);
	}
}
