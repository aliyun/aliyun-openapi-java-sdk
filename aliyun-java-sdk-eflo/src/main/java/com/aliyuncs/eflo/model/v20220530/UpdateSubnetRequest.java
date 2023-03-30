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

package com.aliyuncs.eflo.model.v20220530;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateSubnetRequest extends RpcAcsRequest<UpdateSubnetResponse> {
	   

	private String subnetId;

	private String description;

	private String vpdId;

	private String zoneId;

	private String subnetName;
	public UpdateSubnetRequest() {
		super("eflo", "2022-05-30", "UpdateSubnet", "eflo");
		setMethod(MethodType.POST);
	}

	public String getSubnetId() {
		return this.subnetId;
	}

	public void setSubnetId(String subnetId) {
		this.subnetId = subnetId;
		if(subnetId != null){
			putBodyParameter("SubnetId", subnetId);
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

	public String getVpdId() {
		return this.vpdId;
	}

	public void setVpdId(String vpdId) {
		this.vpdId = vpdId;
		if(vpdId != null){
			putBodyParameter("VpdId", vpdId);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putBodyParameter("ZoneId", zoneId);
		}
	}

	public String getSubnetName() {
		return this.subnetName;
	}

	public void setSubnetName(String subnetName) {
		this.subnetName = subnetName;
		if(subnetName != null){
			putBodyParameter("SubnetName", subnetName);
		}
	}

	@Override
	public Class<UpdateSubnetResponse> getResponseClass() {
		return UpdateSubnetResponse.class;
	}

}
