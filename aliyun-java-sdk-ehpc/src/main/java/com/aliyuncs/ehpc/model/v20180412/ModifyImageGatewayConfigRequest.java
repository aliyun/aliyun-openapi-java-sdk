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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ehpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyImageGatewayConfigRequest extends RpcAcsRequest<ModifyImageGatewayConfigResponse> {
	   

	private List<Repo> repos;

	private String dBServerInfo;

	private String clusterId;

	private String defaultRepoLocation;

	private String dBPassword;

	private String dBType;

	private String dBUsername;

	private Integer pullUpdateTimeout;

	private String imageExpirationTimeout;
	public ModifyImageGatewayConfigRequest() {
		super("EHPC", "2018-04-12", "ModifyImageGatewayConfig", "ehs");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Repo> getRepos() {
		return this.repos;
	}

	public void setRepos(List<Repo> repos) {
		this.repos = repos;	
		if (repos != null) {
			for (int depth1 = 0; depth1 < repos.size(); depth1++) {
				putQueryParameter("Repo." + (depth1 + 1) + ".Auth" , repos.get(depth1).getAuth());
				putQueryParameter("Repo." + (depth1 + 1) + ".Location" , repos.get(depth1).getLocation());
				putQueryParameter("Repo." + (depth1 + 1) + ".URL" , repos.get(depth1).getURL());
			}
		}	
	}

	public String getDBServerInfo() {
		return this.dBServerInfo;
	}

	public void setDBServerInfo(String dBServerInfo) {
		this.dBServerInfo = dBServerInfo;
		if(dBServerInfo != null){
			putQueryParameter("DBServerInfo", dBServerInfo);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getDefaultRepoLocation() {
		return this.defaultRepoLocation;
	}

	public void setDefaultRepoLocation(String defaultRepoLocation) {
		this.defaultRepoLocation = defaultRepoLocation;
		if(defaultRepoLocation != null){
			putQueryParameter("DefaultRepoLocation", defaultRepoLocation);
		}
	}

	public String getDBPassword() {
		return this.dBPassword;
	}

	public void setDBPassword(String dBPassword) {
		this.dBPassword = dBPassword;
		if(dBPassword != null){
			putQueryParameter("DBPassword", dBPassword);
		}
	}

	public String getDBType() {
		return this.dBType;
	}

	public void setDBType(String dBType) {
		this.dBType = dBType;
		if(dBType != null){
			putQueryParameter("DBType", dBType);
		}
	}

	public String getDBUsername() {
		return this.dBUsername;
	}

	public void setDBUsername(String dBUsername) {
		this.dBUsername = dBUsername;
		if(dBUsername != null){
			putQueryParameter("DBUsername", dBUsername);
		}
	}

	public Integer getPullUpdateTimeout() {
		return this.pullUpdateTimeout;
	}

	public void setPullUpdateTimeout(Integer pullUpdateTimeout) {
		this.pullUpdateTimeout = pullUpdateTimeout;
		if(pullUpdateTimeout != null){
			putQueryParameter("PullUpdateTimeout", pullUpdateTimeout.toString());
		}
	}

	public String getImageExpirationTimeout() {
		return this.imageExpirationTimeout;
	}

	public void setImageExpirationTimeout(String imageExpirationTimeout) {
		this.imageExpirationTimeout = imageExpirationTimeout;
		if(imageExpirationTimeout != null){
			putQueryParameter("ImageExpirationTimeout", imageExpirationTimeout);
		}
	}

	public static class Repo {

		private String auth;

		private String location;

		private String uRL;

		public String getAuth() {
			return this.auth;
		}

		public void setAuth(String auth) {
			this.auth = auth;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getURL() {
			return this.uRL;
		}

		public void setURL(String uRL) {
			this.uRL = uRL;
		}
	}

	@Override
	public Class<ModifyImageGatewayConfigResponse> getResponseClass() {
		return ModifyImageGatewayConfigResponse.class;
	}

}
