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
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QuerySavingsPlansDiscountRequest extends RpcAcsRequest<QuerySavingsPlansDiscountResponse> {
	   

	private String commodityCode;

	private String locale;

	private Integer pageNum;

	private String cycle;

	private String spec;

	private String moduleCode;

	private String payMode;

	private Integer pageSize;

	private String spnType;

	private String region;
	public QuerySavingsPlansDiscountRequest() {
		super("BssOpenApi", "2017-12-14", "QuerySavingsPlansDiscount");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
		if(commodityCode != null){
			putQueryParameter("CommodityCode", commodityCode);
		}
	}

	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
		if(locale != null){
			putQueryParameter("Locale", locale);
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

	public String getCycle() {
		return this.cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
		if(cycle != null){
			putQueryParameter("Cycle", cycle);
		}
	}

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
		if(spec != null){
			putQueryParameter("Spec", spec);
		}
	}

	public String getModuleCode() {
		return this.moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
		if(moduleCode != null){
			putQueryParameter("ModuleCode", moduleCode);
		}
	}

	public String getPayMode() {
		return this.payMode;
	}

	public void setPayMode(String payMode) {
		this.payMode = payMode;
		if(payMode != null){
			putQueryParameter("PayMode", payMode);
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

	public String getSpnType() {
		return this.spnType;
	}

	public void setSpnType(String spnType) {
		this.spnType = spnType;
		if(spnType != null){
			putQueryParameter("SpnType", spnType);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	@Override
	public Class<QuerySavingsPlansDiscountResponse> getResponseClass() {
		return QuerySavingsPlansDiscountResponse.class;
	}

}
