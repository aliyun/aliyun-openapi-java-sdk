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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class StartInstancesRequest extends RpcAcsRequest<StartInstancesResponse> {
	   

	private List<String> instanceIds;
	public StartInstancesRequest() {
		super("Ens", "2017-11-10", "StartInstances", "ens");
		setMethod(MethodType.POST);
	}

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;	
		if (instanceIds != null) {
			String instanceIdsArrVal = "";
			for(int depth1 = 0; depth1 < instanceIds.size(); depth1++) {
				instanceIdsArrVal += instanceIds.get(depth1) + ",";
			}
			if (instanceIdsArrVal.length() > 0) {
				instanceIdsArrVal = instanceIdsArrVal.substring(0, instanceIdsArrVal.length() - 1);
			}
			putQueryParameter("InstanceIds" , instanceIdsArrVal);
		}	
	}

	@Override
	public Class<StartInstancesResponse> getResponseClass() {
		return StartInstancesResponse.class;
	}

}
