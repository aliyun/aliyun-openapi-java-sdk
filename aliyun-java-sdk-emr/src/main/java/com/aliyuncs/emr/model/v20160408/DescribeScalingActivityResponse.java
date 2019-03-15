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
import com.aliyuncs.emr.transform.v20160408.DescribeScalingActivityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScalingActivityResponse extends AcsResponse {

	private String requestId;

	private String bizId;

	private Long startTime;

	private Long endTime;

	private String instanceIds;

	private Integer totalCapacity;

	private String cause;

	private String description;

	private String status;

	private String transition;

	private String scalingRuleId;

	private Integer expectNum;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
	}

	public Integer getTotalCapacity() {
		return this.totalCapacity;
	}

	public void setTotalCapacity(Integer totalCapacity) {
		this.totalCapacity = totalCapacity;
	}

	public String getCause() {
		return this.cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTransition() {
		return this.transition;
	}

	public void setTransition(String transition) {
		this.transition = transition;
	}

	public String getScalingRuleId() {
		return this.scalingRuleId;
	}

	public void setScalingRuleId(String scalingRuleId) {
		this.scalingRuleId = scalingRuleId;
	}

	public Integer getExpectNum() {
		return this.expectNum;
	}

	public void setExpectNum(Integer expectNum) {
		this.expectNum = expectNum;
	}

	@Override
	public DescribeScalingActivityResponse getInstance(UnmarshallerContext context) {
		return	DescribeScalingActivityResponseUnmarshaller.unmarshall(this, context);
	}
}
