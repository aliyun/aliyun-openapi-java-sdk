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
public class CheckSmsReceiptExportStatusRequest extends RpcAcsRequest<CheckSmsReceiptExportStatusResponse> {
	   

	private String accessId;

	private String marketTaskId;

	private String workspaceId;
	public CheckSmsReceiptExportStatusRequest() {
		super("retailadvqa-public", "2020-05-15", "CheckSmsReceiptExportStatus");
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

	public String getMarketTaskId() {
		return this.marketTaskId;
	}

	public void setMarketTaskId(String marketTaskId) {
		this.marketTaskId = marketTaskId;
		if(marketTaskId != null){
			putQueryParameter("MarketTaskId", marketTaskId);
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
	public Class<CheckSmsReceiptExportStatusResponse> getResponseClass() {
		return CheckSmsReceiptExportStatusResponse.class;
	}

}
