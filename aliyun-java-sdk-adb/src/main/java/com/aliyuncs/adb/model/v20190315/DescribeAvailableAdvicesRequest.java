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

package com.aliyuncs.adb.model.v20190315;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.adb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeAvailableAdvicesRequest extends RpcAcsRequest<DescribeAvailableAdvicesResponse> {
	   

	private String dBClusterId;

	private String schemaTableName;

	private Long pageNumber;

	private String adviceType;

	private Long adviceDate;

	private Long pageSize;

	private String lang;

	private String keyword;

	private String order;
	public DescribeAvailableAdvicesRequest() {
		super("adb", "2019-03-15", "DescribeAvailableAdvices", "ads");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
		}
	}

	public String getSchemaTableName() {
		return this.schemaTableName;
	}

	public void setSchemaTableName(String schemaTableName) {
		this.schemaTableName = schemaTableName;
		if(schemaTableName != null){
			putQueryParameter("SchemaTableName", schemaTableName);
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getAdviceType() {
		return this.adviceType;
	}

	public void setAdviceType(String adviceType) {
		this.adviceType = adviceType;
		if(adviceType != null){
			putQueryParameter("AdviceType", adviceType);
		}
	}

	public Long getAdviceDate() {
		return this.adviceDate;
	}

	public void setAdviceDate(Long adviceDate) {
		this.adviceDate = adviceDate;
		if(adviceDate != null){
			putQueryParameter("AdviceDate", adviceDate.toString());
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

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
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

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order);
		}
	}

	@Override
	public Class<DescribeAvailableAdvicesResponse> getResponseClass() {
		return DescribeAvailableAdvicesResponse.class;
	}

}
