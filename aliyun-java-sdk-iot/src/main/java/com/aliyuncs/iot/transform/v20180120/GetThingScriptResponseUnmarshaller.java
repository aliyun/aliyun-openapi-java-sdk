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

import com.aliyuncs.iot.model.v20180120.GetThingScriptResponse;
import com.aliyuncs.iot.model.v20180120.GetThingScriptResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetThingScriptResponseUnmarshaller {

	public static GetThingScriptResponse unmarshall(GetThingScriptResponse getThingScriptResponse, UnmarshallerContext _ctx) {
		
		getThingScriptResponse.setRequestId(_ctx.stringValue("GetThingScriptResponse.RequestId"));
		getThingScriptResponse.setSuccess(_ctx.booleanValue("GetThingScriptResponse.Success"));
		getThingScriptResponse.setCode(_ctx.stringValue("GetThingScriptResponse.Code"));
		getThingScriptResponse.setErrorMessage(_ctx.stringValue("GetThingScriptResponse.ErrorMessage"));

		Data data = new Data();
		data.setScriptType(_ctx.stringValue("GetThingScriptResponse.Data.ScriptType"));
		data.setScriptUrl(_ctx.stringValue("GetThingScriptResponse.Data.ScriptUrl"));
		getThingScriptResponse.setData(data);
	 
	 	return getThingScriptResponse;
	}
}