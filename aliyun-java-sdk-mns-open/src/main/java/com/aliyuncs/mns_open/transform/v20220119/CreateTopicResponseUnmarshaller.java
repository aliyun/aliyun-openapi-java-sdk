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

import com.aliyuncs.mns_open.model.v20220119.CreateTopicResponse;
import com.aliyuncs.mns_open.model.v20220119.CreateTopicResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTopicResponseUnmarshaller {

	public static CreateTopicResponse unmarshall(CreateTopicResponse createTopicResponse, UnmarshallerContext _ctx) {
		
		createTopicResponse.setRequestId(_ctx.stringValue("CreateTopicResponse.RequestId"));
		createTopicResponse.setCode(_ctx.longValue("CreateTopicResponse.Code"));
		createTopicResponse.setStatus(_ctx.stringValue("CreateTopicResponse.Status"));
		createTopicResponse.setMessage(_ctx.stringValue("CreateTopicResponse.Message"));
		createTopicResponse.setSuccess(_ctx.booleanValue("CreateTopicResponse.Success"));

		Data data = new Data();
		data.setCode(_ctx.longValue("CreateTopicResponse.Data.Code"));
		data.setMessage(_ctx.stringValue("CreateTopicResponse.Data.Message"));
		data.setSuccess(_ctx.booleanValue("CreateTopicResponse.Data.Success"));
		createTopicResponse.setData(data);
	 
	 	return createTopicResponse;
	}
}