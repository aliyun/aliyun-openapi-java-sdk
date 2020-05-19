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

package com.aliyuncs.linkwan.model.v20190301;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20190301.GetGatewayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetGatewayResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String gwEui;

		private String onlineState;

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

		private Boolean timeCorrectable;

		private Boolean classBSupported;

		private Boolean classBWorking;

		private Boolean enabled;

		private Long onlineStateChangedMillis;

		private String embeddedNsId;

		private String chargeStatus;

		private String authTypes;

		public String getGwEui() {
			return this.gwEui;
		}

		public void setGwEui(String gwEui) {
			this.gwEui = gwEui;
		}

		public String getOnlineState() {
			return this.onlineState;
		}

		public void setOnlineState(String onlineState) {
			this.onlineState = onlineState;
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

		public Boolean getTimeCorrectable() {
			return this.timeCorrectable;
		}

		public void setTimeCorrectable(Boolean timeCorrectable) {
			this.timeCorrectable = timeCorrectable;
		}

		public Boolean getClassBSupported() {
			return this.classBSupported;
		}

		public void setClassBSupported(Boolean classBSupported) {
			this.classBSupported = classBSupported;
		}

		public Boolean getClassBWorking() {
			return this.classBWorking;
		}

		public void setClassBWorking(Boolean classBWorking) {
			this.classBWorking = classBWorking;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public Long getOnlineStateChangedMillis() {
			return this.onlineStateChangedMillis;
		}

		public void setOnlineStateChangedMillis(Long onlineStateChangedMillis) {
			this.onlineStateChangedMillis = onlineStateChangedMillis;
		}

		public String getEmbeddedNsId() {
			return this.embeddedNsId;
		}

		public void setEmbeddedNsId(String embeddedNsId) {
			this.embeddedNsId = embeddedNsId;
		}

		public String getChargeStatus() {
			return this.chargeStatus;
		}

		public void setChargeStatus(String chargeStatus) {
			this.chargeStatus = chargeStatus;
		}

		public String getAuthTypes() {
			return this.authTypes;
		}

		public void setAuthTypes(String authTypes) {
			this.authTypes = authTypes;
		}
	}

	@Override
	public GetGatewayResponse getInstance(UnmarshallerContext context) {
		return	GetGatewayResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
