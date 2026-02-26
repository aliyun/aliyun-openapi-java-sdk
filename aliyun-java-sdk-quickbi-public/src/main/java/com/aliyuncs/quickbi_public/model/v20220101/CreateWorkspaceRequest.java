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
public class CreateWorkspaceRequest extends RpcAcsRequest<CreateWorkspaceResponse> {
	   

	private Boolean allowViewAll;

	private String workspaceName;

	private String workspaceDescription;

	private Boolean onlyAdminCreateDatasource;

	private Boolean allowShare;

	private Boolean defaultShareToAll;

	private Boolean allowPublish;

	private Boolean useComment;
	public CreateWorkspaceRequest() {
		super("quickbi-public", "2022-01-01", "CreateWorkspace", "2.2.0");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Boolean getAllowViewAll() {
		return this.allowViewAll;
	}

	public void setAllowViewAll(Boolean allowViewAll) {
		this.allowViewAll = allowViewAll;
		if(allowViewAll != null){
			putQueryParameter("AllowViewAll", allowViewAll.toString());
		}
	}

	public String getWorkspaceName() {
		return this.workspaceName;
	}

	public void setWorkspaceName(String workspaceName) {
		this.workspaceName = workspaceName;
		if(workspaceName != null){
			putQueryParameter("WorkspaceName", workspaceName);
		}
	}

	public String getWorkspaceDescription() {
		return this.workspaceDescription;
	}

	public void setWorkspaceDescription(String workspaceDescription) {
		this.workspaceDescription = workspaceDescription;
		if(workspaceDescription != null){
			putQueryParameter("WorkspaceDescription", workspaceDescription);
		}
	}

	public Boolean getOnlyAdminCreateDatasource() {
		return this.onlyAdminCreateDatasource;
	}

	public void setOnlyAdminCreateDatasource(Boolean onlyAdminCreateDatasource) {
		this.onlyAdminCreateDatasource = onlyAdminCreateDatasource;
		if(onlyAdminCreateDatasource != null){
			putQueryParameter("OnlyAdminCreateDatasource", onlyAdminCreateDatasource.toString());
		}
	}

	public Boolean getAllowShare() {
		return this.allowShare;
	}

	public void setAllowShare(Boolean allowShare) {
		this.allowShare = allowShare;
		if(allowShare != null){
			putQueryParameter("AllowShare", allowShare.toString());
		}
	}

	public Boolean getDefaultShareToAll() {
		return this.defaultShareToAll;
	}

	public void setDefaultShareToAll(Boolean defaultShareToAll) {
		this.defaultShareToAll = defaultShareToAll;
		if(defaultShareToAll != null){
			putQueryParameter("DefaultShareToAll", defaultShareToAll.toString());
		}
	}

	public Boolean getAllowPublish() {
		return this.allowPublish;
	}

	public void setAllowPublish(Boolean allowPublish) {
		this.allowPublish = allowPublish;
		if(allowPublish != null){
			putQueryParameter("AllowPublish", allowPublish.toString());
		}
	}

	public Boolean getUseComment() {
		return this.useComment;
	}

	public void setUseComment(Boolean useComment) {
		this.useComment = useComment;
		if(useComment != null){
			putQueryParameter("UseComment", useComment.toString());
		}
	}

	@Override
	public Class<CreateWorkspaceResponse> getResponseClass() {
		return CreateWorkspaceResponse.class;
	}

}
