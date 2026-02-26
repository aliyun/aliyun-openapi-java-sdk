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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ChangeInstanceAzoneRequest extends RpcAcsRequest<ChangeInstanceAzoneResponse> {
	   

	private String targetAzoneId;

	private String drdsRegionId;

	private String drdsInstanceId;

	private String originAzoneId;

	private Boolean changeVSwitch;

	private String newVSwitch;
	public ChangeInstanceAzoneRequest() {
		super("Drds", "2019-01-23", "ChangeInstanceAzone", "drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTargetAzoneId() {
		return this.targetAzoneId;
	}

	public void setTargetAzoneId(String targetAzoneId) {
		this.targetAzoneId = targetAzoneId;
		if(targetAzoneId != null){
			putQueryParameter("TargetAzoneId", targetAzoneId);
		}
	}

	public String getDrdsRegionId() {
		return this.drdsRegionId;
	}

	public void setDrdsRegionId(String drdsRegionId) {
		this.drdsRegionId = drdsRegionId;
		if(drdsRegionId != null){
			putQueryParameter("DrdsRegionId", drdsRegionId);
		}
	}

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
		if(drdsInstanceId != null){
			putQueryParameter("DrdsInstanceId", drdsInstanceId);
		}
	}

	public String getOriginAzoneId() {
		return this.originAzoneId;
	}

	public void setOriginAzoneId(String originAzoneId) {
		this.originAzoneId = originAzoneId;
		if(originAzoneId != null){
			putQueryParameter("OriginAzoneId", originAzoneId);
		}
	}

	public Boolean getChangeVSwitch() {
		return this.changeVSwitch;
	}

	public void setChangeVSwitch(Boolean changeVSwitch) {
		this.changeVSwitch = changeVSwitch;
		if(changeVSwitch != null){
			putQueryParameter("ChangeVSwitch", changeVSwitch.toString());
		}
	}

	public String getNewVSwitch() {
		return this.newVSwitch;
	}

	public void setNewVSwitch(String newVSwitch) {
		this.newVSwitch = newVSwitch;
		if(newVSwitch != null){
			putQueryParameter("NewVSwitch", newVSwitch);
		}
	}

	@Override
	public Class<ChangeInstanceAzoneResponse> getResponseClass() {
		return ChangeInstanceAzoneResponse.class;
	}

}
