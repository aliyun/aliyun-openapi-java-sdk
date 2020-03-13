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
public class CreateAKSBuildConfigRequest extends RpcAcsRequest<CreateAKSBuildConfigResponse> {
	   

	private String compileDir;

	private String workspace;

	private String compileDockerfile;

	private String scmUrl;

	private String gitlabAccessToken;

	private String externalDockerCredential;

	private String externalImageName;

	private List<DockerCredential> dockerCredentials;

	private String gitlabAccessId;

	private String appBuildName;

	private String appId;

	private String namespace;

	private String region;
	public CreateAKSBuildConfigRequest() {
		super("SOFA", "2019-08-15", "CreateAKSBuildConfig", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCompileDir() {
		return this.compileDir;
	}

	public void setCompileDir(String compileDir) {
		this.compileDir = compileDir;
		if(compileDir != null){
			putBodyParameter("CompileDir", compileDir);
		}
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

	public String getCompileDockerfile() {
		return this.compileDockerfile;
	}

	public void setCompileDockerfile(String compileDockerfile) {
		this.compileDockerfile = compileDockerfile;
		if(compileDockerfile != null){
			putBodyParameter("CompileDockerfile", compileDockerfile);
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

	public String getGitlabAccessToken() {
		return this.gitlabAccessToken;
	}

	public void setGitlabAccessToken(String gitlabAccessToken) {
		this.gitlabAccessToken = gitlabAccessToken;
		if(gitlabAccessToken != null){
			putBodyParameter("GitlabAccessToken", gitlabAccessToken);
		}
	}

	public String getExternalDockerCredential() {
		return this.externalDockerCredential;
	}

	public void setExternalDockerCredential(String externalDockerCredential) {
		this.externalDockerCredential = externalDockerCredential;
		if(externalDockerCredential != null){
			putBodyParameter("ExternalDockerCredential", externalDockerCredential);
		}
	}

	public String getExternalImageName() {
		return this.externalImageName;
	}

	public void setExternalImageName(String externalImageName) {
		this.externalImageName = externalImageName;
		if(externalImageName != null){
			putBodyParameter("ExternalImageName", externalImageName);
		}
	}

	public List<DockerCredential> getDockerCredentials() {
		return this.dockerCredentials;
	}

	public void setDockerCredentials(List<DockerCredential> dockerCredentials) {
		this.dockerCredentials = dockerCredentials;	
		if (dockerCredentials != null) {
			for (int depth1 = 0; depth1 < dockerCredentials.size(); depth1++) {
				putBodyParameter("DockerCredential." + (depth1 + 1) + ".Password" , dockerCredentials.get(depth1).getPassword());
				putBodyParameter("DockerCredential." + (depth1 + 1) + ".Domain" , dockerCredentials.get(depth1).getDomain());
				putBodyParameter("DockerCredential." + (depth1 + 1) + ".User" , dockerCredentials.get(depth1).getUser());
			}
		}	
	}

	public String getGitlabAccessId() {
		return this.gitlabAccessId;
	}

	public void setGitlabAccessId(String gitlabAccessId) {
		this.gitlabAccessId = gitlabAccessId;
		if(gitlabAccessId != null){
			putBodyParameter("GitlabAccessId", gitlabAccessId);
		}
	}

	public String getAppBuildName() {
		return this.appBuildName;
	}

	public void setAppBuildName(String appBuildName) {
		this.appBuildName = appBuildName;
		if(appBuildName != null){
			putBodyParameter("AppBuildName", appBuildName);
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

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putBodyParameter("Namespace", namespace);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putBodyParameter("Region", region);
		}
	}

	public static class DockerCredential {

		private String password;

		private String domain;

		private String user;

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}
	}

	@Override
	public Class<CreateAKSBuildConfigResponse> getResponseClass() {
		return CreateAKSBuildConfigResponse.class;
	}

}
