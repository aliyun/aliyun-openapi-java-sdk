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

package com.aliyuncs.elasticsearch.model.v20170613;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.elasticsearch.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PostEmonTryAlarmRuleRequest extends RoaAcsRequest<PostEmonTryAlarmRuleResponse> {
	   

	private String alarmGroupId;

	private String projectId;
	public PostEmonTryAlarmRuleRequest() {
		super("elasticsearch", "2017-06-13", "PostEmonTryAlarmRule", "elasticsearch");
		setUriPattern("/openapi/emon/projects/[ProjectId]/alarm-groups/[AlarmGroupId]/alarm-rules/_test");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAlarmGroupId() {
		return this.alarmGroupId;
	}

	public void setAlarmGroupId(String alarmGroupId) {
		this.alarmGroupId = alarmGroupId;
		if(alarmGroupId != null){
			putPathParameter("AlarmGroupId", alarmGroupId);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putPathParameter("ProjectId", projectId);
		}
	}

	@Override
	public Class<PostEmonTryAlarmRuleResponse> getResponseClass() {
		return PostEmonTryAlarmRuleResponse.class;
	}

}
