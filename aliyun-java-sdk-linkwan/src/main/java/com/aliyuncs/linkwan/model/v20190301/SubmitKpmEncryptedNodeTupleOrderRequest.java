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

package com.aliyuncs.linkwan.model.v20190301;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkwan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubmitKpmEncryptedNodeTupleOrderRequest extends RpcAcsRequest<SubmitKpmEncryptedNodeTupleOrderResponse> {
	   

	private String loraVersion;

	private Long requiredCount;

	private String tupleType;
	public SubmitKpmEncryptedNodeTupleOrderRequest() {
		super("LinkWAN", "2019-03-01", "SubmitKpmEncryptedNodeTupleOrder", "linkwan");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLoraVersion() {
		return this.loraVersion;
	}

	public void setLoraVersion(String loraVersion) {
		this.loraVersion = loraVersion;
		if(loraVersion != null){
			putQueryParameter("LoraVersion", loraVersion);
		}
	}

	public Long getRequiredCount() {
		return this.requiredCount;
	}

	public void setRequiredCount(Long requiredCount) {
		this.requiredCount = requiredCount;
		if(requiredCount != null){
			putQueryParameter("RequiredCount", requiredCount.toString());
		}
	}

	public String getTupleType() {
		return this.tupleType;
	}

	public void setTupleType(String tupleType) {
		this.tupleType = tupleType;
		if(tupleType != null){
			putQueryParameter("TupleType", tupleType);
		}
	}

	@Override
	public Class<SubmitKpmEncryptedNodeTupleOrderResponse> getResponseClass() {
		return SubmitKpmEncryptedNodeTupleOrderResponse.class;
	}

}
