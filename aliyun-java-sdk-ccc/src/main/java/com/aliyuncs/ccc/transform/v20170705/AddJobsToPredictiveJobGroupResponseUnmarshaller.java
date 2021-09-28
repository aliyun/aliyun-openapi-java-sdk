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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.AddJobsToPredictiveJobGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddJobsToPredictiveJobGroupResponseUnmarshaller {

	public static AddJobsToPredictiveJobGroupResponse unmarshall(AddJobsToPredictiveJobGroupResponse addJobsToPredictiveJobGroupResponse, UnmarshallerContext _ctx) {
		
		addJobsToPredictiveJobGroupResponse.setRequestId(_ctx.stringValue("AddJobsToPredictiveJobGroupResponse.RequestId"));
		addJobsToPredictiveJobGroupResponse.setSuccess(_ctx.booleanValue("AddJobsToPredictiveJobGroupResponse.Success"));
		addJobsToPredictiveJobGroupResponse.setCode(_ctx.stringValue("AddJobsToPredictiveJobGroupResponse.Code"));
		addJobsToPredictiveJobGroupResponse.setMessage(_ctx.stringValue("AddJobsToPredictiveJobGroupResponse.Message"));
		addJobsToPredictiveJobGroupResponse.setHttpStatusCode(_ctx.integerValue("AddJobsToPredictiveJobGroupResponse.HttpStatusCode"));
	 
	 	return addJobsToPredictiveJobGroupResponse;
	}
}