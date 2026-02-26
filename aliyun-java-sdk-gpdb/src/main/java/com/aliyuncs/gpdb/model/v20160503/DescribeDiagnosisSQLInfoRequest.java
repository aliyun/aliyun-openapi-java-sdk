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
public class DescribeDiagnosisSQLInfoRequest extends RpcAcsRequest<DescribeDiagnosisSQLInfoResponse> {
	   

	private String database;

	private String dBInstanceId;

	private String queryID;
	public DescribeDiagnosisSQLInfoRequest() {
		super("gpdb", "2016-05-03", "DescribeDiagnosisSQLInfo", "gpdb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDatabase() {
		return this.database;
	}

	public void setDatabase(String database) {
		this.database = database;
		if(database != null){
			putQueryParameter("Database", database);
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

	public String getQueryID() {
		return this.queryID;
	}

	public void setQueryID(String queryID) {
		this.queryID = queryID;
		if(queryID != null){
			putQueryParameter("QueryID", queryID);
		}
	}

	@Override
	public Class<DescribeDiagnosisSQLInfoResponse> getResponseClass() {
		return DescribeDiagnosisSQLInfoResponse.class;
	}

}
