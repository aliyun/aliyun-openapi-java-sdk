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

package com.aliyuncs.dyplsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyplsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteSecretBlacklistRequest extends RpcAcsRequest<DeleteSecretBlacklistResponse> {
	   

	private String blackType;

	private String remark;

	private String poolKey;

	private String blackNo;

	private String wayControl;
	public DeleteSecretBlacklistRequest() {
		super("Dyplsapi", "2017-05-25", "DeleteSecretBlacklist", "dyplsapi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBlackType() {
		return this.blackType;
	}

	public void setBlackType(String blackType) {
		this.blackType = blackType;
		if(blackType != null){
			putQueryParameter("BlackType", blackType);
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getPoolKey() {
		return this.poolKey;
	}

	public void setPoolKey(String poolKey) {
		this.poolKey = poolKey;
		if(poolKey != null){
			putQueryParameter("PoolKey", poolKey);
		}
	}

	public String getBlackNo() {
		return this.blackNo;
	}

	public void setBlackNo(String blackNo) {
		this.blackNo = blackNo;
		if(blackNo != null){
			putQueryParameter("BlackNo", blackNo);
		}
	}

	public String getWayControl() {
		return this.wayControl;
	}

	public void setWayControl(String wayControl) {
		this.wayControl = wayControl;
		if(wayControl != null){
			putQueryParameter("WayControl", wayControl);
		}
	}

	@Override
	public Class<DeleteSecretBlacklistResponse> getResponseClass() {
		return DeleteSecretBlacklistResponse.class;
	}

}
