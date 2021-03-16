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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsCreateSystemImageRequest extends RpcAcsRequest<OpsCreateSystemImageResponse> {
	   

	private String imageId;

	private Long osTypeId;

	private String description;

	private Integer imageSize;

	private Long virtBaseImageId;

	private String operator;

	private String imageName;

	private String imageVersion;

	private String auditParamStr;
	public OpsCreateSystemImageRequest() {
		super("Ecsops", "2016-04-01", "OpsCreateSystemImage", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public Long getOsTypeId() {
		return this.osTypeId;
	}

	public void setOsTypeId(Long osTypeId) {
		this.osTypeId = osTypeId;
		if(osTypeId != null){
			putQueryParameter("OsTypeId", osTypeId.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Integer getImageSize() {
		return this.imageSize;
	}

	public void setImageSize(Integer imageSize) {
		this.imageSize = imageSize;
		if(imageSize != null){
			putQueryParameter("ImageSize", imageSize.toString());
		}
	}

	public Long getVirtBaseImageId() {
		return this.virtBaseImageId;
	}

	public void setVirtBaseImageId(Long virtBaseImageId) {
		this.virtBaseImageId = virtBaseImageId;
		if(virtBaseImageId != null){
			putQueryParameter("VirtBaseImageId", virtBaseImageId.toString());
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
		if(imageName != null){
			putQueryParameter("ImageName", imageName);
		}
	}

	public String getImageVersion() {
		return this.imageVersion;
	}

	public void setImageVersion(String imageVersion) {
		this.imageVersion = imageVersion;
		if(imageVersion != null){
			putQueryParameter("ImageVersion", imageVersion);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsCreateSystemImageResponse> getResponseClass() {
		return OpsCreateSystemImageResponse.class;
	}

}
