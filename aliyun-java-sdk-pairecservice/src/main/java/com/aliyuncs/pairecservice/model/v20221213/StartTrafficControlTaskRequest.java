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

package com.aliyuncs.pairecservice.model.v20221213;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class StartTrafficControlTaskRequest extends RoaAcsRequest<StartTrafficControlTaskResponse> {
	   

	private String trafficControlTaskId;

	private String body;
	public StartTrafficControlTaskRequest() {
		super("PaiRecService", "2022-12-13", "StartTrafficControlTask");
		setUriPattern("/api/v1/trafficcontroltasks/[TrafficControlTaskId]/action/start");
		setMethod(MethodType.POST);
	}

	public String getTrafficControlTaskId() {
		return this.trafficControlTaskId;
	}

	public void setTrafficControlTaskId(String trafficControlTaskId) {
		this.trafficControlTaskId = trafficControlTaskId;
		if(trafficControlTaskId != null){
			putPathParameter("TrafficControlTaskId", trafficControlTaskId);
		}
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putBodyParameter("body", body);
		}
	}

	@Override
	public Class<StartTrafficControlTaskResponse> getResponseClass() {
		return StartTrafficControlTaskResponse.class;
	}

}
