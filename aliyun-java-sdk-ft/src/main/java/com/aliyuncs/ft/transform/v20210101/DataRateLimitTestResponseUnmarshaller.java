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

package com.aliyuncs.ft.transform.v20210101;

import com.aliyuncs.ft.model.v20210101.DataRateLimitTestResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DataRateLimitTestResponseUnmarshaller {

	public static DataRateLimitTestResponse unmarshall(DataRateLimitTestResponse dataRateLimitTestResponse, UnmarshallerContext _ctx) {
		
		dataRateLimitTestResponse.setRequestId(_ctx.stringValue("DataRateLimitTestResponse.RequestId"));
	 
	 	return dataRateLimitTestResponse;
	}
}