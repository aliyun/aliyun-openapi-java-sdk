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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.GetAppResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppResponseUnmarshaller {

	public static GetAppResponse unmarshall(GetAppResponse getAppResponse, UnmarshallerContext _ctx) {
		
		getAppResponse.setRequestId(_ctx.stringValue("GetAppResponse.RequestId"));
		getAppResponse.setStatus(_ctx.stringValue("GetAppResponse.Status"));
		getAppResponse.setIsSuccess(_ctx.booleanValue("GetAppResponse.IsSuccess"));
		getAppResponse.setType(_ctx.stringValue("GetAppResponse.Type"));
		getAppResponse.setAppUid(_ctx.stringValue("GetAppResponse.AppUid"));
		getAppResponse.setIcon(_ctx.stringValue("GetAppResponse.Icon"));
		getAppResponse.setCode(_ctx.stringValue("GetAppResponse.Code"));
		getAppResponse.setName(_ctx.stringValue("GetAppResponse.Name"));
	 
	 	return getAppResponse;
	}
}