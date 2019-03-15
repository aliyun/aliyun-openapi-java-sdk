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
public class FindImagesByTagNamesRequest extends RpcAcsRequest<FindImagesByTagNamesResponse> {
	
	public FindImagesByTagNamesRequest() {
		super("imm", "2017-09-06", "FindImagesByTagNames", "imm");
	}

	private String marker;

	private Integer limit;

	private String project;

	private String setId;

	private String tagNames;

	public String getMarker() {
		return this.marker;
	}

	public void setMarker(String marker) {
		this.marker = marker;
		if(marker != null){
			putQueryParameter("Marker", marker);
		}
	}

	public Integer getLimit() {
		return this.limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit.toString());
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

	public String getSetId() {
		return this.setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
		if(setId != null){
			putQueryParameter("SetId", setId);
		}
	}

	public String getTagNames() {
		return this.tagNames;
	}

	public void setTagNames(String tagNames) {
		this.tagNames = tagNames;
		if(tagNames != null){
			putQueryParameter("TagNames", tagNames);
		}
	}

	@Override
	public Class<FindImagesByTagNamesResponse> getResponseClass() {
		return FindImagesByTagNamesResponse.class;
	}

}
