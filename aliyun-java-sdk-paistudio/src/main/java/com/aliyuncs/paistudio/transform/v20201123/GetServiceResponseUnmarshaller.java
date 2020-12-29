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

package com.aliyuncs.paistudio.transform.v20201123;

import com.aliyuncs.paistudio.model.v20201123.GetServiceResponse;
import com.aliyuncs.paistudio.model.v20201123.GetServiceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceResponseUnmarshaller {

	public static GetServiceResponse unmarshall(GetServiceResponse getServiceResponse, UnmarshallerContext _ctx) {
		
		getServiceResponse.setRequestId(_ctx.stringValue("GetServiceResponse.RequestId"));
		getServiceResponse.setCode(_ctx.stringValue("GetServiceResponse.Code"));
		getServiceResponse.setMessage(_ctx.stringValue("GetServiceResponse.Message"));

		Data data = new Data();
		data.setUrl(_ctx.stringValue("GetServiceResponse.Data.Url"));
		data.setMessage(_ctx.stringValue("GetServiceResponse.Data.Message"));
		getServiceResponse.setData(data);
	 
	 	return getServiceResponse;
	}
}