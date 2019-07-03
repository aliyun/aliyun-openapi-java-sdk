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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.GetLoraNodesTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLoraNodesTaskResponseUnmarshaller {

	public static GetLoraNodesTaskResponse unmarshall(GetLoraNodesTaskResponse getLoraNodesTaskResponse, UnmarshallerContext _ctx) {
		
		getLoraNodesTaskResponse.setRequestId(_ctx.stringValue("GetLoraNodesTaskResponse.RequestId"));
		getLoraNodesTaskResponse.setSuccess(_ctx.booleanValue("GetLoraNodesTaskResponse.Success"));
		getLoraNodesTaskResponse.setCode(_ctx.stringValue("GetLoraNodesTaskResponse.Code"));
		getLoraNodesTaskResponse.setErrorMessage(_ctx.stringValue("GetLoraNodesTaskResponse.ErrorMessage"));
		getLoraNodesTaskResponse.setTaskId(_ctx.stringValue("GetLoraNodesTaskResponse.TaskId"));
		getLoraNodesTaskResponse.setTaskState(_ctx.stringValue("GetLoraNodesTaskResponse.TaskState"));
		getLoraNodesTaskResponse.setTotalCount(_ctx.longValue("GetLoraNodesTaskResponse.TotalCount"));
		getLoraNodesTaskResponse.setSuccessCount(_ctx.longValue("GetLoraNodesTaskResponse.SuccessCount"));

		List<String> successDevEuis = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLoraNodesTaskResponse.SuccessDevEuis.Length"); i++) {
			successDevEuis.add(_ctx.stringValue("GetLoraNodesTaskResponse.SuccessDevEuis["+ i +"]"));
		}
		getLoraNodesTaskResponse.setSuccessDevEuis(successDevEuis);
	 
	 	return getLoraNodesTaskResponse;
	}
}