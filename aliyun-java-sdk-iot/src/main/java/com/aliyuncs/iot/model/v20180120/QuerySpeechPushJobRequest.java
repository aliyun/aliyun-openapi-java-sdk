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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QuerySpeechPushJobRequest extends RpcAcsRequest<QuerySpeechPushJobResponse> {
	   

	private List<String> statusLists;

	private String projectCode;

	private Integer pageId;

	private String iotInstanceId;

	private Integer pageSize;

	private String pushMode;

	private String jobCode;
	public QuerySpeechPushJobRequest() {
		super("Iot", "2018-01-20", "QuerySpeechPushJob", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getStatusLists() {
		return this.statusLists;
	}

	public void setStatusLists(List<String> statusLists) {
		this.statusLists = statusLists;	
		if (statusLists != null) {
			for (int i = 0; i < statusLists.size(); i++) {
				putBodyParameter("StatusList." + (i + 1) , statusLists.get(i));
			}
		}	
	}

	public String getProjectCode() {
		return this.projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
		if(projectCode != null){
			putBodyParameter("ProjectCode", projectCode);
		}
	}

	public Integer getPageId() {
		return this.pageId;
	}

	public void setPageId(Integer pageId) {
		this.pageId = pageId;
		if(pageId != null){
			putBodyParameter("PageId", pageId.toString());
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putBodyParameter("IotInstanceId", iotInstanceId);
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

	public String getPushMode() {
		return this.pushMode;
	}

	public void setPushMode(String pushMode) {
		this.pushMode = pushMode;
		if(pushMode != null){
			putBodyParameter("PushMode", pushMode);
		}
	}

	public String getJobCode() {
		return this.jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
		if(jobCode != null){
			putQueryParameter("JobCode", jobCode);
		}
	}

	@Override
	public Class<QuerySpeechPushJobResponse> getResponseClass() {
		return QuerySpeechPushJobResponse.class;
	}

}
