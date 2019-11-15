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

/**
 * @author auto create
 * @version 
 */
public class QueryEvaluateListRequest extends RpcAcsRequest<QueryEvaluateListResponse> {
	   

	private String endSearchTime;

	private String outBizId;

	private Integer sortType;

	private Integer type;

	private Integer pageNum;

	private Integer pageSize;

	private Long endAmount;

	private String billCycle;

	private List<String> bizTypeLists;

	private Long ownerId;

	private String startSearchTime;

	private String endBizTime;

	private Long startAmount;

	private String startBizTime;
	public QueryEvaluateListRequest() {
		super("BssOpenApi", "2017-12-14", "QueryEvaluateList");
		setMethod(MethodType.POST);
	}

	public String getEndSearchTime() {
		return this.endSearchTime;
	}

	public void setEndSearchTime(String endSearchTime) {
		this.endSearchTime = endSearchTime;
		if(endSearchTime != null){
			putQueryParameter("EndSearchTime", endSearchTime);
		}
	}

	public String getOutBizId() {
		return this.outBizId;
	}

	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
		if(outBizId != null){
			putQueryParameter("OutBizId", outBizId);
		}
	}

	public Integer getSortType() {
		return this.sortType;
	}

	public void setSortType(Integer sortType) {
		this.sortType = sortType;
		if(sortType != null){
			putQueryParameter("SortType", sortType.toString());
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type.toString());
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

	public Long getEndAmount() {
		return this.endAmount;
	}

	public void setEndAmount(Long endAmount) {
		this.endAmount = endAmount;
		if(endAmount != null){
			putQueryParameter("EndAmount", endAmount.toString());
		}
	}

	public String getBillCycle() {
		return this.billCycle;
	}

	public void setBillCycle(String billCycle) {
		this.billCycle = billCycle;
		if(billCycle != null){
			putQueryParameter("BillCycle", billCycle);
		}
	}

	public List<String> getBizTypeLists() {
		return this.bizTypeLists;
	}

	public void setBizTypeLists(List<String> bizTypeLists) {
		this.bizTypeLists = bizTypeLists;	
		if (bizTypeLists != null) {
			for (int i = 0; i < bizTypeLists.size(); i++) {
				putQueryParameter("BizTypeList." + (i + 1) , bizTypeLists.get(i));
			}
		}	
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getStartSearchTime() {
		return this.startSearchTime;
	}

	public void setStartSearchTime(String startSearchTime) {
		this.startSearchTime = startSearchTime;
		if(startSearchTime != null){
			putQueryParameter("StartSearchTime", startSearchTime);
		}
	}

	public String getEndBizTime() {
		return this.endBizTime;
	}

	public void setEndBizTime(String endBizTime) {
		this.endBizTime = endBizTime;
		if(endBizTime != null){
			putQueryParameter("EndBizTime", endBizTime);
		}
	}

	public Long getStartAmount() {
		return this.startAmount;
	}

	public void setStartAmount(Long startAmount) {
		this.startAmount = startAmount;
		if(startAmount != null){
			putQueryParameter("StartAmount", startAmount.toString());
		}
	}

	public String getStartBizTime() {
		return this.startBizTime;
	}

	public void setStartBizTime(String startBizTime) {
		this.startBizTime = startBizTime;
		if(startBizTime != null){
			putQueryParameter("StartBizTime", startBizTime);
		}
	}

	@Override
	public Class<QueryEvaluateListResponse> getResponseClass() {
		return QueryEvaluateListResponse.class;
	}

}
