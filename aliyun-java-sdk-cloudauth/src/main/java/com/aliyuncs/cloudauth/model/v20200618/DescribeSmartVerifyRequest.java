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

package com.aliyuncs.cloudauth.model.v20200618;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudauth.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeSmartVerifyRequest extends RpcAcsRequest<DescribeSmartVerifyResponse> {
	   

	private String certifyId;

	private String pictureReturnType;

	private Long sceneId;
	public DescribeSmartVerifyRequest() {
		super("Cloudauth", "2020-06-18", "DescribeSmartVerify", "cloudauth");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCertifyId() {
		return this.certifyId;
	}

	public void setCertifyId(String certifyId) {
		this.certifyId = certifyId;
		if(certifyId != null){
			putBodyParameter("CertifyId", certifyId);
		}
	}

	public String getPictureReturnType() {
		return this.pictureReturnType;
	}

	public void setPictureReturnType(String pictureReturnType) {
		this.pictureReturnType = pictureReturnType;
		if(pictureReturnType != null){
			putBodyParameter("PictureReturnType", pictureReturnType);
		}
	}

	public Long getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(Long sceneId) {
		this.sceneId = sceneId;
		if(sceneId != null){
			putBodyParameter("SceneId", sceneId.toString());
		}
	}

	@Override
	public Class<DescribeSmartVerifyResponse> getResponseClass() {
		return DescribeSmartVerifyResponse.class;
	}

}
