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

package com.aliyuncs.dt_oc_info.model.v20220829;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dt_oc_info.transform.v20220829.GetOcOperationPurchaseLandResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOcOperationPurchaseLandResponse extends AcsResponse {

	private String code;

	private Boolean success;

	private String message;

	private Integer totalNum;

	private Integer pageIndex;

	private Integer pageNum;

	private String requestId;

	private List<DataItem> data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String entName;

		private String regionName;

		private String electronicNo;

		private String projectName;

		private String location;

		private String area;

		private String releaseDate;

		private String landSource;

		private String landUse;

		private String landLevel;

		private String signingMode;

		private String useYear;

		private String industry;

		private String promiseDeliveryDate;

		private String promiseStartDate;

		private String promiseEndDate;

		private String department;

		private String price;

		private String volumeFractionUpperBound;

		private String volumeFractionLowerBound;

		public String getEntName() {
			return this.entName;
		}

		public void setEntName(String entName) {
			this.entName = entName;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public String getElectronicNo() {
			return this.electronicNo;
		}

		public void setElectronicNo(String electronicNo) {
			this.electronicNo = electronicNo;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getArea() {
			return this.area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public String getReleaseDate() {
			return this.releaseDate;
		}

		public void setReleaseDate(String releaseDate) {
			this.releaseDate = releaseDate;
		}

		public String getLandSource() {
			return this.landSource;
		}

		public void setLandSource(String landSource) {
			this.landSource = landSource;
		}

		public String getLandUse() {
			return this.landUse;
		}

		public void setLandUse(String landUse) {
			this.landUse = landUse;
		}

		public String getLandLevel() {
			return this.landLevel;
		}

		public void setLandLevel(String landLevel) {
			this.landLevel = landLevel;
		}

		public String getSigningMode() {
			return this.signingMode;
		}

		public void setSigningMode(String signingMode) {
			this.signingMode = signingMode;
		}

		public String getUseYear() {
			return this.useYear;
		}

		public void setUseYear(String useYear) {
			this.useYear = useYear;
		}

		public String getIndustry() {
			return this.industry;
		}

		public void setIndustry(String industry) {
			this.industry = industry;
		}

		public String getPromiseDeliveryDate() {
			return this.promiseDeliveryDate;
		}

		public void setPromiseDeliveryDate(String promiseDeliveryDate) {
			this.promiseDeliveryDate = promiseDeliveryDate;
		}

		public String getPromiseStartDate() {
			return this.promiseStartDate;
		}

		public void setPromiseStartDate(String promiseStartDate) {
			this.promiseStartDate = promiseStartDate;
		}

		public String getPromiseEndDate() {
			return this.promiseEndDate;
		}

		public void setPromiseEndDate(String promiseEndDate) {
			this.promiseEndDate = promiseEndDate;
		}

		public String getDepartment() {
			return this.department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getPrice() {
			return this.price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public String getVolumeFractionUpperBound() {
			return this.volumeFractionUpperBound;
		}

		public void setVolumeFractionUpperBound(String volumeFractionUpperBound) {
			this.volumeFractionUpperBound = volumeFractionUpperBound;
		}

		public String getVolumeFractionLowerBound() {
			return this.volumeFractionLowerBound;
		}

		public void setVolumeFractionLowerBound(String volumeFractionLowerBound) {
			this.volumeFractionLowerBound = volumeFractionLowerBound;
		}
	}

	@Override
	public GetOcOperationPurchaseLandResponse getInstance(UnmarshallerContext context) {
		return	GetOcOperationPurchaseLandResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
