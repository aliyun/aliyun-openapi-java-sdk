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

package com.aliyuncs.paifeaturestore.transform.v20230621;

import com.aliyuncs.paifeaturestore.model.v20230621.GetTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskResponseUnmarshaller {

	public static GetTaskResponse unmarshall(GetTaskResponse getTaskResponse, UnmarshallerContext _ctx) {
		
		getTaskResponse.setRequestId(_ctx.stringValue("GetTaskResponse.RequestId"));
		getTaskResponse.setProjectId(_ctx.stringValue("GetTaskResponse.ProjectId"));
		getTaskResponse.setProjectName(_ctx.stringValue("GetTaskResponse.ProjectName"));
		getTaskResponse.setType(_ctx.stringValue("GetTaskResponse.Type"));
		getTaskResponse.setObjectType(_ctx.stringValue("GetTaskResponse.ObjectType"));
		getTaskResponse.setObjectId(_ctx.stringValue("GetTaskResponse.ObjectId"));
		getTaskResponse.setStatus(_ctx.stringValue("GetTaskResponse.Status"));
		getTaskResponse.setConfig(_ctx.stringValue("GetTaskResponse.Config"));
		getTaskResponse.setRunningConfig(_ctx.stringValue("GetTaskResponse.RunningConfig"));
		getTaskResponse.setGmtCreateTime(_ctx.stringValue("GetTaskResponse.GmtCreateTime"));
		getTaskResponse.setGmtModifiedTime(_ctx.stringValue("GetTaskResponse.GmtModifiedTime"));
		getTaskResponse.setGmtExecutedTime(_ctx.stringValue("GetTaskResponse.GmtExecutedTime"));
		getTaskResponse.setGmtFinishedTime(_ctx.stringValue("GetTaskResponse.GmtFinishedTime"));
	 
	 	return getTaskResponse;
	}
}