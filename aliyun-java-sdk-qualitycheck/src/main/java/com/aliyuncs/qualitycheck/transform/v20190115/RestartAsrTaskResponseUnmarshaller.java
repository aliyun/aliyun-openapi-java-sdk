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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.RestartAsrTaskResponse;
import com.aliyuncs.qualitycheck.model.v20190115.RestartAsrTaskResponse.RestartResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class RestartAsrTaskResponseUnmarshaller {

	public static RestartAsrTaskResponse unmarshall(RestartAsrTaskResponse restartAsrTaskResponse, UnmarshallerContext context) {
		
		restartAsrTaskResponse.setRequestId(context.stringValue("RestartAsrTaskResponse.RequestId"));
		restartAsrTaskResponse.setSuccess(context.booleanValue("RestartAsrTaskResponse.Success"));
		restartAsrTaskResponse.setCode(context.stringValue("RestartAsrTaskResponse.Code"));
		restartAsrTaskResponse.setMessage(context.stringValue("RestartAsrTaskResponse.Message"));

		List<RestartResult> data = new ArrayList<RestartResult>();
		for (int i = 0; i < context.lengthValue("RestartAsrTaskResponse.Data.Length"); i++) {
			RestartResult restartResult = new RestartResult();
			restartResult.setSuccess(context.booleanValue("RestartAsrTaskResponse.Data["+ i +"].Success"));
			restartResult.setData(context.stringValue("RestartAsrTaskResponse.Data["+ i +"].Data"));
			restartResult.setMessage(context.stringValue("RestartAsrTaskResponse.Data["+ i +"].Message"));

			data.add(restartResult);
		}
		restartAsrTaskResponse.setData(data);
	 
	 	return restartAsrTaskResponse;
	}
}