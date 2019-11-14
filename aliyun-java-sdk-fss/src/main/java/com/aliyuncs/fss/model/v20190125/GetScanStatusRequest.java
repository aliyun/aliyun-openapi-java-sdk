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

package com.aliyuncs.fss.model.v20190125;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.fss.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetScanStatusRequest extends RpcAcsRequest<GetScanStatusResponse> {
	   

	private String fssSign;

	private String fssAccessKey;

	private String fssRequestID;

	private String taskUUID;
	public GetScanStatusRequest() {
		super("Fss", "2019-01-25", "GetScanStatus");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFssSign() {
		return this.fssSign;
	}

	public void setFssSign(String fssSign) {
		this.fssSign = fssSign;
		if(fssSign != null){
			putBodyParameter("FssSign", fssSign);
		}
	}

	public String getFssAccessKey() {
		return this.fssAccessKey;
	}

	public void setFssAccessKey(String fssAccessKey) {
		this.fssAccessKey = fssAccessKey;
		if(fssAccessKey != null){
			putBodyParameter("FssAccessKey", fssAccessKey);
		}
	}

	public String getFssRequestID() {
		return this.fssRequestID;
	}

	public void setFssRequestID(String fssRequestID) {
		this.fssRequestID = fssRequestID;
		if(fssRequestID != null){
			putBodyParameter("FssRequestID", fssRequestID);
		}
	}

	public String getTaskUUID() {
		return this.taskUUID;
	}

	public void setTaskUUID(String taskUUID) {
		this.taskUUID = taskUUID;
		if(taskUUID != null){
			putBodyParameter("TaskUUID", taskUUID);
		}
	}

	@Override
	public Class<GetScanStatusResponse> getResponseClass() {
		return GetScanStatusResponse.class;
	}

}
