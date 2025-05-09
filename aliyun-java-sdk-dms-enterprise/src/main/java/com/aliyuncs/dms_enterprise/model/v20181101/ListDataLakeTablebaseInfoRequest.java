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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListDataLakeTablebaseInfoRequest extends RpcAcsRequest<ListDataLakeTablebaseInfoResponse> {
	   

	private String searchKey;

	private Long tid;

	private String catalogName;

	private Integer rows;

	private String dbName;

	private String dataRegion;

	private Integer page;
	public ListDataLakeTablebaseInfoRequest() {
		super("dms-enterprise", "2018-11-01", "ListDataLakeTablebaseInfo", "dms-enterprise");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSearchKey() {
		return this.searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
		if(searchKey != null){
			putQueryParameter("SearchKey", searchKey);
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

	public String getCatalogName() {
		return this.catalogName;
	}

	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
		if(catalogName != null){
			putQueryParameter("CatalogName", catalogName);
		}
	}

	public Integer getRows() {
		return this.rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
		if(rows != null){
			putQueryParameter("Rows", rows.toString());
		}
	}

	public String getDbName() {
		return this.dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
		if(dbName != null){
			putQueryParameter("DbName", dbName);
		}
	}

	public String getDataRegion() {
		return this.dataRegion;
	}

	public void setDataRegion(String dataRegion) {
		this.dataRegion = dataRegion;
		if(dataRegion != null){
			putQueryParameter("DataRegion", dataRegion);
		}
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
		if(page != null){
			putQueryParameter("Page", page.toString());
		}
	}

	@Override
	public Class<ListDataLakeTablebaseInfoResponse> getResponseClass() {
		return ListDataLakeTablebaseInfoResponse.class;
	}

}
