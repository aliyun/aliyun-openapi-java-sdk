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

package com.aliyuncs.sls.transform.v20191023;

import com.aliyuncs.sls.model.v20191023.GetSlsServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSlsServiceResponseUnmarshaller {

	public static GetSlsServiceResponse unmarshall(GetSlsServiceResponse getSlsServiceResponse, UnmarshallerContext _ctx) {
		
		getSlsServiceResponse.setRequestId(_ctx.stringValue("GetSlsServiceResponse.RequestId"));
		getSlsServiceResponse.setSuccess(_ctx.booleanValue("GetSlsServiceResponse.Success"));
		getSlsServiceResponse.setMessage(_ctx.stringValue("GetSlsServiceResponse.Message"));
		getSlsServiceResponse.setEnabled(_ctx.booleanValue("GetSlsServiceResponse.Enabled"));
		getSlsServiceResponse.setCode(_ctx.stringValue("GetSlsServiceResponse.Code"));
	 
	 	return getSlsServiceResponse;
	}
}