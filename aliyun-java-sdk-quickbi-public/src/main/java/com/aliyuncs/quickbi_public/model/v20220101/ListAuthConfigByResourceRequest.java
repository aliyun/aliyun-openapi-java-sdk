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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListAuthConfigByResourceRequest extends RpcAcsRequest<ListAuthConfigByResourceResponse> {
	   

	private Boolean hasAuth;

	private String keyword;

	private String resourceId;

	private String worksType;

	private Integer shareToType;
	public ListAuthConfigByResourceRequest() {
		super("quickbi-public", "2022-01-01", "ListAuthConfigByResource", "QuickBI");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Boolean getHasAuth() {
		return this.hasAuth;
	}

	public void setHasAuth(Boolean hasAuth) {
		this.hasAuth = hasAuth;
		if(hasAuth != null){
			putQueryParameter("HasAuth", hasAuth.toString());
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
		}
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
		}
	}

	public String getWorksType() {
		return this.worksType;
	}

	public void setWorksType(String worksType) {
		this.worksType = worksType;
		if(worksType != null){
			putQueryParameter("WorksType", worksType);
		}
	}

	public Integer getShareToType() {
		return this.shareToType;
	}

	public void setShareToType(Integer shareToType) {
		this.shareToType = shareToType;
		if(shareToType != null){
			putQueryParameter("ShareToType", shareToType.toString());
		}
	}

	@Override
	public Class<ListAuthConfigByResourceResponse> getResponseClass() {
		return ListAuthConfigByResourceResponse.class;
	}

}
