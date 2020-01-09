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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeMeasurementDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMeasurementDataResponse extends AcsResponse {

	private String requestId;

	private List<MeasurementData> measurementDatas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MeasurementData> getMeasurementDatas() {
		return this.measurementDatas;
	}

	public void setMeasurementDatas(List<MeasurementData> measurementDatas) {
		this.measurementDatas = measurementDatas;
	}

	public static class MeasurementData {

		private String chargeModel;

		private String costCycle;

		private String costStartTime;

		private String costEndTime;

		private List<BandWidthFeeData> bandWidthFeeDatas;

		private ResourceFeeData resourceFeeData;

		public String getChargeModel() {
			return this.chargeModel;
		}

		public void setChargeModel(String chargeModel) {
			this.chargeModel = chargeModel;
		}

		public String getCostCycle() {
			return this.costCycle;
		}

		public void setCostCycle(String costCycle) {
			this.costCycle = costCycle;
		}

		public String getCostStartTime() {
			return this.costStartTime;
		}

		public void setCostStartTime(String costStartTime) {
			this.costStartTime = costStartTime;
		}

		public String getCostEndTime() {
			return this.costEndTime;
		}

		public void setCostEndTime(String costEndTime) {
			this.costEndTime = costEndTime;
		}

		public List<BandWidthFeeData> getBandWidthFeeDatas() {
			return this.bandWidthFeeDatas;
		}

		public void setBandWidthFeeDatas(List<BandWidthFeeData> bandWidthFeeDatas) {
			this.bandWidthFeeDatas = bandWidthFeeDatas;
		}

		public ResourceFeeData getResourceFeeData() {
			return this.resourceFeeData;
		}

		public void setResourceFeeData(ResourceFeeData resourceFeeData) {
			this.resourceFeeData = resourceFeeData;
		}

		public static class BandWidthFeeData {

			private Integer costVal;

			private String costCode;

			private String costName;

			public Integer getCostVal() {
				return this.costVal;
			}

			public void setCostVal(Integer costVal) {
				this.costVal = costVal;
			}

			public String getCostCode() {
				return this.costCode;
			}

			public void setCostCode(String costCode) {
				this.costCode = costCode;
			}

			public String getCostName() {
				return this.costName;
			}

			public void setCostName(String costName) {
				this.costName = costName;
			}
		}

		public static class ResourceFeeData {

			private Integer storage;

			private Integer memory;

			private Integer vcpu;

			public Integer getStorage() {
				return this.storage;
			}

			public void setStorage(Integer storage) {
				this.storage = storage;
			}

			public Integer getMemory() {
				return this.memory;
			}

			public void setMemory(Integer memory) {
				this.memory = memory;
			}

			public Integer getVcpu() {
				return this.vcpu;
			}

			public void setVcpu(Integer vcpu) {
				this.vcpu = vcpu;
			}
		}
	}

	@Override
	public DescribeMeasurementDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeMeasurementDataResponseUnmarshaller.unmarshall(this, context);
	}
}
