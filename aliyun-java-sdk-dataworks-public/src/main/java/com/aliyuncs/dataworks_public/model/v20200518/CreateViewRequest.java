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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateViewRequest extends RpcAcsRequest<CreateViewResponse> {
	   

	private String viewName;

	private String clientToken;

	private String selectSQL;

	private String selectWhere;

	private String selectTableName;

	private String comment;

	private String selectColumn;

	private String appGuid;

	private List<ViewColumn> viewColumns;
	public CreateViewRequest() {
		super("dataworks-public", "2020-05-18", "CreateView");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getViewName() {
		return this.viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
		if(viewName != null){
			putBodyParameter("ViewName", viewName);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getSelectSQL() {
		return this.selectSQL;
	}

	public void setSelectSQL(String selectSQL) {
		this.selectSQL = selectSQL;
		if(selectSQL != null){
			putBodyParameter("SelectSQL", selectSQL);
		}
	}

	public String getSelectWhere() {
		return this.selectWhere;
	}

	public void setSelectWhere(String selectWhere) {
		this.selectWhere = selectWhere;
		if(selectWhere != null){
			putBodyParameter("SelectWhere", selectWhere);
		}
	}

	public String getSelectTableName() {
		return this.selectTableName;
	}

	public void setSelectTableName(String selectTableName) {
		this.selectTableName = selectTableName;
		if(selectTableName != null){
			putBodyParameter("SelectTableName", selectTableName);
		}
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putBodyParameter("Comment", comment);
		}
	}

	public String getSelectColumn() {
		return this.selectColumn;
	}

	public void setSelectColumn(String selectColumn) {
		this.selectColumn = selectColumn;
		if(selectColumn != null){
			putBodyParameter("SelectColumn", selectColumn);
		}
	}

	public String getAppGuid() {
		return this.appGuid;
	}

	public void setAppGuid(String appGuid) {
		this.appGuid = appGuid;
		if(appGuid != null){
			putBodyParameter("AppGuid", appGuid);
		}
	}

	public List<ViewColumn> getViewColumns() {
		return this.viewColumns;
	}

	public void setViewColumns(List<ViewColumn> viewColumns) {
		this.viewColumns = viewColumns;	
		if (viewColumns != null) {
			for (int depth1 = 0; depth1 < viewColumns.size(); depth1++) {
				putBodyParameter("ViewColumn." + (depth1 + 1) + ".Comment" , viewColumns.get(depth1).getComment());
				putBodyParameter("ViewColumn." + (depth1 + 1) + ".ColumnName" , viewColumns.get(depth1).getColumnName());
			}
		}	
	}

	public static class ViewColumn {

		private String comment;

		private String columnName;

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getColumnName() {
			return this.columnName;
		}

		public void setColumnName(String columnName) {
			this.columnName = columnName;
		}
	}

	@Override
	public Class<CreateViewResponse> getResponseClass() {
		return CreateViewResponse.class;
	}

}
