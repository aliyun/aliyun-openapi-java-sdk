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
import com.aliyuncs.cdrs.transform.v20201101.ListVehicleDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVehicleDetailsResponse extends AcsResponse {

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

		private String vehicleId;

		private String vehicleColor;

		private String targetImageStoragePath;

		private String gender;

		private String personType;

		private String prefOutTime;

		private String popularPoi;

		private String popularAddress;

		private String sourceImageStoragePath;

		private String vehicleClass;

		private String vehicleApplication;

		private String personId;

		private String plateId;

		public String getVehicleId() {
			return this.vehicleId;
		}

		public void setVehicleId(String vehicleId) {
			this.vehicleId = vehicleId;
		}

		public String getVehicleColor() {
			return this.vehicleColor;
		}

		public void setVehicleColor(String vehicleColor) {
			this.vehicleColor = vehicleColor;
		}

		public String getTargetImageStoragePath() {
			return this.targetImageStoragePath;
		}

		public void setTargetImageStoragePath(String targetImageStoragePath) {
			this.targetImageStoragePath = targetImageStoragePath;
		}

		public String getGender() {
			return this.gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getPersonType() {
			return this.personType;
		}

		public void setPersonType(String personType) {
			this.personType = personType;
		}

		public String getPrefOutTime() {
			return this.prefOutTime;
		}

		public void setPrefOutTime(String prefOutTime) {
			this.prefOutTime = prefOutTime;
		}

		public String getPopularPoi() {
			return this.popularPoi;
		}

		public void setPopularPoi(String popularPoi) {
			this.popularPoi = popularPoi;
		}

		public String getPopularAddress() {
			return this.popularAddress;
		}

		public void setPopularAddress(String popularAddress) {
			this.popularAddress = popularAddress;
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

		public String getVehicleApplication() {
			return this.vehicleApplication;
		}

		public void setVehicleApplication(String vehicleApplication) {
			this.vehicleApplication = vehicleApplication;
		}

		public String getPersonId() {
			return this.personId;
		}

		public void setPersonId(String personId) {
			this.personId = personId;
		}

		public String getPlateId() {
			return this.plateId;
		}

		public void setPlateId(String plateId) {
			this.plateId = plateId;
		}
	}

	@Override
	public ListVehicleDetailsResponse getInstance(UnmarshallerContext context) {
		return	ListVehicleDetailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
