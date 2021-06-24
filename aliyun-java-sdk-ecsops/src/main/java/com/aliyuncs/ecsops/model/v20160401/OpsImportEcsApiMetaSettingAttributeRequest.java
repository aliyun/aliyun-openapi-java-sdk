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
public class OpsImportEcsApiMetaSettingAttributeRequest extends RpcAcsRequest<OpsImportEcsApiMetaSettingAttributeResponse> {
	   

	private List<MetaSettingProductInfoList> metaSettingProductInfoLists;

	private String auditParamStr;
	public OpsImportEcsApiMetaSettingAttributeRequest() {
		super("Ecsops", "2016-04-01", "OpsImportEcsApiMetaSettingAttribute", "ecsops");
		setMethod(MethodType.POST);
	}

	public List<MetaSettingProductInfoList> getMetaSettingProductInfoLists() {
		return this.metaSettingProductInfoLists;
	}

	public void setMetaSettingProductInfoLists(List<MetaSettingProductInfoList> metaSettingProductInfoLists) {
		this.metaSettingProductInfoLists = metaSettingProductInfoLists;	
		if (metaSettingProductInfoLists != null) {
			for (int depth1 = 0; depth1 < metaSettingProductInfoLists.size(); depth1++) {
				putQueryParameter("MetaSettingProductInfoList." + (depth1 + 1) + ".ProductName" , metaSettingProductInfoLists.get(depth1).getProductName());
				putQueryParameter("MetaSettingProductInfoList." + (depth1 + 1) + ".ProApiName" , metaSettingProductInfoLists.get(depth1).getProApiName());
				putQueryParameter("MetaSettingProductInfoList." + (depth1 + 1) + ".AttributeKey" , metaSettingProductInfoLists.get(depth1).getAttributeKey());
				putQueryParameter("MetaSettingProductInfoList." + (depth1 + 1) + ".VersionName" , metaSettingProductInfoLists.get(depth1).getVersionName());
				putQueryParameter("MetaSettingProductInfoList." + (depth1 + 1) + ".AttributeValue" , metaSettingProductInfoLists.get(depth1).getAttributeValue());
			}
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

	public static class MetaSettingProductInfoList {

		private String productName;

		private String proApiName;

		private String attributeKey;

		private String versionName;

		private String attributeValue;

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProApiName() {
			return this.proApiName;
		}

		public void setProApiName(String proApiName) {
			this.proApiName = proApiName;
		}

		public String getAttributeKey() {
			return this.attributeKey;
		}

		public void setAttributeKey(String attributeKey) {
			this.attributeKey = attributeKey;
		}

		public String getVersionName() {
			return this.versionName;
		}

		public void setVersionName(String versionName) {
			this.versionName = versionName;
		}

		public String getAttributeValue() {
			return this.attributeValue;
		}

		public void setAttributeValue(String attributeValue) {
			this.attributeValue = attributeValue;
		}
	}

	@Override
	public Class<OpsImportEcsApiMetaSettingAttributeResponse> getResponseClass() {
		return OpsImportEcsApiMetaSettingAttributeResponse.class;
	}

}
