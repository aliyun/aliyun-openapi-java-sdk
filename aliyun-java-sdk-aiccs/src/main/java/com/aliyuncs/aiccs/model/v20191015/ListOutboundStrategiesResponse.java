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

package com.aliyuncs.aiccs.model.v20191015;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aiccs.transform.v20191015.ListOutboundStrategiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOutboundStrategiesResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private List<OutboundStrategy> outboundStrategies;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<OutboundStrategy> getOutboundStrategies() {
		return this.outboundStrategies;
	}

	public void setOutboundStrategies(List<OutboundStrategy> outboundStrategies) {
		this.outboundStrategies = outboundStrategies;
	}

	public static class OutboundStrategy {

		private Integer status;

		private Integer robotType;

		private Long outboundStrategyId;

		private Long creatorId;

		private String outboundNum;

		private String robotId;

		private String extAttr;

		private String modifierName;

		private Integer process;

		private Integer successRate;

		private Integer resourceAllocation;

		private String gmtCreateStr;

		private String outboundStrategyName;

		private String gmtModifiedStr;

		private Long buId;

		private String sceneName;

		private Integer numType;

		private String robotName;

		private Long departmentId;

		private Long ruleCode;

		private String creatorName;

		private Long modifierId;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getRobotType() {
			return this.robotType;
		}

		public void setRobotType(Integer robotType) {
			this.robotType = robotType;
		}

		public Long getOutboundStrategyId() {
			return this.outboundStrategyId;
		}

		public void setOutboundStrategyId(Long outboundStrategyId) {
			this.outboundStrategyId = outboundStrategyId;
		}

		public Long getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(Long creatorId) {
			this.creatorId = creatorId;
		}

		public String getOutboundNum() {
			return this.outboundNum;
		}

		public void setOutboundNum(String outboundNum) {
			this.outboundNum = outboundNum;
		}

		public String getRobotId() {
			return this.robotId;
		}

		public void setRobotId(String robotId) {
			this.robotId = robotId;
		}

		public String getExtAttr() {
			return this.extAttr;
		}

		public void setExtAttr(String extAttr) {
			this.extAttr = extAttr;
		}

		public String getModifierName() {
			return this.modifierName;
		}

		public void setModifierName(String modifierName) {
			this.modifierName = modifierName;
		}

		public Integer getProcess() {
			return this.process;
		}

		public void setProcess(Integer process) {
			this.process = process;
		}

		public Integer getSuccessRate() {
			return this.successRate;
		}

		public void setSuccessRate(Integer successRate) {
			this.successRate = successRate;
		}

		public Integer getResourceAllocation() {
			return this.resourceAllocation;
		}

		public void setResourceAllocation(Integer resourceAllocation) {
			this.resourceAllocation = resourceAllocation;
		}

		public String getGmtCreateStr() {
			return this.gmtCreateStr;
		}

		public void setGmtCreateStr(String gmtCreateStr) {
			this.gmtCreateStr = gmtCreateStr;
		}

		public String getOutboundStrategyName() {
			return this.outboundStrategyName;
		}

		public void setOutboundStrategyName(String outboundStrategyName) {
			this.outboundStrategyName = outboundStrategyName;
		}

		public String getGmtModifiedStr() {
			return this.gmtModifiedStr;
		}

		public void setGmtModifiedStr(String gmtModifiedStr) {
			this.gmtModifiedStr = gmtModifiedStr;
		}

		public Long getBuId() {
			return this.buId;
		}

		public void setBuId(Long buId) {
			this.buId = buId;
		}

		public String getSceneName() {
			return this.sceneName;
		}

		public void setSceneName(String sceneName) {
			this.sceneName = sceneName;
		}

		public Integer getNumType() {
			return this.numType;
		}

		public void setNumType(Integer numType) {
			this.numType = numType;
		}

		public String getRobotName() {
			return this.robotName;
		}

		public void setRobotName(String robotName) {
			this.robotName = robotName;
		}

		public Long getDepartmentId() {
			return this.departmentId;
		}

		public void setDepartmentId(Long departmentId) {
			this.departmentId = departmentId;
		}

		public Long getRuleCode() {
			return this.ruleCode;
		}

		public void setRuleCode(Long ruleCode) {
			this.ruleCode = ruleCode;
		}

		public String getCreatorName() {
			return this.creatorName;
		}

		public void setCreatorName(String creatorName) {
			this.creatorName = creatorName;
		}

		public Long getModifierId() {
			return this.modifierId;
		}

		public void setModifierId(Long modifierId) {
			this.modifierId = modifierId;
		}
	}

	@Override
	public ListOutboundStrategiesResponse getInstance(UnmarshallerContext context) {
		return	ListOutboundStrategiesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
