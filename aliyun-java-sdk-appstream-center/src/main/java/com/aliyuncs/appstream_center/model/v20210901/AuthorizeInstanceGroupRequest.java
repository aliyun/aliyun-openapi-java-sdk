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
public class AuthorizeInstanceGroupRequest extends RpcAcsRequest<AuthorizeInstanceGroupResponse> {
	   

	private List<String> unAuthorizeUserIdss;

	private String productType;

	private String appInstanceGroupId;

	private List<String> authorizeUserIdss;
	public AuthorizeInstanceGroupRequest() {
		super("appstream-center", "2021-09-01", "AuthorizeInstanceGroup");
		setMethod(MethodType.POST);
	}

	public List<String> getUnAuthorizeUserIdss() {
		return this.unAuthorizeUserIdss;
	}

	public void setUnAuthorizeUserIdss(List<String> unAuthorizeUserIdss) {
		this.unAuthorizeUserIdss = unAuthorizeUserIdss;	
		if (unAuthorizeUserIdss != null) {
			for (int i = 0; i < unAuthorizeUserIdss.size(); i++) {
				putBodyParameter("UnAuthorizeUserIds." + (i + 1) , unAuthorizeUserIdss.get(i));
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

	public List<String> getAuthorizeUserIdss() {
		return this.authorizeUserIdss;
	}

	public void setAuthorizeUserIdss(List<String> authorizeUserIdss) {
		this.authorizeUserIdss = authorizeUserIdss;	
		if (authorizeUserIdss != null) {
			for (int i = 0; i < authorizeUserIdss.size(); i++) {
				putBodyParameter("AuthorizeUserIds." + (i + 1) , authorizeUserIdss.get(i));
			}
		}	
	}

	@Override
	public Class<AuthorizeInstanceGroupResponse> getResponseClass() {
		return AuthorizeInstanceGroupResponse.class;
	}

}
