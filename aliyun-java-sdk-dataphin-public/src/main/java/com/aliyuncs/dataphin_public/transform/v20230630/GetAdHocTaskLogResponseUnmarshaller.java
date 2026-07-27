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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.GetAdHocTaskLogResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetAdHocTaskLogResponse.LogInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAdHocTaskLogResponseUnmarshaller {

	public static GetAdHocTaskLogResponse unmarshall(GetAdHocTaskLogResponse getAdHocTaskLogResponse, UnmarshallerContext _ctx) {
		
		getAdHocTaskLogResponse.setRequestId(_ctx.stringValue("GetAdHocTaskLogResponse.RequestId"));
		getAdHocTaskLogResponse.setMessage(_ctx.stringValue("GetAdHocTaskLogResponse.Message"));
		getAdHocTaskLogResponse.setHttpStatusCode(_ctx.integerValue("GetAdHocTaskLogResponse.HttpStatusCode"));
		getAdHocTaskLogResponse.setCode(_ctx.stringValue("GetAdHocTaskLogResponse.Code"));
		getAdHocTaskLogResponse.setSuccess(_ctx.booleanValue("GetAdHocTaskLogResponse.Success"));

		LogInfo logInfo = new LogInfo();
		logInfo.setSubTaskId(_ctx.integerValue("GetAdHocTaskLogResponse.LogInfo.SubTaskId"));
		logInfo.setTaskId(_ctx.stringValue("GetAdHocTaskLogResponse.LogInfo.TaskId"));
		logInfo.setContent(_ctx.stringValue("GetAdHocTaskLogResponse.LogInfo.Content"));
		logInfo.setHasResult(_ctx.booleanValue("GetAdHocTaskLogResponse.LogInfo.HasResult"));
		logInfo.setNextOffset(_ctx.integerValue("GetAdHocTaskLogResponse.LogInfo.NextOffset"));
		logInfo.setTaskStatus(_ctx.stringValue("GetAdHocTaskLogResponse.LogInfo.TaskStatus"));
		logInfo.setHasNext(_ctx.booleanValue("GetAdHocTaskLogResponse.LogInfo.HasNext"));
		getAdHocTaskLogResponse.setLogInfo(logInfo);
	 
	 	return getAdHocTaskLogResponse;
	}
}