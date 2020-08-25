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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkeantcodeAntcodeCreateanewprojectRequest extends RpcAcsRequest<QueryLinkeantcodeAntcodeCreateanewprojectResponse> {
	   

	private String description;

	private String initProject;

	private String path;

	private String _public;

	private String namespaceId;

	private String visibilityLevel;

	private String perPage;

	private String requestGitOperate;

	private String encoding;

	private String importUrl;

	private String name;

	private String namespace;

	private String page;
	public QueryLinkeantcodeAntcodeCreateanewprojectRequest() {
		super("SOFA", "2019-08-15", "QueryLinkeantcodeAntcodeCreateanewproject", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getInitProject() {
		return this.initProject;
	}

	public void setInitProject(String initProject) {
		this.initProject = initProject;
		if(initProject != null){
			putBodyParameter("InitProject", initProject);
		}
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
		if(path != null){
			putBodyParameter("Path", path);
		}
	}

	public String get_Public() {
		return this._public;
	}

	public void set_Public(String _public) {
		this._public = _public;
		if(_public != null){
			putBodyParameter("Public", _public);
		}
	}

	public String getNamespaceId() {
		return this.namespaceId;
	}

	public void setNamespaceId(String namespaceId) {
		this.namespaceId = namespaceId;
		if(namespaceId != null){
			putBodyParameter("NamespaceId", namespaceId);
		}
	}

	public String getVisibilityLevel() {
		return this.visibilityLevel;
	}

	public void setVisibilityLevel(String visibilityLevel) {
		this.visibilityLevel = visibilityLevel;
		if(visibilityLevel != null){
			putBodyParameter("VisibilityLevel", visibilityLevel);
		}
	}

	public String getPerPage() {
		return this.perPage;
	}

	public void setPerPage(String perPage) {
		this.perPage = perPage;
		if(perPage != null){
			putBodyParameter("PerPage", perPage);
		}
	}

	public String getRequestGitOperate() {
		return this.requestGitOperate;
	}

	public void setRequestGitOperate(String requestGitOperate) {
		this.requestGitOperate = requestGitOperate;
		if(requestGitOperate != null){
			putBodyParameter("RequestGitOperate", requestGitOperate);
		}
	}

	public String getEncoding() {
		return this.encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
		if(encoding != null){
			putBodyParameter("Encoding", encoding);
		}
	}

	public String getImportUrl() {
		return this.importUrl;
	}

	public void setImportUrl(String importUrl) {
		this.importUrl = importUrl;
		if(importUrl != null){
			putBodyParameter("ImportUrl", importUrl);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
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

	public String getPage() {
		return this.page;
	}

	public void setPage(String page) {
		this.page = page;
		if(page != null){
			putBodyParameter("Page", page);
		}
	}

	@Override
	public Class<QueryLinkeantcodeAntcodeCreateanewprojectResponse> getResponseClass() {
		return QueryLinkeantcodeAntcodeCreateanewprojectResponse.class;
	}

}
