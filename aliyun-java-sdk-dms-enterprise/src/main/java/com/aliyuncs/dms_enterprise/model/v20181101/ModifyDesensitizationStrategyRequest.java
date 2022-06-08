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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDesensitizationStrategyRequest extends RpcAcsRequest<ModifyDesensitizationStrategyResponse> {
	   

	private String schemaName;

	private Boolean isReset;

	private Boolean isLogic;

	private String columnName;

	private Long tid;

	private Integer dbId;

	private String tableName;

	private Integer ruleId;
	public ModifyDesensitizationStrategyRequest() {
		super("dms-enterprise", "2018-11-01", "ModifyDesensitizationStrategy", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSchemaName() {
		return this.schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
		if(schemaName != null){
			putQueryParameter("SchemaName", schemaName);
		}
	}

	public Boolean getIsReset() {
		return this.isReset;
	}

	public void setIsReset(Boolean isReset) {
		this.isReset = isReset;
		if(isReset != null){
			putQueryParameter("IsReset", isReset.toString());
		}
	}

	public Boolean getIsLogic() {
		return this.isLogic;
	}

	public void setIsLogic(Boolean isLogic) {
		this.isLogic = isLogic;
		if(isLogic != null){
			putQueryParameter("IsLogic", isLogic.toString());
		}
	}

	public String getColumnName() {
		return this.columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
		if(columnName != null){
			putQueryParameter("ColumnName", columnName);
		}
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public Integer getDbId() {
		return this.dbId;
	}

	public void setDbId(Integer dbId) {
		this.dbId = dbId;
		if(dbId != null){
			putQueryParameter("DbId", dbId.toString());
		}
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
		if(tableName != null){
			putQueryParameter("TableName", tableName);
		}
	}

	public Integer getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(Integer ruleId) {
		this.ruleId = ruleId;
		if(ruleId != null){
			putQueryParameter("RuleId", ruleId.toString());
		}
	}

	@Override
	public Class<ModifyDesensitizationStrategyResponse> getResponseClass() {
		return ModifyDesensitizationStrategyResponse.class;
	}

}
