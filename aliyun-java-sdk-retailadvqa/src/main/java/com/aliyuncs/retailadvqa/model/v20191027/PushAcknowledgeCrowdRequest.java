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

package com.aliyuncs.retailadvqa.model.v20191027;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PushAcknowledgeCrowdRequest extends RpcAcsRequest<PushAcknowledgeCrowdResponse> {
	   

	private String uid;

	private Long crowdCount;

	private String brandId;

	private String brandName;

	private String crowdId;

	private String smartName;
	public PushAcknowledgeCrowdRequest() {
		super("retailadvqa", "2019-10-27", "PushAcknowledgeCrowd");
		setMethod(MethodType.POST);
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid);
		}
	}

	public Long getCrowdCount() {
		return this.crowdCount;
	}

	public void setCrowdCount(Long crowdCount) {
		this.crowdCount = crowdCount;
		if(crowdCount != null){
			putQueryParameter("CrowdCount", crowdCount.toString());
		}
	}

	public String getBrandId() {
		return this.brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
		if(brandId != null){
			putQueryParameter("BrandId", brandId);
		}
	}

	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
		if(brandName != null){
			putQueryParameter("BrandName", brandName);
		}
	}

	public String getCrowdId() {
		return this.crowdId;
	}

	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
		if(crowdId != null){
			putQueryParameter("CrowdId", crowdId);
		}
	}

	public String getSmartName() {
		return this.smartName;
	}

	public void setSmartName(String smartName) {
		this.smartName = smartName;
		if(smartName != null){
			putQueryParameter("SmartName", smartName);
		}
	}

	@Override
	public Class<PushAcknowledgeCrowdResponse> getResponseClass() {
		return PushAcknowledgeCrowdResponse.class;
	}

}
