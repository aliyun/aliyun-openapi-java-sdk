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

package com.aliyuncs.wyota.model.v20210420;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.wyota.transform.v20210420.ListDeviceSeatsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDeviceSeatsResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long totalCount;

		private List<DeviceSeatDTOListItem> deviceSeatDTOList;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<DeviceSeatDTOListItem> getDeviceSeatDTOList() {
			return this.deviceSeatDTOList;
		}

		public void setDeviceSeatDTOList(List<DeviceSeatDTOListItem> deviceSeatDTOList) {
			this.deviceSeatDTOList = deviceSeatDTOList;
		}

		public static class DeviceSeatDTOListItem {

			private String serialNo;

			private String siteId;

			private String zoneId;

			private String siteName;

			private String seatNo;

			private String seatName;

			private String label;

			public String getSerialNo() {
				return this.serialNo;
			}

			public void setSerialNo(String serialNo) {
				this.serialNo = serialNo;
			}

			public String getSiteId() {
				return this.siteId;
			}

			public void setSiteId(String siteId) {
				this.siteId = siteId;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getSiteName() {
				return this.siteName;
			}

			public void setSiteName(String siteName) {
				this.siteName = siteName;
			}

			public String getSeatNo() {
				return this.seatNo;
			}

			public void setSeatNo(String seatNo) {
				this.seatNo = seatNo;
			}

			public String getSeatName() {
				return this.seatName;
			}

			public void setSeatName(String seatName) {
				this.seatName = seatName;
			}

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}
		}
	}

	@Override
	public ListDeviceSeatsResponse getInstance(UnmarshallerContext context) {
		return	ListDeviceSeatsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
