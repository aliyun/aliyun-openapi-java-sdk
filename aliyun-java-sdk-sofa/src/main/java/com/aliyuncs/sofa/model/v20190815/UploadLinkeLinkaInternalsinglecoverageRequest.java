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
public class UploadLinkeLinkaInternalsinglecoverageRequest extends RpcAcsRequest<UploadLinkeLinkaInternalsinglecoverageResponse> {
	   

	private String commitId;

	private String source;

	private Boolean aciMode;

	private String branch;

	private String aciTenant;

	private String customToken;

	private String gitUrl;

	private String group;

	private String sourceKind;

	private String startCommitId;

	private String encoding;

	private String classesFileId;

	private String customUser;

	private String coverageFileId;

	private String callbackUrl;

	private List<String> excludesRepeatLists;
	public UploadLinkeLinkaInternalsinglecoverageRequest() {
		super("SOFA", "2019-08-15", "UploadLinkeLinkaInternalsinglecoverage", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCommitId() {
		return this.commitId;
	}

	public void setCommitId(String commitId) {
		this.commitId = commitId;
		if(commitId != null){
			putBodyParameter("CommitId", commitId);
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putBodyParameter("Source", source);
		}
	}

	public Boolean getAciMode() {
		return this.aciMode;
	}

	public void setAciMode(Boolean aciMode) {
		this.aciMode = aciMode;
		if(aciMode != null){
			putBodyParameter("AciMode", aciMode.toString());
		}
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
		if(branch != null){
			putBodyParameter("Branch", branch);
		}
	}

	public String getAciTenant() {
		return this.aciTenant;
	}

	public void setAciTenant(String aciTenant) {
		this.aciTenant = aciTenant;
		if(aciTenant != null){
			putBodyParameter("AciTenant", aciTenant);
		}
	}

	public String getCustomToken() {
		return this.customToken;
	}

	public void setCustomToken(String customToken) {
		this.customToken = customToken;
		if(customToken != null){
			putBodyParameter("CustomToken", customToken);
		}
	}

	public String getGitUrl() {
		return this.gitUrl;
	}

	public void setGitUrl(String gitUrl) {
		this.gitUrl = gitUrl;
		if(gitUrl != null){
			putBodyParameter("GitUrl", gitUrl);
		}
	}

	public String getGroup() {
		return this.group;
	}

	public void setGroup(String group) {
		this.group = group;
		if(group != null){
			putBodyParameter("Group", group);
		}
	}

	public String getSourceKind() {
		return this.sourceKind;
	}

	public void setSourceKind(String sourceKind) {
		this.sourceKind = sourceKind;
		if(sourceKind != null){
			putBodyParameter("SourceKind", sourceKind);
		}
	}

	public String getStartCommitId() {
		return this.startCommitId;
	}

	public void setStartCommitId(String startCommitId) {
		this.startCommitId = startCommitId;
		if(startCommitId != null){
			putBodyParameter("StartCommitId", startCommitId);
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

	public String getClassesFileId() {
		return this.classesFileId;
	}

	public void setClassesFileId(String classesFileId) {
		this.classesFileId = classesFileId;
		if(classesFileId != null){
			putBodyParameter("ClassesFileId", classesFileId);
		}
	}

	public String getCustomUser() {
		return this.customUser;
	}

	public void setCustomUser(String customUser) {
		this.customUser = customUser;
		if(customUser != null){
			putBodyParameter("CustomUser", customUser);
		}
	}

	public String getCoverageFileId() {
		return this.coverageFileId;
	}

	public void setCoverageFileId(String coverageFileId) {
		this.coverageFileId = coverageFileId;
		if(coverageFileId != null){
			putBodyParameter("CoverageFileId", coverageFileId);
		}
	}

	public String getCallbackUrl() {
		return this.callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
		if(callbackUrl != null){
			putBodyParameter("CallbackUrl", callbackUrl);
		}
	}

	public List<String> getExcludesRepeatLists() {
		return this.excludesRepeatLists;
	}

	public void setExcludesRepeatLists(List<String> excludesRepeatLists) {
		this.excludesRepeatLists = excludesRepeatLists;	
		if (excludesRepeatLists != null) {
			for (int i = 0; i < excludesRepeatLists.size(); i++) {
				putBodyParameter("ExcludesRepeatList." + (i + 1) , excludesRepeatLists.get(i));
			}
		}	
	}

	@Override
	public Class<UploadLinkeLinkaInternalsinglecoverageResponse> getResponseClass() {
		return UploadLinkeLinkaInternalsinglecoverageResponse.class;
	}

}
