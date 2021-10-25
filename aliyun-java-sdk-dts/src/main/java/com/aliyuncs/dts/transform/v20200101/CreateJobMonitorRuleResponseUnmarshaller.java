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

package com.aliyuncs.dts.transform.v20200101;

import com.aliyuncs.dts.model.v20200101.CreateJobMonitorRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateJobMonitorRuleResponseUnmarshaller {

	public static CreateJobMonitorRuleResponse unmarshall(CreateJobMonitorRuleResponse createJobMonitorRuleResponse, UnmarshallerContext _ctx) {
		
		createJobMonitorRuleResponse.setRequestId(_ctx.stringValue("CreateJobMonitorRuleResponse.RequestId"));
		createJobMonitorRuleResponse.setCode(_ctx.stringValue("CreateJobMonitorRuleResponse.Code"));
		createJobMonitorRuleResponse.setDynamicMessage(_ctx.stringValue("CreateJobMonitorRuleResponse.DynamicMessage"));
		createJobMonitorRuleResponse.setErrCode(_ctx.stringValue("CreateJobMonitorRuleResponse.ErrCode"));
		createJobMonitorRuleResponse.setErrMessage(_ctx.stringValue("CreateJobMonitorRuleResponse.ErrMessage"));
		createJobMonitorRuleResponse.setHttpStatusCode(_ctx.integerValue("CreateJobMonitorRuleResponse.HttpStatusCode"));
		createJobMonitorRuleResponse.setSuccess(_ctx.booleanValue("CreateJobMonitorRuleResponse.Success"));
		createJobMonitorRuleResponse.setDtsJobId(_ctx.stringValue("CreateJobMonitorRuleResponse.DtsJobId"));
	 
	 	return createJobMonitorRuleResponse;
	}
}