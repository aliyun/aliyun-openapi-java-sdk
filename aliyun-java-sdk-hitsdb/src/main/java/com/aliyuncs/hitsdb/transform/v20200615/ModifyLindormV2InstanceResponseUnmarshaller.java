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

package com.aliyuncs.hitsdb.transform.v20200615;

import com.aliyuncs.hitsdb.model.v20200615.ModifyLindormV2InstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyLindormV2InstanceResponseUnmarshaller {

	public static ModifyLindormV2InstanceResponse unmarshall(ModifyLindormV2InstanceResponse modifyLindormV2InstanceResponse, UnmarshallerContext _ctx) {
		
		modifyLindormV2InstanceResponse.setRequestId(_ctx.stringValue("ModifyLindormV2InstanceResponse.RequestId"));
		modifyLindormV2InstanceResponse.setInstanceId(_ctx.stringValue("ModifyLindormV2InstanceResponse.InstanceId"));
		modifyLindormV2InstanceResponse.setOrderId(_ctx.longValue("ModifyLindormV2InstanceResponse.OrderId"));
		modifyLindormV2InstanceResponse.setAccessDeniedDetail(_ctx.stringValue("ModifyLindormV2InstanceResponse.AccessDeniedDetail"));
	 
	 	return modifyLindormV2InstanceResponse;
	}
}