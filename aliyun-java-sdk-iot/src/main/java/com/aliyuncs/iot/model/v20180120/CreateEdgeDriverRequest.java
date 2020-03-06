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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateEdgeDriverRequest extends RpcAcsRequest<CreateEdgeDriverResponse> {
	   

	private String driverProtocol;

	private String driverName;

	private Boolean isBuiltIn;

	private String iotInstanceId;

	private String runtime;

	private String cpuArch;
	public CreateEdgeDriverRequest() {
		super("Iot", "2018-01-20", "CreateEdgeDriver", "Iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDriverProtocol() {
		return this.driverProtocol;
	}

	public void setDriverProtocol(String driverProtocol) {
		this.driverProtocol = driverProtocol;
		if(driverProtocol != null){
			putQueryParameter("DriverProtocol", driverProtocol);
		}
	}

	public String getDriverName() {
		return this.driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
		if(driverName != null){
			putQueryParameter("DriverName", driverName);
		}
	}

	public Boolean getIsBuiltIn() {
		return this.isBuiltIn;
	}

	public void setIsBuiltIn(Boolean isBuiltIn) {
		this.isBuiltIn = isBuiltIn;
		if(isBuiltIn != null){
			putQueryParameter("IsBuiltIn", isBuiltIn.toString());
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getRuntime() {
		return this.runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
		if(runtime != null){
			putQueryParameter("Runtime", runtime);
		}
	}

	public String getCpuArch() {
		return this.cpuArch;
	}

	public void setCpuArch(String cpuArch) {
		this.cpuArch = cpuArch;
		if(cpuArch != null){
			putQueryParameter("CpuArch", cpuArch);
		}
	}

	@Override
	public Class<CreateEdgeDriverResponse> getResponseClass() {
		return CreateEdgeDriverResponse.class;
	}

}
