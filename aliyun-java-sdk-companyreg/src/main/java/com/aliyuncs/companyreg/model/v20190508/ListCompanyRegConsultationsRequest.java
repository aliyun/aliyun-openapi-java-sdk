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

package com.aliyuncs.companyreg.model.v20190508;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListCompanyRegConsultationsRequest extends RpcAcsRequest<ListCompanyRegConsultationsResponse> {
	
	public ListCompanyRegConsultationsRequest() {
		super("companyreg", "2019-05-08", "ListCompanyRegConsultations", "companyreg");
	}

	private Long endGmtCreate;

	private String city;

	private Integer pageSize;

	private String bizId;

	private Long startGmtCreate;

	private Integer pageNum;

	public Long getEndGmtCreate() {
		return this.endGmtCreate;
	}

	public void setEndGmtCreate(Long endGmtCreate) {
		this.endGmtCreate = endGmtCreate;
		if(endGmtCreate != null){
			putQueryParameter("EndGmtCreate", endGmtCreate.toString());
		}
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
		if(city != null){
			putQueryParameter("City", city);
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

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public Long getStartGmtCreate() {
		return this.startGmtCreate;
	}

	public void setStartGmtCreate(Long startGmtCreate) {
		this.startGmtCreate = startGmtCreate;
		if(startGmtCreate != null){
			putQueryParameter("StartGmtCreate", startGmtCreate.toString());
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

	@Override
	public Class<ListCompanyRegConsultationsResponse> getResponseClass() {
		return ListCompanyRegConsultationsResponse.class;
	}

}
