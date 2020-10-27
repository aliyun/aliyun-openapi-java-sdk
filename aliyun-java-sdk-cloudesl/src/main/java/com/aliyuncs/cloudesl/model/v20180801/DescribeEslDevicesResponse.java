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

package com.aliyuncs.cloudesl.model.v20180801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudesl.transform.v20180801.DescribeEslDevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEslDevicesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String message;

	private String errorCode;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<EslDeviceInfo> eslDevices;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
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

	public List<EslDeviceInfo> getEslDevices() {
		return this.eslDevices;
	}

	public void setEslDevices(List<EslDeviceInfo> eslDevices) {
		this.eslDevices = eslDevices;
	}

	public static class EslDeviceInfo {

		private String companyId;

		private String storeId;

		private String mac;

		private String eslBarCode;

		private String itemBarCode;

		private String vendor;

		private String connectAp;

		private String type;

		private String model;

		private String beBind;

		private String screenWidth;

		private String screenHeight;

		private String lastCommunicateTime;

		private Integer batteryLevel;

		private String eslStatus;

		private String shelfCode;

		private String positionCode;

		private Long itemId;

		private String itemTitle;

		private Integer itemActionPrice;

		private String itemPriceUnit;

		public String getCompanyId() {
			return this.companyId;
		}

		public void setCompanyId(String companyId) {
			this.companyId = companyId;
		}

		public String getStoreId() {
			return this.storeId;
		}

		public void setStoreId(String storeId) {
			this.storeId = storeId;
		}

		public String getMac() {
			return this.mac;
		}

		public void setMac(String mac) {
			this.mac = mac;
		}

		public String getEslBarCode() {
			return this.eslBarCode;
		}

		public void setEslBarCode(String eslBarCode) {
			this.eslBarCode = eslBarCode;
		}

		public String getItemBarCode() {
			return this.itemBarCode;
		}

		public void setItemBarCode(String itemBarCode) {
			this.itemBarCode = itemBarCode;
		}

		public String getVendor() {
			return this.vendor;
		}

		public void setVendor(String vendor) {
			this.vendor = vendor;
		}

		public String getConnectAp() {
			return this.connectAp;
		}

		public void setConnectAp(String connectAp) {
			this.connectAp = connectAp;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getModel() {
			return this.model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getBeBind() {
			return this.beBind;
		}

		public void setBeBind(String beBind) {
			this.beBind = beBind;
		}

		public String getScreenWidth() {
			return this.screenWidth;
		}

		public void setScreenWidth(String screenWidth) {
			this.screenWidth = screenWidth;
		}

		public String getScreenHeight() {
			return this.screenHeight;
		}

		public void setScreenHeight(String screenHeight) {
			this.screenHeight = screenHeight;
		}

		public String getLastCommunicateTime() {
			return this.lastCommunicateTime;
		}

		public void setLastCommunicateTime(String lastCommunicateTime) {
			this.lastCommunicateTime = lastCommunicateTime;
		}

		public Integer getBatteryLevel() {
			return this.batteryLevel;
		}

		public void setBatteryLevel(Integer batteryLevel) {
			this.batteryLevel = batteryLevel;
		}

		public String getEslStatus() {
			return this.eslStatus;
		}

		public void setEslStatus(String eslStatus) {
			this.eslStatus = eslStatus;
		}

		public String getShelfCode() {
			return this.shelfCode;
		}

		public void setShelfCode(String shelfCode) {
			this.shelfCode = shelfCode;
		}

		public String getPositionCode() {
			return this.positionCode;
		}

		public void setPositionCode(String positionCode) {
			this.positionCode = positionCode;
		}

		public Long getItemId() {
			return this.itemId;
		}

		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}

		public String getItemTitle() {
			return this.itemTitle;
		}

		public void setItemTitle(String itemTitle) {
			this.itemTitle = itemTitle;
		}

		public Integer getItemActionPrice() {
			return this.itemActionPrice;
		}

		public void setItemActionPrice(Integer itemActionPrice) {
			this.itemActionPrice = itemActionPrice;
		}

		public String getItemPriceUnit() {
			return this.itemPriceUnit;
		}

		public void setItemPriceUnit(String itemPriceUnit) {
			this.itemPriceUnit = itemPriceUnit;
		}
	}

	@Override
	public DescribeEslDevicesResponse getInstance(UnmarshallerContext context) {
		return	DescribeEslDevicesResponseUnmarshaller.unmarshall(this, context);
	}
}
