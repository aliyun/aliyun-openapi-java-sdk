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

package com.aliyuncs.r_kvstore.transform.v20150101;

import com.aliyuncs.r_kvstore.model.v20150101.CreateTairKVCacheVNodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTairKVCacheVNodeResponseUnmarshaller {

	public static CreateTairKVCacheVNodeResponse unmarshall(CreateTairKVCacheVNodeResponse createTairKVCacheVNodeResponse, UnmarshallerContext _ctx) {
		
		createTairKVCacheVNodeResponse.setRequestId(_ctx.stringValue("CreateTairKVCacheVNodeResponse.RequestId"));
		createTairKVCacheVNodeResponse.setInstanceId(_ctx.stringValue("CreateTairKVCacheVNodeResponse.InstanceId"));
		createTairKVCacheVNodeResponse.setOrderId(_ctx.longValue("CreateTairKVCacheVNodeResponse.OrderId"));
		createTairKVCacheVNodeResponse.setRegionId(_ctx.stringValue("CreateTairKVCacheVNodeResponse.RegionId"));
		createTairKVCacheVNodeResponse.setZoneId(_ctx.stringValue("CreateTairKVCacheVNodeResponse.ZoneId"));
		createTairKVCacheVNodeResponse.setVkName(_ctx.stringValue("CreateTairKVCacheVNodeResponse.VkName"));
		createTairKVCacheVNodeResponse.setVClusterId(_ctx.stringValue("CreateTairKVCacheVNodeResponse.VClusterId"));
		createTairKVCacheVNodeResponse.setNodeId(_ctx.stringValue("CreateTairKVCacheVNodeResponse.NodeId"));
	 
	 	return createTairKVCacheVNodeResponse;
	}
}