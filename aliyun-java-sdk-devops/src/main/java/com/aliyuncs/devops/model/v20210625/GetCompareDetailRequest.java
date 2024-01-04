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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetCompareDetailRequest extends RoaAcsRequest<GetCompareDetailResponse> {
	   

	private Integer maxDiffFile;

	private Boolean mergeBase;

	private String organizationId;

	private Integer maxDiffByte;

	private Long repositoryId;

	private String from;

	private String to;
	public GetCompareDetailRequest() {
		super("devops", "2021-06-25", "GetCompareDetail");
		setUriPattern("/repository/[repositoryId]/commits/compare/detail");
		setMethod(MethodType.GET);
	}

	public Integer getMaxDiffFile() {
		return this.maxDiffFile;
	}

	public void setMaxDiffFile(Integer maxDiffFile) {
		this.maxDiffFile = maxDiffFile;
		if(maxDiffFile != null){
			putQueryParameter("maxDiffFile", maxDiffFile.toString());
		}
	}

	public Boolean getMergeBase() {
		return this.mergeBase;
	}

	public void setMergeBase(Boolean mergeBase) {
		this.mergeBase = mergeBase;
		if(mergeBase != null){
			putQueryParameter("mergeBase", mergeBase.toString());
		}
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putQueryParameter("organizationId", organizationId);
		}
	}

	public Integer getMaxDiffByte() {
		return this.maxDiffByte;
	}

	public void setMaxDiffByte(Integer maxDiffByte) {
		this.maxDiffByte = maxDiffByte;
		if(maxDiffByte != null){
			putQueryParameter("maxDiffByte", maxDiffByte.toString());
		}
	}

	public Long getRepositoryId() {
		return this.repositoryId;
	}

	public void setRepositoryId(Long repositoryId) {
		this.repositoryId = repositoryId;
		if(repositoryId != null){
			putPathParameter("repositoryId", repositoryId.toString());
		}
	}

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
		if(from != null){
			putQueryParameter("from", from);
		}
	}

	public String getTo() {
		return this.to;
	}

	public void setTo(String to) {
		this.to = to;
		if(to != null){
			putQueryParameter("to", to);
		}
	}

	@Override
	public Class<GetCompareDetailResponse> getResponseClass() {
		return GetCompareDetailResponse.class;
	}

}
