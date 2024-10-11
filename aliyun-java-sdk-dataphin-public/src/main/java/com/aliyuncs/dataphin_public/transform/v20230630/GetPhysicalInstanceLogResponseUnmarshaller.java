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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalInstanceLogResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalInstanceLogResponse.TaskrunLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPhysicalInstanceLogResponseUnmarshaller {

	public static GetPhysicalInstanceLogResponse unmarshall(GetPhysicalInstanceLogResponse getPhysicalInstanceLogResponse, UnmarshallerContext _ctx) {
		
		getPhysicalInstanceLogResponse.setRequestId(_ctx.stringValue("GetPhysicalInstanceLogResponse.RequestId"));
		getPhysicalInstanceLogResponse.setSuccess(_ctx.booleanValue("GetPhysicalInstanceLogResponse.Success"));
		getPhysicalInstanceLogResponse.setHttpStatusCode(_ctx.integerValue("GetPhysicalInstanceLogResponse.HttpStatusCode"));
		getPhysicalInstanceLogResponse.setCode(_ctx.stringValue("GetPhysicalInstanceLogResponse.Code"));
		getPhysicalInstanceLogResponse.setMessage(_ctx.stringValue("GetPhysicalInstanceLogResponse.Message"));

		List<TaskrunLog> taskrunLogList = new ArrayList<TaskrunLog>();
		for (int i = 0; i < _ctx.lengthValue("GetPhysicalInstanceLogResponse.TaskrunLogList.Length"); i++) {
			TaskrunLog taskrunLog = new TaskrunLog();
			taskrunLog.setTaskrunId(_ctx.stringValue("GetPhysicalInstanceLogResponse.TaskrunLogList["+ i +"].TaskrunId"));
			taskrunLog.setStartTime(_ctx.stringValue("GetPhysicalInstanceLogResponse.TaskrunLogList["+ i +"].StartTime"));
			taskrunLog.setEndTime(_ctx.stringValue("GetPhysicalInstanceLogResponse.TaskrunLogList["+ i +"].EndTime"));
			taskrunLog.setLogContent(_ctx.stringValue("GetPhysicalInstanceLogResponse.TaskrunLogList["+ i +"].LogContent"));
			taskrunLog.setStatus(_ctx.stringValue("GetPhysicalInstanceLogResponse.TaskrunLogList["+ i +"].Status"));
			taskrunLog.setDuration(_ctx.stringValue("GetPhysicalInstanceLogResponse.TaskrunLogList["+ i +"].Duration"));

			taskrunLogList.add(taskrunLog);
		}
		getPhysicalInstanceLogResponse.setTaskrunLogList(taskrunLogList);
	 
	 	return getPhysicalInstanceLogResponse;
	}
}