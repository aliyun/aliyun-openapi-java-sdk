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
public class DeleteSubnetRequest extends RpcAcsRequest<DeleteSubnetResponse> {
	   

	private String subnetId;

	private String vpdId;

	private String zoneId;
	public DeleteSubnetRequest() {
		super("eflo", "2022-05-30", "DeleteSubnet", "eflo");
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

	@Override
	public Class<DeleteSubnetResponse> getResponseClass() {
		return DeleteSubnetResponse.class;
	}

}
