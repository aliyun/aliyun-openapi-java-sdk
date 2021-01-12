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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.AddServiceTimeConfigResponse;
import com.aliyuncs.edas.model.v20170801.AddServiceTimeConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddServiceTimeConfigResponseUnmarshaller {

	public static AddServiceTimeConfigResponse unmarshall(AddServiceTimeConfigResponse addServiceTimeConfigResponse, UnmarshallerContext _ctx) {
		
		addServiceTimeConfigResponse.setRequestId(_ctx.stringValue("AddServiceTimeConfigResponse.RequestId"));
		addServiceTimeConfigResponse.setCode(_ctx.integerValue("AddServiceTimeConfigResponse.Code"));
		addServiceTimeConfigResponse.setMessage(_ctx.stringValue("AddServiceTimeConfigResponse.Message"));
		addServiceTimeConfigResponse.setSuccess(_ctx.booleanValue("AddServiceTimeConfigResponse.Success"));

		Data data = new Data();
		data.setTimeout(_ctx.stringValue("AddServiceTimeConfigResponse.Data.Timeout"));
		data.setConsumerAppName(_ctx.stringValue("AddServiceTimeConfigResponse.Data.ConsumerAppName"));
		data.setConsumerAppId(_ctx.stringValue("AddServiceTimeConfigResponse.Data.ConsumerAppId"));
		data.setPath(_ctx.stringValue("AddServiceTimeConfigResponse.Data.Path"));
		data.setId(_ctx.longValue("AddServiceTimeConfigResponse.Data.Id"));
		addServiceTimeConfigResponse.setData(data);
	 
	 	return addServiceTimeConfigResponse;
	}
}