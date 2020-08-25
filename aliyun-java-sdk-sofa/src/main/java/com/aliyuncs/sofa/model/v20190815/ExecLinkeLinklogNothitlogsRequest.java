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
public class ExecLinkeLinklogNothitlogsRequest extends RpcAcsRequest<ExecLinkeLinklogNothitlogsResponse> {
	   

	private Long gmtModified;

	private Long storeId;

	private String sourcePath;

	private List<String> bizPatternRepeatLists;

	private String taskUrl;

	private String sourceType;

	private Long id;

	private String taskId;

	private String taskApp;

	private String encoding;

	private String iterationId;

	private Long begin;

	private String status;

	private Long beginMills;

	private String sorter;

	private Long endMills;

	private String taskStatus;

	private Long pageSize;

	private String tenantId;

	private Long end;

	private String key;

	private String sourceId;

	private Long currentPage;

	private Long gmtCreate;

	private List<String> bizInfoRepeatLists;
	public ExecLinkeLinklogNothitlogsRequest() {
		super("SOFA", "2019-08-15", "ExecLinkeLinklogNothitlogs", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(Long gmtModified) {
		this.gmtModified = gmtModified;
		if(gmtModified != null){
			putBodyParameter("GmtModified", gmtModified.toString());
		}
	}

	public Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId.toString());
		}
	}

	public String getSourcePath() {
		return this.sourcePath;
	}

	public void setSourcePath(String sourcePath) {
		this.sourcePath = sourcePath;
		if(sourcePath != null){
			putBodyParameter("SourcePath", sourcePath);
		}
	}

	public List<String> getBizPatternRepeatLists() {
		return this.bizPatternRepeatLists;
	}

	public void setBizPatternRepeatLists(List<String> bizPatternRepeatLists) {
		this.bizPatternRepeatLists = bizPatternRepeatLists;	
		if (bizPatternRepeatLists != null) {
			for (int i = 0; i < bizPatternRepeatLists.size(); i++) {
				putBodyParameter("BizPatternRepeatList." + (i + 1) , bizPatternRepeatLists.get(i));
			}
		}	
	}

	public String getTaskUrl() {
		return this.taskUrl;
	}

	public void setTaskUrl(String taskUrl) {
		this.taskUrl = taskUrl;
		if(taskUrl != null){
			putBodyParameter("TaskUrl", taskUrl);
		}
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putBodyParameter("SourceType", sourceType);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putBodyParameter("TaskId", taskId);
		}
	}

	public String getTaskApp() {
		return this.taskApp;
	}

	public void setTaskApp(String taskApp) {
		this.taskApp = taskApp;
		if(taskApp != null){
			putBodyParameter("TaskApp", taskApp);
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

	public String getIterationId() {
		return this.iterationId;
	}

	public void setIterationId(String iterationId) {
		this.iterationId = iterationId;
		if(iterationId != null){
			putBodyParameter("IterationId", iterationId);
		}
	}

	public Long getBegin() {
		return this.begin;
	}

	public void setBegin(Long begin) {
		this.begin = begin;
		if(begin != null){
			putBodyParameter("Begin", begin.toString());
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	public Long getBeginMills() {
		return this.beginMills;
	}

	public void setBeginMills(Long beginMills) {
		this.beginMills = beginMills;
		if(beginMills != null){
			putBodyParameter("BeginMills", beginMills.toString());
		}
	}

	public String getSorter() {
		return this.sorter;
	}

	public void setSorter(String sorter) {
		this.sorter = sorter;
		if(sorter != null){
			putBodyParameter("Sorter", sorter);
		}
	}

	public Long getEndMills() {
		return this.endMills;
	}

	public void setEndMills(Long endMills) {
		this.endMills = endMills;
		if(endMills != null){
			putBodyParameter("EndMills", endMills.toString());
		}
	}

	public String getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
		if(taskStatus != null){
			putBodyParameter("TaskStatus", taskStatus);
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

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public Long getEnd() {
		return this.end;
	}

	public void setEnd(Long end) {
		this.end = end;
		if(end != null){
			putBodyParameter("End", end.toString());
		}
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
		if(key != null){
			putBodyParameter("Key", key);
		}
	}

	public String getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
		if(sourceId != null){
			putBodyParameter("SourceId", sourceId);
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

	public Long getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(Long gmtCreate) {
		this.gmtCreate = gmtCreate;
		if(gmtCreate != null){
			putBodyParameter("GmtCreate", gmtCreate.toString());
		}
	}

	public List<String> getBizInfoRepeatLists() {
		return this.bizInfoRepeatLists;
	}

	public void setBizInfoRepeatLists(List<String> bizInfoRepeatLists) {
		this.bizInfoRepeatLists = bizInfoRepeatLists;	
		if (bizInfoRepeatLists != null) {
			for (int i = 0; i < bizInfoRepeatLists.size(); i++) {
				putBodyParameter("BizInfoRepeatList." + (i + 1) , bizInfoRepeatLists.get(i));
			}
		}	
	}

	@Override
	public Class<ExecLinkeLinklogNothitlogsResponse> getResponseClass() {
		return ExecLinkeLinklogNothitlogsResponse.class;
	}

}
