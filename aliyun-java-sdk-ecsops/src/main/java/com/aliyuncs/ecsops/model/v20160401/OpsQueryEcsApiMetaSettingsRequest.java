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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryEcsApiMetaSettingsRequest extends RpcAcsRequest<OpsQueryEcsApiMetaSettingsResponse> {
	   

	private String proApiName;

	private List<String> attributeNamess;

	private Integer pageNumber;

	private Integer pageSize;

	private String productName;

	private String apiVersion;

	private String auditParamStr;
	public OpsQueryEcsApiMetaSettingsRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryEcsApiMetaSettings", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProApiName() {
		return this.proApiName;
	}

	public void setProApiName(String proApiName) {
		this.proApiName = proApiName;
		if(proApiName != null){
			putQueryParameter("ProApiName", proApiName);
		}
	}

	public List<String> getAttributeNamess() {
		return this.attributeNamess;
	}

	public void setAttributeNamess(List<String> attributeNamess) {
		this.attributeNamess = attributeNamess;	
		if (attributeNamess != null) {
			for (int i = 0; i < attributeNamess.size(); i++) {
				putQueryParameter("AttributeNames." + (i + 1) , attributeNamess.get(i));
			}
		}	
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		if(productName != null){
			putQueryParameter("ProductName", productName);
		}
	}

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
		if(apiVersion != null){
			putQueryParameter("ApiVersion", apiVersion);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsQueryEcsApiMetaSettingsResponse> getResponseClass() {
		return OpsQueryEcsApiMetaSettingsResponse.class;
	}

}
