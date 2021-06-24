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
public class OpsOperateInstanceTypeExtAttributeRequest extends RpcAcsRequest<OpsOperateInstanceTypeExtAttributeResponse> {
	   

	private List<AttributeModelList> attributeModelLists;

	private String auditParamStr;
	public OpsOperateInstanceTypeExtAttributeRequest() {
		super("Ecsops", "2016-04-01", "OpsOperateInstanceTypeExtAttribute", "ecsops");
		setMethod(MethodType.POST);
	}

	public List<AttributeModelList> getAttributeModelLists() {
		return this.attributeModelLists;
	}

	public void setAttributeModelLists(List<AttributeModelList> attributeModelLists) {
		this.attributeModelLists = attributeModelLists;	
		if (attributeModelLists != null) {
			for (int depth1 = 0; depth1 < attributeModelLists.size(); depth1++) {
				putQueryParameter("AttributeModelList." + (depth1 + 1) + ".AttributeValue" , attributeModelLists.get(depth1).getAttributeValue());
				putQueryParameter("AttributeModelList." + (depth1 + 1) + ".InstanceType" , attributeModelLists.get(depth1).getInstanceType());
				putQueryParameter("AttributeModelList." + (depth1 + 1) + ".Remark" , attributeModelLists.get(depth1).getRemark());
				putQueryParameter("AttributeModelList." + (depth1 + 1) + ".AttributeName" , attributeModelLists.get(depth1).getAttributeName());
				putQueryParameter("AttributeModelList." + (depth1 + 1) + ".Category" , attributeModelLists.get(depth1).getCategory());
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

	public static class AttributeModelList {

		private String attributeValue;

		private String instanceType;

		private String remark;

		private String attributeName;

		private String category;

		public String getAttributeValue() {
			return this.attributeValue;
		}

		public void setAttributeValue(String attributeValue) {
			this.attributeValue = attributeValue;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getAttributeName() {
			return this.attributeName;
		}

		public void setAttributeName(String attributeName) {
			this.attributeName = attributeName;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}
	}

	@Override
	public Class<OpsOperateInstanceTypeExtAttributeResponse> getResponseClass() {
		return OpsOperateInstanceTypeExtAttributeResponse.class;
	}

}
