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

package com.aliyuncs.cloudesl.model.v20200201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudesl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ExportEslDevicesRequest extends RpcAcsRequest<ExportEslDevicesResponse> {
	   

	private String extraParams;

	private String language;

	private String type;

	private String storeId;

	private String eslBarCode;

	private String typeEncode;

	private String eslStatus;

	private Integer toBatteryLevel;

	private String levelLower;

	private Integer fromBatteryLevel;

	private String levelOrder;
	public ExportEslDevicesRequest() {
		super("cloudesl", "2020-02-01", "ExportEslDevices");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExtraParams() {
		return this.extraParams;
	}

	public void setExtraParams(String extraParams) {
		this.extraParams = extraParams;
		if(extraParams != null){
			putBodyParameter("ExtraParams", extraParams);
		}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putBodyParameter("Language", language);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId);
		}
	}

	public String getEslBarCode() {
		return this.eslBarCode;
	}

	public void setEslBarCode(String eslBarCode) {
		this.eslBarCode = eslBarCode;
		if(eslBarCode != null){
			putBodyParameter("EslBarCode", eslBarCode);
		}
	}

	public String getTypeEncode() {
		return this.typeEncode;
	}

	public void setTypeEncode(String typeEncode) {
		this.typeEncode = typeEncode;
		if(typeEncode != null){
			putBodyParameter("TypeEncode", typeEncode);
		}
	}

	public String getEslStatus() {
		return this.eslStatus;
	}

	public void setEslStatus(String eslStatus) {
		this.eslStatus = eslStatus;
		if(eslStatus != null){
			putBodyParameter("EslStatus", eslStatus);
		}
	}

	public Integer getToBatteryLevel() {
		return this.toBatteryLevel;
	}

	public void setToBatteryLevel(Integer toBatteryLevel) {
		this.toBatteryLevel = toBatteryLevel;
		if(toBatteryLevel != null){
			putBodyParameter("ToBatteryLevel", toBatteryLevel.toString());
		}
	}

	public String getLevelLower() {
		return this.levelLower;
	}

	public void setLevelLower(String levelLower) {
		this.levelLower = levelLower;
		if(levelLower != null){
			putBodyParameter("LevelLower", levelLower);
		}
	}

	public Integer getFromBatteryLevel() {
		return this.fromBatteryLevel;
	}

	public void setFromBatteryLevel(Integer fromBatteryLevel) {
		this.fromBatteryLevel = fromBatteryLevel;
		if(fromBatteryLevel != null){
			putBodyParameter("FromBatteryLevel", fromBatteryLevel.toString());
		}
	}

	public String getLevelOrder() {
		return this.levelOrder;
	}

	public void setLevelOrder(String levelOrder) {
		this.levelOrder = levelOrder;
		if(levelOrder != null){
			putBodyParameter("LevelOrder", levelOrder);
		}
	}

	@Override
	public Class<ExportEslDevicesResponse> getResponseClass() {
		return ExportEslDevicesResponse.class;
	}

}
