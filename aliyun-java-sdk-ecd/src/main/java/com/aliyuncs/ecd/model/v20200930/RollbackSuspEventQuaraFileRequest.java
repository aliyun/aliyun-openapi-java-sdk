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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RollbackSuspEventQuaraFileRequest extends RpcAcsRequest<RollbackSuspEventQuaraFileResponse> {
	   

	private Integer quaraFieldId;

	private String desktopId;
	public RollbackSuspEventQuaraFileRequest() {
		super("ecd", "2020-09-30", "RollbackSuspEventQuaraFile");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getQuaraFieldId() {
		return this.quaraFieldId;
	}

	public void setQuaraFieldId(Integer quaraFieldId) {
		this.quaraFieldId = quaraFieldId;
		if(quaraFieldId != null){
			putQueryParameter("QuaraFieldId", quaraFieldId.toString());
		}
	}

	public String getDesktopId() {
		return this.desktopId;
	}

	public void setDesktopId(String desktopId) {
		this.desktopId = desktopId;
		if(desktopId != null){
			putQueryParameter("DesktopId", desktopId);
		}
	}

	@Override
	public Class<RollbackSuspEventQuaraFileResponse> getResponseClass() {
		return RollbackSuspEventQuaraFileResponse.class;
	}

}
