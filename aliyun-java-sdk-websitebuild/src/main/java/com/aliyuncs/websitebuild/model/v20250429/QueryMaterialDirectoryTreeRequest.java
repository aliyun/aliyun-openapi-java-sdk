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

package com.aliyuncs.websitebuild.model.v20250429;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryMaterialDirectoryTreeRequest extends RpcAcsRequest<QueryMaterialDirectoryTreeResponse> {
	   

	private Boolean hiddenPublic;

	private Boolean root;

	private String bizId;
	public QueryMaterialDirectoryTreeRequest() {
		super("WebsiteBuild", "2025-04-29", "QueryMaterialDirectoryTree");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Boolean getHiddenPublic() {
		return this.hiddenPublic;
	}

	public void setHiddenPublic(Boolean hiddenPublic) {
		this.hiddenPublic = hiddenPublic;
		if(hiddenPublic != null){
			putQueryParameter("HiddenPublic", hiddenPublic.toString());
		}
	}

	public Boolean getRoot() {
		return this.root;
	}

	public void setRoot(Boolean root) {
		this.root = root;
		if(root != null){
			putQueryParameter("Root", root.toString());
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	@Override
	public Class<QueryMaterialDirectoryTreeResponse> getResponseClass() {
		return QueryMaterialDirectoryTreeResponse.class;
	}

}
