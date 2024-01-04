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

package com.aliyuncs.devops.transform.v20210625;

import com.aliyuncs.devops.model.v20210625.JoinPipelineGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class JoinPipelineGroupResponseUnmarshaller {

	public static JoinPipelineGroupResponse unmarshall(JoinPipelineGroupResponse joinPipelineGroupResponse, UnmarshallerContext _ctx) {
		
		joinPipelineGroupResponse.setRequestId(_ctx.stringValue("JoinPipelineGroupResponse.requestId"));
		joinPipelineGroupResponse.setErrorMessage(_ctx.stringValue("JoinPipelineGroupResponse.errorMessage"));
		joinPipelineGroupResponse.setSuccess(_ctx.booleanValue("JoinPipelineGroupResponse.success"));
		joinPipelineGroupResponse.setErrorCode(_ctx.stringValue("JoinPipelineGroupResponse.errorCode"));
	 
	 	return joinPipelineGroupResponse;
	}
}