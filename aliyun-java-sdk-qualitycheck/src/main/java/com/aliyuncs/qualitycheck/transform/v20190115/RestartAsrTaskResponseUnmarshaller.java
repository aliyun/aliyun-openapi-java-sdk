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

	public static RestartAsrTaskResponse unmarshall(RestartAsrTaskResponse restartAsrTaskResponse, UnmarshallerContext _ctx) {
		
		restartAsrTaskResponse.setRequestId(_ctx.stringValue("RestartAsrTaskResponse.RequestId"));
		restartAsrTaskResponse.setSuccess(_ctx.booleanValue("RestartAsrTaskResponse.Success"));
		restartAsrTaskResponse.setCode(_ctx.stringValue("RestartAsrTaskResponse.Code"));
		restartAsrTaskResponse.setMessage(_ctx.stringValue("RestartAsrTaskResponse.Message"));

		List<RestartResult> data = new ArrayList<RestartResult>();
		for (int i = 0; i < _ctx.lengthValue("RestartAsrTaskResponse.Data.Length"); i++) {
			RestartResult restartResult = new RestartResult();
			restartResult.setSuccess(_ctx.booleanValue("RestartAsrTaskResponse.Data["+ i +"].Success"));
			restartResult.setData(_ctx.stringValue("RestartAsrTaskResponse.Data["+ i +"].Data"));
			restartResult.setMessage(_ctx.stringValue("RestartAsrTaskResponse.Data["+ i +"].Message"));

			data.add(restartResult);
		}
		restartAsrTaskResponse.setData(data);
	 
	 	return restartAsrTaskResponse;
	}
}