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

import com.aliyuncs.eds_aic.model.v20230930.FetchFileResponse;
import com.aliyuncs.eds_aic.model.v20230930.FetchFileResponse.InstanceTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class FetchFileResponseUnmarshaller {

	public static FetchFileResponse unmarshall(FetchFileResponse fetchFileResponse, UnmarshallerContext _ctx) {
		
		fetchFileResponse.setRequestId(_ctx.stringValue("FetchFileResponse.RequestId"));
		fetchFileResponse.setTaskId(_ctx.stringValue("FetchFileResponse.TaskId"));

		List<InstanceTask> data = new ArrayList<InstanceTask>();
		for (int i = 0; i < _ctx.lengthValue("FetchFileResponse.Data.Length"); i++) {
			InstanceTask instanceTask = new InstanceTask();
			instanceTask.setAndroidInstanceId(_ctx.stringValue("FetchFileResponse.Data["+ i +"].AndroidInstanceId"));
			instanceTask.setTaskId(_ctx.stringValue("FetchFileResponse.Data["+ i +"].TaskId"));

			data.add(instanceTask);
		}
		fetchFileResponse.setData(data);
	 
	 	return fetchFileResponse;
	}
}