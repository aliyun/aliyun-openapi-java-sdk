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

package com.aliyuncs.cdrs.model.v20201101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PaginateProjectRequest extends RpcAcsRequest<PaginateProjectResponse> {
	   

	private String type;

	private Long pageNumber;

	private Boolean countTotalNum;

	private Long pageSize;

	private String nameLike;
	public PaginateProjectRequest() {
		super("CDRS", "2020-11-01", "PaginateProject");
		setMethod(MethodType.POST);
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public Boolean getCountTotalNum() {
		return this.countTotalNum;
	}

	public void setCountTotalNum(Boolean countTotalNum) {
		this.countTotalNum = countTotalNum;
		if(countTotalNum != null){
			putBodyParameter("CountTotalNum", countTotalNum.toString());
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getNameLike() {
		return this.nameLike;
	}

	public void setNameLike(String nameLike) {
		this.nameLike = nameLike;
		if(nameLike != null){
			putBodyParameter("NameLike", nameLike);
		}
	}

	@Override
	public Class<PaginateProjectResponse> getResponseClass() {
		return PaginateProjectResponse.class;
	}

}
