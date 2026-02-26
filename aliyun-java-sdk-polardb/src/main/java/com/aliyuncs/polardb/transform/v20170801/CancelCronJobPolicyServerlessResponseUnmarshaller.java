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

import com.aliyuncs.polardb.model.v20170801.CancelCronJobPolicyServerlessResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelCronJobPolicyServerlessResponseUnmarshaller {

	public static CancelCronJobPolicyServerlessResponse unmarshall(CancelCronJobPolicyServerlessResponse cancelCronJobPolicyServerlessResponse, UnmarshallerContext _ctx) {
		
		cancelCronJobPolicyServerlessResponse.setRequestId(_ctx.stringValue("CancelCronJobPolicyServerlessResponse.RequestId"));
		cancelCronJobPolicyServerlessResponse.setDBClusterId(_ctx.stringValue("CancelCronJobPolicyServerlessResponse.DBClusterId"));
		cancelCronJobPolicyServerlessResponse.setJobId(_ctx.stringValue("CancelCronJobPolicyServerlessResponse.JobId"));
		cancelCronJobPolicyServerlessResponse.setRegionId(_ctx.stringValue("CancelCronJobPolicyServerlessResponse.RegionId"));
		cancelCronJobPolicyServerlessResponse.setStatus(_ctx.stringValue("CancelCronJobPolicyServerlessResponse.Status"));
	 
	 	return cancelCronJobPolicyServerlessResponse;
	}
}