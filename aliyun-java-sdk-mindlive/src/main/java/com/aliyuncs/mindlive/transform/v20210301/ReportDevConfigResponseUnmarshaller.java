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

import com.aliyuncs.mindlive.model.v20210301.ReportDevConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReportDevConfigResponseUnmarshaller {

	public static ReportDevConfigResponse unmarshall(ReportDevConfigResponse reportDevConfigResponse, UnmarshallerContext _ctx) {
		
		reportDevConfigResponse.setRequestId(_ctx.stringValue("ReportDevConfigResponse.RequestId"));
		reportDevConfigResponse.setSuccess(_ctx.booleanValue("ReportDevConfigResponse.Success"));
		reportDevConfigResponse.setErrorCode(_ctx.stringValue("ReportDevConfigResponse.ErrorCode"));
		reportDevConfigResponse.setErrorMessage(_ctx.stringValue("ReportDevConfigResponse.ErrorMessage"));
	 
	 	return reportDevConfigResponse;
	}
}