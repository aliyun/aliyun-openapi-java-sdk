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
public class BatchCreateQualityProjectsRequest extends RpcAcsRequest<BatchCreateQualityProjectsResponse> {
	   

	private List<String> instanceLists;

	private String projectName;

	private Integer checkFreqType;

	private String timeRangeStart;

	private String timeRangeEnd;

	private List<Long> analysisIdss;

	private List<Integer> channelTouchTypes;
	public BatchCreateQualityProjectsRequest() {
		super("aiccs", "2019-10-15", "BatchCreateQualityProjects");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getInstanceLists() {
		return this.instanceLists;
	}

	public void setInstanceLists(List<String> instanceLists) {
		this.instanceLists = instanceLists;	
		if (instanceLists != null) {
			for (int i = 0; i < instanceLists.size(); i++) {
				putQueryParameter("InstanceList." + (i + 1) , instanceLists.get(i));
			}
		}	
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
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

	public String getTimeRangeStart() {
		return this.timeRangeStart;
	}

	public void setTimeRangeStart(String timeRangeStart) {
		this.timeRangeStart = timeRangeStart;
		if(timeRangeStart != null){
			putQueryParameter("TimeRangeStart", timeRangeStart);
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
	public Class<BatchCreateQualityProjectsResponse> getResponseClass() {
		return BatchCreateQualityProjectsResponse.class;
	}

}
