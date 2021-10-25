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

import com.aliyuncs.dts.model.v20200101.StartDtsJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartDtsJobResponseUnmarshaller {

	public static StartDtsJobResponse unmarshall(StartDtsJobResponse startDtsJobResponse, UnmarshallerContext _ctx) {
		
		startDtsJobResponse.setRequestId(_ctx.stringValue("StartDtsJobResponse.RequestId"));
		startDtsJobResponse.setDynamicCode(_ctx.stringValue("StartDtsJobResponse.DynamicCode"));
		startDtsJobResponse.setDynamicMessage(_ctx.stringValue("StartDtsJobResponse.DynamicMessage"));
		startDtsJobResponse.setErrCode(_ctx.stringValue("StartDtsJobResponse.ErrCode"));
		startDtsJobResponse.setErrMessage(_ctx.stringValue("StartDtsJobResponse.ErrMessage"));
		startDtsJobResponse.setHttpStatusCode(_ctx.integerValue("StartDtsJobResponse.HttpStatusCode"));
		startDtsJobResponse.setSuccess(_ctx.booleanValue("StartDtsJobResponse.Success"));
	 
	 	return startDtsJobResponse;
	}
}