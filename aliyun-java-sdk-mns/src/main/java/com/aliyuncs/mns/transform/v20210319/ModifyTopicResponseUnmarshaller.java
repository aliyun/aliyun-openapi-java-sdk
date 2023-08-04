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

package com.aliyuncs.mns.transform.v20210319;

import com.aliyuncs.mns.model.v20210319.ModifyTopicResponse;
import com.aliyuncs.mns.model.v20210319.ModifyTopicResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyTopicResponseUnmarshaller {

	public static ModifyTopicResponse unmarshall(ModifyTopicResponse modifyTopicResponse, UnmarshallerContext _ctx) {
		
		modifyTopicResponse.setRequestId(_ctx.stringValue("ModifyTopicResponse.RequestId"));
		modifyTopicResponse.setCode(_ctx.longValue("ModifyTopicResponse.Code"));
		modifyTopicResponse.setStatus(_ctx.stringValue("ModifyTopicResponse.Status"));
		modifyTopicResponse.setMessage(_ctx.stringValue("ModifyTopicResponse.Message"));
		modifyTopicResponse.setSuccess(_ctx.booleanValue("ModifyTopicResponse.Success"));

		Data data = new Data();
		data.setCode(_ctx.longValue("ModifyTopicResponse.Data.Code"));
		data.setMessage(_ctx.stringValue("ModifyTopicResponse.Data.Message"));
		data.setSuccess(_ctx.booleanValue("ModifyTopicResponse.Data.Success"));
		modifyTopicResponse.setData(data);
	 
	 	return modifyTopicResponse;
	}
}