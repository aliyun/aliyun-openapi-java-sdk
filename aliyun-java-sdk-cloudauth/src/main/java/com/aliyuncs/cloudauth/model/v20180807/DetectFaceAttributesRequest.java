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

package com.aliyuncs.cloudauth.model.v20180807;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class DetectFaceAttributesRequest extends RpcAcsRequest<DetectFaceAttributesResponse> {
	
	public DetectFaceAttributesRequest() {
		super("Cloudauth", "2018-08-07", "DetectFaceAttributes", "cloudauth");
		setProtocol(ProtocolType.HTTPS);
	}

	private Integer maxNumPhotosPerCategory;

	private Integer maxFaceNum;

	private Long resourceOwnerId;

	private String sourceIp;

	private String retAttributes;

	private String materialValue;

	private Boolean dontSaveDB;

	private String clientTag;

	public Integer getMaxNumPhotosPerCategory() {
		return this.maxNumPhotosPerCategory;
	}

	public void setMaxNumPhotosPerCategory(Integer maxNumPhotosPerCategory) {
		this.maxNumPhotosPerCategory = maxNumPhotosPerCategory;
		if(maxNumPhotosPerCategory != null){
			putQueryParameter("MaxNumPhotosPerCategory", maxNumPhotosPerCategory.toString());
		}
	}

	public Integer getMaxFaceNum() {
		return this.maxFaceNum;
	}

	public void setMaxFaceNum(Integer maxFaceNum) {
		this.maxFaceNum = maxFaceNum;
		if(maxFaceNum != null){
			putQueryParameter("MaxFaceNum", maxFaceNum.toString());
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

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getRetAttributes() {
		return this.retAttributes;
	}

	public void setRetAttributes(String retAttributes) {
		this.retAttributes = retAttributes;
		if(retAttributes != null){
			putQueryParameter("RetAttributes", retAttributes);
		}
	}

	public String getMaterialValue() {
		return this.materialValue;
	}

	public void setMaterialValue(String materialValue) {
		this.materialValue = materialValue;
		if(materialValue != null){
			putQueryParameter("MaterialValue", materialValue);
		}
	}

	public Boolean getDontSaveDB() {
		return this.dontSaveDB;
	}

	public void setDontSaveDB(Boolean dontSaveDB) {
		this.dontSaveDB = dontSaveDB;
		if(dontSaveDB != null){
			putQueryParameter("DontSaveDB", dontSaveDB.toString());
		}
	}

	public String getClientTag() {
		return this.clientTag;
	}

	public void setClientTag(String clientTag) {
		this.clientTag = clientTag;
		if(clientTag != null){
			putQueryParameter("ClientTag", clientTag);
		}
	}

	@Override
	public Class<DetectFaceAttributesResponse> getResponseClass() {
		return DetectFaceAttributesResponse.class;
	}

}
