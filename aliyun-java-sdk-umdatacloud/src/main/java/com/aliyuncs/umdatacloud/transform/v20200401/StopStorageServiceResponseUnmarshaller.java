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

package com.aliyuncs.umdatacloud.transform.v20200401;

import com.aliyuncs.umdatacloud.model.v20200401.StopStorageServiceResponse;
import com.aliyuncs.umdatacloud.model.v20200401.StopStorageServiceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopStorageServiceResponseUnmarshaller {

	public static StopStorageServiceResponse unmarshall(StopStorageServiceResponse stopStorageServiceResponse, UnmarshallerContext _ctx) {
		
		stopStorageServiceResponse.setRequestId(_ctx.stringValue("StopStorageServiceResponse.RequestId"));
		stopStorageServiceResponse.setMessage(_ctx.stringValue("StopStorageServiceResponse.Message"));
		stopStorageServiceResponse.setCode(_ctx.integerValue("StopStorageServiceResponse.Code"));
		stopStorageServiceResponse.setSuccess(_ctx.booleanValue("StopStorageServiceResponse.Success"));

		Data data = new Data();
		data.setResult(_ctx.booleanValue("StopStorageServiceResponse.Data.Result"));
		stopStorageServiceResponse.setData(data);
	 
	 	return stopStorageServiceResponse;
	}
}