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

import com.aliyuncs.live.model.v20161101.GetMessageGroupResponse;
import com.aliyuncs.live.model.v20161101.GetMessageGroupResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMessageGroupResponseUnmarshaller {

	public static GetMessageGroupResponse unmarshall(GetMessageGroupResponse getMessageGroupResponse, UnmarshallerContext _ctx) {
		
		getMessageGroupResponse.setRequestId(_ctx.stringValue("GetMessageGroupResponse.RequestId"));

		Result result = new Result();
		result.setCreateTime(_ctx.longValue("GetMessageGroupResponse.Result.CreateTime"));
		result.setCreatorId(_ctx.stringValue("GetMessageGroupResponse.Result.CreatorId"));
		result.setExtension(_ctx.mapValue("GetMessageGroupResponse.Result.Extension"));
		result.setGroupId(_ctx.stringValue("GetMessageGroupResponse.Result.GroupId"));
		result.setIsMuteAll(_ctx.booleanValue("GetMessageGroupResponse.Result.IsMuteAll"));
		result.setStatus(_ctx.integerValue("GetMessageGroupResponse.Result.Status"));
		getMessageGroupResponse.setResult(result);
	 
	 	return getMessageGroupResponse;
	}
}