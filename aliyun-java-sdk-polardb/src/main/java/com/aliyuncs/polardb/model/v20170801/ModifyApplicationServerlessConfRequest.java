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
public class ModifyApplicationServerlessConfRequest extends RpcAcsRequest<ModifyApplicationServerlessConfResponse> {
	   

	private List<ServerlessConfList> serverlessConfLists;

	private String applicationId;
	public ModifyApplicationServerlessConfRequest() {
		super("polardb", "2017-08-01", "ModifyApplicationServerlessConf", "polardb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<ServerlessConfList> getServerlessConfLists() {
		return this.serverlessConfLists;
	}

	public void setServerlessConfLists(List<ServerlessConfList> serverlessConfLists) {
		this.serverlessConfLists = serverlessConfLists;	
		if (serverlessConfLists != null) {
			for (int depth1 = 0; depth1 < serverlessConfLists.size(); depth1++) {
				putQueryParameter("ServerlessConfList." + (depth1 + 1) + ".ComponentType" , serverlessConfLists.get(depth1).getComponentType());
				putQueryParameter("ServerlessConfList." + (depth1 + 1) + ".ScaleMax" , serverlessConfLists.get(depth1).getScaleMax());
				putQueryParameter("ServerlessConfList." + (depth1 + 1) + ".ScaleMin" , serverlessConfLists.get(depth1).getScaleMin());
			}
		}	
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
		if(applicationId != null){
			putQueryParameter("ApplicationId", applicationId);
		}
	}

	public static class ServerlessConfList {

		private String componentType;

		private String scaleMax;

		private String scaleMin;

		public String getComponentType() {
			return this.componentType;
		}

		public void setComponentType(String componentType) {
			this.componentType = componentType;
		}

		public String getScaleMax() {
			return this.scaleMax;
		}

		public void setScaleMax(String scaleMax) {
			this.scaleMax = scaleMax;
		}

		public String getScaleMin() {
			return this.scaleMin;
		}

		public void setScaleMin(String scaleMin) {
			this.scaleMin = scaleMin;
		}
	}

	@Override
	public Class<ModifyApplicationServerlessConfResponse> getResponseClass() {
		return ModifyApplicationServerlessConfResponse.class;
	}

}
