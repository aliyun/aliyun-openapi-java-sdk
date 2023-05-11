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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.BatchDeleteDeviceGroupRelationsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchDeleteDeviceGroupRelationsResponseUnmarshaller {

	public static BatchDeleteDeviceGroupRelationsResponse unmarshall(BatchDeleteDeviceGroupRelationsResponse batchDeleteDeviceGroupRelationsResponse, UnmarshallerContext _ctx) {
		
		batchDeleteDeviceGroupRelationsResponse.setRequestId(_ctx.stringValue("BatchDeleteDeviceGroupRelationsResponse.RequestId"));
		batchDeleteDeviceGroupRelationsResponse.setSuccess(_ctx.booleanValue("BatchDeleteDeviceGroupRelationsResponse.Success"));
		batchDeleteDeviceGroupRelationsResponse.setCode(_ctx.stringValue("BatchDeleteDeviceGroupRelationsResponse.Code"));
		batchDeleteDeviceGroupRelationsResponse.setErrorMessage(_ctx.stringValue("BatchDeleteDeviceGroupRelationsResponse.ErrorMessage"));
		batchDeleteDeviceGroupRelationsResponse.setValidDeviceCount(_ctx.integerValue("BatchDeleteDeviceGroupRelationsResponse.ValidDeviceCount"));
		batchDeleteDeviceGroupRelationsResponse.setAlreadyRelatedGroupDeviceCount(_ctx.integerValue("BatchDeleteDeviceGroupRelationsResponse.AlreadyRelatedGroupDeviceCount"));
		batchDeleteDeviceGroupRelationsResponse.setSuccessDeviceCount(_ctx.integerValue("BatchDeleteDeviceGroupRelationsResponse.SuccessDeviceCount"));
	 
	 	return batchDeleteDeviceGroupRelationsResponse;
	}
}