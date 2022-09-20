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

import com.aliyuncs.mns_open.model.v20220119.DeleteTopicResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteTopicResponseUnmarshaller {

	public static DeleteTopicResponse unmarshall(DeleteTopicResponse deleteTopicResponse, UnmarshallerContext _ctx) {
		
		deleteTopicResponse.setRequestId(_ctx.stringValue("DeleteTopicResponse.RequestId"));
		deleteTopicResponse.setCode(_ctx.longValue("DeleteTopicResponse.Code"));
		deleteTopicResponse.setStatus(_ctx.stringValue("DeleteTopicResponse.Status"));
		deleteTopicResponse.setMessage(_ctx.stringValue("DeleteTopicResponse.Message"));
		deleteTopicResponse.setSuccess(_ctx.booleanValue("DeleteTopicResponse.Success"));
		deleteTopicResponse.setData(_ctx.mapValue("DeleteTopicResponse.Data"));
	 
	 	return deleteTopicResponse;
	}
}