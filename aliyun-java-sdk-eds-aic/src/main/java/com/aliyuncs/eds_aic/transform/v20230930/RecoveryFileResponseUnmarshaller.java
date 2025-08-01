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

package com.aliyuncs.eds_aic.transform.v20230930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_aic.model.v20230930.RecoveryFileResponse;
import com.aliyuncs.eds_aic.model.v20230930.RecoveryFileResponse.InstanceTaskList;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecoveryFileResponseUnmarshaller {

	public static RecoveryFileResponse unmarshall(RecoveryFileResponse recoveryFileResponse, UnmarshallerContext _ctx) {
		
		recoveryFileResponse.setRequestId(_ctx.stringValue("RecoveryFileResponse.RequestId"));
		recoveryFileResponse.setCount(_ctx.longValue("RecoveryFileResponse.Count"));
		recoveryFileResponse.setTaskId(_ctx.stringValue("RecoveryFileResponse.TaskId"));

		List<InstanceTaskList> data = new ArrayList<InstanceTaskList>();
		for (int i = 0; i < _ctx.lengthValue("RecoveryFileResponse.Data.Length"); i++) {
			InstanceTaskList instanceTaskList = new InstanceTaskList();
			instanceTaskList.setAndroidInstanceId(_ctx.stringValue("RecoveryFileResponse.Data["+ i +"].AndroidInstanceId"));
			instanceTaskList.setTaskId(_ctx.stringValue("RecoveryFileResponse.Data["+ i +"].TaskId"));

			data.add(instanceTaskList);
		}
		recoveryFileResponse.setData(data);
	 
	 	return recoveryFileResponse;
	}
}