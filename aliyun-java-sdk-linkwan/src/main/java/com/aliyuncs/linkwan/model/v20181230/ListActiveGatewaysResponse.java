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

package com.aliyuncs.linkwan.model.v20181230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20181230.ListActiveGatewaysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListActiveGatewaysResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<Gateway> data;

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

	public List<Gateway> getData() {
		return this.data;
	}

	public void setData(List<Gateway> data) {
		this.data = data;
	}

	public static class Gateway {

		private String gwEui;

		private String name;

		private String description;

		private String city;

		private String district;

		private String address;

		private Long addressCode;

		private String gisCoordinateSystem;

		private Float longitude;

		private Float latitude;

		private Long freqBandPlanGroupId;

		private String communicationMode;

		private String onlineState;

		public String getGwEui() {
			return this.gwEui;
		}

		public void setGwEui(String gwEui) {
			this.gwEui = gwEui;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getDistrict() {
			return this.district;
		}

		public void setDistrict(String district) {
			this.district = district;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public Long getAddressCode() {
			return this.addressCode;
		}

		public void setAddressCode(Long addressCode) {
			this.addressCode = addressCode;
		}

		public String getGisCoordinateSystem() {
			return this.gisCoordinateSystem;
		}

		public void setGisCoordinateSystem(String gisCoordinateSystem) {
			this.gisCoordinateSystem = gisCoordinateSystem;
		}

		public Float getLongitude() {
			return this.longitude;
		}

		public void setLongitude(Float longitude) {
			this.longitude = longitude;
		}

		public Float getLatitude() {
			return this.latitude;
		}

		public void setLatitude(Float latitude) {
			this.latitude = latitude;
		}

		public Long getFreqBandPlanGroupId() {
			return this.freqBandPlanGroupId;
		}

		public void setFreqBandPlanGroupId(Long freqBandPlanGroupId) {
			this.freqBandPlanGroupId = freqBandPlanGroupId;
		}

		public String getCommunicationMode() {
			return this.communicationMode;
		}

		public void setCommunicationMode(String communicationMode) {
			this.communicationMode = communicationMode;
		}

		public String getOnlineState() {
			return this.onlineState;
		}

		public void setOnlineState(String onlineState) {
			this.onlineState = onlineState;
		}
	}

	@Override
	public ListActiveGatewaysResponse getInstance(UnmarshallerContext context) {
		return	ListActiveGatewaysResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
