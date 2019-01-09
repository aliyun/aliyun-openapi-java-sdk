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

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SearchFaceRequest extends RpcAcsRequest<SearchFaceResponse> {
	
	public SearchFaceRequest() {
		super("imm", "2017-09-06", "SearchFace", "2017-09-06");
	}

	private Integer resultNum;

	private String project;

	private String searchThresholdLevel;

	private String srcUri;

	private Boolean isThreshold;

	private String groupName;

	public Integer getResultNum() {
		return this.resultNum;
	}

	public void setResultNum(Integer resultNum) {
		this.resultNum = resultNum;
		if(resultNum != null){
			putQueryParameter("ResultNum", resultNum.toString());
		}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public String getSearchThresholdLevel() {
		return this.searchThresholdLevel;
	}

	public void setSearchThresholdLevel(String searchThresholdLevel) {
		this.searchThresholdLevel = searchThresholdLevel;
		if(searchThresholdLevel != null){
			putQueryParameter("SearchThresholdLevel", searchThresholdLevel);
		}
	}

	public String getSrcUri() {
		return this.srcUri;
	}

	public void setSrcUri(String srcUri) {
		this.srcUri = srcUri;
		if(srcUri != null){
			putQueryParameter("SrcUri", srcUri);
		}
	}

	public Boolean getIsThreshold() {
		return this.isThreshold;
	}

	public void setIsThreshold(Boolean isThreshold) {
		this.isThreshold = isThreshold;
		if(isThreshold != null){
			putQueryParameter("IsThreshold", isThreshold.toString());
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	@Override
	public Class<SearchFaceResponse> getResponseClass() {
		return SearchFaceResponse.class;
	}

}
