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

package com.aliyuncs.live.transform.v20161101;

import com.aliyuncs.live.model.v20161101.CreateMessageGroupResponse;
import com.aliyuncs.live.model.v20161101.CreateMessageGroupResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMessageGroupResponseUnmarshaller {

	public static CreateMessageGroupResponse unmarshall(CreateMessageGroupResponse createMessageGroupResponse, UnmarshallerContext _ctx) {
		
		createMessageGroupResponse.setRequestId(_ctx.stringValue("CreateMessageGroupResponse.RequestId"));

		Result result = new Result();
		result.setExtension(_ctx.mapValue("CreateMessageGroupResponse.Result.Extension"));
		result.setGroupId(_ctx.stringValue("CreateMessageGroupResponse.Result.GroupId"));
		createMessageGroupResponse.setResult(result);
	 
	 	return createMessageGroupResponse;
	}
}