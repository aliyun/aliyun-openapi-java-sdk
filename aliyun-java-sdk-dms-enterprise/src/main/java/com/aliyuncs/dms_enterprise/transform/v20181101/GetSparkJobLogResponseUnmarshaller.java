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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.GetSparkJobLogResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSparkJobLogResponseUnmarshaller {

	public static GetSparkJobLogResponse unmarshall(GetSparkJobLogResponse getSparkJobLogResponse, UnmarshallerContext _ctx) {
		
		getSparkJobLogResponse.setRequestId(_ctx.stringValue("GetSparkJobLogResponse.RequestId"));
		getSparkJobLogResponse.setSuccess(_ctx.booleanValue("GetSparkJobLogResponse.Success"));
		getSparkJobLogResponse.setErrorMessage(_ctx.stringValue("GetSparkJobLogResponse.ErrorMessage"));
		getSparkJobLogResponse.setErrorCode(_ctx.stringValue("GetSparkJobLogResponse.ErrorCode"));
		getSparkJobLogResponse.setLog(_ctx.stringValue("GetSparkJobLogResponse.Log"));
	 
	 	return getSparkJobLogResponse;
	}
}