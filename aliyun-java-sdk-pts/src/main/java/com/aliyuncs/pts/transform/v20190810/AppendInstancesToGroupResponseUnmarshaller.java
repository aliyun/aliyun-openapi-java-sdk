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

package com.aliyuncs.pts.transform.v20190810;

import com.aliyuncs.pts.model.v20190810.AppendInstancesToGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AppendInstancesToGroupResponseUnmarshaller {

	public static AppendInstancesToGroupResponse unmarshall(AppendInstancesToGroupResponse appendInstancesToGroupResponse, UnmarshallerContext _ctx) {
		
		appendInstancesToGroupResponse.setRequestId(_ctx.stringValue("AppendInstancesToGroupResponse.RequestId"));
		appendInstancesToGroupResponse.setCode(_ctx.stringValue("AppendInstancesToGroupResponse.Code"));
		appendInstancesToGroupResponse.setMessage(_ctx.stringValue("AppendInstancesToGroupResponse.Message"));
		appendInstancesToGroupResponse.setHttpStatusCode(_ctx.integerValue("AppendInstancesToGroupResponse.HttpStatusCode"));
		appendInstancesToGroupResponse.setSuccess(_ctx.booleanValue("AppendInstancesToGroupResponse.Success"));
	 
	 	return appendInstancesToGroupResponse;
	}
}