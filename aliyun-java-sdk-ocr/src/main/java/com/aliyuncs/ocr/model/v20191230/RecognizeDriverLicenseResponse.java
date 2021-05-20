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
import com.aliyuncs.ocr.transform.v20191230.RecognizeDriverLicenseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeDriverLicenseResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

			private String archiveNumber;

			private String name;

			private String cardNumber;

			private String record;

			public String getArchiveNumber() {
				return this.archiveNumber;
			}

			public void setArchiveNumber(String archiveNumber) {
				this.archiveNumber = archiveNumber;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCardNumber() {
				return this.cardNumber;
			}

			public void setCardNumber(String cardNumber) {
				this.cardNumber = cardNumber;
			}

			public String getRecord() {
				return this.record;
			}

			public void setRecord(String record) {
				this.record = record;
			}
		}

		public static class FaceResult {

			private String vehicleType;

			private String issueDate;

			private String endDate;

			private String gender;

			private String address;

			private String startDate;

			private String licenseNumber;

			private String name;

			private String issueUnit;

			public String getVehicleType() {
				return this.vehicleType;
			}

			public void setVehicleType(String vehicleType) {
				this.vehicleType = vehicleType;
			}

			public String getIssueDate() {
				return this.issueDate;
			}

			public void setIssueDate(String issueDate) {
				this.issueDate = issueDate;
			}

			public String getEndDate() {
				return this.endDate;
			}

			public void setEndDate(String endDate) {
				this.endDate = endDate;
			}

			public String getGender() {
				return this.gender;
			}

			public void setGender(String gender) {
				this.gender = gender;
			}

			public String getAddress() {
				return this.address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getStartDate() {
				return this.startDate;
			}

			public void setStartDate(String startDate) {
				this.startDate = startDate;
			}

			public String getLicenseNumber() {
				return this.licenseNumber;
			}

			public void setLicenseNumber(String licenseNumber) {
				this.licenseNumber = licenseNumber;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getIssueUnit() {
				return this.issueUnit;
			}

			public void setIssueUnit(String issueUnit) {
				this.issueUnit = issueUnit;
			}
		}
	}

	@Override
	public RecognizeDriverLicenseResponse getInstance(UnmarshallerContext context) {
		return	RecognizeDriverLicenseResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
