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

import com.aliyuncs.sls.model.v20191023.EnableAlertResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableAlertResponseUnmarshaller {

	public static EnableAlertResponse unmarshall(EnableAlertResponse enableAlertResponse, UnmarshallerContext _ctx) {
		
		enableAlertResponse.setRequestId(_ctx.stringValue("EnableAlertResponse.RequestId"));
		enableAlertResponse.setSuccess(_ctx.booleanValue("EnableAlertResponse.Success"));
		enableAlertResponse.setCode(_ctx.stringValue("EnableAlertResponse.Code"));
		enableAlertResponse.setMessage(_ctx.stringValue("EnableAlertResponse.Message"));
	 
	 	return enableAlertResponse;
	}
}