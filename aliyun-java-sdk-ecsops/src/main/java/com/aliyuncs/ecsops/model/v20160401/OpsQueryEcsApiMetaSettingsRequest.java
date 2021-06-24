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

/**
 * @author auto create
 * @version 
 */
public class OpsQueryEcsApiMetaSettingsRequest extends RpcAcsRequest<OpsQueryEcsApiMetaSettingsResponse> {
	   

	private String proApiName;

	private Integer pageNumber;

	private List<String> attributeNamess;

	private Integer pageSize;

	private String productName;

	private List<MetaInfo> metaInfos;

	private String apiVersion;

	private String auditParamStr;
	public OpsQueryEcsApiMetaSettingsRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryEcsApiMetaSettings", "ecsops");
		setMethod(MethodType.POST);
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
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

	public List<MetaInfo> getMetaInfos() {
		return this.metaInfos;
	}

	public void setMetaInfos(List<MetaInfo> metaInfos) {
		this.metaInfos = metaInfos;	
		if (metaInfos != null) {
			for (int depth1 = 0; depth1 < metaInfos.size(); depth1++) {
				putQueryParameter("MetaInfo." + (depth1 + 1) + ".Key" , metaInfos.get(depth1).getKey());
				if (metaInfos.get(depth1).getValuess() != null) {
					for (int i = 0; i < metaInfos.get(depth1).getValuess().size(); i++) {
						putQueryParameter("MetaInfo." + (depth1 + 1) + ".Values." + (i + 1) , metaInfos.get(depth1).getValuess().get(i));
					}
				}
			}
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

	public static class MetaInfo {

		private String key;

		private List<String> valuess;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public List<String> getValuess() {
			return this.valuess;
		}

		public void setValuess(List<String> valuess) {
			this.valuess = valuess;
		}
	}

	@Override
	public Class<OpsQueryEcsApiMetaSettingsResponse> getResponseClass() {
		return OpsQueryEcsApiMetaSettingsResponse.class;
	}

}
