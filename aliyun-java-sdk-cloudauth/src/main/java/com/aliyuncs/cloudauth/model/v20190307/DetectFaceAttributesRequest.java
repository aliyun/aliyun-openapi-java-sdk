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
public class DetectFaceAttributesRequest extends RpcAcsRequest<DetectFaceAttributesResponse> {
	   

	private Integer maxNumPhotosPerCategory;

	private Integer maxFaceNum;

	private Long resourceOwnerId;

	private String retAttributes;

	private String clientTag;

	private String sourceIp;

	private String materialValue;

	private Boolean dontSaveDB;
	public DetectFaceAttributesRequest() {
		super("Cloudauth", "2019-03-07", "DetectFaceAttributes", "cloudauth");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getMaxNumPhotosPerCategory() {
		return this.maxNumPhotosPerCategory;
	}

	public void setMaxNumPhotosPerCategory(Integer maxNumPhotosPerCategory) {
		this.maxNumPhotosPerCategory = maxNumPhotosPerCategory;
		if(maxNumPhotosPerCategory != null){
			putBodyParameter("MaxNumPhotosPerCategory", maxNumPhotosPerCategory.toString());
		}
	}

	public Integer getMaxFaceNum() {
		return this.maxFaceNum;
	}

	public void setMaxFaceNum(Integer maxFaceNum) {
		this.maxFaceNum = maxFaceNum;
		if(maxFaceNum != null){
			putBodyParameter("MaxFaceNum", maxFaceNum.toString());
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getRetAttributes() {
		return this.retAttributes;
	}

	public void setRetAttributes(String retAttributes) {
		this.retAttributes = retAttributes;
		if(retAttributes != null){
			putBodyParameter("RetAttributes", retAttributes);
		}
	}

	public String getClientTag() {
		return this.clientTag;
	}

	public void setClientTag(String clientTag) {
		this.clientTag = clientTag;
		if(clientTag != null){
			putBodyParameter("ClientTag", clientTag);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getMaterialValue() {
		return this.materialValue;
	}

	public void setMaterialValue(String materialValue) {
		this.materialValue = materialValue;
		if(materialValue != null){
			putBodyParameter("MaterialValue", materialValue);
		}
	}

	public Boolean getDontSaveDB() {
		return this.dontSaveDB;
	}

	public void setDontSaveDB(Boolean dontSaveDB) {
		this.dontSaveDB = dontSaveDB;
		if(dontSaveDB != null){
			putBodyParameter("DontSaveDB", dontSaveDB.toString());
		}
	}

	@Override
	public Class<DetectFaceAttributesResponse> getResponseClass() {
		return DetectFaceAttributesResponse.class;
	}

}
