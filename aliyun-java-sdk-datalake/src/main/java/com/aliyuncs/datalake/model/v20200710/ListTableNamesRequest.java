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

package com.aliyuncs.datalake.model.v20200710;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.datalake.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTableNamesRequest extends RoaAcsRequest<ListTableNamesResponse> {
	   

	private String tableType;

	private String catalogId;

	private String nextPageToken;

	private String databaseName;

	private Integer pageSize;

	private String tableNamePattern;
	public ListTableNamesRequest() {
		super("DataLake", "2020-07-10", "ListTableNames");
		setUriPattern("/api/metastore/catalogs/databases/tables/names");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTableType() {
		return this.tableType;
	}

	public void setTableType(String tableType) {
		this.tableType = tableType;
		if(tableType != null){
			putQueryParameter("TableType", tableType);
		}
	}

	public String getCatalogId() {
		return this.catalogId;
	}

	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
		if(catalogId != null){
			putQueryParameter("CatalogId", catalogId);
		}
	}

	public String getNextPageToken() {
		return this.nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
		if(nextPageToken != null){
			putQueryParameter("NextPageToken", nextPageToken);
		}
	}

	public String getDatabaseName() {
		return this.databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
		if(databaseName != null){
			putQueryParameter("DatabaseName", databaseName);
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

	public String getTableNamePattern() {
		return this.tableNamePattern;
	}

	public void setTableNamePattern(String tableNamePattern) {
		this.tableNamePattern = tableNamePattern;
		if(tableNamePattern != null){
			putQueryParameter("TableNamePattern", tableNamePattern);
		}
	}

	@Override
	public Class<ListTableNamesResponse> getResponseClass() {
		return ListTableNamesResponse.class;
	}

}
