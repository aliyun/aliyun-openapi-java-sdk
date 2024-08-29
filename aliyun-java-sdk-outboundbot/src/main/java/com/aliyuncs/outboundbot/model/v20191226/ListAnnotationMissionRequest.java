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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListAnnotationMissionRequest extends RpcAcsRequest<ListAnnotationMissionResponse> {
	   

	private Long createTimeStartFilter;

	private String annotationStatusListStringFilter;

	private String annotationMissionId;

	private String annotationMissionName;

	private String instanceId;

	private Long createTimeEndFilter;

	private List<Integer> annotationStatusListFilters;

	private Integer pageSize;

	private Integer pageIndex;
	public ListAnnotationMissionRequest() {
		super("OutboundBot", "2019-12-26", "ListAnnotationMission", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getCreateTimeStartFilter() {
		return this.createTimeStartFilter;
	}

	public void setCreateTimeStartFilter(Long createTimeStartFilter) {
		this.createTimeStartFilter = createTimeStartFilter;
		if(createTimeStartFilter != null){
			putQueryParameter("CreateTimeStartFilter", createTimeStartFilter.toString());
		}
	}

	public String getAnnotationStatusListStringFilter() {
		return this.annotationStatusListStringFilter;
	}

	public void setAnnotationStatusListStringFilter(String annotationStatusListStringFilter) {
		this.annotationStatusListStringFilter = annotationStatusListStringFilter;
		if(annotationStatusListStringFilter != null){
			putQueryParameter("AnnotationStatusListStringFilter", annotationStatusListStringFilter);
		}
	}

	public String getAnnotationMissionId() {
		return this.annotationMissionId;
	}

	public void setAnnotationMissionId(String annotationMissionId) {
		this.annotationMissionId = annotationMissionId;
		if(annotationMissionId != null){
			putQueryParameter("AnnotationMissionId", annotationMissionId);
		}
	}

	public String getAnnotationMissionName() {
		return this.annotationMissionName;
	}

	public void setAnnotationMissionName(String annotationMissionName) {
		this.annotationMissionName = annotationMissionName;
		if(annotationMissionName != null){
			putQueryParameter("AnnotationMissionName", annotationMissionName);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Long getCreateTimeEndFilter() {
		return this.createTimeEndFilter;
	}

	public void setCreateTimeEndFilter(Long createTimeEndFilter) {
		this.createTimeEndFilter = createTimeEndFilter;
		if(createTimeEndFilter != null){
			putQueryParameter("CreateTimeEndFilter", createTimeEndFilter.toString());
		}
	}

	public List<Integer> getAnnotationStatusListFilters() {
		return this.annotationStatusListFilters;
	}

	public void setAnnotationStatusListFilters(List<Integer> annotationStatusListFilters) {
		this.annotationStatusListFilters = annotationStatusListFilters;	
		if (annotationStatusListFilters != null) {
			for (int i = 0; i < annotationStatusListFilters.size(); i++) {
				putQueryParameter("AnnotationStatusListFilter." + (i + 1) , annotationStatusListFilters.get(i));
			}
		}	
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putQueryParameter("PageIndex", pageIndex.toString());
		}
	}

	@Override
	public Class<ListAnnotationMissionResponse> getResponseClass() {
		return ListAnnotationMissionResponse.class;
	}

}
