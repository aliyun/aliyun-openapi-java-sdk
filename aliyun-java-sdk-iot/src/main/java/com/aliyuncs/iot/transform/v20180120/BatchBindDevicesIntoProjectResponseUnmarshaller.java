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

import com.aliyuncs.iot.model.v20180120.BatchBindDevicesIntoProjectResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchBindDevicesIntoProjectResponseUnmarshaller {

	public static BatchBindDevicesIntoProjectResponse unmarshall(BatchBindDevicesIntoProjectResponse batchBindDevicesIntoProjectResponse, UnmarshallerContext _ctx) {
		
		batchBindDevicesIntoProjectResponse.setRequestId(_ctx.stringValue("BatchBindDevicesIntoProjectResponse.RequestId"));
		batchBindDevicesIntoProjectResponse.setSuccess(_ctx.booleanValue("BatchBindDevicesIntoProjectResponse.Success"));
		batchBindDevicesIntoProjectResponse.setCode(_ctx.stringValue("BatchBindDevicesIntoProjectResponse.Code"));
		batchBindDevicesIntoProjectResponse.setErrorMessage(_ctx.stringValue("BatchBindDevicesIntoProjectResponse.ErrorMessage"));
		batchBindDevicesIntoProjectResponse.setData(_ctx.mapValue("BatchBindDevicesIntoProjectResponse.Data"));
	 
	 	return batchBindDevicesIntoProjectResponse;
	}
}