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

package com.aliyuncs.ocr.model.v20191230;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ocr.transform.v20191230.RecognizeDrivingLicenseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeDrivingLicenseResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private BackResult backResult;

		private FaceResult faceResult;

		public BackResult getBackResult() {
			return this.backResult;
		}

		public void setBackResult(BackResult backResult) {
			this.backResult = backResult;
		}

		public FaceResult getFaceResult() {
			return this.faceResult;
		}

		public void setFaceResult(FaceResult faceResult) {
			this.faceResult = faceResult;
		}

		public static class BackResult {

			private String overallDimension;

			private String inspectionRecord;

			private String unladenMass;

			private String fileNumber;

			private String tractionMass;

			private String grossMass;

			private String plateNumber;

			private String approvedPassengerCapacity;

			private String energyType;

			private String approvedLoad;

			public String getOverallDimension() {
				return this.overallDimension;
			}

			public void setOverallDimension(String overallDimension) {
				this.overallDimension = overallDimension;
			}

			public String getInspectionRecord() {
				return this.inspectionRecord;
			}

			public void setInspectionRecord(String inspectionRecord) {
				this.inspectionRecord = inspectionRecord;
			}

			public String getUnladenMass() {
				return this.unladenMass;
			}

			public void setUnladenMass(String unladenMass) {
				this.unladenMass = unladenMass;
			}

			public String getFileNumber() {
				return this.fileNumber;
			}

			public void setFileNumber(String fileNumber) {
				this.fileNumber = fileNumber;
			}

			public String getTractionMass() {
				return this.tractionMass;
			}

			public void setTractionMass(String tractionMass) {
				this.tractionMass = tractionMass;
			}

			public String getGrossMass() {
				return this.grossMass;
			}

			public void setGrossMass(String grossMass) {
				this.grossMass = grossMass;
			}

			public String getPlateNumber() {
				return this.plateNumber;
			}

			public void setPlateNumber(String plateNumber) {
				this.plateNumber = plateNumber;
			}

			public String getApprovedPassengerCapacity() {
				return this.approvedPassengerCapacity;
			}

			public void setApprovedPassengerCapacity(String approvedPassengerCapacity) {
				this.approvedPassengerCapacity = approvedPassengerCapacity;
			}

			public String getEnergyType() {
				return this.energyType;
			}

			public void setEnergyType(String energyType) {
				this.energyType = energyType;
			}

			public String getApprovedLoad() {
				return this.approvedLoad;
			}

			public void setApprovedLoad(String approvedLoad) {
				this.approvedLoad = approvedLoad;
			}
		}

		public static class FaceResult {

			private String issueDate;

			private String model;

			private String vehicleType;

			private String owner;

			private String engineNumber;

			private String plateNumber;

			private String address;

			private String useCharacter;

			private String vin;

			private String registerDate;

			public String getIssueDate() {
				return this.issueDate;
			}

			public void setIssueDate(String issueDate) {
				this.issueDate = issueDate;
			}

			public String getModel() {
				return this.model;
			}

			public void setModel(String model) {
				this.model = model;
			}

			public String getVehicleType() {
				return this.vehicleType;
			}

			public void setVehicleType(String vehicleType) {
				this.vehicleType = vehicleType;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public String getEngineNumber() {
				return this.engineNumber;
			}

			public void setEngineNumber(String engineNumber) {
				this.engineNumber = engineNumber;
			}

			public String getPlateNumber() {
				return this.plateNumber;
			}

			public void setPlateNumber(String plateNumber) {
				this.plateNumber = plateNumber;
			}

			public String getAddress() {
				return this.address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getUseCharacter() {
				return this.useCharacter;
			}

			public void setUseCharacter(String useCharacter) {
				this.useCharacter = useCharacter;
			}

			public String getVin() {
				return this.vin;
			}

			public void setVin(String vin) {
				this.vin = vin;
			}

			public String getRegisterDate() {
				return this.registerDate;
			}

			public void setRegisterDate(String registerDate) {
				this.registerDate = registerDate;
			}
		}
	}

	@Override
	public RecognizeDrivingLicenseResponse getInstance(UnmarshallerContext context) {
		return	RecognizeDrivingLicenseResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
