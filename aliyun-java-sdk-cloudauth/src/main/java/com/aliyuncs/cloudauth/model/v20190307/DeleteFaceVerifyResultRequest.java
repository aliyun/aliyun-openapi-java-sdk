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

package com.aliyuncs.cloudauth.model.v20190307;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudauth.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteFaceVerifyResultRequest extends RpcAcsRequest<DeleteFaceVerifyResultResponse> {
	   

	private String deleteAfterQuery;

	private String certifyId;
	public DeleteFaceVerifyResultRequest() {
		super("Cloudauth", "2019-03-07", "DeleteFaceVerifyResult", "cloudauth");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDeleteAfterQuery() {
		return this.deleteAfterQuery;
	}

	public void setDeleteAfterQuery(String deleteAfterQuery) {
		this.deleteAfterQuery = deleteAfterQuery;
		if(deleteAfterQuery != null){
			putQueryParameter("DeleteAfterQuery", deleteAfterQuery);
		}
	}

	public String getCertifyId() {
		return this.certifyId;
	}

	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
		if(certifyId != null){
			putQueryParameter("CertifyId", certifyId);
		}
	}

	@Override
	public Class<DeleteFaceVerifyResultResponse> getResponseClass() {
		return DeleteFaceVerifyResultResponse.class;
	}

}
