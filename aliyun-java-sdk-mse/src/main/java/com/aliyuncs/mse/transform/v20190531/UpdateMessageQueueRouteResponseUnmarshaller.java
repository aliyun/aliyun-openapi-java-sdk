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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.UpdateMessageQueueRouteResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMessageQueueRouteResponseUnmarshaller {

	public static UpdateMessageQueueRouteResponse unmarshall(UpdateMessageQueueRouteResponse updateMessageQueueRouteResponse, UnmarshallerContext _ctx) {
		
		updateMessageQueueRouteResponse.setRequestId(_ctx.stringValue("UpdateMessageQueueRouteResponse.RequestId"));
		updateMessageQueueRouteResponse.setHttpStatusCode(_ctx.integerValue("UpdateMessageQueueRouteResponse.HttpStatusCode"));
		updateMessageQueueRouteResponse.setMessage(_ctx.stringValue("UpdateMessageQueueRouteResponse.Message"));
		updateMessageQueueRouteResponse.setData(_ctx.stringValue("UpdateMessageQueueRouteResponse.Data"));
		updateMessageQueueRouteResponse.setCode(_ctx.integerValue("UpdateMessageQueueRouteResponse.Code"));
		updateMessageQueueRouteResponse.setSuccess(_ctx.booleanValue("UpdateMessageQueueRouteResponse.Success"));
	 
	 	return updateMessageQueueRouteResponse;
	}
}