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

import com.aliyuncs.viapi_regen.model.v20211119.EnableDataReflowResponse;
import com.aliyuncs.viapi_regen.model.v20211119.EnableDataReflowResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableDataReflowResponseUnmarshaller {

	public static EnableDataReflowResponse unmarshall(EnableDataReflowResponse enableDataReflowResponse, UnmarshallerContext _ctx) {
		
		enableDataReflowResponse.setRequestId(_ctx.stringValue("EnableDataReflowResponse.RequestId"));
		enableDataReflowResponse.setMessage(_ctx.stringValue("EnableDataReflowResponse.Message"));
		enableDataReflowResponse.setCode(_ctx.stringValue("EnableDataReflowResponse.Code"));

		Data data = new Data();
		data.setServiceId(_ctx.longValue("EnableDataReflowResponse.Data.ServiceId"));
		data.setEnableDataReflowFlag(_ctx.booleanValue("EnableDataReflowResponse.Data.EnableDataReflowFlag"));
		data.setDataReflowRate(_ctx.longValue("EnableDataReflowResponse.Data.DataReflowRate"));
		data.setDataReflowOssPath(_ctx.stringValue("EnableDataReflowResponse.Data.DataReflowOssPath"));
		enableDataReflowResponse.setData(data);
	 
	 	return enableDataReflowResponse;
	}
}