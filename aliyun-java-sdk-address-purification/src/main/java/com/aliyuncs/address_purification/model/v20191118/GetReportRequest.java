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

package com.aliyuncs.address_purification.model.v20191118;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetReportRequest extends RpcAcsRequest<GetReportResponse> {
	   

	private String productCode;

	private String reportType;

	private String apiCode;

	private String granularity;

	private String commodityCode;

	private String parameters;
	public GetReportRequest() {
		super("address-purification", "2019-11-18", "GetReport");
		setMethod(MethodType.POST);
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putBodyParameter("ProductCode", productCode);
		}
	}

	public String getReportType() {
		return this.reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
		if(reportType != null){
			putBodyParameter("ReportType", reportType);
		}
	}

	public String getApiCode() {
		return this.apiCode;
	}

	public void setApiCode(String apiCode) {
		this.apiCode = apiCode;
		if(apiCode != null){
			putBodyParameter("ApiCode", apiCode);
		}
	}

	public String getGranularity() {
		return this.granularity;
	}

	public void setGranularity(String granularity) {
		this.granularity = granularity;
		if(granularity != null){
			putBodyParameter("Granularity", granularity);
		}
	}

	public String getCommodityCode() {
		return this.commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
		if(commodityCode != null){
			putBodyParameter("CommodityCode", commodityCode);
		}
	}

	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
		if(parameters != null){
			putBodyParameter("Parameters", parameters);
		}
	}

	@Override
	public Class<GetReportResponse> getResponseClass() {
		return GetReportResponse.class;
	}

}
