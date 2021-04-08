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

package com.aliyuncs.aiccs.model.v20191015;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aiccs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EditQualityProjectRequest extends RpcAcsRequest<EditQualityProjectResponse> {
	   

	private String projectName;

	private Integer checkFreqType;

	private Integer scopeType;

	private List<String> servicerLists;

	private String timeRangeEnd;

	private List<Long> depLists;

	private List<Long> analysisIdss;

	private String instanceId;

	private String timeRangeStart;

	private Integer projectVersion;

	private List<Long> groupLists;

	private Long projectId;

	private List<Integer> channelTouchTypes;
	public EditQualityProjectRequest() {
		super("aiccs", "2019-10-15", "EditQualityProject");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putBodyParameter("ProjectName", projectName);
		}
	}

	public Integer getCheckFreqType() {
		return this.checkFreqType;
	}

	public void setCheckFreqType(Integer checkFreqType) {
		this.checkFreqType = checkFreqType;
		if(checkFreqType != null){
			putQueryParameter("CheckFreqType", checkFreqType.toString());
		}
	}

	public Integer getScopeType() {
		return this.scopeType;
	}

	public void setScopeType(Integer scopeType) {
		this.scopeType = scopeType;
		if(scopeType != null){
			putQueryParameter("ScopeType", scopeType.toString());
		}
	}

	public List<String> getServicerLists() {
		return this.servicerLists;
	}

	public void setServicerLists(List<String> servicerLists) {
		this.servicerLists = servicerLists;	
		if (servicerLists != null) {
			for (int i = 0; i < servicerLists.size(); i++) {
				putQueryParameter("ServicerList." + (i + 1) , servicerLists.get(i));
			}
		}	
	}

	public String getTimeRangeEnd() {
		return this.timeRangeEnd;
	}

	public void setTimeRangeEnd(String timeRangeEnd) {
		this.timeRangeEnd = timeRangeEnd;
		if(timeRangeEnd != null){
			putQueryParameter("TimeRangeEnd", timeRangeEnd);
		}
	}

	public List<Long> getDepLists() {
		return this.depLists;
	}

	public void setDepLists(List<Long> depLists) {
		this.depLists = depLists;	
		if (depLists != null) {
			for (int i = 0; i < depLists.size(); i++) {
				putQueryParameter("DepList." + (i + 1) , depLists.get(i));
			}
		}	
	}

	public List<Long> getAnalysisIdss() {
		return this.analysisIdss;
	}

	public void setAnalysisIdss(List<Long> analysisIdss) {
		this.analysisIdss = analysisIdss;	
		if (analysisIdss != null) {
			for (int i = 0; i < analysisIdss.size(); i++) {
				putQueryParameter("AnalysisIds." + (i + 1) , analysisIdss.get(i));
			}
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

	public String getTimeRangeStart() {
		return this.timeRangeStart;
	}

	public void setTimeRangeStart(String timeRangeStart) {
		this.timeRangeStart = timeRangeStart;
		if(timeRangeStart != null){
			putQueryParameter("TimeRangeStart", timeRangeStart);
		}
	}

	public Integer getProjectVersion() {
		return this.projectVersion;
	}

	public void setProjectVersion(Integer projectVersion) {
		this.projectVersion = projectVersion;
		if(projectVersion != null){
			putQueryParameter("ProjectVersion", projectVersion.toString());
		}
	}

	public List<Long> getGroupLists() {
		return this.groupLists;
	}

	public void setGroupLists(List<Long> groupLists) {
		this.groupLists = groupLists;	
		if (groupLists != null) {
			for (int i = 0; i < groupLists.size(); i++) {
				putQueryParameter("GroupList." + (i + 1) , groupLists.get(i));
			}
		}	
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId.toString());
		}
	}

	public List<Integer> getChannelTouchTypes() {
		return this.channelTouchTypes;
	}

	public void setChannelTouchTypes(List<Integer> channelTouchTypes) {
		this.channelTouchTypes = channelTouchTypes;	
		if (channelTouchTypes != null) {
			for (int i = 0; i < channelTouchTypes.size(); i++) {
				putQueryParameter("ChannelTouchType." + (i + 1) , channelTouchTypes.get(i));
			}
		}	
	}

	@Override
	public Class<EditQualityProjectResponse> getResponseClass() {
		return EditQualityProjectResponse.class;
	}

}
