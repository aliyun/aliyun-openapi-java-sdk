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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeRCClusterConfigRequest extends RpcAcsRequest<DescribeRCClusterConfigResponse> {
	   

	private String vpcId;

	private Integer temporaryDurationMinutes;
	public DescribeRCClusterConfigRequest() {
		super("Rds", "2014-08-15", "DescribeRCClusterConfig", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public Integer getTemporaryDurationMinutes() {
		return this.temporaryDurationMinutes;
	}

	public void setTemporaryDurationMinutes(Integer temporaryDurationMinutes) {
		this.temporaryDurationMinutes = temporaryDurationMinutes;
		if(temporaryDurationMinutes != null){
			putQueryParameter("TemporaryDurationMinutes", temporaryDurationMinutes.toString());
		}
	}

	@Override
	public Class<DescribeRCClusterConfigResponse> getResponseClass() {
		return DescribeRCClusterConfigResponse.class;
	}

}
