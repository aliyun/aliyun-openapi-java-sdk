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

package com.aliyuncs.copyright.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetAllPatentListRequest extends RpcAcsRequest<GetAllPatentListResponse> {
	   

	private Integer pageNum;

	private Long startPayDate;

	private String patentStatus;

	private Integer soldType;

	private Long endPayDate;

	private String pageSize;

	private String keyword;
	public GetAllPatentListRequest() {
		super("Copyright", "2019-01-23", "GetAllPatentList", "swcopyright");
		setMethod(MethodType.POST);
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

	public Long getStartPayDate() {
		return this.startPayDate;
	}

	public void setStartPayDate(Long startPayDate) {
		this.startPayDate = startPayDate;
		if(startPayDate != null){
			putQueryParameter("StartPayDate", startPayDate.toString());
		}
	}

	public String getPatentStatus() {
		return this.patentStatus;
	}

	public void setPatentStatus(String patentStatus) {
		this.patentStatus = patentStatus;
		if(patentStatus != null){
			putQueryParameter("PatentStatus", patentStatus);
		}
	}

	public Integer getSoldType() {
		return this.soldType;
	}

	public void setSoldType(Integer soldType) {
		this.soldType = soldType;
		if(soldType != null){
			putQueryParameter("SoldType", soldType.toString());
		}
	}

	public Long getEndPayDate() {
		return this.endPayDate;
	}

	public void setEndPayDate(Long endPayDate) {
		this.endPayDate = endPayDate;
		if(endPayDate != null){
			putQueryParameter("EndPayDate", endPayDate.toString());
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
		}
	}

	@Override
	public Class<GetAllPatentListResponse> getResponseClass() {
		return GetAllPatentListResponse.class;
	}

}
