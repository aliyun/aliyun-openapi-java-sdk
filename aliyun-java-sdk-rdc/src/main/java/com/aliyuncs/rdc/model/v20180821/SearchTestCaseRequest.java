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

package com.aliyuncs.rdc.model.v20180821;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SearchTestCaseRequest extends RpcAcsRequest<SearchTestCaseResponse> {
	
	public SearchTestCaseRequest() {
		super("Rdc", "2018-08-21", "SearchTestCase");
		setMethod(MethodType.POST);
	}

	private String updateDateEnd;

	private String corpIdentifier;

	private String createDateEnd;

	private String createDateStart;

	private String updateDateStart;

	private Integer pageSize;

	private String akProjectId;

	private String caseTag;

	private String pageNum;

	public String getUpdateDateEnd() {
		return this.updateDateEnd;
	}

	public void setUpdateDateEnd(String updateDateEnd) {
		this.updateDateEnd = updateDateEnd;
		if(updateDateEnd != null){
			putBodyParameter("UpdateDateEnd", updateDateEnd);
		}
	}

	public String getCorpIdentifier() {
		return this.corpIdentifier;
	}

	public void setCorpIdentifier(String corpIdentifier) {
		this.corpIdentifier = corpIdentifier;
		if(corpIdentifier != null){
			putQueryParameter("CorpIdentifier", corpIdentifier);
		}
	}

	public String getCreateDateEnd() {
		return this.createDateEnd;
	}

	public void setCreateDateEnd(String createDateEnd) {
		this.createDateEnd = createDateEnd;
		if(createDateEnd != null){
			putBodyParameter("CreateDateEnd", createDateEnd);
		}
	}

	public String getCreateDateStart() {
		return this.createDateStart;
	}

	public void setCreateDateStart(String createDateStart) {
		this.createDateStart = createDateStart;
		if(createDateStart != null){
			putBodyParameter("CreateDateStart", createDateStart);
		}
	}

	public String getUpdateDateStart() {
		return this.updateDateStart;
	}

	public void setUpdateDateStart(String updateDateStart) {
		this.updateDateStart = updateDateStart;
		if(updateDateStart != null){
			putBodyParameter("UpdateDateStart", updateDateStart);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getAkProjectId() {
		return this.akProjectId;
	}

	public void setAkProjectId(String akProjectId) {
		this.akProjectId = akProjectId;
		if(akProjectId != null){
			putBodyParameter("AkProjectId", akProjectId);
		}
	}

	public String getCaseTag() {
		return this.caseTag;
	}

	public void setCaseTag(String caseTag) {
		this.caseTag = caseTag;
		if(caseTag != null){
			putBodyParameter("CaseTag", caseTag);
		}
	}

	public String getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putBodyParameter("PageNum", pageNum);
		}
	}

	@Override
	public Class<SearchTestCaseResponse> getResponseClass() {
		return SearchTestCaseResponse.class;
	}

}
