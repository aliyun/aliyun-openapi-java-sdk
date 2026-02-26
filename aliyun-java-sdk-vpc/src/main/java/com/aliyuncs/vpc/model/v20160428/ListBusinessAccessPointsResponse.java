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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.ListBusinessAccessPointsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBusinessAccessPointsResponse extends AcsResponse {

	private String requestId;

	private List<BusinessAccessPointsItem> businessAccessPoints;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BusinessAccessPointsItem> getBusinessAccessPoints() {
		return this.businessAccessPoints;
	}

	public void setBusinessAccessPoints(List<BusinessAccessPointsItem> businessAccessPoints) {
		this.businessAccessPoints = businessAccessPoints;
	}

	public static class BusinessAccessPointsItem {

		private String accessPointId;

		private String accessPointName;

		private String supportLineOperator;

		private String supportPortTypes;

		private String cloudBoxInstanceIds;

		private Double longitude;

		private Double latitude;

		private List<OpticalModuleModelsItem> opticalModuleModels;

		public String getAccessPointId() {
			return this.accessPointId;
		}

		public void setAccessPointId(String accessPointId) {
			this.accessPointId = accessPointId;
		}

		public String getAccessPointName() {
			return this.accessPointName;
		}

		public void setAccessPointName(String accessPointName) {
			this.accessPointName = accessPointName;
		}

		public String getSupportLineOperator() {
			return this.supportLineOperator;
		}

		public void setSupportLineOperator(String supportLineOperator) {
			this.supportLineOperator = supportLineOperator;
		}

		public String getSupportPortTypes() {
			return this.supportPortTypes;
		}

		public void setSupportPortTypes(String supportPortTypes) {
			this.supportPortTypes = supportPortTypes;
		}

		public String getCloudBoxInstanceIds() {
			return this.cloudBoxInstanceIds;
		}

		public void setCloudBoxInstanceIds(String cloudBoxInstanceIds) {
			this.cloudBoxInstanceIds = cloudBoxInstanceIds;
		}

		public Double getLongitude() {
			return this.longitude;
		}

		public void setLongitude(Double longitude) {
			this.longitude = longitude;
		}

		public Double getLatitude() {
			return this.latitude;
		}

		public void setLatitude(Double latitude) {
			this.latitude = latitude;
		}

		public List<OpticalModuleModelsItem> getOpticalModuleModels() {
			return this.opticalModuleModels;
		}

		public void setOpticalModuleModels(List<OpticalModuleModelsItem> opticalModuleModels) {
			this.opticalModuleModels = opticalModuleModels;
		}

		public static class OpticalModuleModelsItem {

			private String portType;

			private String opticalModuleModel;

			public String getPortType() {
				return this.portType;
			}

			public void setPortType(String portType) {
				this.portType = portType;
			}

			public String getOpticalModuleModel() {
				return this.opticalModuleModel;
			}

			public void setOpticalModuleModel(String opticalModuleModel) {
				this.opticalModuleModel = opticalModuleModel;
			}
		}
	}

	@Override
	public ListBusinessAccessPointsResponse getInstance(UnmarshallerContext context) {
		return	ListBusinessAccessPointsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
