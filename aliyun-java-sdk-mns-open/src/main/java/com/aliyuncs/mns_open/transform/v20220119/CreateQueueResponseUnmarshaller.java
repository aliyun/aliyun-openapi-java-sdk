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

package com.aliyuncs.mns_open.transform.v20220119;

import com.aliyuncs.mns_open.model.v20220119.CreateQueueResponse;
import com.aliyuncs.mns_open.model.v20220119.CreateQueueResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateQueueResponseUnmarshaller {

	public static CreateQueueResponse unmarshall(CreateQueueResponse createQueueResponse, UnmarshallerContext _ctx) {
		
		createQueueResponse.setRequestId(_ctx.stringValue("CreateQueueResponse.RequestId"));
		createQueueResponse.setCode(_ctx.longValue("CreateQueueResponse.Code"));
		createQueueResponse.setStatus(_ctx.stringValue("CreateQueueResponse.Status"));
		createQueueResponse.setMessage(_ctx.stringValue("CreateQueueResponse.Message"));
		createQueueResponse.setSuccess(_ctx.booleanValue("CreateQueueResponse.Success"));

		Data data = new Data();
		data.setCode(_ctx.longValue("CreateQueueResponse.Data.Code"));
		data.setMessage(_ctx.stringValue("CreateQueueResponse.Data.Message"));
		data.setSuccess(_ctx.booleanValue("CreateQueueResponse.Data.Success"));
		createQueueResponse.setData(data);
	 
	 	return createQueueResponse;
	}
}