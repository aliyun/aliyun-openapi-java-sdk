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

import com.aliyuncs.dts.model.v20200101.SuspendDtsJobsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SuspendDtsJobsResponseUnmarshaller {

	public static SuspendDtsJobsResponse unmarshall(SuspendDtsJobsResponse suspendDtsJobsResponse, UnmarshallerContext _ctx) {
		
		suspendDtsJobsResponse.setRequestId(_ctx.stringValue("SuspendDtsJobsResponse.RequestId"));
		suspendDtsJobsResponse.setHttpStatusCode(_ctx.integerValue("SuspendDtsJobsResponse.HttpStatusCode"));
		suspendDtsJobsResponse.setErrCode(_ctx.stringValue("SuspendDtsJobsResponse.ErrCode"));
		suspendDtsJobsResponse.setSuccess(_ctx.booleanValue("SuspendDtsJobsResponse.Success"));
		suspendDtsJobsResponse.setErrMessage(_ctx.stringValue("SuspendDtsJobsResponse.ErrMessage"));
		suspendDtsJobsResponse.setDynamicMessage(_ctx.stringValue("SuspendDtsJobsResponse.DynamicMessage"));
		suspendDtsJobsResponse.setDynamicCode(_ctx.stringValue("SuspendDtsJobsResponse.DynamicCode"));
	 
	 	return suspendDtsJobsResponse;
	}
}