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

package com.aliyuncs.baas.transform.v20180731;

import com.aliyuncs.baas.model.v20180731.DescribePeerLogsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePeerLogsResponseUnmarshaller {

	public static DescribePeerLogsResponse unmarshall(DescribePeerLogsResponse describePeerLogsResponse, UnmarshallerContext context) {
		
		describePeerLogsResponse.setRequestId(context.stringValue("DescribePeerLogsResponse.RequestId"));
		describePeerLogsResponse.setSuccess(context.booleanValue("DescribePeerLogsResponse.Success"));
		describePeerLogsResponse.setErrorCode(context.integerValue("DescribePeerLogsResponse.ErrorCode"));
		describePeerLogsResponse.setResult(context.stringValue("DescribePeerLogsResponse.Result"));
	 
	 	return describePeerLogsResponse;
	}
}