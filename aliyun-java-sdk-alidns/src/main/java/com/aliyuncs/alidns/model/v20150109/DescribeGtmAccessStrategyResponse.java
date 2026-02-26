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
import com.aliyuncs.alidns.transform.v20150109.DescribeGtmAccessStrategyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGtmAccessStrategyResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private String strategyId;

	private String defaultAddrPoolStatus;

	private String failoverAddrPoolId;

	private String accessStatus;

	private String defaultAddrPoolMonitorStatus;

	private String defaultAddrPoolName;

	private String defultAddrPoolId;

	private String strategyName;

	private String failoverAddrPoolStatus;

	private String accessMode;

	private String strategyMode;

	private String failoverAddrPoolMonitorStatus;

	private String failoverAddrPoolName;

	private List<Line> lines;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getStrategyId() {
		return this.strategyId;
	}

	public void setStrategyId(String strategyId) {
		this.strategyId = strategyId;
	}

	public String getDefaultAddrPoolStatus() {
		return this.defaultAddrPoolStatus;
	}

	public void setDefaultAddrPoolStatus(String defaultAddrPoolStatus) {
		this.defaultAddrPoolStatus = defaultAddrPoolStatus;
	}

	public String getFailoverAddrPoolId() {
		return this.failoverAddrPoolId;
	}

	public void setFailoverAddrPoolId(String failoverAddrPoolId) {
		this.failoverAddrPoolId = failoverAddrPoolId;
	}

	public String getAccessStatus() {
		return this.accessStatus;
	}

	public void setAccessStatus(String accessStatus) {
		this.accessStatus = accessStatus;
	}

	public String getDefaultAddrPoolMonitorStatus() {
		return this.defaultAddrPoolMonitorStatus;
	}

	public void setDefaultAddrPoolMonitorStatus(String defaultAddrPoolMonitorStatus) {
		this.defaultAddrPoolMonitorStatus = defaultAddrPoolMonitorStatus;
	}

	public String getDefaultAddrPoolName() {
		return this.defaultAddrPoolName;
	}

	public void setDefaultAddrPoolName(String defaultAddrPoolName) {
		this.defaultAddrPoolName = defaultAddrPoolName;
	}

	public String getDefultAddrPoolId() {
		return this.defultAddrPoolId;
	}

	public void setDefultAddrPoolId(String defultAddrPoolId) {
		this.defultAddrPoolId = defultAddrPoolId;
	}

	public String getStrategyName() {
		return this.strategyName;
	}

	public void setStrategyName(String strategyName) {
		this.strategyName = strategyName;
	}

	public String getFailoverAddrPoolStatus() {
		return this.failoverAddrPoolStatus;
	}

	public void setFailoverAddrPoolStatus(String failoverAddrPoolStatus) {
		this.failoverAddrPoolStatus = failoverAddrPoolStatus;
	}

	public String getAccessMode() {
		return this.accessMode;
	}

	public void setAccessMode(String accessMode) {
		this.accessMode = accessMode;
	}

	public String getStrategyMode() {
		return this.strategyMode;
	}

	public void setStrategyMode(String strategyMode) {
		this.strategyMode = strategyMode;
	}

	public String getFailoverAddrPoolMonitorStatus() {
		return this.failoverAddrPoolMonitorStatus;
	}

	public void setFailoverAddrPoolMonitorStatus(String failoverAddrPoolMonitorStatus) {
		this.failoverAddrPoolMonitorStatus = failoverAddrPoolMonitorStatus;
	}

	public String getFailoverAddrPoolName() {
		return this.failoverAddrPoolName;
	}

	public void setFailoverAddrPoolName(String failoverAddrPoolName) {
		this.failoverAddrPoolName = failoverAddrPoolName;
	}

	public List<Line> getLines() {
		return this.lines;
	}

	public void setLines(List<Line> lines) {
		this.lines = lines;
	}

	public static class Line {

		private String groupName;

		private String lineCode;

		private String lineName;

		private String groupCode;

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

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
	}

	@Override
	public DescribeGtmAccessStrategyResponse getInstance(UnmarshallerContext context) {
		return	DescribeGtmAccessStrategyResponseUnmarshaller.unmarshall(this, context);
	}
}
