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

import com.aliyuncs.dts.model.v20200101.StartDtsJobsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartDtsJobsResponseUnmarshaller {

	public static StartDtsJobsResponse unmarshall(StartDtsJobsResponse startDtsJobsResponse, UnmarshallerContext _ctx) {
		
		startDtsJobsResponse.setRequestId(_ctx.stringValue("StartDtsJobsResponse.RequestId"));
		startDtsJobsResponse.setHttpStatusCode(_ctx.integerValue("StartDtsJobsResponse.HttpStatusCode"));
		startDtsJobsResponse.setErrCode(_ctx.stringValue("StartDtsJobsResponse.ErrCode"));
		startDtsJobsResponse.setSuccess(_ctx.booleanValue("StartDtsJobsResponse.Success"));
		startDtsJobsResponse.setErrMessage(_ctx.stringValue("StartDtsJobsResponse.ErrMessage"));
		startDtsJobsResponse.setDynamicMessage(_ctx.stringValue("StartDtsJobsResponse.DynamicMessage"));
		startDtsJobsResponse.setDynamicCode(_ctx.stringValue("StartDtsJobsResponse.DynamicCode"));
	 
	 	return startDtsJobsResponse;
	}
}