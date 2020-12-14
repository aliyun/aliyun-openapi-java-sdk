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

package com.aliyuncs.cdrs.model.v20201101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdrs.transform.v20201101.ListCityMapImageDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCityMapImageDetailsResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Long pageNumber;

	private Long pageSize;

	private Long totalCount;

	private List<Datas> data;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<Datas> getData() {
		return this.data;
	}

	public void setData(List<Datas> data) {
		this.data = data;
	}

	public static class Datas {

		private String personTargetImageStoragePath;

		private String ageLowerLimit;

		private String ageUpLimit;

		private String vehicleColor;

		private String trousersColor;

		private String dataSourceId;

		private String gender;

		private String ageLowerLimitReliability;

		private String genderCodeReliability;

		private String vehicleClassReliability;

		private String recordId;

		private String ageCodeReliability;

		private String sourceImageStoragePath;

		private String vehicleClass;

		private String motorTargetImageStoragePath;

		private String coatColor;

		private String faceTargetImageStoragePath;

		private String shotTime;

		private String vehicleColorReliability;

		private String trousersColorReliability;

		private String coatColorReliability;

		private String leftTopX;

		private String leftTopY;

		private String rightBottomX;

		private String rightBottomY;

		public String getPersonTargetImageStoragePath() {
			return this.personTargetImageStoragePath;
		}

		public void setPersonTargetImageStoragePath(String personTargetImageStoragePath) {
			this.personTargetImageStoragePath = personTargetImageStoragePath;
		}

		public String getAgeLowerLimit() {
			return this.ageLowerLimit;
		}

		public void setAgeLowerLimit(String ageLowerLimit) {
			this.ageLowerLimit = ageLowerLimit;
		}

		public String getAgeUpLimit() {
			return this.ageUpLimit;
		}

		public void setAgeUpLimit(String ageUpLimit) {
			this.ageUpLimit = ageUpLimit;
		}

		public String getVehicleColor() {
			return this.vehicleColor;
		}

		public void setVehicleColor(String vehicleColor) {
			this.vehicleColor = vehicleColor;
		}

		public String getTrousersColor() {
			return this.trousersColor;
		}

		public void setTrousersColor(String trousersColor) {
			this.trousersColor = trousersColor;
		}

		public String getDataSourceId() {
			return this.dataSourceId;
		}

		public void setDataSourceId(String dataSourceId) {
			this.dataSourceId = dataSourceId;
		}

		public String getGender() {
			return this.gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getAgeLowerLimitReliability() {
			return this.ageLowerLimitReliability;
		}

		public void setAgeLowerLimitReliability(String ageLowerLimitReliability) {
			this.ageLowerLimitReliability = ageLowerLimitReliability;
		}

		public String getGenderCodeReliability() {
			return this.genderCodeReliability;
		}

		public void setGenderCodeReliability(String genderCodeReliability) {
			this.genderCodeReliability = genderCodeReliability;
		}

		public String getVehicleClassReliability() {
			return this.vehicleClassReliability;
		}

		public void setVehicleClassReliability(String vehicleClassReliability) {
			this.vehicleClassReliability = vehicleClassReliability;
		}

		public String getRecordId() {
			return this.recordId;
		}

		public void setRecordId(String recordId) {
			this.recordId = recordId;
		}

		public String getAgeCodeReliability() {
			return this.ageCodeReliability;
		}

		public void setAgeCodeReliability(String ageCodeReliability) {
			this.ageCodeReliability = ageCodeReliability;
		}

		public String getSourceImageStoragePath() {
			return this.sourceImageStoragePath;
		}

		public void setSourceImageStoragePath(String sourceImageStoragePath) {
			this.sourceImageStoragePath = sourceImageStoragePath;
		}

		public String getVehicleClass() {
			return this.vehicleClass;
		}

		public void setVehicleClass(String vehicleClass) {
			this.vehicleClass = vehicleClass;
		}

		public String getMotorTargetImageStoragePath() {
			return this.motorTargetImageStoragePath;
		}

		public void setMotorTargetImageStoragePath(String motorTargetImageStoragePath) {
			this.motorTargetImageStoragePath = motorTargetImageStoragePath;
		}

		public String getCoatColor() {
			return this.coatColor;
		}

		public void setCoatColor(String coatColor) {
			this.coatColor = coatColor;
		}

		public String getFaceTargetImageStoragePath() {
			return this.faceTargetImageStoragePath;
		}

		public void setFaceTargetImageStoragePath(String faceTargetImageStoragePath) {
			this.faceTargetImageStoragePath = faceTargetImageStoragePath;
		}

		public String getShotTime() {
			return this.shotTime;
		}

		public void setShotTime(String shotTime) {
			this.shotTime = shotTime;
		}

		public String getVehicleColorReliability() {
			return this.vehicleColorReliability;
		}

		public void setVehicleColorReliability(String vehicleColorReliability) {
			this.vehicleColorReliability = vehicleColorReliability;
		}

		public String getTrousersColorReliability() {
			return this.trousersColorReliability;
		}

		public void setTrousersColorReliability(String trousersColorReliability) {
			this.trousersColorReliability = trousersColorReliability;
		}

		public String getCoatColorReliability() {
			return this.coatColorReliability;
		}

		public void setCoatColorReliability(String coatColorReliability) {
			this.coatColorReliability = coatColorReliability;
		}

		public String getLeftTopX() {
			return this.leftTopX;
		}

		public void setLeftTopX(String leftTopX) {
			this.leftTopX = leftTopX;
		}

		public String getLeftTopY() {
			return this.leftTopY;
		}

		public void setLeftTopY(String leftTopY) {
			this.leftTopY = leftTopY;
		}

		public String getRightBottomX() {
			return this.rightBottomX;
		}

		public void setRightBottomX(String rightBottomX) {
			this.rightBottomX = rightBottomX;
		}

		public String getRightBottomY() {
			return this.rightBottomY;
		}

		public void setRightBottomY(String rightBottomY) {
			this.rightBottomY = rightBottomY;
		}
	}

	@Override
	public ListCityMapImageDetailsResponse getInstance(UnmarshallerContext context) {
		return	ListCityMapImageDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
