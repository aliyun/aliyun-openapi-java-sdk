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

import com.aliyuncs.dts.model.v20200101.SkipPreCheckResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SkipPreCheckResponseUnmarshaller {

	public static SkipPreCheckResponse unmarshall(SkipPreCheckResponse skipPreCheckResponse, UnmarshallerContext _ctx) {
		
		skipPreCheckResponse.setRequestId(_ctx.stringValue("SkipPreCheckResponse.RequestId"));
		skipPreCheckResponse.setCode(_ctx.stringValue("SkipPreCheckResponse.Code"));
		skipPreCheckResponse.setDynamicMessage(_ctx.stringValue("SkipPreCheckResponse.DynamicMessage"));
		skipPreCheckResponse.setErrCode(_ctx.stringValue("SkipPreCheckResponse.ErrCode"));
		skipPreCheckResponse.setErrMessage(_ctx.stringValue("SkipPreCheckResponse.ErrMessage"));
		skipPreCheckResponse.setHttpStatusCode(_ctx.integerValue("SkipPreCheckResponse.HttpStatusCode"));
		skipPreCheckResponse.setSuccess(_ctx.booleanValue("SkipPreCheckResponse.Success"));
		skipPreCheckResponse.setMigrationJobId(_ctx.stringValue("SkipPreCheckResponse.MigrationJobId"));
		skipPreCheckResponse.setScheduleJobId(_ctx.stringValue("SkipPreCheckResponse.ScheduleJobId"));
		skipPreCheckResponse.setSkipItems(_ctx.stringValue("SkipPreCheckResponse.SkipItems"));
		skipPreCheckResponse.setSkipNames(_ctx.stringValue("SkipPreCheckResponse.SkipNames"));
	 
	 	return skipPreCheckResponse;
	}
}