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
public class RevokeUserPermissionRequest extends RpcAcsRequest<RevokeUserPermissionResponse> {
	   

	private String permTypes;

	private String userAccessId;

	private String dsType;

	private String userId;

	private Long tid;

	private String dbId;

	private String tableId;

	private Boolean logic;

	private String tableName;
	public RevokeUserPermissionRequest() {
		super("dms-enterprise", "2018-11-01", "RevokeUserPermission");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPermTypes() {
		return this.permTypes;
	}

	public void setPermTypes(String permTypes) {
		this.permTypes = permTypes;
		if(permTypes != null){
			putQueryParameter("PermTypes", permTypes);
		}
	}

	public String getUserAccessId() {
		return this.userAccessId;
	}

	public void setUserAccessId(String userAccessId) {
		this.userAccessId = userAccessId;
		if(userAccessId != null){
			putQueryParameter("UserAccessId", userAccessId);
		}
	}

	public String getDsType() {
		return this.dsType;
	}

	public void setDsType(String dsType) {
		this.dsType = dsType;
		if(dsType != null){
			putQueryParameter("DsType", dsType);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
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

	public String getDbId() {
		return this.dbId;
	}

	public void setDbId(String dbId) {
		this.dbId = dbId;
		if(dbId != null){
			putQueryParameter("DbId", dbId);
		}
	}

	public String getTableId() {
		return this.tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
		if(tableId != null){
			putQueryParameter("TableId", tableId);
		}
	}

	public Boolean getLogic() {
		return this.logic;
	}

	public void setLogic(Boolean logic) {
		this.logic = logic;
		if(logic != null){
			putQueryParameter("Logic", logic.toString());
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

	@Override
	public Class<RevokeUserPermissionResponse> getResponseClass() {
		return RevokeUserPermissionResponse.class;
	}

}
