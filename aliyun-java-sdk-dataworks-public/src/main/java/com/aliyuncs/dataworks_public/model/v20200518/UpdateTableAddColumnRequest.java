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
public class UpdateTableAddColumnRequest extends RpcAcsRequest<UpdateTableAddColumnResponse> {
	   

	private String tableGuid;

	private List<Column> columns;
	public UpdateTableAddColumnRequest() {
		super("dataworks-public", "2020-05-18", "UpdateTableAddColumn");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTableGuid() {
		return this.tableGuid;
	}

	public void setTableGuid(String tableGuid) {
		this.tableGuid = tableGuid;
		if(tableGuid != null){
			putQueryParameter("TableGuid", tableGuid);
		}
	}

	public List<Column> getColumns() {
		return this.columns;
	}

	public void setColumns(List<Column> columns) {
		this.columns = columns;	
		if (columns != null) {
			for (int depth1 = 0; depth1 < columns.size(); depth1++) {
				putBodyParameter("Column." + (depth1 + 1) + ".ColumnNameCn" , columns.get(depth1).getColumnNameCn());
				putBodyParameter("Column." + (depth1 + 1) + ".Comment" , columns.get(depth1).getComment());
				putBodyParameter("Column." + (depth1 + 1) + ".ColumnName" , columns.get(depth1).getColumnName());
				putBodyParameter("Column." + (depth1 + 1) + ".ColumnType" , columns.get(depth1).getColumnType());
			}
		}	
	}

	public static class Column {

		private String columnNameCn;

		private String comment;

		private String columnName;

		private String columnType;

		public String getColumnNameCn() {
			return this.columnNameCn;
		}

		public void setColumnNameCn(String columnNameCn) {
			this.columnNameCn = columnNameCn;
		}

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

		public String getColumnType() {
			return this.columnType;
		}

		public void setColumnType(String columnType) {
			this.columnType = columnType;
		}
	}

	@Override
	public Class<UpdateTableAddColumnResponse> getResponseClass() {
		return UpdateTableAddColumnResponse.class;
	}

}
