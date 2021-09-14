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

package com.aliyuncs.emas_dmp.model.v20210402;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emas_dmp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTargetAudienceRequest extends RpcAcsRequest<ListTargetAudienceResponse> {
	   

	private String pushedBands;

	private Integer pageNum;

	private Boolean ascendSort;

	private String createTimeEnd;

	private String accountId;

	private String taTypeList;

	private String name;

	private Integer pageSize;

	private String sortBy;

	private String createTimeStart;

	private String taIds;

	private String status;
	public ListTargetAudienceRequest() {
		super("emas-dmp", "2021-04-02", "ListTargetAudience");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPushedBands() {
		return this.pushedBands;
	}

	public void setPushedBands(String pushedBands) {
		this.pushedBands = pushedBands;
		if(pushedBands != null){
			putBodyParameter("PushedBands", pushedBands);
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putBodyParameter("PageNum", pageNum.toString());
		}
	}

	public Boolean getAscendSort() {
		return this.ascendSort;
	}

	public void setAscendSort(Boolean ascendSort) {
		this.ascendSort = ascendSort;
		if(ascendSort != null){
			putBodyParameter("AscendSort", ascendSort.toString());
		}
	}

	public String getCreateTimeEnd() {
		return this.createTimeEnd;
	}

	public void setCreateTimeEnd(String createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
		if(createTimeEnd != null){
			putBodyParameter("CreateTimeEnd", createTimeEnd);
		}
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putBodyParameter("AccountId", accountId);
		}
	}

	public String getTaTypeList() {
		return this.taTypeList;
	}

	public void setTaTypeList(String taTypeList) {
		this.taTypeList = taTypeList;
		if(taTypeList != null){
			putBodyParameter("TaTypeList", taTypeList);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
		if(sortBy != null){
			putBodyParameter("SortBy", sortBy);
		}
	}

	public String getCreateTimeStart() {
		return this.createTimeStart;
	}

	public void setCreateTimeStart(String createTimeStart) {
		this.createTimeStart = createTimeStart;
		if(createTimeStart != null){
			putBodyParameter("CreateTimeStart", createTimeStart);
		}
	}

	public String getTaIds() {
		return this.taIds;
	}

	public void setTaIds(String taIds) {
		this.taIds = taIds;
		if(taIds != null){
			putBodyParameter("TaIds", taIds);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	@Override
	public Class<ListTargetAudienceResponse> getResponseClass() {
		return ListTargetAudienceResponse.class;
	}

}
