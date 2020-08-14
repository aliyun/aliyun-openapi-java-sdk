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

package com.aliyuncs.teambition_aliyun.transform.v20200226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.teambition_aliyun.model.v20200226.ListProjectTaskFlowResponse;
import com.aliyuncs.teambition_aliyun.model.v20200226.ListProjectTaskFlowResponse.Taskflow;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectTaskFlowResponseUnmarshaller {

	public static ListProjectTaskFlowResponse unmarshall(ListProjectTaskFlowResponse listProjectTaskFlowResponse, UnmarshallerContext _ctx) {
		
		listProjectTaskFlowResponse.setRequestId(_ctx.stringValue("ListProjectTaskFlowResponse.RequestId"));
		listProjectTaskFlowResponse.setSuccessful(_ctx.booleanValue("ListProjectTaskFlowResponse.Successful"));
		listProjectTaskFlowResponse.setErrorCode(_ctx.stringValue("ListProjectTaskFlowResponse.ErrorCode"));
		listProjectTaskFlowResponse.setErrorMsg(_ctx.stringValue("ListProjectTaskFlowResponse.ErrorMsg"));

		List<Taskflow> object = new ArrayList<Taskflow>();
		for (int i = 0; i < _ctx.lengthValue("ListProjectTaskFlowResponse.Object.Length"); i++) {
			Taskflow taskflow = new Taskflow();
			taskflow.setId(_ctx.stringValue("ListProjectTaskFlowResponse.Object["+ i +"].Id"));
			taskflow.setType(_ctx.stringValue("ListProjectTaskFlowResponse.Object["+ i +"].Type"));

			object.add(taskflow);
		}
		listProjectTaskFlowResponse.setObject(object);
	 
	 	return listProjectTaskFlowResponse;
	}
}