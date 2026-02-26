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
public class GetAllPatentApplyNumberListRequest extends RpcAcsRequest<GetAllPatentApplyNumberListResponse> {
	   

	private Long startPayDate;

	private String patentStatus;

	private Integer soldType;

	private Long endPayDate;

	private String keyword;
	public GetAllPatentApplyNumberListRequest() {
		super("Copyright", "2019-01-23", "GetAllPatentApplyNumberList", "swcopyright");
		setMethod(MethodType.POST);
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
	public Class<GetAllPatentApplyNumberListResponse> getResponseClass() {
		return GetAllPatentApplyNumberListResponse.class;
	}

}
