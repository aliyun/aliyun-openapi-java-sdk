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

import com.aliyuncs.r_kvstore.model.v20150101.CreateTairInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTairInstanceResponseUnmarshaller {

	public static CreateTairInstanceResponse unmarshall(CreateTairInstanceResponse createTairInstanceResponse, UnmarshallerContext _ctx) {
		
		createTairInstanceResponse.setRequestId(_ctx.stringValue("CreateTairInstanceResponse.RequestId"));
		createTairInstanceResponse.setInstanceId(_ctx.stringValue("CreateTairInstanceResponse.InstanceId"));
		createTairInstanceResponse.setInstanceName(_ctx.stringValue("CreateTairInstanceResponse.InstanceName"));
		createTairInstanceResponse.setConnectionDomain(_ctx.stringValue("CreateTairInstanceResponse.ConnectionDomain"));
		createTairInstanceResponse.setPort(_ctx.integerValue("CreateTairInstanceResponse.Port"));
		createTairInstanceResponse.setInstanceStatus(_ctx.stringValue("CreateTairInstanceResponse.InstanceStatus"));
		createTairInstanceResponse.setRegionId(_ctx.stringValue("CreateTairInstanceResponse.RegionId"));
		createTairInstanceResponse.setQPS(_ctx.longValue("CreateTairInstanceResponse.QPS"));
		createTairInstanceResponse.setBandwidth(_ctx.longValue("CreateTairInstanceResponse.Bandwidth"));
		createTairInstanceResponse.setConnections(_ctx.longValue("CreateTairInstanceResponse.Connections"));
		createTairInstanceResponse.setZoneId(_ctx.stringValue("CreateTairInstanceResponse.ZoneId"));
		createTairInstanceResponse.setConfig(_ctx.stringValue("CreateTairInstanceResponse.Config"));
		createTairInstanceResponse.setChargeType(_ctx.stringValue("CreateTairInstanceResponse.ChargeType"));
		createTairInstanceResponse.setTaskId(_ctx.stringValue("CreateTairInstanceResponse.TaskId"));
	 
	 	return createTairInstanceResponse;
	}
}