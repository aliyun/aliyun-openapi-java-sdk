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

package com.aliyuncs.hdr.model.v20170925;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hdr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ReportKmsStatusRequest extends RpcAcsRequest<ReportKmsStatusResponse> {
	
	public ReportKmsStatusRequest() {
		super("hdr", "2017-09-25", "ReportKmsStatus", "hdr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String output;

	private String hardwareId;

	private Boolean succeed;

	public String getOutput() {
		return this.output;
	}

	public void setOutput(String output) {
		this.output = output;
		if(output != null){
			putQueryParameter("Output", output);
		}
	}

	public String getHardwareId() {
		return this.hardwareId;
	}

	public void setHardwareId(String hardwareId) {
		this.hardwareId = hardwareId;
		if(hardwareId != null){
			putQueryParameter("HardwareId", hardwareId);
		}
	}

	public Boolean getSucceed() {
		return this.succeed;
	}

	public void setSucceed(Boolean succeed) {
		this.succeed = succeed;
		if(succeed != null){
			putQueryParameter("Succeed", succeed.toString());
		}
	}

	@Override
	public Class<ReportKmsStatusResponse> getResponseClass() {
		return ReportKmsStatusResponse.class;
	}

}
