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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import com.aliyuncs.openanalytics_open.model.v20180619.OpenDataLakeAnalyticsServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpenDataLakeAnalyticsServiceResponseUnmarshaller {

	public static OpenDataLakeAnalyticsServiceResponse unmarshall(OpenDataLakeAnalyticsServiceResponse openDataLakeAnalyticsServiceResponse, UnmarshallerContext _ctx) {
		
		openDataLakeAnalyticsServiceResponse.setRequestId(_ctx.stringValue("OpenDataLakeAnalyticsServiceResponse.RequestId"));
		openDataLakeAnalyticsServiceResponse.setSuccess(_ctx.booleanValue("OpenDataLakeAnalyticsServiceResponse.Success"));
		openDataLakeAnalyticsServiceResponse.setErrorCode(_ctx.stringValue("OpenDataLakeAnalyticsServiceResponse.ErrorCode"));
		openDataLakeAnalyticsServiceResponse.setErrorInfo(_ctx.stringValue("OpenDataLakeAnalyticsServiceResponse.ErrorInfo"));
		openDataLakeAnalyticsServiceResponse.setResult(_ctx.stringValue("OpenDataLakeAnalyticsServiceResponse.Result"));
	 
	 	return openDataLakeAnalyticsServiceResponse;
	}
}