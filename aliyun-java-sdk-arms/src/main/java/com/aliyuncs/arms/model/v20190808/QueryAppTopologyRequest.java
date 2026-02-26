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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryAppTopologyRequest extends RpcAcsRequest<QueryAppTopologyResponse> {
	   

	private String rpc;

	private String appType;

	private Long endTime;

	private String pid;

	private Long startTime;

	@SerializedName("filters")
	private Map<String,String> filters;

	private String type;

	private String dbName;

	private String db;
	public QueryAppTopologyRequest() {
		super("ARMS", "2019-08-08", "QueryAppTopology", "arms");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRpc() {
		return this.rpc;
	}

	public void setRpc(String rpc) {
		this.rpc = rpc;
		if(rpc != null){
			putQueryParameter("Rpc", rpc);
		}
	}

	public String getAppType() {
		return this.appType;
	}

	public void setAppType(String appType) {
		this.appType = appType;
		if(appType != null){
			putQueryParameter("AppType", appType);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public String getPid() {
		return this.pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
		if(pid != null){
			putQueryParameter("Pid", pid);
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public Map<String,String> getFilters() {
		return this.filters;
	}

	public void setFilters(Map<String,String> filters) {
		this.filters = filters;	
		if (filters != null) {
			putQueryParameter("Filters" , new Gson().toJson(filters));
		}	
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
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

	public String getDb() {
		return this.db;
	}

	public void setDb(String db) {
		this.db = db;
		if(db != null){
			putQueryParameter("Db", db);
		}
	}

	@Override
	public Class<QueryAppTopologyResponse> getResponseClass() {
		return QueryAppTopologyResponse.class;
	}

}
