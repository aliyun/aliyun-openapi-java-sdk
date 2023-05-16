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

package com.aliyuncs.agency.model.v20171030;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.agency.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class TransferFxResellerToUserRequest extends RpcAcsRequest<TransferFxResellerToUserResponse> {
	   

	private Integer tansferScene;

	private String transferUid;
	public TransferFxResellerToUserRequest() {
		super("Agency", "2017-10-30", "TransferFxResellerToUser", "openApi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getTansferScene() {
		return this.tansferScene;
	}

	public void setTansferScene(Integer tansferScene) {
		this.tansferScene = tansferScene;
		if(tansferScene != null){
			putQueryParameter("TansferScene", tansferScene.toString());
		}
	}

	public String getTransferUid() {
		return this.transferUid;
	}

	public void setTransferUid(String transferUid) {
		this.transferUid = transferUid;
		if(transferUid != null){
			putQueryParameter("TransferUid", transferUid);
		}
	}

	@Override
	public Class<TransferFxResellerToUserResponse> getResponseClass() {
		return TransferFxResellerToUserResponse.class;
	}

}
