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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddOrUpdateDeviceSeatsRequest extends RpcAcsRequest<AddOrUpdateDeviceSeatsResponse> {
	   

	private String fileName;

	private String userCustomId;

	private String zoneId;
	public AddOrUpdateDeviceSeatsRequest() {
		super("wyota", "2021-04-20", "AddOrUpdateDeviceSeats");
		setMethod(MethodType.POST);
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		if(fileName != null){
			putBodyParameter("FileName", fileName);
		}
	}

	public String getUserCustomId() {
		return this.userCustomId;
	}

	public void setUserCustomId(String userCustomId) {
		this.userCustomId = userCustomId;
		if(userCustomId != null){
			putBodyParameter("UserCustomId", userCustomId);
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
	public Class<AddOrUpdateDeviceSeatsResponse> getResponseClass() {
		return AddOrUpdateDeviceSeatsResponse.class;
	}

}
