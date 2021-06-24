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
public class OpsCreateEcsApiMetaSettingAttributeKeyValueRequest extends RpcAcsRequest<OpsCreateEcsApiMetaSettingAttributeKeyValueResponse> {
	   

	private List<MetaSettingAttributeKeyValueList> metaSettingAttributeKeyValueLists;

	private String auditParamStr;
	public OpsCreateEcsApiMetaSettingAttributeKeyValueRequest() {
		super("Ecsops", "2016-04-01", "OpsCreateEcsApiMetaSettingAttributeKeyValue", "ecsops");
		setMethod(MethodType.POST);
	}

	public List<MetaSettingAttributeKeyValueList> getMetaSettingAttributeKeyValueLists() {
		return this.metaSettingAttributeKeyValueLists;
	}

	public void setMetaSettingAttributeKeyValueLists(List<MetaSettingAttributeKeyValueList> metaSettingAttributeKeyValueLists) {
		this.metaSettingAttributeKeyValueLists = metaSettingAttributeKeyValueLists;	
		if (metaSettingAttributeKeyValueLists != null) {
			for (int depth1 = 0; depth1 < metaSettingAttributeKeyValueLists.size(); depth1++) {
				putQueryParameter("MetaSettingAttributeKeyValueList." + (depth1 + 1) + ".Comment" , metaSettingAttributeKeyValueLists.get(depth1).getComment());
				putQueryParameter("MetaSettingAttributeKeyValueList." + (depth1 + 1) + ".AttributeName" , metaSettingAttributeKeyValueLists.get(depth1).getAttributeName());
				putQueryParameter("MetaSettingAttributeKeyValueList." + (depth1 + 1) + ".AttributeValue" , metaSettingAttributeKeyValueLists.get(depth1).getAttributeValue());
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

	public static class MetaSettingAttributeKeyValueList {

		private String comment;

		private String attributeName;

		private String attributeValue;

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getAttributeName() {
			return this.attributeName;
		}

		public void setAttributeName(String attributeName) {
			this.attributeName = attributeName;
		}

		public String getAttributeValue() {
			return this.attributeValue;
		}

		public void setAttributeValue(String attributeValue) {
			this.attributeValue = attributeValue;
		}
	}

	@Override
	public Class<OpsCreateEcsApiMetaSettingAttributeKeyValueResponse> getResponseClass() {
		return OpsCreateEcsApiMetaSettingAttributeKeyValueResponse.class;
	}

}
