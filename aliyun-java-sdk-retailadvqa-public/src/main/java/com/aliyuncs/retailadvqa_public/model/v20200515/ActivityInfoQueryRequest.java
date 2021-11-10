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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ActivityInfoQueryRequest extends RpcAcsRequest<ActivityInfoQueryResponse> {
	   

	private String accessId;

	private String privateKey;

	private Boolean isMainActivity;

	private Boolean isIncludeMainActivity;

	private Integer pageSize;

	private Integer pageNum;

	private String workspaceId;
	public ActivityInfoQueryRequest() {
		super("retailadvqa-public", "2020-05-15", "ActivityInfoQuery");
		setMethod(MethodType.POST);
	}

	public String getAccessId() {
		return this.accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
		if(accessId != null){
			putQueryParameter("AccessId", accessId);
		}
	}

	public String getPrivateKey() {
		return this.privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
		if(privateKey != null){
			putQueryParameter("PrivateKey", privateKey);
		}
	}

	public Boolean getIsMainActivity() {
		return this.isMainActivity;
	}

	public void setIsMainActivity(Boolean isMainActivity) {
		this.isMainActivity = isMainActivity;
		if(isMainActivity != null){
			putQueryParameter("IsMainActivity", isMainActivity.toString());
		}
	}

	public Boolean getIsIncludeMainActivity() {
		return this.isIncludeMainActivity;
	}

	public void setIsIncludeMainActivity(Boolean isIncludeMainActivity) {
		this.isIncludeMainActivity = isIncludeMainActivity;
		if(isIncludeMainActivity != null){
			putQueryParameter("IsIncludeMainActivity", isIncludeMainActivity.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<ActivityInfoQueryResponse> getResponseClass() {
		return ActivityInfoQueryResponse.class;
	}

}
