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

import com.aliyuncs.viapi_regen.model.v20211119.DisableDataReflowResponse;
import com.aliyuncs.viapi_regen.model.v20211119.DisableDataReflowResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableDataReflowResponseUnmarshaller {

	public static DisableDataReflowResponse unmarshall(DisableDataReflowResponse disableDataReflowResponse, UnmarshallerContext _ctx) {
		
		disableDataReflowResponse.setRequestId(_ctx.stringValue("DisableDataReflowResponse.RequestId"));
		disableDataReflowResponse.setMessage(_ctx.stringValue("DisableDataReflowResponse.Message"));
		disableDataReflowResponse.setCode(_ctx.stringValue("DisableDataReflowResponse.Code"));

		Data data = new Data();
		data.setServiceId(_ctx.longValue("DisableDataReflowResponse.Data.ServiceId"));
		data.setEnableDataReflowFlag(_ctx.booleanValue("DisableDataReflowResponse.Data.EnableDataReflowFlag"));
		disableDataReflowResponse.setData(data);
	 
	 	return disableDataReflowResponse;
	}
}