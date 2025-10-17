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

package com.aliyuncs.polardb.transform.v20170801;

import com.aliyuncs.polardb.model.v20170801.CreateCronJobPolicyServerlessResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCronJobPolicyServerlessResponseUnmarshaller {

	public static CreateCronJobPolicyServerlessResponse unmarshall(CreateCronJobPolicyServerlessResponse createCronJobPolicyServerlessResponse, UnmarshallerContext _ctx) {
		
		createCronJobPolicyServerlessResponse.setRequestId(_ctx.stringValue("CreateCronJobPolicyServerlessResponse.RequestId"));
		createCronJobPolicyServerlessResponse.setJobId(_ctx.stringValue("CreateCronJobPolicyServerlessResponse.JobId"));
		createCronJobPolicyServerlessResponse.setDBClusterId(_ctx.stringValue("CreateCronJobPolicyServerlessResponse.DBClusterId"));
		createCronJobPolicyServerlessResponse.setRegionId(_ctx.stringValue("CreateCronJobPolicyServerlessResponse.RegionId"));
		createCronJobPolicyServerlessResponse.setStatus(_ctx.stringValue("CreateCronJobPolicyServerlessResponse.Status"));
		createCronJobPolicyServerlessResponse.setArgs(_ctx.stringValue("CreateCronJobPolicyServerlessResponse.Args"));
		createCronJobPolicyServerlessResponse.setCronExpression(_ctx.stringValue("CreateCronJobPolicyServerlessResponse.CronExpression"));
		createCronJobPolicyServerlessResponse.setAction(_ctx.stringValue("CreateCronJobPolicyServerlessResponse.Action"));
		createCronJobPolicyServerlessResponse.setStartTime(_ctx.stringValue("CreateCronJobPolicyServerlessResponse.StartTime"));
		createCronJobPolicyServerlessResponse.setEndTime(_ctx.stringValue("CreateCronJobPolicyServerlessResponse.EndTime"));
	 
	 	return createCronJobPolicyServerlessResponse;
	}
}