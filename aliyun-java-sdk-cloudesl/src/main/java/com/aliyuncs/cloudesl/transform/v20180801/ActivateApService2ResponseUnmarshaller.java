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

package com.aliyuncs.cloudesl.transform.v20180801;

import com.aliyuncs.cloudesl.model.v20180801.ActivateApService2Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class ActivateApService2ResponseUnmarshaller {

	public static ActivateApService2Response unmarshall(ActivateApService2Response activateApService2Response, UnmarshallerContext _ctx) {
		
		activateApService2Response.setRequestId(_ctx.stringValue("ActivateApService2Response.RequestId"));
		activateApService2Response.setSuccess(_ctx.booleanValue("ActivateApService2Response.Success"));
		activateApService2Response.setMessage(_ctx.stringValue("ActivateApService2Response.Message"));
		activateApService2Response.setErrorCode(_ctx.stringValue("ActivateApService2Response.ErrorCode"));
		activateApService2Response.setCode(_ctx.stringValue("ActivateApService2Response.Code"));
	 
	 	return activateApService2Response;
	}
}