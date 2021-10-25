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

import com.aliyuncs.dts.model.v20200101.StopDtsJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopDtsJobResponseUnmarshaller {

	public static StopDtsJobResponse unmarshall(StopDtsJobResponse stopDtsJobResponse, UnmarshallerContext _ctx) {
		
		stopDtsJobResponse.setRequestId(_ctx.stringValue("StopDtsJobResponse.RequestId"));
		stopDtsJobResponse.setDynamicCode(_ctx.stringValue("StopDtsJobResponse.DynamicCode"));
		stopDtsJobResponse.setDynamicMessage(_ctx.stringValue("StopDtsJobResponse.DynamicMessage"));
		stopDtsJobResponse.setErrCode(_ctx.stringValue("StopDtsJobResponse.ErrCode"));
		stopDtsJobResponse.setErrMessage(_ctx.stringValue("StopDtsJobResponse.ErrMessage"));
		stopDtsJobResponse.setHttpStatusCode(_ctx.integerValue("StopDtsJobResponse.HttpStatusCode"));
		stopDtsJobResponse.setSuccess(_ctx.booleanValue("StopDtsJobResponse.Success"));
	 
	 	return stopDtsJobResponse;
	}
}