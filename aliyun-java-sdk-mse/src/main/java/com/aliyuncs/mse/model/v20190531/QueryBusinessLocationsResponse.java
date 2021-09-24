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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.QueryBusinessLocationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryBusinessLocationsResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String errorCode;

	private String success;

	private List<LocationData> data;

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<LocationData> getData() {
		return this.data;
	}

	public void setData(List<LocationData> data) {
		this.data = data;
	}

	public static class LocationData {

		private Integer ordering;

		private String type;

		private String districtEnName;

		private String showName;

		private String districtCnName;

		private String enName;

		private String districtId;

		private String districtShowName;

		private String description;

		private String enDescription;

		private String cnName;

		private String name;

		private Integer districtOrdering;

		public Integer getOrdering() {
			return this.ordering;
		}

		public void setOrdering(Integer ordering) {
			this.ordering = ordering;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDistrictEnName() {
			return this.districtEnName;
		}

		public void setDistrictEnName(String districtEnName) {
			this.districtEnName = districtEnName;
		}

		public String getShowName() {
			return this.showName;
		}

		public void setShowName(String showName) {
			this.showName = showName;
		}

		public String getDistrictCnName() {
			return this.districtCnName;
		}

		public void setDistrictCnName(String districtCnName) {
			this.districtCnName = districtCnName;
		}

		public String getEnName() {
			return this.enName;
		}

		public void setEnName(String enName) {
			this.enName = enName;
		}

		public String getDistrictId() {
			return this.districtId;
		}

		public void setDistrictId(String districtId) {
			this.districtId = districtId;
		}

		public String getDistrictShowName() {
			return this.districtShowName;
		}

		public void setDistrictShowName(String districtShowName) {
			this.districtShowName = districtShowName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getEnDescription() {
			return this.enDescription;
		}

		public void setEnDescription(String enDescription) {
			this.enDescription = enDescription;
		}

		public String getCnName() {
			return this.cnName;
		}

		public void setCnName(String cnName) {
			this.cnName = cnName;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getDistrictOrdering() {
			return this.districtOrdering;
		}

		public void setDistrictOrdering(Integer districtOrdering) {
			this.districtOrdering = districtOrdering;
		}
	}

	@Override
	public QueryBusinessLocationsResponse getInstance(UnmarshallerContext context) {
		return	QueryBusinessLocationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
