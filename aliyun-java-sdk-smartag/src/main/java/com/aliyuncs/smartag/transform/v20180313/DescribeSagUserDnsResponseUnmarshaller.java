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

import com.aliyuncs.smartag.model.v20180313.DescribeSagUserDnsResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSagUserDnsResponse.TaskState;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSagUserDnsResponseUnmarshaller {

	public static DescribeSagUserDnsResponse unmarshall(DescribeSagUserDnsResponse describeSagUserDnsResponse, UnmarshallerContext _ctx) {
		
		describeSagUserDnsResponse.setRequestId(_ctx.stringValue("DescribeSagUserDnsResponse.RequestId"));
		describeSagUserDnsResponse.setSlaveDns(_ctx.stringValue("DescribeSagUserDnsResponse.SlaveDns"));
		describeSagUserDnsResponse.setMasterDns(_ctx.stringValue("DescribeSagUserDnsResponse.MasterDns"));

		List<TaskState> taskStates = new ArrayList<TaskState>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagUserDnsResponse.TaskStates.Length"); i++) {
			TaskState taskState = new TaskState();
			taskState.setErrorMessage(_ctx.stringValue("DescribeSagUserDnsResponse.TaskStates["+ i +"].ErrorMessage"));
			taskState.setState(_ctx.stringValue("DescribeSagUserDnsResponse.TaskStates["+ i +"].State"));
			taskState.setErrorCode(_ctx.stringValue("DescribeSagUserDnsResponse.TaskStates["+ i +"].ErrorCode"));
			taskState.setCreateTime(_ctx.stringValue("DescribeSagUserDnsResponse.TaskStates["+ i +"].CreateTime"));

			taskStates.add(taskState);
		}
		describeSagUserDnsResponse.setTaskStates(taskStates);
	 
	 	return describeSagUserDnsResponse;
	}
}