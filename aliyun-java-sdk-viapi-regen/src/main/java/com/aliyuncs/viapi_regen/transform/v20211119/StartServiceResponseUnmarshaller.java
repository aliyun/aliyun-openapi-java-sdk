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

import com.aliyuncs.viapi_regen.model.v20211119.StartServiceResponse;
import com.aliyuncs.viapi_regen.model.v20211119.StartServiceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartServiceResponseUnmarshaller {

	public static StartServiceResponse unmarshall(StartServiceResponse startServiceResponse, UnmarshallerContext _ctx) {
		
		startServiceResponse.setRequestId(_ctx.stringValue("StartServiceResponse.RequestId"));
		startServiceResponse.setMessage(_ctx.stringValue("StartServiceResponse.Message"));
		startServiceResponse.setCode(_ctx.stringValue("StartServiceResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("StartServiceResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("StartServiceResponse.Data.GmtCreate"));
		data.setServiceName(_ctx.stringValue("StartServiceResponse.Data.ServiceName"));
		data.setServiceDescription(_ctx.stringValue("StartServiceResponse.Data.ServiceDescription"));
		data.setStatus(_ctx.stringValue("StartServiceResponse.Data.Status"));
		startServiceResponse.setData(data);
	 
	 	return startServiceResponse;
	}
}