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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListEiamInstancesRequest extends RpcAcsRequest<ListEiamInstancesResponse> {
	   

	private String instanceRegionId;

	private List<String> instanceIds;
	public ListEiamInstancesRequest() {
		super("Eiam", "2021-12-01", "ListEiamInstances", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getInstanceRegionId() {
		return this.instanceRegionId;
	}

	public void setInstanceRegionId(String instanceRegionId) {
		this.instanceRegionId = instanceRegionId;
		if(instanceRegionId != null){
			putQueryParameter("InstanceRegionId", instanceRegionId);
		}
	}

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;	
		if (instanceIds != null) {
			for (int depth1 = 0; depth1 < instanceIds.size(); depth1++) {
				putQueryParameter("InstanceIds." + (depth1 + 1) , instanceIds.get(depth1));
			}
		}	
	}

	@Override
	public Class<ListEiamInstancesResponse> getResponseClass() {
		return ListEiamInstancesResponse.class;
	}

}
