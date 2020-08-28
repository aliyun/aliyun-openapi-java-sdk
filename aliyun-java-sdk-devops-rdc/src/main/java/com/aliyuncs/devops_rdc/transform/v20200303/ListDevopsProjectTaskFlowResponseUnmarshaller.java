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

package com.aliyuncs.devops_rdc.transform.v20200303;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops_rdc.model.v20200303.ListDevopsProjectTaskFlowResponse;
import com.aliyuncs.devops_rdc.model.v20200303.ListDevopsProjectTaskFlowResponse.Taskflow;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDevopsProjectTaskFlowResponseUnmarshaller {

	public static ListDevopsProjectTaskFlowResponse unmarshall(ListDevopsProjectTaskFlowResponse listDevopsProjectTaskFlowResponse, UnmarshallerContext _ctx) {
		
		listDevopsProjectTaskFlowResponse.setRequestId(_ctx.stringValue("ListDevopsProjectTaskFlowResponse.RequestId"));
		listDevopsProjectTaskFlowResponse.setSuccessful(_ctx.booleanValue("ListDevopsProjectTaskFlowResponse.Successful"));
		listDevopsProjectTaskFlowResponse.setErrorCode(_ctx.stringValue("ListDevopsProjectTaskFlowResponse.ErrorCode"));
		listDevopsProjectTaskFlowResponse.setErrorMsg(_ctx.stringValue("ListDevopsProjectTaskFlowResponse.ErrorMsg"));

		List<Taskflow> object = new ArrayList<Taskflow>();
		for (int i = 0; i < _ctx.lengthValue("ListDevopsProjectTaskFlowResponse.Object.Length"); i++) {
			Taskflow taskflow = new Taskflow();
			taskflow.setId(_ctx.stringValue("ListDevopsProjectTaskFlowResponse.Object["+ i +"].Id"));
			taskflow.setType(_ctx.stringValue("ListDevopsProjectTaskFlowResponse.Object["+ i +"].Type"));
			taskflow.setName(_ctx.stringValue("ListDevopsProjectTaskFlowResponse.Object["+ i +"].Name"));

			object.add(taskflow);
		}
		listDevopsProjectTaskFlowResponse.setObject(object);
	 
	 	return listDevopsProjectTaskFlowResponse;
	}
}