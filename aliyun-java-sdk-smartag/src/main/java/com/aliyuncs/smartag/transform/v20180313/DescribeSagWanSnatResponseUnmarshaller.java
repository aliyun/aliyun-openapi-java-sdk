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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeSagWanSnatResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSagWanSnatResponse.TaskState;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSagWanSnatResponseUnmarshaller {

	public static DescribeSagWanSnatResponse unmarshall(DescribeSagWanSnatResponse describeSagWanSnatResponse, UnmarshallerContext _ctx) {
		
		describeSagWanSnatResponse.setRequestId(_ctx.stringValue("DescribeSagWanSnatResponse.RequestId"));
		describeSagWanSnatResponse.setSnat(_ctx.stringValue("DescribeSagWanSnatResponse.Snat"));

		List<TaskState> taskStates = new ArrayList<TaskState>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagWanSnatResponse.TaskStates.Length"); i++) {
			TaskState taskState = new TaskState();
			taskState.setErrorMessage(_ctx.stringValue("DescribeSagWanSnatResponse.TaskStates["+ i +"].ErrorMessage"));
			taskState.setState(_ctx.stringValue("DescribeSagWanSnatResponse.TaskStates["+ i +"].State"));
			taskState.setErrorCode(_ctx.stringValue("DescribeSagWanSnatResponse.TaskStates["+ i +"].ErrorCode"));
			taskState.setCreateTime(_ctx.stringValue("DescribeSagWanSnatResponse.TaskStates["+ i +"].CreateTime"));

			taskStates.add(taskState);
		}
		describeSagWanSnatResponse.setTaskStates(taskStates);
	 
	 	return describeSagWanSnatResponse;
	}
}