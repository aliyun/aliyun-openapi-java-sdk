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
public class UpdatePrivateRdsClassRequest extends RpcAcsRequest<UpdatePrivateRdsClassResponse> {
	   

	private String storage;

	private Boolean autoUseCoupon;

	private String drdsInstanceId;

	private String rdsClass;

	private Integer prePayDuration;

	private String dBInstanceId;
	public UpdatePrivateRdsClassRequest() {
		super("Drds", "2019-01-23", "UpdatePrivateRdsClass", "drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStorage() {
		return this.storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
		if(storage != null){
			putQueryParameter("Storage", storage);
		}
	}

	public Boolean getAutoUseCoupon() {
		return this.autoUseCoupon;
	}

	public void setAutoUseCoupon(Boolean autoUseCoupon) {
		this.autoUseCoupon = autoUseCoupon;
		if(autoUseCoupon != null){
			putQueryParameter("AutoUseCoupon", autoUseCoupon.toString());
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

	public String getRdsClass() {
		return this.rdsClass;
	}

	public void setRdsClass(String rdsClass) {
		this.rdsClass = rdsClass;
		if(rdsClass != null){
			putQueryParameter("RdsClass", rdsClass);
		}
	}

	public Integer getPrePayDuration() {
		return this.prePayDuration;
	}

	public void setPrePayDuration(Integer prePayDuration) {
		this.prePayDuration = prePayDuration;
		if(prePayDuration != null){
			putQueryParameter("PrePayDuration", prePayDuration.toString());
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	@Override
	public Class<UpdatePrivateRdsClassResponse> getResponseClass() {
		return UpdatePrivateRdsClassResponse.class;
	}

}
