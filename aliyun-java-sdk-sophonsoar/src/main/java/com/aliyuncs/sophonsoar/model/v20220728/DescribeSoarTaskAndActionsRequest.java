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

package com.aliyuncs.sophonsoar.model.v20220728;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeSoarTaskAndActionsRequest extends RpcAcsRequest<DescribeSoarTaskAndActionsResponse> {
	   

	private Integer pageNumber;

	private String requestUuid;

	private Integer pageSize;

	private String lang;

	private String queryValue;

	private String queryType;
	public DescribeSoarTaskAndActionsRequest() {
		super("sophonsoar", "2022-07-28", "DescribeSoarTaskAndActions");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getRequestUuid() {
		return this.requestUuid;
	}

	public void setRequestUuid(String requestUuid) {
		this.requestUuid = requestUuid;
		if(requestUuid != null){
			putQueryParameter("RequestUuid", requestUuid);
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

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getQueryValue() {
		return this.queryValue;
	}

	public void setQueryValue(String queryValue) {
		this.queryValue = queryValue;
		if(queryValue != null){
			putQueryParameter("QueryValue", queryValue);
		}
	}

	public String getQueryType() {
		return this.queryType;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
		if(queryType != null){
			putQueryParameter("QueryType", queryType);
		}
	}

	@Override
	public Class<DescribeSoarTaskAndActionsResponse> getResponseClass() {
		return DescribeSoarTaskAndActionsResponse.class;
	}

}
