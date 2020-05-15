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

package com.aliyuncs.alikafka.transform.v20190916;

import com.aliyuncs.alikafka.model.v20190916.ModifyPartitionNumResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyPartitionNumResponseUnmarshaller {

	public static ModifyPartitionNumResponse unmarshall(ModifyPartitionNumResponse modifyPartitionNumResponse, UnmarshallerContext _ctx) {
		
		modifyPartitionNumResponse.setRequestId(_ctx.stringValue("ModifyPartitionNumResponse.RequestId"));
		modifyPartitionNumResponse.setSuccess(_ctx.booleanValue("ModifyPartitionNumResponse.Success"));
		modifyPartitionNumResponse.setCode(_ctx.integerValue("ModifyPartitionNumResponse.Code"));
		modifyPartitionNumResponse.setMessage(_ctx.stringValue("ModifyPartitionNumResponse.Message"));
	 
	 	return modifyPartitionNumResponse;
	}
}