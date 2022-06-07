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

package com.aliyuncs.appstream_center.model.v20210901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateAppInstanceGroupImageRequest extends RpcAcsRequest<UpdateAppInstanceGroupImageResponse> {
	   

	private String bizRegionId;

	private String productType;

	private String appInstanceGroupId;

	private String appCenterImageId;
	public UpdateAppInstanceGroupImageRequest() {
		super("appstream-center", "2021-09-01", "UpdateAppInstanceGroupImage");
		setMethod(MethodType.POST);
	}

	public String getBizRegionId() {
		return this.bizRegionId;
	}

	public void setBizRegionId(String bizRegionId) {
		this.bizRegionId = bizRegionId;
		if(bizRegionId != null){
			putQueryParameter("BizRegionId", bizRegionId);
		}
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
		if(productType != null){
			putQueryParameter("ProductType", productType);
		}
	}

	public String getAppInstanceGroupId() {
		return this.appInstanceGroupId;
	}

	public void setAppInstanceGroupId(String appInstanceGroupId) {
		this.appInstanceGroupId = appInstanceGroupId;
		if(appInstanceGroupId != null){
			putQueryParameter("AppInstanceGroupId", appInstanceGroupId);
		}
	}

	public String getAppCenterImageId() {
		return this.appCenterImageId;
	}

	public void setAppCenterImageId(String appCenterImageId) {
		this.appCenterImageId = appCenterImageId;
		if(appCenterImageId != null){
			putQueryParameter("AppCenterImageId", appCenterImageId);
		}
	}

	@Override
	public Class<UpdateAppInstanceGroupImageResponse> getResponseClass() {
		return UpdateAppInstanceGroupImageResponse.class;
	}

}
