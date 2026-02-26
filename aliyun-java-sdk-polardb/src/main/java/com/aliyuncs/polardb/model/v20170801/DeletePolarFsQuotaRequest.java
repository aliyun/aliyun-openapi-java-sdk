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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeletePolarFsQuotaRequest extends RpcAcsRequest<DeletePolarFsQuotaResponse> {
	   

	private List<Quotas> quotass;

	private String dBClusterId;

	private String polarFsInstanceId;
	public DeletePolarFsQuotaRequest() {
		super("polardb", "2017-08-01", "DeletePolarFsQuota", "polardb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Quotas> getQuotass() {
		return this.quotass;
	}

	public void setQuotass(List<Quotas> quotass) {
		this.quotass = quotass;	
		if (quotass != null) {
			for (int depth1 = 0; depth1 < quotass.size(); depth1++) {
				putQueryParameter("Quotas." + (depth1 + 1) + ".Name" , quotass.get(depth1).getName());
				putQueryParameter("Quotas." + (depth1 + 1) + ".Id" , quotass.get(depth1).getId());
			}
		}	
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
		}
	}

	public String getPolarFsInstanceId() {
		return this.polarFsInstanceId;
	}

	public void setPolarFsInstanceId(String polarFsInstanceId) {
		this.polarFsInstanceId = polarFsInstanceId;
		if(polarFsInstanceId != null){
			putQueryParameter("PolarFsInstanceId", polarFsInstanceId);
		}
	}

	public static class Quotas {

		private String name;

		private String id;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	@Override
	public Class<DeletePolarFsQuotaResponse> getResponseClass() {
		return DeletePolarFsQuotaResponse.class;
	}

}
