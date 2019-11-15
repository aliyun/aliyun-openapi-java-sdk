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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryCostUnitRequest extends RpcAcsRequest<QueryCostUnitResponse> {
	   

	private Long parentUnitId;

	private Integer pageNum;

	private Integer pageSize;

	private Long ownerUid;
	public QueryCostUnitRequest() {
		super("BssOpenApi", "2017-12-14", "QueryCostUnit");
		setMethod(MethodType.POST);
	}

	public Long getParentUnitId() {
		return this.parentUnitId;
	}

	public void setParentUnitId(Long parentUnitId) {
		this.parentUnitId = parentUnitId;
		if(parentUnitId != null){
			putQueryParameter("ParentUnitId", parentUnitId.toString());
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Long getOwnerUid() {
		return this.ownerUid;
	}

	public void setOwnerUid(Long ownerUid) {
		this.ownerUid = ownerUid;
		if(ownerUid != null){
			putQueryParameter("OwnerUid", ownerUid.toString());
		}
	}

	@Override
	public Class<QueryCostUnitResponse> getResponseClass() {
		return QueryCostUnitResponse.class;
	}

}
