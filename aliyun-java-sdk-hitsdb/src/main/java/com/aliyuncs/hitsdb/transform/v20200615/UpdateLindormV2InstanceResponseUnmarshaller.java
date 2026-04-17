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

import com.aliyuncs.hitsdb.model.v20200615.UpdateLindormV2InstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLindormV2InstanceResponseUnmarshaller {

	public static UpdateLindormV2InstanceResponse unmarshall(UpdateLindormV2InstanceResponse updateLindormV2InstanceResponse, UnmarshallerContext _ctx) {
		
		updateLindormV2InstanceResponse.setRequestId(_ctx.stringValue("UpdateLindormV2InstanceResponse.RequestId"));
		updateLindormV2InstanceResponse.setInstanceId(_ctx.stringValue("UpdateLindormV2InstanceResponse.InstanceId"));
		updateLindormV2InstanceResponse.setOrderId(_ctx.longValue("UpdateLindormV2InstanceResponse.OrderId"));
		updateLindormV2InstanceResponse.setAccessDeniedDetail(_ctx.stringValue("UpdateLindormV2InstanceResponse.AccessDeniedDetail"));
	 
	 	return updateLindormV2InstanceResponse;
	}
}