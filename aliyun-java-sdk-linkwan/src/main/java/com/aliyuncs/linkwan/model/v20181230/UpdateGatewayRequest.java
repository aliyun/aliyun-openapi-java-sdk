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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class UpdateGatewayRequest extends RpcAcsRequest<UpdateGatewayResponse> {
	
	public UpdateGatewayRequest() {
		super("LinkWAN", "2018-12-30", "UpdateGateway", "linkwan");
		setProtocol(ProtocolType.HTTPS);
	}

	private String city;

	private Float latitude;

	private String description;

	private Long addressCode;

	private String gisCoordinateSystem;

	private Float longitude;

	private String address;

	private String gwEui;

	private Long freqBandPlanGroupId;

	private String district;

	private String name;

	private String communicationMode;

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
		if(city != null){
			putBodyParameter("City", city);
		}
	}

	public Float getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
		if(latitude != null){
			putBodyParameter("Latitude", latitude.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public Long getAddressCode() {
		return this.addressCode;
	}

	public void setAddressCode(Long addressCode) {
		this.addressCode = addressCode;
		if(addressCode != null){
			putBodyParameter("AddressCode", addressCode.toString());
		}
	}

	public String getGisCoordinateSystem() {
		return this.gisCoordinateSystem;
	}

	public void setGisCoordinateSystem(String gisCoordinateSystem) {
		this.gisCoordinateSystem = gisCoordinateSystem;
		if(gisCoordinateSystem != null){
			putBodyParameter("GisCoordinateSystem", gisCoordinateSystem);
		}
	}

	public Float getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
		if(longitude != null){
			putBodyParameter("Longitude", longitude.toString());
		}
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
		if(address != null){
			putBodyParameter("Address", address);
		}
	}

	public String getGwEui() {
		return this.gwEui;
	}

	public void setGwEui(String gwEui) {
		this.gwEui = gwEui;
		if(gwEui != null){
			putBodyParameter("GwEui", gwEui);
		}
	}

	public Long getFreqBandPlanGroupId() {
		return this.freqBandPlanGroupId;
	}

	public void setFreqBandPlanGroupId(Long freqBandPlanGroupId) {
		this.freqBandPlanGroupId = freqBandPlanGroupId;
		if(freqBandPlanGroupId != null){
			putBodyParameter("FreqBandPlanGroupId", freqBandPlanGroupId.toString());
		}
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
		if(district != null){
			putBodyParameter("District", district);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getCommunicationMode() {
		return this.communicationMode;
	}

	public void setCommunicationMode(String communicationMode) {
		this.communicationMode = communicationMode;
		if(communicationMode != null){
			putBodyParameter("CommunicationMode", communicationMode);
		}
	}

	@Override
	public Class<UpdateGatewayResponse> getResponseClass() {
		return UpdateGatewayResponse.class;
	}

}
