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
public class GetAudienceMarketingInfoRequest extends RpcAcsRequest<GetAudienceMarketingInfoResponse> {
	   

	private String accessId;

	private Long pageSize;

	private String latestDataModifyStartTime;

	private String latestDataModifyEndTime;

	private Long pageNum;

	private String workspaceId;
	public GetAudienceMarketingInfoRequest() {
		super("retailadvqa-public", "2020-05-15", "GetAudienceMarketingInfo");
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

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getLatestDataModifyStartTime() {
		return this.latestDataModifyStartTime;
	}

	public void setLatestDataModifyStartTime(String latestDataModifyStartTime) {
		this.latestDataModifyStartTime = latestDataModifyStartTime;
		if(latestDataModifyStartTime != null){
			putQueryParameter("LatestDataModifyStartTime", latestDataModifyStartTime);
		}
	}

	public String getLatestDataModifyEndTime() {
		return this.latestDataModifyEndTime;
	}

	public void setLatestDataModifyEndTime(String latestDataModifyEndTime) {
		this.latestDataModifyEndTime = latestDataModifyEndTime;
		if(latestDataModifyEndTime != null){
			putQueryParameter("LatestDataModifyEndTime", latestDataModifyEndTime);
		}
	}

	public Long getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Long pageNum) {
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
	public Class<GetAudienceMarketingInfoResponse> getResponseClass() {
		return GetAudienceMarketingInfoResponse.class;
	}

}
