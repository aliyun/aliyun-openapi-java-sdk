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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryWorksByOrganizationRequest extends RpcAcsRequest<QueryWorksByOrganizationResponse> {
	   

	private Integer thirdPartAuthFlag;

	private Integer pageNum;

	private Integer pageSize;

	private String worksType;

	private Integer status;
	public QueryWorksByOrganizationRequest() {
		super("quickbi-public", "2022-01-01", "QueryWorksByOrganization", "2.2.0");
		setMethod(MethodType.POST);
	}

	public Integer getThirdPartAuthFlag() {
		return this.thirdPartAuthFlag;
	}

	public void setThirdPartAuthFlag(Integer thirdPartAuthFlag) {
		this.thirdPartAuthFlag = thirdPartAuthFlag;
		if(thirdPartAuthFlag != null){
			putQueryParameter("ThirdPartAuthFlag", thirdPartAuthFlag.toString());
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

	public String getWorksType() {
		return this.worksType;
	}

	public void setWorksType(String worksType) {
		this.worksType = worksType;
		if(worksType != null){
			putQueryParameter("WorksType", worksType);
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status.toString());
		}
	}

	@Override
	public Class<QueryWorksByOrganizationResponse> getResponseClass() {
		return QueryWorksByOrganizationResponse.class;
	}

}
