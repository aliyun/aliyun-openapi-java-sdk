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

import com.aliyuncs.mindlive.model.v20210301.ReportScreenResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReportScreenResponseUnmarshaller {

	public static ReportScreenResponse unmarshall(ReportScreenResponse reportScreenResponse, UnmarshallerContext _ctx) {
		
		reportScreenResponse.setRequestId(_ctx.stringValue("ReportScreenResponse.RequestId"));
		reportScreenResponse.setSuccess(_ctx.booleanValue("ReportScreenResponse.Success"));
		reportScreenResponse.setErrorCode(_ctx.stringValue("ReportScreenResponse.ErrorCode"));
		reportScreenResponse.setErrorMessage(_ctx.stringValue("ReportScreenResponse.ErrorMessage"));
	 
	 	return reportScreenResponse;
	}
}