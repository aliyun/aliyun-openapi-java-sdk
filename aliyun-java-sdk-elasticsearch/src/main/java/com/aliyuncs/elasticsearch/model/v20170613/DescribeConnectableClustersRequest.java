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

package com.aliyuncs.elasticsearch.model.v20170613;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.elasticsearch.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeConnectableClustersRequest extends RoaAcsRequest<DescribeConnectableClustersResponse> {
	   

	private String instanceId;

	private Boolean alreadySetItems;
	public DescribeConnectableClustersRequest() {
		super("elasticsearch", "2017-06-13", "DescribeConnectableClusters", "elasticsearch");
		setUriPattern("/openapi/instances/[InstanceId]/connectable-clusters");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putPathParameter("InstanceId", instanceId);
		}
	}

	public Boolean getAlreadySetItems() {
		return this.alreadySetItems;
	}

	public void setAlreadySetItems(Boolean alreadySetItems) {
		this.alreadySetItems = alreadySetItems;
		if(alreadySetItems != null){
			putQueryParameter("alreadySetItems", alreadySetItems.toString());
		}
	}

	@Override
	public Class<DescribeConnectableClustersResponse> getResponseClass() {
		return DescribeConnectableClustersResponse.class;
	}

}
