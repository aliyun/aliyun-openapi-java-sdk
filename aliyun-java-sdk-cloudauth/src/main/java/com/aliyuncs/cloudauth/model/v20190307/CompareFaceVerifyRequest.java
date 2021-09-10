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
public class CompareFaceVerifyRequest extends RpcAcsRequest<CompareFaceVerifyResponse> {
	   

	private String targetFaceContrastPictureUrl;

	private String productCode;

	private String targetCertifyId;

	private String sourceOssObjectName;

	private String targetFaceContrastPicture;

	private String targetOssBucketName;

	private String sourceOssBucketName;

	private String outerOrderNo;

	private String targetOssObjectName;

	private String sourceFaceContrastPicture;

	private Long sceneId;

	private String sourceFaceContrastPictureUrl;

	private String sourceCertifyId;

	private String crop;
	public CompareFaceVerifyRequest() {
		super("Cloudauth", "2019-03-07", "CompareFaceVerify");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTargetFaceContrastPictureUrl() {
		return this.targetFaceContrastPictureUrl;
	}

	public void setTargetFaceContrastPictureUrl(String targetFaceContrastPictureUrl) {
		this.targetFaceContrastPictureUrl = targetFaceContrastPictureUrl;
		if(targetFaceContrastPictureUrl != null){
			putBodyParameter("TargetFaceContrastPictureUrl", targetFaceContrastPictureUrl);
		}
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putBodyParameter("ProductCode", productCode);
		}
	}

	public String getTargetCertifyId() {
		return this.targetCertifyId;
	}

	public void setTargetCertifyId(String targetCertifyId) {
		this.targetCertifyId = targetCertifyId;
		if(targetCertifyId != null){
			putBodyParameter("TargetCertifyId", targetCertifyId);
		}
	}

	public String getSourceOssObjectName() {
		return this.sourceOssObjectName;
	}

	public void setSourceOssObjectName(String sourceOssObjectName) {
		this.sourceOssObjectName = sourceOssObjectName;
		if(sourceOssObjectName != null){
			putBodyParameter("SourceOssObjectName", sourceOssObjectName);
		}
	}

	public String getTargetFaceContrastPicture() {
		return this.targetFaceContrastPicture;
	}

	public void setTargetFaceContrastPicture(String targetFaceContrastPicture) {
		this.targetFaceContrastPicture = targetFaceContrastPicture;
		if(targetFaceContrastPicture != null){
			putBodyParameter("TargetFaceContrastPicture", targetFaceContrastPicture);
		}
	}

	public String getTargetOssBucketName() {
		return this.targetOssBucketName;
	}

	public void setTargetOssBucketName(String targetOssBucketName) {
		this.targetOssBucketName = targetOssBucketName;
		if(targetOssBucketName != null){
			putBodyParameter("TargetOssBucketName", targetOssBucketName);
		}
	}

	public String getSourceOssBucketName() {
		return this.sourceOssBucketName;
	}

	public void setSourceOssBucketName(String sourceOssBucketName) {
		this.sourceOssBucketName = sourceOssBucketName;
		if(sourceOssBucketName != null){
			putBodyParameter("SourceOssBucketName", sourceOssBucketName);
		}
	}

	public String getOuterOrderNo() {
		return this.outerOrderNo;
	}

	public void setOuterOrderNo(String outerOrderNo) {
		this.outerOrderNo = outerOrderNo;
		if(outerOrderNo != null){
			putBodyParameter("OuterOrderNo", outerOrderNo);
		}
	}

	public String getTargetOssObjectName() {
		return this.targetOssObjectName;
	}

	public void setTargetOssObjectName(String targetOssObjectName) {
		this.targetOssObjectName = targetOssObjectName;
		if(targetOssObjectName != null){
			putBodyParameter("TargetOssObjectName", targetOssObjectName);
		}
	}

	public String getSourceFaceContrastPicture() {
		return this.sourceFaceContrastPicture;
	}

	public void setSourceFaceContrastPicture(String sourceFaceContrastPicture) {
		this.sourceFaceContrastPicture = sourceFaceContrastPicture;
		if(sourceFaceContrastPicture != null){
			putBodyParameter("SourceFaceContrastPicture", sourceFaceContrastPicture);
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

	public String getSourceFaceContrastPictureUrl() {
		return this.sourceFaceContrastPictureUrl;
	}

	public void setSourceFaceContrastPictureUrl(String sourceFaceContrastPictureUrl) {
		this.sourceFaceContrastPictureUrl = sourceFaceContrastPictureUrl;
		if(sourceFaceContrastPictureUrl != null){
			putBodyParameter("SourceFaceContrastPictureUrl", sourceFaceContrastPictureUrl);
		}
	}

	public String getSourceCertifyId() {
		return this.sourceCertifyId;
	}

	public void setSourceCertifyId(String sourceCertifyId) {
		this.sourceCertifyId = sourceCertifyId;
		if(sourceCertifyId != null){
			putBodyParameter("SourceCertifyId", sourceCertifyId);
		}
	}

	public String getCrop() {
		return this.crop;
	}

	public void setCrop(String crop) {
		this.crop = crop;
		if(crop != null){
			putBodyParameter("Crop", crop);
		}
	}

	@Override
	public Class<CompareFaceVerifyResponse> getResponseClass() {
		return CompareFaceVerifyResponse.class;
	}

}
