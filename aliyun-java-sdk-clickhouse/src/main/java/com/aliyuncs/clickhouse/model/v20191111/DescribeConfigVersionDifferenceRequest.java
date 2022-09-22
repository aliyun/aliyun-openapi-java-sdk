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

package com.aliyuncs.clickhouse.model.v20191111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.clickhouse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeConfigVersionDifferenceRequest extends RpcAcsRequest<DescribeConfigVersionDifferenceResponse> {
	   

	private String dBClusterId;

	private String changeId;
	public DescribeConfigVersionDifferenceRequest() {
		super("clickhouse", "2019-11-11", "DescribeConfigVersionDifference");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
		}
	}

	public String getChangeId() {
		return this.changeId;
	}

	public void setChangeId(String changeId) {
		this.changeId = changeId;
		if(changeId != null){
			putQueryParameter("ChangeId", changeId);
		}
	}

	@Override
	public Class<DescribeConfigVersionDifferenceResponse> getResponseClass() {
		return DescribeConfigVersionDifferenceResponse.class;
	}

}
