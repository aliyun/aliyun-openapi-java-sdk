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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DsgQuerySensResultRequest extends RpcAcsRequest<DsgQuerySensResultResponse> {
	   

	private String col;

	private String projectName;

	private String schemaName;

	private String level;

	private String sensStatus;

	private String nodeName;

	private String sensitiveId;

	private Integer pageNo;

	private String tenantId;

	private String dbType;

	private Integer pageSize;

	private String sensitiveName;

	private String table;

	private String order;

	private String orderField;
	public DsgQuerySensResultRequest() {
		super("dataworks-public", "2020-05-18", "DsgQuerySensResult");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCol() {
		return this.col;
	}

	public void setCol(String col) {
		this.col = col;
		if(col != null){
			putBodyParameter("Col", col);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putBodyParameter("ProjectName", projectName);
		}
	}

	public String getSchemaName() {
		return this.schemaName;
	}

	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
		if(schemaName != null){
			putBodyParameter("SchemaName", schemaName);
		}
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
		if(level != null){
			putBodyParameter("Level", level);
		}
	}

	public String getSensStatus() {
		return this.sensStatus;
	}

	public void setSensStatus(String sensStatus) {
		this.sensStatus = sensStatus;
		if(sensStatus != null){
			putBodyParameter("SensStatus", sensStatus);
		}
	}

	public String getNodeName() {
		return this.nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
		if(nodeName != null){
			putBodyParameter("NodeName", nodeName);
		}
	}

	public String getSensitiveId() {
		return this.sensitiveId;
	}

	public void setSensitiveId(String sensitiveId) {
		this.sensitiveId = sensitiveId;
		if(sensitiveId != null){
			putBodyParameter("SensitiveId", sensitiveId);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putBodyParameter("PageNo", pageNo.toString());
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getDbType() {
		return this.dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
		if(dbType != null){
			putBodyParameter("DbType", dbType);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getSensitiveName() {
		return this.sensitiveName;
	}

	public void setSensitiveName(String sensitiveName) {
		this.sensitiveName = sensitiveName;
		if(sensitiveName != null){
			putBodyParameter("SensitiveName", sensitiveName);
		}
	}

	public String getTable() {
		return this.table;
	}

	public void setTable(String table) {
		this.table = table;
		if(table != null){
			putBodyParameter("Table", table);
		}
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putBodyParameter("Order", order);
		}
	}

	public String getOrderField() {
		return this.orderField;
	}

	public void setOrderField(String orderField) {
		this.orderField = orderField;
		if(orderField != null){
			putBodyParameter("OrderField", orderField);
		}
	}

	@Override
	public Class<DsgQuerySensResultResponse> getResponseClass() {
		return DsgQuerySensResultResponse.class;
	}

}
