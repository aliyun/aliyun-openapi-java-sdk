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

package com.aliyuncs.cloud_siem.transform.v20220616;

import com.aliyuncs.cloud_siem.model.v20220616.GetCapacityResponse;
import com.aliyuncs.cloud_siem.model.v20220616.GetCapacityResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCapacityResponseUnmarshaller {

	public static GetCapacityResponse unmarshall(GetCapacityResponse getCapacityResponse, UnmarshallerContext _ctx) {
		
		getCapacityResponse.setRequestId(_ctx.stringValue("GetCapacityResponse.RequestId"));

		Data data = new Data();
		data.setUsedCapacity(_ctx.doubleValue("GetCapacityResponse.Data.UsedCapacity"));
		data.setPreservedCapacity(_ctx.longValue("GetCapacityResponse.Data.PreservedCapacity"));
		data.setExistLogStore(_ctx.booleanValue("GetCapacityResponse.Data.ExistLogStore"));
		data.setAgentManagedAssetQuota(_ctx.longValue("GetCapacityResponse.Data.AgentManagedAssetQuota"));
		data.setAgentManagedAssetUsed(_ctx.longValue("GetCapacityResponse.Data.AgentManagedAssetUsed"));
		getCapacityResponse.setData(data);
	 
	 	return getCapacityResponse;
	}
}