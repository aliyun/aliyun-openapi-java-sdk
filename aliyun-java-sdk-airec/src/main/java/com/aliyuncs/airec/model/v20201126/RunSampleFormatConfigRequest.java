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

package com.aliyuncs.airec.model.v20201126;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.airec.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RunSampleFormatConfigRequest extends RoaAcsRequest<RunSampleFormatConfigResponse> {
	   

	private String mode;

	private String instanceId;

	private String sampleId;
	public RunSampleFormatConfigRequest() {
		super("Airec", "2020-11-26", "RunSampleFormatConfig", "airec");
		setUriPattern("/v2/openapi/instances/[instanceId]/samples/[sampleId]/format-configs/actions/run");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("mode", mode);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putPathParameter("instanceId", instanceId);
		}
	}

	public String getSampleId() {
		return this.sampleId;
	}

	public void setSampleId(String sampleId) {
		this.sampleId = sampleId;
		if(sampleId != null){
			putPathParameter("sampleId", sampleId);
		}
	}

	@Override
	public Class<RunSampleFormatConfigResponse> getResponseClass() {
		return RunSampleFormatConfigResponse.class;
	}

}
