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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLogicDatabaseRequest extends RpcAcsRequest<CreateLogicDatabaseResponse> {
	   

	private Long tid;

	private String alias;

	@SerializedName("databaseIds")
	private List<Long> databaseIds;
	public CreateLogicDatabaseRequest() {
		super("dms-enterprise", "2018-11-01", "CreateLogicDatabase", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
		if(alias != null){
			putQueryParameter("Alias", alias);
		}
	}

	public List<Long> getDatabaseIds() {
		return this.databaseIds;
	}

	public void setDatabaseIds(List<Long> databaseIds) {
		this.databaseIds = databaseIds;	
		if (databaseIds != null) {
			putQueryParameter("DatabaseIds" , new Gson().toJson(databaseIds));
		}	
	}

	@Override
	public Class<CreateLogicDatabaseResponse> getResponseClass() {
		return CreateLogicDatabaseResponse.class;
	}

}
