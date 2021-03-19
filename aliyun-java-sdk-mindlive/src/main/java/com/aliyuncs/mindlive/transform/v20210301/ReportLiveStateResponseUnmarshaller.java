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

package com.aliyuncs.mindlive.transform.v20210301;

import com.aliyuncs.mindlive.model.v20210301.ReportLiveStateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReportLiveStateResponseUnmarshaller {

	public static ReportLiveStateResponse unmarshall(ReportLiveStateResponse reportLiveStateResponse, UnmarshallerContext _ctx) {
		
		reportLiveStateResponse.setRequestId(_ctx.stringValue("ReportLiveStateResponse.RequestId"));
		reportLiveStateResponse.setSuccess(_ctx.booleanValue("ReportLiveStateResponse.Success"));
		reportLiveStateResponse.setErrorCode(_ctx.stringValue("ReportLiveStateResponse.ErrorCode"));
		reportLiveStateResponse.setErrorMessage(_ctx.stringValue("ReportLiveStateResponse.ErrorMessage"));
	 
	 	return reportLiveStateResponse;
	}
}