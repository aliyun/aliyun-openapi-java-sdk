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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetNewbieTaskStatusResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetNewbieTaskStatusResponse.NewbieTaskStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNewbieTaskStatusResponseUnmarshaller {

	public static GetNewbieTaskStatusResponse unmarshall(GetNewbieTaskStatusResponse getNewbieTaskStatusResponse, UnmarshallerContext context) {
		
		getNewbieTaskStatusResponse.setRequestId(context.stringValue("GetNewbieTaskStatusResponse.RequestId"));
		getNewbieTaskStatusResponse.setSuccess(context.booleanValue("GetNewbieTaskStatusResponse.Success"));
		getNewbieTaskStatusResponse.setCode(context.stringValue("GetNewbieTaskStatusResponse.Code"));
		getNewbieTaskStatusResponse.setMessage(context.stringValue("GetNewbieTaskStatusResponse.Message"));
		getNewbieTaskStatusResponse.setHttpStatusCode(context.integerValue("GetNewbieTaskStatusResponse.HttpStatusCode"));

		List<NewbieTaskStatus> taskStatus = new ArrayList<NewbieTaskStatus>();
		for (int i = 0; i < context.lengthValue("GetNewbieTaskStatusResponse.TaskStatus.Length"); i++) {
			NewbieTaskStatus newbieTaskStatus = new NewbieTaskStatus();
			newbieTaskStatus.setTask(context.stringValue("GetNewbieTaskStatusResponse.TaskStatus["+ i +"].Task"));
			newbieTaskStatus.setStatus(context.booleanValue("GetNewbieTaskStatusResponse.TaskStatus["+ i +"].Status"));

			taskStatus.add(newbieTaskStatus);
		}
		getNewbieTaskStatusResponse.setTaskStatus(taskStatus);
	 
	 	return getNewbieTaskStatusResponse;
	}
}