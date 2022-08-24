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

import com.aliyuncs.viapi_regen.model.v20211119.GetServiceResponse;
import com.aliyuncs.viapi_regen.model.v20211119.GetServiceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceResponseUnmarshaller {

	public static GetServiceResponse unmarshall(GetServiceResponse getServiceResponse, UnmarshallerContext _ctx) {
		
		getServiceResponse.setRequestId(_ctx.stringValue("GetServiceResponse.RequestId"));
		getServiceResponse.setMessage(_ctx.stringValue("GetServiceResponse.Message"));
		getServiceResponse.setCode(_ctx.stringValue("GetServiceResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("GetServiceResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("GetServiceResponse.Data.GmtCreate"));
		data.setServiceName(_ctx.stringValue("GetServiceResponse.Data.ServiceName"));
		data.setServiceDescription(_ctx.stringValue("GetServiceResponse.Data.ServiceDescription"));
		data.setStatus(_ctx.stringValue("GetServiceResponse.Data.Status"));
		data.setServiceId(_ctx.stringValue("GetServiceResponse.Data.ServiceId"));
		data.setInputParams(_ctx.stringValue("GetServiceResponse.Data.InputParams"));
		data.setOutputParams(_ctx.stringValue("GetServiceResponse.Data.OutputParams"));
		data.setErrorcodes(_ctx.stringValue("GetServiceResponse.Data.Errorcodes"));
		data.setInputExample(_ctx.stringValue("GetServiceResponse.Data.InputExample"));
		data.setOutputExample(_ctx.stringValue("GetServiceResponse.Data.OutputExample"));
		getServiceResponse.setData(data);
	 
	 	return getServiceResponse;
	}
}