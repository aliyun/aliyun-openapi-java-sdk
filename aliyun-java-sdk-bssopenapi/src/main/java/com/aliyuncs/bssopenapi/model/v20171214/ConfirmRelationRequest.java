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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ConfirmRelationRequest extends RpcAcsRequest<ConfirmRelationResponse> {
	   

	private String relationType;

	private Long parentUserId;

	private String confirmCode;

	private Long childUserId;

	private String requestId;

	private List<String> permissionCodess;
	public ConfirmRelationRequest() {
		super("BssOpenApi", "2017-12-14", "ConfirmRelation");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRelationType() {
		return this.relationType;
	}

	public void setRelationType(String relationType) {
		this.relationType = relationType;
		if(relationType != null){
			putQueryParameter("RelationType", relationType);
		}
	}

	public Long getParentUserId() {
		return this.parentUserId;
	}

	public void setParentUserId(Long parentUserId) {
		this.parentUserId = parentUserId;
		if(parentUserId != null){
			putQueryParameter("ParentUserId", parentUserId.toString());
		}
	}

	public String getConfirmCode() {
		return this.confirmCode;
	}

	public void setConfirmCode(String confirmCode) {
		this.confirmCode = confirmCode;
		if(confirmCode != null){
			putQueryParameter("ConfirmCode", confirmCode);
		}
	}

	public Long getChildUserId() {
		return this.childUserId;
	}

	public void setChildUserId(Long childUserId) {
		this.childUserId = childUserId;
		if(childUserId != null){
			putQueryParameter("ChildUserId", childUserId.toString());
		}
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
		if(requestId != null){
			putQueryParameter("RequestId", requestId);
		}
	}

	public List<String> getPermissionCodess() {
		return this.permissionCodess;
	}

	public void setPermissionCodess(List<String> permissionCodess) {
		this.permissionCodess = permissionCodess;	
		if (permissionCodess != null) {
			for (int i = 0; i < permissionCodess.size(); i++) {
				putQueryParameter("PermissionCodes." + (i + 1) , permissionCodess.get(i));
			}
		}	
	}

	@Override
	public Class<ConfirmRelationResponse> getResponseClass() {
		return ConfirmRelationResponse.class;
	}

}
