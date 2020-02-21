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

package com.aliyuncs.oos.model.v20190601;

import com.aliyuncs.RpcAcsRequest;
import java.util.Map;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListTemplatesRequest extends RpcAcsRequest<ListTemplatesResponse> {
	   

	private String createdDateBefore;

	private String createdBy;

	private String nextToken;

	private String templateName;

	private String sortOrder;

	private String shareType;

	private Boolean hasTrigger;

	private String createdDateAfter;

	private Map<Object,Object> tags;

	private Integer maxResults;

	private String templateFormat;

	private String sortField;

	private String category;
	public ListTemplatesRequest() {
		super("oos", "2019-06-01", "ListTemplates", "oos");
		setMethod(MethodType.POST);
	}

	public String getCreatedDateBefore() {
		return this.createdDateBefore;
	}

	public void setCreatedDateBefore(String createdDateBefore) {
		this.createdDateBefore = createdDateBefore;
		if(createdDateBefore != null){
			putQueryParameter("CreatedDateBefore", createdDateBefore);
		}
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
		if(createdBy != null){
			putQueryParameter("CreatedBy", createdBy);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
		if(templateName != null){
			putQueryParameter("TemplateName", templateName);
		}
	}

	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
		if(sortOrder != null){
			putQueryParameter("SortOrder", sortOrder);
		}
	}

	public String getShareType() {
		return this.shareType;
	}

	public void setShareType(String shareType) {
		this.shareType = shareType;
		if(shareType != null){
			putQueryParameter("ShareType", shareType);
		}
	}

	public Boolean getHasTrigger() {
		return this.hasTrigger;
	}

	public void setHasTrigger(Boolean hasTrigger) {
		this.hasTrigger = hasTrigger;
		if(hasTrigger != null){
			putQueryParameter("HasTrigger", hasTrigger.toString());
		}
	}

	public String getCreatedDateAfter() {
		return this.createdDateAfter;
	}

	public void setCreatedDateAfter(String createdDateAfter) {
		this.createdDateAfter = createdDateAfter;
		if(createdDateAfter != null){
			putQueryParameter("CreatedDateAfter", createdDateAfter);
		}
	}

	public Map<Object,Object> getTags() {
		return this.tags;
	}

	public void setTags(Map<Object,Object> tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", new Gson().toJson(tags));
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getTemplateFormat() {
		return this.templateFormat;
	}

	public void setTemplateFormat(String templateFormat) {
		this.templateFormat = templateFormat;
		if(templateFormat != null){
			putQueryParameter("TemplateFormat", templateFormat);
		}
	}

	public String getSortField() {
		return this.sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
		if(sortField != null){
			putQueryParameter("SortField", sortField);
		}
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putQueryParameter("Category", category);
		}
	}

	@Override
	public Class<ListTemplatesResponse> getResponseClass() {
		return ListTemplatesResponse.class;
	}

}
