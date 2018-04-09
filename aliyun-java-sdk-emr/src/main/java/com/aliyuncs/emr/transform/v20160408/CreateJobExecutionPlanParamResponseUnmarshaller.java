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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.CreateJobExecutionPlanParamResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateJobExecutionPlanParamResponseUnmarshaller {

	public static CreateJobExecutionPlanParamResponse unmarshall(CreateJobExecutionPlanParamResponse createJobExecutionPlanParamResponse, UnmarshallerContext context) {
		
		createJobExecutionPlanParamResponse.setRequestId(context.stringValue("CreateJobExecutionPlanParamResponse.RequestId"));
		createJobExecutionPlanParamResponse.setSuccess(context.stringValue("CreateJobExecutionPlanParamResponse.Success"));
		createJobExecutionPlanParamResponse.setErrCode(context.stringValue("CreateJobExecutionPlanParamResponse.ErrCode"));
		createJobExecutionPlanParamResponse.setErrMsg(context.stringValue("CreateJobExecutionPlanParamResponse.ErrMsg"));

		List<String> ids = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("CreateJobExecutionPlanParamResponse.Ids.Length"); i++) {
			ids.add(context.stringValue("CreateJobExecutionPlanParamResponse.Ids["+ i +"]"));
		}
		createJobExecutionPlanParamResponse.setIds(ids);
	 
	 	return createJobExecutionPlanParamResponse;
	}
}