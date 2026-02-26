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

import com.aliyuncs.viapi_regen.model.v20211119.GetServiceQpsResponse;
import com.aliyuncs.viapi_regen.model.v20211119.GetServiceQpsResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceQpsResponseUnmarshaller {

	public static GetServiceQpsResponse unmarshall(GetServiceQpsResponse getServiceQpsResponse, UnmarshallerContext _ctx) {
		
		getServiceQpsResponse.setRequestId(_ctx.stringValue("GetServiceQpsResponse.RequestId"));
		getServiceQpsResponse.setMessage(_ctx.stringValue("GetServiceQpsResponse.Message"));
		getServiceQpsResponse.setCode(_ctx.stringValue("GetServiceQpsResponse.Code"));

		Data data = new Data();
		data.setUserQps(_ctx.mapValue("GetServiceQpsResponse.Data.UserQps"));
		getServiceQpsResponse.setData(data);
	 
	 	return getServiceQpsResponse;
	}
}