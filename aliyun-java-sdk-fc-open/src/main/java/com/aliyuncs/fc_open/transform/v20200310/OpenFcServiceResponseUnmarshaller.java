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

package com.aliyuncs.fc_open.transform.v20200310;

import com.aliyuncs.fc_open.model.v20200310.OpenFcServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpenFcServiceResponseUnmarshaller {

	public static OpenFcServiceResponse unmarshall(OpenFcServiceResponse openFcServiceResponse, UnmarshallerContext _ctx) {
		
		openFcServiceResponse.setRequestId(_ctx.stringValue("OpenFcServiceResponse.RequestId"));
		openFcServiceResponse.setOrderId(_ctx.stringValue("OpenFcServiceResponse.OrderId"));
		openFcServiceResponse.setMessage(_ctx.stringValue("OpenFcServiceResponse.Message"));
		openFcServiceResponse.setErrorCode(_ctx.stringValue("OpenFcServiceResponse.ErrorCode"));
	 
	 	return openFcServiceResponse;
	}
}