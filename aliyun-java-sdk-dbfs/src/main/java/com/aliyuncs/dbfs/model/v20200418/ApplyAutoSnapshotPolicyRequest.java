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

package com.aliyuncs.dbfs.model.v20200418;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dbfs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ApplyAutoSnapshotPolicyRequest extends RpcAcsRequest<ApplyAutoSnapshotPolicyResponse> {
	   

	@SerializedName("dbfsIds")
	private List<String> dbfsIds;

	private String policyId;
	public ApplyAutoSnapshotPolicyRequest() {
		super("DBFS", "2020-04-18", "ApplyAutoSnapshotPolicy", "dbfs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getDbfsIds() {
		return this.dbfsIds;
	}

	public void setDbfsIds(List<String> dbfsIds) {
		this.dbfsIds = dbfsIds;	
		if (dbfsIds != null) {
			putQueryParameter("DbfsIds" , new Gson().toJson(dbfsIds));
		}	
	}

	public String getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
		if(policyId != null){
			putQueryParameter("PolicyId", policyId);
		}
	}

	@Override
	public Class<ApplyAutoSnapshotPolicyResponse> getResponseClass() {
		return ApplyAutoSnapshotPolicyResponse.class;
	}

}
