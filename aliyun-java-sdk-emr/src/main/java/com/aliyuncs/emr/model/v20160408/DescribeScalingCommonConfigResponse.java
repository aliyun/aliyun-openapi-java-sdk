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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.DescribeScalingCommonConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScalingCommonConfigResponse extends AcsResponse {

	private String requestId;

	private Integer autoScalingHookHeartbeatDefaultTime;

	private Integer autoScalingCoolDownTime;

	private Long autoScalingMNSScalingThreadSleepTime;

	private Integer autoScalingGroupMinSizeLimit;

	private Integer autoScalingGroupMaxSizeLimit;

	private Integer autoScalingRuleMinDelayLimit;

	private Integer autoScalingRuleAlarmDelayLimit;

	private Integer autoScalingRuleAlarmSilentTime;

	private Integer autoScalingConfigSystemDiskSize;

	private Long autoScalingConfigDecommissionQueryInterval;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getAutoScalingHookHeartbeatDefaultTime() {
		return this.autoScalingHookHeartbeatDefaultTime;
	}

	public void setAutoScalingHookHeartbeatDefaultTime(Integer autoScalingHookHeartbeatDefaultTime) {
		this.autoScalingHookHeartbeatDefaultTime = autoScalingHookHeartbeatDefaultTime;
	}

	public Integer getAutoScalingCoolDownTime() {
		return this.autoScalingCoolDownTime;
	}

	public void setAutoScalingCoolDownTime(Integer autoScalingCoolDownTime) {
		this.autoScalingCoolDownTime = autoScalingCoolDownTime;
	}

	public Long getAutoScalingMNSScalingThreadSleepTime() {
		return this.autoScalingMNSScalingThreadSleepTime;
	}

	public void setAutoScalingMNSScalingThreadSleepTime(Long autoScalingMNSScalingThreadSleepTime) {
		this.autoScalingMNSScalingThreadSleepTime = autoScalingMNSScalingThreadSleepTime;
	}

	public Integer getAutoScalingGroupMinSizeLimit() {
		return this.autoScalingGroupMinSizeLimit;
	}

	public void setAutoScalingGroupMinSizeLimit(Integer autoScalingGroupMinSizeLimit) {
		this.autoScalingGroupMinSizeLimit = autoScalingGroupMinSizeLimit;
	}

	public Integer getAutoScalingGroupMaxSizeLimit() {
		return this.autoScalingGroupMaxSizeLimit;
	}

	public void setAutoScalingGroupMaxSizeLimit(Integer autoScalingGroupMaxSizeLimit) {
		this.autoScalingGroupMaxSizeLimit = autoScalingGroupMaxSizeLimit;
	}

	public Integer getAutoScalingRuleMinDelayLimit() {
		return this.autoScalingRuleMinDelayLimit;
	}

	public void setAutoScalingRuleMinDelayLimit(Integer autoScalingRuleMinDelayLimit) {
		this.autoScalingRuleMinDelayLimit = autoScalingRuleMinDelayLimit;
	}

	public Integer getAutoScalingRuleAlarmDelayLimit() {
		return this.autoScalingRuleAlarmDelayLimit;
	}

	public void setAutoScalingRuleAlarmDelayLimit(Integer autoScalingRuleAlarmDelayLimit) {
		this.autoScalingRuleAlarmDelayLimit = autoScalingRuleAlarmDelayLimit;
	}

	public Integer getAutoScalingRuleAlarmSilentTime() {
		return this.autoScalingRuleAlarmSilentTime;
	}

	public void setAutoScalingRuleAlarmSilentTime(Integer autoScalingRuleAlarmSilentTime) {
		this.autoScalingRuleAlarmSilentTime = autoScalingRuleAlarmSilentTime;
	}

	public Integer getAutoScalingConfigSystemDiskSize() {
		return this.autoScalingConfigSystemDiskSize;
	}

	public void setAutoScalingConfigSystemDiskSize(Integer autoScalingConfigSystemDiskSize) {
		this.autoScalingConfigSystemDiskSize = autoScalingConfigSystemDiskSize;
	}

	public Long getAutoScalingConfigDecommissionQueryInterval() {
		return this.autoScalingConfigDecommissionQueryInterval;
	}

	public void setAutoScalingConfigDecommissionQueryInterval(Long autoScalingConfigDecommissionQueryInterval) {
		this.autoScalingConfigDecommissionQueryInterval = autoScalingConfigDecommissionQueryInterval;
	}

	@Override
	public DescribeScalingCommonConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeScalingCommonConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
