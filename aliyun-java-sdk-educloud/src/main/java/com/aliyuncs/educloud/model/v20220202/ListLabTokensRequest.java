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

package com.aliyuncs.educloud.model.v20220202;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListLabTokensRequest extends RpcAcsRequest<ListLabTokensResponse> {
	   

	private String ramUid;

	private String labId;

	private Long finishStatus;

	private Long pageSize;

	private Long page;
	public ListLabTokensRequest() {
		super("EduCloud", "2022-02-02", "ListLabTokens");
		setMethod(MethodType.GET);
	}

	public String getRamUid() {
		return this.ramUid;
	}

	public void setRamUid(String ramUid) {
		this.ramUid = ramUid;
		if(ramUid != null){
			putQueryParameter("RamUid", ramUid);
		}
	}

	public String getLabId() {
		return this.labId;
	}

	public void setLabId(String labId) {
		this.labId = labId;
		if(labId != null){
			putQueryParameter("LabId", labId);
		}
	}

	public Long getFinishStatus() {
		return this.finishStatus;
	}

	public void setFinishStatus(Long finishStatus) {
		this.finishStatus = finishStatus;
		if(finishStatus != null){
			putQueryParameter("FinishStatus", finishStatus.toString());
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

	public Long getPage() {
		return this.page;
	}

	public void setPage(Long page) {
		this.page = page;
		if(page != null){
			putQueryParameter("Page", page.toString());
		}
	}

	@Override
	public Class<ListLabTokensResponse> getResponseClass() {
		return ListLabTokensResponse.class;
	}

}
