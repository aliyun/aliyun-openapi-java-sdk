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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeSQLLogsOnSliceRequest extends RpcAcsRequest<DescribeSQLLogsOnSliceResponse> {
	   

	private String sliceId;

	private Integer pageNumber;

	private String minExecuteCost;

	private Integer pageSize;

	private String dBInstanceId;

	private String maxExecuteCost;

	private String executeState;

	private String queryId;
	public DescribeSQLLogsOnSliceRequest() {
		super("gpdb", "2016-05-03", "DescribeSQLLogsOnSlice", "gpdb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSliceId() {
		return this.sliceId;
	}

	public void setSliceId(String sliceId) {
		this.sliceId = sliceId;
		if(sliceId != null){
			putQueryParameter("SliceId", sliceId);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getMinExecuteCost() {
		return this.minExecuteCost;
	}

	public void setMinExecuteCost(String minExecuteCost) {
		this.minExecuteCost = minExecuteCost;
		if(minExecuteCost != null){
			putQueryParameter("MinExecuteCost", minExecuteCost);
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

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getMaxExecuteCost() {
		return this.maxExecuteCost;
	}

	public void setMaxExecuteCost(String maxExecuteCost) {
		this.maxExecuteCost = maxExecuteCost;
		if(maxExecuteCost != null){
			putQueryParameter("MaxExecuteCost", maxExecuteCost);
		}
	}

	public String getExecuteState() {
		return this.executeState;
	}

	public void setExecuteState(String executeState) {
		this.executeState = executeState;
		if(executeState != null){
			putQueryParameter("ExecuteState", executeState);
		}
	}

	public String getQueryId() {
		return this.queryId;
	}

	public void setQueryId(String queryId) {
		this.queryId = queryId;
		if(queryId != null){
			putQueryParameter("QueryId", queryId);
		}
	}

	@Override
	public Class<DescribeSQLLogsOnSliceResponse> getResponseClass() {
		return DescribeSQLLogsOnSliceResponse.class;
	}

}
