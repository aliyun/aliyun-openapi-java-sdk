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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeMonitoringAgentStatusesRequest extends RpcAcsRequest<DescribeMonitoringAgentStatusesResponse> {
	   

	private String instanceIds;
	public DescribeMonitoringAgentStatusesRequest() {
		super("Cms", "2019-01-01", "DescribeMonitoringAgentStatuses", "Cms");
		setMethod(MethodType.POST);
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putQueryParameter("InstanceIds", instanceIds);
		}
	}

	@Override
	public Class<DescribeMonitoringAgentStatusesResponse> getResponseClass() {
		return DescribeMonitoringAgentStatusesResponse.class;
	}

}
