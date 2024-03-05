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
public class SetPostScriptsRequest extends RpcAcsRequest<SetPostScriptsResponse> {
	   

	private List<PostInstallScripts> postInstallScriptss;

	private String clusterId;
	public SetPostScriptsRequest() {
		super("EHPC", "2018-04-12", "SetPostScripts", "ehs");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<PostInstallScripts> getPostInstallScriptss() {
		return this.postInstallScriptss;
	}

	public void setPostInstallScriptss(List<PostInstallScripts> postInstallScriptss) {
		this.postInstallScriptss = postInstallScriptss;	
		if (postInstallScriptss != null) {
			for (int depth1 = 0; depth1 < postInstallScriptss.size(); depth1++) {
				putQueryParameter("PostInstallScripts." + (depth1 + 1) + ".Args" , postInstallScriptss.get(depth1).getArgs());
				putQueryParameter("PostInstallScripts." + (depth1 + 1) + ".Url" , postInstallScriptss.get(depth1).getUrl());
			}
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

	public static class PostInstallScripts {

		private String args;

		private String url;

		public String getArgs() {
			return this.args;
		}

		public void setArgs(String args) {
			this.args = args;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	}

	@Override
	public Class<SetPostScriptsResponse> getResponseClass() {
		return SetPostScriptsResponse.class;
	}

}
