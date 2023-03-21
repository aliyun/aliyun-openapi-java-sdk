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
public class UnbindRequest extends RpcAcsRequest<UnbindResponse> {
	   

	private String productType;

	private String appInstanceGroupId;

	private String endUserId;

	private String appInstanceId;
	public UnbindRequest() {
		super("appstream-center", "2021-09-01", "Unbind");
		setMethod(MethodType.POST);
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
		if(productType != null){
			putBodyParameter("ProductType", productType);
		}
	}

	public String getAppInstanceGroupId() {
		return this.appInstanceGroupId;
	}

	public void setAppInstanceGroupId(String appInstanceGroupId) {
		this.appInstanceGroupId = appInstanceGroupId;
		if(appInstanceGroupId != null){
			putBodyParameter("AppInstanceGroupId", appInstanceGroupId);
		}
	}

	public String getEndUserId() {
		return this.endUserId;
	}

	public void setEndUserId(String endUserId) {
		this.endUserId = endUserId;
		if(endUserId != null){
			putBodyParameter("EndUserId", endUserId);
		}
	}

	public String getAppInstanceId() {
		return this.appInstanceId;
	}

	public void setAppInstanceId(String appInstanceId) {
		this.appInstanceId = appInstanceId;
		if(appInstanceId != null){
			putBodyParameter("AppInstanceId", appInstanceId);
		}
	}

	@Override
	public Class<UnbindResponse> getResponseClass() {
		return UnbindResponse.class;
	}

}
