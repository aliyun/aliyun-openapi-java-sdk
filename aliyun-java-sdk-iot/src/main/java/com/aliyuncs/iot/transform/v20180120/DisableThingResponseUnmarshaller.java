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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.DisableThingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableThingResponseUnmarshaller {

	public static DisableThingResponse unmarshall(DisableThingResponse disableThingResponse, UnmarshallerContext context) {
		
		disableThingResponse.setRequestId(context.stringValue("DisableThingResponse.RequestId"));
		disableThingResponse.setSuccess(context.booleanValue("DisableThingResponse.Success"));
		disableThingResponse.setCode(context.stringValue("DisableThingResponse.Code"));
		disableThingResponse.setErrorMessage(context.stringValue("DisableThingResponse.ErrorMessage"));
	 
	 	return disableThingResponse;
	}
}