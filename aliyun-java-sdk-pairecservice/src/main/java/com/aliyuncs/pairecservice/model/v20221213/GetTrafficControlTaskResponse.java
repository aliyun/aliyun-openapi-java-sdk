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

package com.aliyuncs.pairecservice.model.v20221213;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pairecservice.transform.v20221213.GetTrafficControlTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTrafficControlTaskResponse extends AcsResponse {

	private String requestId;

	private String trafficControlTaskId;

	private String name;

	private String description;

	private String sceneId;

	private String sceneName;

	private String productStatus;

	private String prepubStatus;

	private String executionTime;

	private String startTime;

	private String endTime;

	private String behaviorTableMetaId;

	private String userTableMetaId;

	private String itemTableMetaId;

	private String userConditionType;

	private String userConditionArray;

	private String userConditionExpress;

	private String statisBehaviorConditionType;

	private String statisBehaviorConditionArray;

	private String statisBehaviorConditionExpress;

	private String controlType;

	private String controlGranularity;

	private String controlLogic;

	private String itemConditionType;

	private String itemConditionArray;

	private String itemConditionExpress;

	private String gmtCreateTime;

	private String gmtModifiedTime;

	private Boolean everPublished;

	private List<TrafficControlTargetsItem> trafficControlTargets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTrafficControlTaskId() {
		return this.trafficControlTaskId;
	}

	public void setTrafficControlTaskId(String trafficControlTaskId) {
		this.trafficControlTaskId = trafficControlTaskId;
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

	public String getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getSceneName() {
		return this.sceneName;
	}

	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

	public String getProductStatus() {
		return this.productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public String getPrepubStatus() {
		return this.prepubStatus;
	}

	public void setPrepubStatus(String prepubStatus) {
		this.prepubStatus = prepubStatus;
	}

	public String getExecutionTime() {
		return this.executionTime;
	}

	public void setExecutionTime(String executionTime) {
		this.executionTime = executionTime;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getBehaviorTableMetaId() {
		return this.behaviorTableMetaId;
	}

	public void setBehaviorTableMetaId(String behaviorTableMetaId) {
		this.behaviorTableMetaId = behaviorTableMetaId;
	}

	public String getUserTableMetaId() {
		return this.userTableMetaId;
	}

	public void setUserTableMetaId(String userTableMetaId) {
		this.userTableMetaId = userTableMetaId;
	}

	public String getItemTableMetaId() {
		return this.itemTableMetaId;
	}

	public void setItemTableMetaId(String itemTableMetaId) {
		this.itemTableMetaId = itemTableMetaId;
	}

	public String getUserConditionType() {
		return this.userConditionType;
	}

	public void setUserConditionType(String userConditionType) {
		this.userConditionType = userConditionType;
	}

	public String getUserConditionArray() {
		return this.userConditionArray;
	}

	public void setUserConditionArray(String userConditionArray) {
		this.userConditionArray = userConditionArray;
	}

	public String getUserConditionExpress() {
		return this.userConditionExpress;
	}

	public void setUserConditionExpress(String userConditionExpress) {
		this.userConditionExpress = userConditionExpress;
	}

	public String getStatisBehaviorConditionType() {
		return this.statisBehaviorConditionType;
	}

	public void setStatisBehaviorConditionType(String statisBehaviorConditionType) {
		this.statisBehaviorConditionType = statisBehaviorConditionType;
	}

	public String getStatisBehaviorConditionArray() {
		return this.statisBehaviorConditionArray;
	}

	public void setStatisBehaviorConditionArray(String statisBehaviorConditionArray) {
		this.statisBehaviorConditionArray = statisBehaviorConditionArray;
	}

	public String getStatisBehaviorConditionExpress() {
		return this.statisBehaviorConditionExpress;
	}

	public void setStatisBehaviorConditionExpress(String statisBehaviorConditionExpress) {
		this.statisBehaviorConditionExpress = statisBehaviorConditionExpress;
	}

	public String getControlType() {
		return this.controlType;
	}

	public void setControlType(String controlType) {
		this.controlType = controlType;
	}

	public String getControlGranularity() {
		return this.controlGranularity;
	}

	public void setControlGranularity(String controlGranularity) {
		this.controlGranularity = controlGranularity;
	}

	public String getControlLogic() {
		return this.controlLogic;
	}

	public void setControlLogic(String controlLogic) {
		this.controlLogic = controlLogic;
	}

	public String getItemConditionType() {
		return this.itemConditionType;
	}

	public void setItemConditionType(String itemConditionType) {
		this.itemConditionType = itemConditionType;
	}

	public String getItemConditionArray() {
		return this.itemConditionArray;
	}

	public void setItemConditionArray(String itemConditionArray) {
		this.itemConditionArray = itemConditionArray;
	}

	public String getItemConditionExpress() {
		return this.itemConditionExpress;
	}

	public void setItemConditionExpress(String itemConditionExpress) {
		this.itemConditionExpress = itemConditionExpress;
	}

	public String getGmtCreateTime() {
		return this.gmtCreateTime;
	}

	public void setGmtCreateTime(String gmtCreateTime) {
		this.gmtCreateTime = gmtCreateTime;
	}

	public String getGmtModifiedTime() {
		return this.gmtModifiedTime;
	}

	public void setGmtModifiedTime(String gmtModifiedTime) {
		this.gmtModifiedTime = gmtModifiedTime;
	}

	public Boolean getEverPublished() {
		return this.everPublished;
	}

	public void setEverPublished(Boolean everPublished) {
		this.everPublished = everPublished;
	}

	public List<TrafficControlTargetsItem> getTrafficControlTargets() {
		return this.trafficControlTargets;
	}

	public void setTrafficControlTargets(List<TrafficControlTargetsItem> trafficControlTargets) {
		this.trafficControlTargets = trafficControlTargets;
	}

	public static class TrafficControlTargetsItem {

		private String trafficControlTargetId;

		private String name;

		private String startTime;

		private String endTime;

		private String itemConditionType;

		private String itemConditionArray;

		private String itemConditionExpress;

		private String event;

		private Float value;

		private String statisPeriod;

		private Long toleranceValue;

		private String recallName;

		private String status;

		private String gmtCreateTime;

		private String gmtModifiedTime;

		private Boolean newProductRegulation;

		private SplitParts splitParts;

		public String getTrafficControlTargetId() {
			return this.trafficControlTargetId;
		}

		public void setTrafficControlTargetId(String trafficControlTargetId) {
			this.trafficControlTargetId = trafficControlTargetId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getItemConditionType() {
			return this.itemConditionType;
		}

		public void setItemConditionType(String itemConditionType) {
			this.itemConditionType = itemConditionType;
		}

		public String getItemConditionArray() {
			return this.itemConditionArray;
		}

		public void setItemConditionArray(String itemConditionArray) {
			this.itemConditionArray = itemConditionArray;
		}

		public String getItemConditionExpress() {
			return this.itemConditionExpress;
		}

		public void setItemConditionExpress(String itemConditionExpress) {
			this.itemConditionExpress = itemConditionExpress;
		}

		public String getEvent() {
			return this.event;
		}

		public void setEvent(String event) {
			this.event = event;
		}

		public Float getValue() {
			return this.value;
		}

		public void setValue(Float value) {
			this.value = value;
		}

		public String getStatisPeriod() {
			return this.statisPeriod;
		}

		public void setStatisPeriod(String statisPeriod) {
			this.statisPeriod = statisPeriod;
		}

		public Long getToleranceValue() {
			return this.toleranceValue;
		}

		public void setToleranceValue(Long toleranceValue) {
			this.toleranceValue = toleranceValue;
		}

		public String getRecallName() {
			return this.recallName;
		}

		public void setRecallName(String recallName) {
			this.recallName = recallName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getGmtCreateTime() {
			return this.gmtCreateTime;
		}

		public void setGmtCreateTime(String gmtCreateTime) {
			this.gmtCreateTime = gmtCreateTime;
		}

		public String getGmtModifiedTime() {
			return this.gmtModifiedTime;
		}

		public void setGmtModifiedTime(String gmtModifiedTime) {
			this.gmtModifiedTime = gmtModifiedTime;
		}

		public Boolean getNewProductRegulation() {
			return this.newProductRegulation;
		}

		public void setNewProductRegulation(Boolean newProductRegulation) {
			this.newProductRegulation = newProductRegulation;
		}

		public SplitParts getSplitParts() {
			return this.splitParts;
		}

		public void setSplitParts(SplitParts splitParts) {
			this.splitParts = splitParts;
		}

		public static class SplitParts {

			private List<Integer> timePoints;

			private List<Integer> setPoints;

			private List<Long> setValues;

			public List<Integer> getTimePoints() {
				return this.timePoints;
			}

			public void setTimePoints(List<Integer> timePoints) {
				this.timePoints = timePoints;
			}

			public List<Integer> getSetPoints() {
				return this.setPoints;
			}

			public void setSetPoints(List<Integer> setPoints) {
				this.setPoints = setPoints;
			}

			public List<Long> getSetValues() {
				return this.setValues;
			}

			public void setSetValues(List<Long> setValues) {
				this.setValues = setValues;
			}
		}
	}

	@Override
	public GetTrafficControlTaskResponse getInstance(UnmarshallerContext context) {
		return	GetTrafficControlTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
