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

import com.aliyuncs.edas.model.v20170801.DeleteServiceTimeConfigResponse;
import com.aliyuncs.edas.model.v20170801.DeleteServiceTimeConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteServiceTimeConfigResponseUnmarshaller {

	public static DeleteServiceTimeConfigResponse unmarshall(DeleteServiceTimeConfigResponse deleteServiceTimeConfigResponse, UnmarshallerContext _ctx) {
		
		deleteServiceTimeConfigResponse.setCode(_ctx.integerValue("DeleteServiceTimeConfigResponse.Code"));
		deleteServiceTimeConfigResponse.setMessage(_ctx.stringValue("DeleteServiceTimeConfigResponse.Message"));
		deleteServiceTimeConfigResponse.setSuccess(_ctx.booleanValue("DeleteServiceTimeConfigResponse.Success"));

		Data data = new Data();
		data.setTimeout(_ctx.stringValue("DeleteServiceTimeConfigResponse.Data.Timeout"));
		data.setConsumerAppName(_ctx.stringValue("DeleteServiceTimeConfigResponse.Data.ConsumerAppName"));
		data.setConsumerAppId(_ctx.stringValue("DeleteServiceTimeConfigResponse.Data.ConsumerAppId"));
		data.setPath(_ctx.stringValue("DeleteServiceTimeConfigResponse.Data.Path"));
		data.setId(_ctx.longValue("DeleteServiceTimeConfigResponse.Data.Id"));
		deleteServiceTimeConfigResponse.setData(data);
	 
	 	return deleteServiceTimeConfigResponse;
	}
}