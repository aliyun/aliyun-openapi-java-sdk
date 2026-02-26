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
public class DeepfakeDetectRequest extends RpcAcsRequest<DeepfakeDetectResponse> {
	   

	private String faceBase64;

	private String outerOrderNo;

	private String faceUrl;

	private String faceInputType;
	public DeepfakeDetectRequest() {
		super("Cloudauth", "2019-03-07", "DeepfakeDetect", "cloudauth");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFaceBase64() {
		return this.faceBase64;
	}

	public void setFaceBase64(String faceBase64) {
		this.faceBase64 = faceBase64;
		if(faceBase64 != null){
			putBodyParameter("FaceBase64", faceBase64);
		}
	}

	public String getOuterOrderNo() {
		return this.outerOrderNo;
	}

	public void setOuterOrderNo(String outerOrderNo) {
		this.outerOrderNo = outerOrderNo;
		if(outerOrderNo != null){
			putQueryParameter("OuterOrderNo", outerOrderNo);
		}
	}

	public String getFaceUrl() {
		return this.faceUrl;
	}

	public void setFaceUrl(String faceUrl) {
		this.faceUrl = faceUrl;
		if(faceUrl != null){
			putQueryParameter("FaceUrl", faceUrl);
		}
	}

	public String getFaceInputType() {
		return this.faceInputType;
	}

	public void setFaceInputType(String faceInputType) {
		this.faceInputType = faceInputType;
		if(faceInputType != null){
			putQueryParameter("FaceInputType", faceInputType);
		}
	}

	@Override
	public Class<DeepfakeDetectResponse> getResponseClass() {
		return DeepfakeDetectResponse.class;
	}

}
