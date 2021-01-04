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
import com.aliyuncs.alidns.transform.v20150109.DescribeDnsGtmAccessStrategyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDnsGtmAccessStrategyResponse extends AcsResponse {

	private String requestId;

	private String strategyId;

	private String strategyName;

	private String strategyMode;

	private String instanceId;

	private String defaultAddrPoolType;

	private String defaultLbaStrategy;

	private Integer defaultMinAvailableAddrNum;

	private Integer defaultMaxReturnAddrNum;

	private String defaultLatencyOptimization;

	private String defaultAddrPoolGroupStatus;

	private String failoverAddrPoolType;

	private String failoverLbaStrategy;

	private Integer failoverMinAvailableAddrNum;

	private Integer failoverMaxReturnAddrNum;

	private String failoverLatencyOptimization;

	private String failoverAddrPoolGroupStatus;

	private String accessMode;

	private String effectiveAddrPoolGroupType;

	private String createTime;

	private Long createTimestamp;

	private Integer defaultAvailableAddrNum;

	private Integer failoverAvailableAddrNum;

	private List<Line> lines;

	private List<DefaultAddrPool> defaultAddrPools;

	private List<FailoverAddrPool> failoverAddrPools;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStrategyId() {
		return this.strategyId;
	}

	public void setStrategyId(String strategyId) {
		this.strategyId = strategyId;
	}

	public String getStrategyName() {
		return this.strategyName;
	}

	public void setStrategyName(String strategyName) {
		this.strategyName = strategyName;
	}

	public String getStrategyMode() {
		return this.strategyMode;
	}

	public void setStrategyMode(String strategyMode) {
		this.strategyMode = strategyMode;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getDefaultAddrPoolType() {
		return this.defaultAddrPoolType;
	}

	public void setDefaultAddrPoolType(String defaultAddrPoolType) {
		this.defaultAddrPoolType = defaultAddrPoolType;
	}

	public String getDefaultLbaStrategy() {
		return this.defaultLbaStrategy;
	}

	public void setDefaultLbaStrategy(String defaultLbaStrategy) {
		this.defaultLbaStrategy = defaultLbaStrategy;
	}

	public Integer getDefaultMinAvailableAddrNum() {
		return this.defaultMinAvailableAddrNum;
	}

	public void setDefaultMinAvailableAddrNum(Integer defaultMinAvailableAddrNum) {
		this.defaultMinAvailableAddrNum = defaultMinAvailableAddrNum;
	}

	public Integer getDefaultMaxReturnAddrNum() {
		return this.defaultMaxReturnAddrNum;
	}

	public void setDefaultMaxReturnAddrNum(Integer defaultMaxReturnAddrNum) {
		this.defaultMaxReturnAddrNum = defaultMaxReturnAddrNum;
	}

	public String getDefaultLatencyOptimization() {
		return this.defaultLatencyOptimization;
	}

	public void setDefaultLatencyOptimization(String defaultLatencyOptimization) {
		this.defaultLatencyOptimization = defaultLatencyOptimization;
	}

	public String getDefaultAddrPoolGroupStatus() {
		return this.defaultAddrPoolGroupStatus;
	}

	public void setDefaultAddrPoolGroupStatus(String defaultAddrPoolGroupStatus) {
		this.defaultAddrPoolGroupStatus = defaultAddrPoolGroupStatus;
	}

	public String getFailoverAddrPoolType() {
		return this.failoverAddrPoolType;
	}

	public void setFailoverAddrPoolType(String failoverAddrPoolType) {
		this.failoverAddrPoolType = failoverAddrPoolType;
	}

	public String getFailoverLbaStrategy() {
		return this.failoverLbaStrategy;
	}

	public void setFailoverLbaStrategy(String failoverLbaStrategy) {
		this.failoverLbaStrategy = failoverLbaStrategy;
	}

	public Integer getFailoverMinAvailableAddrNum() {
		return this.failoverMinAvailableAddrNum;
	}

	public void setFailoverMinAvailableAddrNum(Integer failoverMinAvailableAddrNum) {
		this.failoverMinAvailableAddrNum = failoverMinAvailableAddrNum;
	}

	public Integer getFailoverMaxReturnAddrNum() {
		return this.failoverMaxReturnAddrNum;
	}

	public void setFailoverMaxReturnAddrNum(Integer failoverMaxReturnAddrNum) {
		this.failoverMaxReturnAddrNum = failoverMaxReturnAddrNum;
	}

	public String getFailoverLatencyOptimization() {
		return this.failoverLatencyOptimization;
	}

	public void setFailoverLatencyOptimization(String failoverLatencyOptimization) {
		this.failoverLatencyOptimization = failoverLatencyOptimization;
	}

	public String getFailoverAddrPoolGroupStatus() {
		return this.failoverAddrPoolGroupStatus;
	}

	public void setFailoverAddrPoolGroupStatus(String failoverAddrPoolGroupStatus) {
		this.failoverAddrPoolGroupStatus = failoverAddrPoolGroupStatus;
	}

	public String getAccessMode() {
		return this.accessMode;
	}

	public void setAccessMode(String accessMode) {
		this.accessMode = accessMode;
	}

	public String getEffectiveAddrPoolGroupType() {
		return this.effectiveAddrPoolGroupType;
	}

	public void setEffectiveAddrPoolGroupType(String effectiveAddrPoolGroupType) {
		this.effectiveAddrPoolGroupType = effectiveAddrPoolGroupType;
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

	public Integer getDefaultAvailableAddrNum() {
		return this.defaultAvailableAddrNum;
	}

	public void setDefaultAvailableAddrNum(Integer defaultAvailableAddrNum) {
		this.defaultAvailableAddrNum = defaultAvailableAddrNum;
	}

	public Integer getFailoverAvailableAddrNum() {
		return this.failoverAvailableAddrNum;
	}

	public void setFailoverAvailableAddrNum(Integer failoverAvailableAddrNum) {
		this.failoverAvailableAddrNum = failoverAvailableAddrNum;
	}

	public List<Line> getLines() {
		return this.lines;
	}

	public void setLines(List<Line> lines) {
		this.lines = lines;
	}

	public List<DefaultAddrPool> getDefaultAddrPools() {
		return this.defaultAddrPools;
	}

	public void setDefaultAddrPools(List<DefaultAddrPool> defaultAddrPools) {
		this.defaultAddrPools = defaultAddrPools;
	}

	public List<FailoverAddrPool> getFailoverAddrPools() {
		return this.failoverAddrPools;
	}

	public void setFailoverAddrPools(List<FailoverAddrPool> failoverAddrPools) {
		this.failoverAddrPools = failoverAddrPools;
	}

	public static class Line {

		private String lineCode;

		private String lineName;

		private String groupCode;

		private String groupName;

		public String getLineCode() {
			return this.lineCode;
		}

		public void setLineCode(String lineCode) {
			this.lineCode = lineCode;
		}

		public String getLineName() {
			return this.lineName;
		}

		public void setLineName(String lineName) {
			this.lineName = lineName;
		}

		public String getGroupCode() {
			return this.groupCode;
		}

		public void setGroupCode(String groupCode) {
			this.groupCode = groupCode;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
	}

	public static class DefaultAddrPool {

		private String id;

		private String name;

		private Integer addrCount;

		private Integer lbaWeight;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAddrCount() {
			return this.addrCount;
		}

		public void setAddrCount(Integer addrCount) {
			this.addrCount = addrCount;
		}

		public Integer getLbaWeight() {
			return this.lbaWeight;
		}

		public void setLbaWeight(Integer lbaWeight) {
			this.lbaWeight = lbaWeight;
		}
	}

	public static class FailoverAddrPool {

		private String id;

		private String name;

		private Integer addrCount;

		private Integer lbaWeight;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAddrCount() {
			return this.addrCount;
		}

		public void setAddrCount(Integer addrCount) {
			this.addrCount = addrCount;
		}

		public Integer getLbaWeight() {
			return this.lbaWeight;
		}

		public void setLbaWeight(Integer lbaWeight) {
			this.lbaWeight = lbaWeight;
		}
	}

	@Override
	public DescribeDnsGtmAccessStrategyResponse getInstance(UnmarshallerContext context) {
		return	DescribeDnsGtmAccessStrategyResponseUnmarshaller.unmarshall(this, context);
	}
}
