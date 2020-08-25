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
public class UploadLinkeLinkaTaskcoverageRequest extends RpcAcsRequest<UploadLinkeLinkaTaskcoverageResponse> {
	   

	private String excludes;

	private String commitId;

	private String source;

	private String branch;

	private String gitUrl;

	private String group;

	private String startCommitId;

	private String encoding;

	private String classesFile;

	private String callbackUrl;

	private List<String> coverageFileRepeatLists;
	public UploadLinkeLinkaTaskcoverageRequest() {
		super("SOFA", "2019-08-15", "UploadLinkeLinkaTaskcoverage", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExcludes() {
		return this.excludes;
	}

	public void setExcludes(String excludes) {
		this.excludes = excludes;
		if(excludes != null){
			putBodyParameter("Excludes", excludes);
		}
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

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
		if(branch != null){
			putBodyParameter("Branch", branch);
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

	public String getClassesFile() {
		return this.classesFile;
	}

	public void setClassesFile(String classesFile) {
		this.classesFile = classesFile;
		if(classesFile != null){
			putBodyParameter("ClassesFile", classesFile);
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

	public List<String> getCoverageFileRepeatLists() {
		return this.coverageFileRepeatLists;
	}

	public void setCoverageFileRepeatLists(List<String> coverageFileRepeatLists) {
		this.coverageFileRepeatLists = coverageFileRepeatLists;	
		if (coverageFileRepeatLists != null) {
			for (int i = 0; i < coverageFileRepeatLists.size(); i++) {
				putBodyParameter("CoverageFileRepeatList." + (i + 1) , coverageFileRepeatLists.get(i));
			}
		}	
	}

	@Override
	public Class<UploadLinkeLinkaTaskcoverageResponse> getResponseClass() {
		return UploadLinkeLinkaTaskcoverageResponse.class;
	}

}
