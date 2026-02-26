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
import com.aliyuncs.pairecservice.transform.v20221213.GetTrafficControlTargetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTrafficControlTargetResponse extends AcsResponse {

	private String requestId;

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

	private Boolean newProductRegulation;

	private SplitParts splitParts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

		private List<Long> timePoints;

		private List<Long> setValues;

		private List<Long> setPoints;

		public List<Long> getTimePoints() {
			return this.timePoints;
		}

		public void setTimePoints(List<Long> timePoints) {
			this.timePoints = timePoints;
		}

		public List<Long> getSetValues() {
			return this.setValues;
		}

		public void setSetValues(List<Long> setValues) {
			this.setValues = setValues;
		}

		public List<Long> getSetPoints() {
			return this.setPoints;
		}

		public void setSetPoints(List<Long> setPoints) {
			this.setPoints = setPoints;
		}
	}

	@Override
	public GetTrafficControlTargetResponse getInstance(UnmarshallerContext context) {
		return	GetTrafficControlTargetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
