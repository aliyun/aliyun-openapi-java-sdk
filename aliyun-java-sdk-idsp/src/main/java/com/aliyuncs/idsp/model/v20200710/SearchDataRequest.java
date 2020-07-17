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

package com.aliyuncs.idsp.model.v20200710;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SearchDataRequest extends RpcAcsRequest<SearchDataResponse> {
	   

	private Long endTime;

	private Long currentPage;

	private Long startTime;

	private String posKeywords;

	private String excludeKeywords;

	private Long subjectId;

	private String mediaTypeFilter;

	private Long pageSize;

	private String assKeywords;
	public SearchDataRequest() {
		super("idsp", "2020-07-10", "SearchData");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime.toString());
		}
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putBodyParameter("CurrentPage", currentPage.toString());
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime.toString());
		}
	}

	public String getPosKeywords() {
		return this.posKeywords;
	}

	public void setPosKeywords(String posKeywords) {
		this.posKeywords = posKeywords;
		if(posKeywords != null){
			putBodyParameter("PosKeywords", posKeywords);
		}
	}

	public String getExcludeKeywords() {
		return this.excludeKeywords;
	}

	public void setExcludeKeywords(String excludeKeywords) {
		this.excludeKeywords = excludeKeywords;
		if(excludeKeywords != null){
			putBodyParameter("ExcludeKeywords", excludeKeywords);
		}
	}

	public Long getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
		if(subjectId != null){
			putBodyParameter("SubjectId", subjectId.toString());
		}
	}

	public String getMediaTypeFilter() {
		return this.mediaTypeFilter;
	}

	public void setMediaTypeFilter(String mediaTypeFilter) {
		this.mediaTypeFilter = mediaTypeFilter;
		if(mediaTypeFilter != null){
			putBodyParameter("MediaTypeFilter", mediaTypeFilter);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getAssKeywords() {
		return this.assKeywords;
	}

	public void setAssKeywords(String assKeywords) {
		this.assKeywords = assKeywords;
		if(assKeywords != null){
			putBodyParameter("AssKeywords", assKeywords);
		}
	}

	@Override
	public Class<SearchDataResponse> getResponseClass() {
		return SearchDataResponse.class;
	}

}
