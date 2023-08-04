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

package com.aliyuncs.mns.transform.v20210319;

import com.aliyuncs.mns.model.v20210319.GetEndpointResponse;
import com.aliyuncs.mns.model.v20210319.GetEndpointResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEndpointResponseUnmarshaller {

	public static GetEndpointResponse unmarshall(GetEndpointResponse getEndpointResponse, UnmarshallerContext _ctx) {
		
		getEndpointResponse.setRequestId(_ctx.stringValue("GetEndpointResponse.RequestId"));
		getEndpointResponse.setCode(_ctx.longValue("GetEndpointResponse.Code"));
		getEndpointResponse.setStatus(_ctx.stringValue("GetEndpointResponse.Status"));
		getEndpointResponse.setMessage(_ctx.stringValue("GetEndpointResponse.Message"));
		getEndpointResponse.setSuccess(_ctx.booleanValue("GetEndpointResponse.Success"));

		Data data = new Data();
		data.setEndpoint(_ctx.stringValue("GetEndpointResponse.Data.Endpoint"));
		data.setInternalEndpoint(_ctx.stringValue("GetEndpointResponse.Data.InternalEndpoint"));
		getEndpointResponse.setData(data);
	 
	 	return getEndpointResponse;
	}
}