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

package com.aliyuncs.cd.model.v2021127;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cd.transform.v2021127.ListShopResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListShopResponse extends AcsResponse {

	private Boolean success;

	private String message;

	private String code;

	private Integer httpStatusCode;

	private String requestId;

	private Long totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<DataItem> data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String shopId;

		private String shopName;

		private String location;

		private String longitude;

		private String latitude;

		private String regionAddress;

		private String regionCode;

		private String remark;

		private Integer deviceNum;

		private Long gmtCreateTime;

		private String weekdaysStartTime;

		private String weekdaysEndTime;

		private String weekendStartTime;

		private String weekendEndTime;

		private Integer businessStatus;

		private List<String> deviceMacList;

		private List<String> shopGroupIds;

		public String getShopId() {
			return this.shopId;
		}

		public void setShopId(String shopId) {
			this.shopId = shopId;
		}

		public String getShopName() {
			return this.shopName;
		}

		public void setShopName(String shopName) {
			this.shopName = shopName;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getLongitude() {
			return this.longitude;
		}

		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}

		public String getLatitude() {
			return this.latitude;
		}

		public void setLatitude(String latitude) {
			this.latitude = latitude;
		}

		public String getRegionAddress() {
			return this.regionAddress;
		}

		public void setRegionAddress(String regionAddress) {
			this.regionAddress = regionAddress;
		}

		public String getRegionCode() {
			return this.regionCode;
		}

		public void setRegionCode(String regionCode) {
			this.regionCode = regionCode;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public Integer getDeviceNum() {
			return this.deviceNum;
		}

		public void setDeviceNum(Integer deviceNum) {
			this.deviceNum = deviceNum;
		}

		public Long getGmtCreateTime() {
			return this.gmtCreateTime;
		}

		public void setGmtCreateTime(Long gmtCreateTime) {
			this.gmtCreateTime = gmtCreateTime;
		}

		public String getWeekdaysStartTime() {
			return this.weekdaysStartTime;
		}

		public void setWeekdaysStartTime(String weekdaysStartTime) {
			this.weekdaysStartTime = weekdaysStartTime;
		}

		public String getWeekdaysEndTime() {
			return this.weekdaysEndTime;
		}

		public void setWeekdaysEndTime(String weekdaysEndTime) {
			this.weekdaysEndTime = weekdaysEndTime;
		}

		public String getWeekendStartTime() {
			return this.weekendStartTime;
		}

		public void setWeekendStartTime(String weekendStartTime) {
			this.weekendStartTime = weekendStartTime;
		}

		public String getWeekendEndTime() {
			return this.weekendEndTime;
		}

		public void setWeekendEndTime(String weekendEndTime) {
			this.weekendEndTime = weekendEndTime;
		}

		public Integer getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(Integer businessStatus) {
			this.businessStatus = businessStatus;
		}

		public List<String> getDeviceMacList() {
			return this.deviceMacList;
		}

		public void setDeviceMacList(List<String> deviceMacList) {
			this.deviceMacList = deviceMacList;
		}

		public List<String> getShopGroupIds() {
			return this.shopGroupIds;
		}

		public void setShopGroupIds(List<String> shopGroupIds) {
			this.shopGroupIds = shopGroupIds;
		}
	}

	@Override
	public ListShopResponse getInstance(UnmarshallerContext context) {
		return	ListShopResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
