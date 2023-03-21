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
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteAppInstancesRequest extends RpcAcsRequest<DeleteAppInstancesResponse> {
	   

	private List<String> appInstanceIdss;

	private String productType;

	private String appInstanceGroupId;
	public DeleteAppInstancesRequest() {
		super("appstream-center", "2021-09-01", "DeleteAppInstances");
		setMethod(MethodType.POST);
	}

	public List<String> getAppInstanceIdss() {
		return this.appInstanceIdss;
	}

	public void setAppInstanceIdss(List<String> appInstanceIdss) {
		this.appInstanceIdss = appInstanceIdss;	
		if (appInstanceIdss != null) {
			for (int i = 0; i < appInstanceIdss.size(); i++) {
				putBodyParameter("AppInstanceIds." + (i + 1) , appInstanceIdss.get(i));
			}
		}	
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

	@Override
	public Class<DeleteAppInstancesResponse> getResponseClass() {
		return DeleteAppInstancesResponse.class;
	}

}
