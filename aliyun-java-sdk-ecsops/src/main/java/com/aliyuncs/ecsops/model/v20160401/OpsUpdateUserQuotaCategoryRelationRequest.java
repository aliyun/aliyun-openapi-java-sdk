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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsUpdateUserQuotaCategoryRelationRequest extends RpcAcsRequest<OpsUpdateUserQuotaCategoryRelationResponse> {
	   

	private String newCategoryName;

	private String operator;

	private Integer categoryType;

	private Long uid;

	private Integer uidType;

	private String categoryName;

	private String auditParamStr;
	public OpsUpdateUserQuotaCategoryRelationRequest() {
		super("Ecsops", "2016-04-01", "OpsUpdateUserQuotaCategoryRelation", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getNewCategoryName() {
		return this.newCategoryName;
	}

	public void setNewCategoryName(String newCategoryName) {
		this.newCategoryName = newCategoryName;
		if(newCategoryName != null){
			putQueryParameter("NewCategoryName", newCategoryName);
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public Integer getCategoryType() {
		return this.categoryType;
	}

	public void setCategoryType(Integer categoryType) {
		this.categoryType = categoryType;
		if(categoryType != null){
			putQueryParameter("CategoryType", categoryType.toString());
		}
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid.toString());
		}
	}

	public Integer getUidType() {
		return this.uidType;
	}

	public void setUidType(Integer uidType) {
		this.uidType = uidType;
		if(uidType != null){
			putQueryParameter("UidType", uidType.toString());
		}
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
		if(categoryName != null){
			putQueryParameter("CategoryName", categoryName);
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
	public Class<OpsUpdateUserQuotaCategoryRelationResponse> getResponseClass() {
		return OpsUpdateUserQuotaCategoryRelationResponse.class;
	}

}
