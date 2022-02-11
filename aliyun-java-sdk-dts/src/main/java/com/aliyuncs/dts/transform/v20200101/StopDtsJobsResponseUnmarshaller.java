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

import com.aliyuncs.dts.model.v20200101.StopDtsJobsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopDtsJobsResponseUnmarshaller {

	public static StopDtsJobsResponse unmarshall(StopDtsJobsResponse stopDtsJobsResponse, UnmarshallerContext _ctx) {
		
		stopDtsJobsResponse.setRequestId(_ctx.stringValue("StopDtsJobsResponse.RequestId"));
		stopDtsJobsResponse.setHttpStatusCode(_ctx.integerValue("StopDtsJobsResponse.HttpStatusCode"));
		stopDtsJobsResponse.setErrCode(_ctx.stringValue("StopDtsJobsResponse.ErrCode"));
		stopDtsJobsResponse.setSuccess(_ctx.booleanValue("StopDtsJobsResponse.Success"));
		stopDtsJobsResponse.setErrMessage(_ctx.stringValue("StopDtsJobsResponse.ErrMessage"));
		stopDtsJobsResponse.setDynamicMessage(_ctx.stringValue("StopDtsJobsResponse.DynamicMessage"));
		stopDtsJobsResponse.setDynamicCode(_ctx.stringValue("StopDtsJobsResponse.DynamicCode"));
	 
	 	return stopDtsJobsResponse;
	}
}