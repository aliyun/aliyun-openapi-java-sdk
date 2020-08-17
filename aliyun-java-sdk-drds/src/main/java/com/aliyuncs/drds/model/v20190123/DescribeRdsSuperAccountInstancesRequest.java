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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeRdsSuperAccountInstancesRequest extends RpcAcsRequest<DescribeRdsSuperAccountInstancesResponse> {
	   

	private List<String> rdsInstances;

	private String drdsInstanceId;

	private String dbInstType;
	public DescribeRdsSuperAccountInstancesRequest() {
		super("Drds", "2019-01-23", "DescribeRdsSuperAccountInstances", "Drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getRdsInstances() {
		return this.rdsInstances;
	}

	public void setRdsInstances(List<String> rdsInstances) {
		this.rdsInstances = rdsInstances;	
		if (rdsInstances != null) {
			for (int i = 0; i < rdsInstances.size(); i++) {
				putQueryParameter("RdsInstance." + (i + 1) , rdsInstances.get(i));
			}
		}	
	}

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
		if(drdsInstanceId != null){
			putQueryParameter("DrdsInstanceId", drdsInstanceId);
		}
	}

	public String getDbInstType() {
		return this.dbInstType;
	}

	public void setDbInstType(String dbInstType) {
		this.dbInstType = dbInstType;
		if(dbInstType != null){
			putQueryParameter("DbInstType", dbInstType);
		}
	}

	@Override
	public Class<DescribeRdsSuperAccountInstancesResponse> getResponseClass() {
		return DescribeRdsSuperAccountInstancesResponse.class;
	}

}
