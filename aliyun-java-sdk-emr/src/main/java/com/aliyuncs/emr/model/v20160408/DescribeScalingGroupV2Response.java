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
import com.aliyuncs.emr.transform.v20160408.DescribeScalingGroupV2ResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScalingGroupV2Response extends AcsResponse {

	private String requestId;

	private String scalingGroupId;

	private String name;

	private String description;

	private String activeStatus;

	private String hostGroupBizId;

	private String scalingInMode;

	private Integer scalingMinSize;

	private Integer scalingMaxSize;

	private String configState;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getActiveStatus() {
		return this.activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public String getHostGroupBizId() {
		return this.hostGroupBizId;
	}

	public void setHostGroupBizId(String hostGroupBizId) {
		this.hostGroupBizId = hostGroupBizId;
	}

	public String getScalingInMode() {
		return this.scalingInMode;
	}

	public void setScalingInMode(String scalingInMode) {
		this.scalingInMode = scalingInMode;
	}

	public Integer getScalingMinSize() {
		return this.scalingMinSize;
	}

	public void setScalingMinSize(Integer scalingMinSize) {
		this.scalingMinSize = scalingMinSize;
	}

	public Integer getScalingMaxSize() {
		return this.scalingMaxSize;
	}

	public void setScalingMaxSize(Integer scalingMaxSize) {
		this.scalingMaxSize = scalingMaxSize;
	}

	public String getConfigState() {
		return this.configState;
	}

	public void setConfigState(String configState) {
		this.configState = configState;
	}

	@Override
	public DescribeScalingGroupV2Response getInstance(UnmarshallerContext context) {
		return	DescribeScalingGroupV2ResponseUnmarshaller.unmarshall(this, context);
	}
}
