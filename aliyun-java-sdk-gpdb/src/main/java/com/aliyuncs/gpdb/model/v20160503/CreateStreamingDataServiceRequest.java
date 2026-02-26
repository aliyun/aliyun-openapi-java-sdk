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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateStreamingDataServiceRequest extends RpcAcsRequest<CreateStreamingDataServiceResponse> {
	   

	private String serviceName;

	private String dBInstanceId;

	private String serviceSpec;

	private String serviceDescription;
	public CreateStreamingDataServiceRequest() {
		super("gpdb", "2016-05-03", "CreateStreamingDataService", "gpdb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("ServiceName", serviceName);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getServiceSpec() {
		return this.serviceSpec;
	}

	public void setServiceSpec(String serviceSpec) {
		this.serviceSpec = serviceSpec;
		if(serviceSpec != null){
			putQueryParameter("ServiceSpec", serviceSpec);
		}
	}

	public String getServiceDescription() {
		return this.serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
		if(serviceDescription != null){
			putQueryParameter("ServiceDescription", serviceDescription);
		}
	}

	@Override
	public Class<CreateStreamingDataServiceResponse> getResponseClass() {
		return CreateStreamingDataServiceResponse.class;
	}

}
