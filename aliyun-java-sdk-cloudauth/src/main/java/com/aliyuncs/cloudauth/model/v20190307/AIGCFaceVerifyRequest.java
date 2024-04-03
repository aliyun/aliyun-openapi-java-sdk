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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudauth.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AIGCFaceVerifyRequest extends RpcAcsRequest<AIGCFaceVerifyResponse> {
	   

	private String productCode;

	private String ossObjectName;

	private String faceContrastPicture;

	private String outerOrderNo;

	private String faceContrastPictureUrl;

	private Long sceneId;

	private String ossBucketName;
	public AIGCFaceVerifyRequest() {
		super("Cloudauth", "2019-03-07", "AIGCFaceVerify", "cloudauth");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public String getOssObjectName() {
		return this.ossObjectName;
	}

	public void setOssObjectName(String ossObjectName) {
		this.ossObjectName = ossObjectName;
		if(ossObjectName != null){
			putQueryParameter("OssObjectName", ossObjectName);
		}
	}

	public String getFaceContrastPicture() {
		return this.faceContrastPicture;
	}

	public void setFaceContrastPicture(String faceContrastPicture) {
		this.faceContrastPicture = faceContrastPicture;
		if(faceContrastPicture != null){
			putBodyParameter("FaceContrastPicture", faceContrastPicture);
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

	public String getFaceContrastPictureUrl() {
		return this.faceContrastPictureUrl;
	}

	public void setFaceContrastPictureUrl(String faceContrastPictureUrl) {
		this.faceContrastPictureUrl = faceContrastPictureUrl;
		if(faceContrastPictureUrl != null){
			putQueryParameter("FaceContrastPictureUrl", faceContrastPictureUrl);
		}
	}

	public Long getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(Long sceneId) {
		this.sceneId = sceneId;
		if(sceneId != null){
			putQueryParameter("SceneId", sceneId.toString());
		}
	}

	public String getOssBucketName() {
		return this.ossBucketName;
	}

	public void setOssBucketName(String ossBucketName) {
		this.ossBucketName = ossBucketName;
		if(ossBucketName != null){
			putQueryParameter("OssBucketName", ossBucketName);
		}
	}

	@Override
	public Class<AIGCFaceVerifyResponse> getResponseClass() {
		return AIGCFaceVerifyResponse.class;
	}

}
