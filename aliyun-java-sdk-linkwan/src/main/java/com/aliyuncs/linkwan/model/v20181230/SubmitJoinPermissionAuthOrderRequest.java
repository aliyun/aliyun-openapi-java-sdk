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
public class SubmitJoinPermissionAuthOrderRequest extends RpcAcsRequest<SubmitJoinPermissionAuthOrderResponse> {
	
	public SubmitJoinPermissionAuthOrderRequest() {
		super("LinkWAN", "2018-12-30", "SubmitJoinPermissionAuthOrder", "linkwan");
		setProtocol(ProtocolType.HTTPS);
	}

	private String joinPermissionId;

	private String renterAliyunId;

	public String getJoinPermissionId() {
		return this.joinPermissionId;
	}

	public void setJoinPermissionId(String joinPermissionId) {
		this.joinPermissionId = joinPermissionId;
		if(joinPermissionId != null){
			putBodyParameter("JoinPermissionId", joinPermissionId);
		}
	}

	public String getRenterAliyunId() {
		return this.renterAliyunId;
	}

	public void setRenterAliyunId(String renterAliyunId) {
		this.renterAliyunId = renterAliyunId;
		if(renterAliyunId != null){
			putBodyParameter("RenterAliyunId", renterAliyunId);
		}
	}

	@Override
	public Class<SubmitJoinPermissionAuthOrderResponse> getResponseClass() {
		return SubmitJoinPermissionAuthOrderResponse.class;
	}

}
