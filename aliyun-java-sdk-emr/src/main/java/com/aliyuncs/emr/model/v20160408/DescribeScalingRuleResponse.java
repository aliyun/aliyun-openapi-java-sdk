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
import com.aliyuncs.emr.transform.v20160408.DescribeScalingRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScalingRuleResponse extends AcsResponse {

	private String requestId;

	private String id;

	private String gmtCreate;

	private String gmtModified;

	private String ruleName;

	private String adjustmentType;

	private Integer adjustmentValue;

	private Integer cooldown;

	private String status;

	private String launchTime;

	private Integer launchExpirationTime;

	private String recurrenceType;

	private String recurrenceValue;

	private String recurrenceEndTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getAdjustmentType() {
		return this.adjustmentType;
	}

	public void setAdjustmentType(String adjustmentType) {
		this.adjustmentType = adjustmentType;
	}

	public Integer getAdjustmentValue() {
		return this.adjustmentValue;
	}

	public void setAdjustmentValue(Integer adjustmentValue) {
		this.adjustmentValue = adjustmentValue;
	}

	public Integer getCooldown() {
		return this.cooldown;
	}

	public void setCooldown(Integer cooldown) {
		this.cooldown = cooldown;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLaunchTime() {
		return this.launchTime;
	}

	public void setLaunchTime(String launchTime) {
		this.launchTime = launchTime;
	}

	public Integer getLaunchExpirationTime() {
		return this.launchExpirationTime;
	}

	public void setLaunchExpirationTime(Integer launchExpirationTime) {
		this.launchExpirationTime = launchExpirationTime;
	}

	public String getRecurrenceType() {
		return this.recurrenceType;
	}

	public void setRecurrenceType(String recurrenceType) {
		this.recurrenceType = recurrenceType;
	}

	public String getRecurrenceValue() {
		return this.recurrenceValue;
	}

	public void setRecurrenceValue(String recurrenceValue) {
		this.recurrenceValue = recurrenceValue;
	}

	public String getRecurrenceEndTime() {
		return this.recurrenceEndTime;
	}

	public void setRecurrenceEndTime(String recurrenceEndTime) {
		this.recurrenceEndTime = recurrenceEndTime;
	}

	@Override
	public DescribeScalingRuleResponse getInstance(UnmarshallerContext context) {
		return	DescribeScalingRuleResponseUnmarshaller.unmarshall(this, context);
	}
}
