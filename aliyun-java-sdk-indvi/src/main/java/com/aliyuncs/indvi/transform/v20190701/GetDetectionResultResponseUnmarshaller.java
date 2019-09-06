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

package com.aliyuncs.indvi.transform.v20190701;

import com.aliyuncs.indvi.model.v20190701.GetDetectionResultResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDetectionResultResponseUnmarshaller {

	public static GetDetectionResultResponse unmarshall(GetDetectionResultResponse getDetectionResultResponse, UnmarshallerContext _ctx) {
		
		getDetectionResultResponse.setRequestId(_ctx.stringValue("GetDetectionResultResponse.RequestId"));
		getDetectionResultResponse.setSuccess(_ctx.booleanValue("GetDetectionResultResponse.Success"));
		getDetectionResultResponse.setMessage(_ctx.stringValue("GetDetectionResultResponse.Message"));
		getDetectionResultResponse.setCode(_ctx.stringValue("GetDetectionResultResponse.Code"));
		getDetectionResultResponse.setResult(_ctx.stringValue("GetDetectionResultResponse.Result"));
	 
	 	return getDetectionResultResponse;
	}
}