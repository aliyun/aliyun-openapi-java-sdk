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
public class UpdateTrafficControlTaskTrafficRequest extends RoaAcsRequest<UpdateTrafficControlTaskTrafficResponse> {
	   

	private String trafficControlTaskId;

	private String body;

	private String newparam3;
	public UpdateTrafficControlTaskTrafficRequest() {
		super("PaiRecService", "2022-12-13", "UpdateTrafficControlTaskTraffic");
		setUriPattern("/api/v1/trafficcontroltasks/[TrafficControlTaskId]/action/traffic");
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

	public String getNewparam3() {
		return this.newparam3;
	}

	public void setNewparam3(String newparam3) {
		this.newparam3 = newparam3;
		if(newparam3 != null){
			putQueryParameter("new-param-3", newparam3);
		}
	}

	@Override
	public Class<UpdateTrafficControlTaskTrafficResponse> getResponseClass() {
		return UpdateTrafficControlTaskTrafficResponse.class;
	}

}
