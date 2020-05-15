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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ExecAKSBuildRequest extends RpcAcsRequest<ExecAKSBuildResponse> {
	   

	private String workspace;

	private List<BuildArgs> buildArgss;

	private String scmUrl;

	private Boolean dockerSecurityBenchmark;

	private String appId;

	private String scmBranch;
	public ExecAKSBuildRequest() {
		super("SOFA", "2019-08-15", "ExecAKSBuild", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWorkspace() {
		return this.workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
		if(workspace != null){
			putBodyParameter("Workspace", workspace);
		}
	}

	public List<BuildArgs> getBuildArgss() {
		return this.buildArgss;
	}

	public void setBuildArgss(List<BuildArgs> buildArgss) {
		this.buildArgss = buildArgss;	
		if (buildArgss != null) {
			for (int depth1 = 0; depth1 < buildArgss.size(); depth1++) {
				putBodyParameter("BuildArgs." + (depth1 + 1) + ".Value" , buildArgss.get(depth1).getValue());
				putBodyParameter("BuildArgs." + (depth1 + 1) + ".Key" , buildArgss.get(depth1).getKey());
			}
		}	
	}

	public String getScmUrl() {
		return this.scmUrl;
	}

	public void setScmUrl(String scmUrl) {
		this.scmUrl = scmUrl;
		if(scmUrl != null){
			putBodyParameter("ScmUrl", scmUrl);
		}
	}

	public Boolean getDockerSecurityBenchmark() {
		return this.dockerSecurityBenchmark;
	}

	public void setDockerSecurityBenchmark(Boolean dockerSecurityBenchmark) {
		this.dockerSecurityBenchmark = dockerSecurityBenchmark;
		if(dockerSecurityBenchmark != null){
			putBodyParameter("DockerSecurityBenchmark", dockerSecurityBenchmark.toString());
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	public String getScmBranch() {
		return this.scmBranch;
	}

	public void setScmBranch(String scmBranch) {
		this.scmBranch = scmBranch;
		if(scmBranch != null){
			putBodyParameter("ScmBranch", scmBranch);
		}
	}

	public static class BuildArgs {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<ExecAKSBuildResponse> getResponseClass() {
		return ExecAKSBuildResponse.class;
	}

}
