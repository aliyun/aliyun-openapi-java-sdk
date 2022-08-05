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

package com.aliyuncs.viapi_regen.transform.v20211119;

import com.aliyuncs.viapi_regen.model.v20211119.StopServiceResponse;
import com.aliyuncs.viapi_regen.model.v20211119.StopServiceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopServiceResponseUnmarshaller {

	public static StopServiceResponse unmarshall(StopServiceResponse stopServiceResponse, UnmarshallerContext _ctx) {
		
		stopServiceResponse.setRequestId(_ctx.stringValue("StopServiceResponse.RequestId"));
		stopServiceResponse.setMessage(_ctx.stringValue("StopServiceResponse.Message"));
		stopServiceResponse.setCode(_ctx.stringValue("StopServiceResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("StopServiceResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("StopServiceResponse.Data.GmtCreate"));
		data.setServiceName(_ctx.stringValue("StopServiceResponse.Data.ServiceName"));
		data.setServiceDescription(_ctx.stringValue("StopServiceResponse.Data.ServiceDescription"));
		data.setStatus(_ctx.stringValue("StopServiceResponse.Data.Status"));
		stopServiceResponse.setData(data);
	 
	 	return stopServiceResponse;
	}
}