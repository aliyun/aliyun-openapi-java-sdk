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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeAlertSourceWithEventRequest extends RpcAcsRequest<DescribeAlertSourceWithEventResponse> {
	   

	private String incidentUuid;
	public DescribeAlertSourceWithEventRequest() {
		super("cloud-siem", "2022-06-16", "DescribeAlertSourceWithEvent", "cloud-siem");
		setMethod(MethodType.POST);
	}

	public String getIncidentUuid() {
		return this.incidentUuid;
	}

	public void setIncidentUuid(String incidentUuid) {
		this.incidentUuid = incidentUuid;
		if(incidentUuid != null){
			putBodyParameter("IncidentUuid", incidentUuid);
		}
	}

	@Override
	public Class<DescribeAlertSourceWithEventResponse> getResponseClass() {
		return DescribeAlertSourceWithEventResponse.class;
	}

}
