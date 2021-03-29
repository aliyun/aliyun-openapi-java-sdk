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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteEnvHttpTrafficControlRequest extends RoaAcsRequest<DeleteEnvHttpTrafficControlResponse> {
	   

	private String labelAdviceName;

	private String pointcutName;
	public DeleteEnvHttpTrafficControlRequest() {
		super("Edas", "2017-08-01", "DeleteEnvHttpTrafficControl", "Edas");
		setUriPattern("/pop/v5/gray/env_http_traffic_control");
		setMethod(MethodType.DELETE);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLabelAdviceName() {
		return this.labelAdviceName;
	}

	public void setLabelAdviceName(String labelAdviceName) {
		this.labelAdviceName = labelAdviceName;
		if(labelAdviceName != null){
			putQueryParameter("LabelAdviceName", labelAdviceName);
		}
	}

	public String getPointcutName() {
		return this.pointcutName;
	}

	public void setPointcutName(String pointcutName) {
		this.pointcutName = pointcutName;
		if(pointcutName != null){
			putQueryParameter("PointcutName", pointcutName);
		}
	}

	@Override
	public Class<DeleteEnvHttpTrafficControlResponse> getResponseClass() {
		return DeleteEnvHttpTrafficControlResponse.class;
	}

}
