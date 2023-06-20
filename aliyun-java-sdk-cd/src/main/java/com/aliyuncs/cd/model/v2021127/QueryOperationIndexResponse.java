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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cd.transform.v2021127.QueryOperationIndexResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOperationIndexResponse extends AcsResponse {

	private Boolean success;

	private String message;

	private String code;

	private Integer httpStatusCode;

	private String requestId;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private ShopIndex shopIndex;

		private DeviceIndex deviceIndex;

		private TicketIndex ticketIndex;

		public ShopIndex getShopIndex() {
			return this.shopIndex;
		}

		public void setShopIndex(ShopIndex shopIndex) {
			this.shopIndex = shopIndex;
		}

		public DeviceIndex getDeviceIndex() {
			return this.deviceIndex;
		}

		public void setDeviceIndex(DeviceIndex deviceIndex) {
			this.deviceIndex = deviceIndex;
		}

		public TicketIndex getTicketIndex() {
			return this.ticketIndex;
		}

		public void setTicketIndex(TicketIndex ticketIndex) {
			this.ticketIndex = ticketIndex;
		}

		public static class ShopIndex {

			private Integer shopTotal;

			private Integer netWorkShopNum;

			private Integer installedShopNum;

			private Integer notWorkShopNum;

			private Integer upholdShopNum;

			private Integer normalShopNum;

			private Integer faultShopNum;

			private Integer highFreqFaultShopNum;

			public Integer getShopTotal() {
				return this.shopTotal;
			}

			public void setShopTotal(Integer shopTotal) {
				this.shopTotal = shopTotal;
			}

			public Integer getNetWorkShopNum() {
				return this.netWorkShopNum;
			}

			public void setNetWorkShopNum(Integer netWorkShopNum) {
				this.netWorkShopNum = netWorkShopNum;
			}

			public Integer getInstalledShopNum() {
				return this.installedShopNum;
			}

			public void setInstalledShopNum(Integer installedShopNum) {
				this.installedShopNum = installedShopNum;
			}

			public Integer getNotWorkShopNum() {
				return this.notWorkShopNum;
			}

			public void setNotWorkShopNum(Integer notWorkShopNum) {
				this.notWorkShopNum = notWorkShopNum;
			}

			public Integer getUpholdShopNum() {
				return this.upholdShopNum;
			}

			public void setUpholdShopNum(Integer upholdShopNum) {
				this.upholdShopNum = upholdShopNum;
			}

			public Integer getNormalShopNum() {
				return this.normalShopNum;
			}

			public void setNormalShopNum(Integer normalShopNum) {
				this.normalShopNum = normalShopNum;
			}

			public Integer getFaultShopNum() {
				return this.faultShopNum;
			}

			public void setFaultShopNum(Integer faultShopNum) {
				this.faultShopNum = faultShopNum;
			}

			public Integer getHighFreqFaultShopNum() {
				return this.highFreqFaultShopNum;
			}

			public void setHighFreqFaultShopNum(Integer highFreqFaultShopNum) {
				this.highFreqFaultShopNum = highFreqFaultShopNum;
			}
		}

		public static class DeviceIndex {

			private Integer onlineNum;

			private Integer cpuAverage;

			private Integer storageAverage;

			private Integer networkTraffic;

			private Integer totalWorkingDeviceNum;

			private Integer normalDeviceNum;

			private Integer faultDeviceNum;

			private Integer highFreqFaultDeviceNum;

			public Integer getOnlineNum() {
				return this.onlineNum;
			}

			public void setOnlineNum(Integer onlineNum) {
				this.onlineNum = onlineNum;
			}

			public Integer getCpuAverage() {
				return this.cpuAverage;
			}

			public void setCpuAverage(Integer cpuAverage) {
				this.cpuAverage = cpuAverage;
			}

			public Integer getStorageAverage() {
				return this.storageAverage;
			}

			public void setStorageAverage(Integer storageAverage) {
				this.storageAverage = storageAverage;
			}

			public Integer getNetworkTraffic() {
				return this.networkTraffic;
			}

			public void setNetworkTraffic(Integer networkTraffic) {
				this.networkTraffic = networkTraffic;
			}

			public Integer getTotalWorkingDeviceNum() {
				return this.totalWorkingDeviceNum;
			}

			public void setTotalWorkingDeviceNum(Integer totalWorkingDeviceNum) {
				this.totalWorkingDeviceNum = totalWorkingDeviceNum;
			}

			public Integer getNormalDeviceNum() {
				return this.normalDeviceNum;
			}

			public void setNormalDeviceNum(Integer normalDeviceNum) {
				this.normalDeviceNum = normalDeviceNum;
			}

			public Integer getFaultDeviceNum() {
				return this.faultDeviceNum;
			}

			public void setFaultDeviceNum(Integer faultDeviceNum) {
				this.faultDeviceNum = faultDeviceNum;
			}

			public Integer getHighFreqFaultDeviceNum() {
				return this.highFreqFaultDeviceNum;
			}

			public void setHighFreqFaultDeviceNum(Integer highFreqFaultDeviceNum) {
				this.highFreqFaultDeviceNum = highFreqFaultDeviceNum;
			}
		}

		public static class TicketIndex {

			private Integer totalTicketNum;

			private Integer autoRecoverTicketNum;

			private Integer openTicketNum;

			private Double recoverRate;

			private Double autoRecoverRate;

			public Integer getTotalTicketNum() {
				return this.totalTicketNum;
			}

			public void setTotalTicketNum(Integer totalTicketNum) {
				this.totalTicketNum = totalTicketNum;
			}

			public Integer getAutoRecoverTicketNum() {
				return this.autoRecoverTicketNum;
			}

			public void setAutoRecoverTicketNum(Integer autoRecoverTicketNum) {
				this.autoRecoverTicketNum = autoRecoverTicketNum;
			}

			public Integer getOpenTicketNum() {
				return this.openTicketNum;
			}

			public void setOpenTicketNum(Integer openTicketNum) {
				this.openTicketNum = openTicketNum;
			}

			public Double getRecoverRate() {
				return this.recoverRate;
			}

			public void setRecoverRate(Double recoverRate) {
				this.recoverRate = recoverRate;
			}

			public Double getAutoRecoverRate() {
				return this.autoRecoverRate;
			}

			public void setAutoRecoverRate(Double autoRecoverRate) {
				this.autoRecoverRate = autoRecoverRate;
			}
		}
	}

	@Override
	public QueryOperationIndexResponse getInstance(UnmarshallerContext context) {
		return	QueryOperationIndexResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
