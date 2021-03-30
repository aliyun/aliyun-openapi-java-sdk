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

package com.aliyuncs.openanalytics_open.model.v20200928;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.openanalytics_open.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddPartitionsRequest extends RpcAcsRequest<AddPartitionsResponse> {
	   

	private Array partition;
	public AddPartitionsRequest() {
		super("openanalytics-open", "2020-09-28", "AddPartitions", "openanalytics");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Array getPartition() {
		return this.partition;
	}

	public void setPartition(Array partition) {
		this.partition = partition;
		if(partition != null){
			putQueryParameter("Partition", partition.toString());
		}
	}

	@Override
	public Class<AddPartitionsResponse> getResponseClass() {
		return AddPartitionsResponse.class;
	}

}
