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

package com.aliyuncs.mpserverless.transform.v20190615;

import com.aliyuncs.mpserverless.model.v20190615.DescribeFCOpenStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFCOpenStatusResponseUnmarshaller {

	public static DescribeFCOpenStatusResponse unmarshall(DescribeFCOpenStatusResponse describeFCOpenStatusResponse, UnmarshallerContext _ctx) {
		
		describeFCOpenStatusResponse.setRequestId(_ctx.stringValue("DescribeFCOpenStatusResponse.RequestId"));
		describeFCOpenStatusResponse.setHttpStatusCode(_ctx.stringValue("DescribeFCOpenStatusResponse.HttpStatusCode"));
		describeFCOpenStatusResponse.setSuccess(_ctx.booleanValue("DescribeFCOpenStatusResponse.Success"));
		describeFCOpenStatusResponse.setCode(_ctx.stringValue("DescribeFCOpenStatusResponse.Code"));
		describeFCOpenStatusResponse.setMessage(_ctx.stringValue("DescribeFCOpenStatusResponse.Message"));
		describeFCOpenStatusResponse.setStatus(_ctx.stringValue("DescribeFCOpenStatusResponse.Status"));
		describeFCOpenStatusResponse.setIsAuthorized(_ctx.booleanValue("DescribeFCOpenStatusResponse.IsAuthorized"));
	 
	 	return describeFCOpenStatusResponse;
	}
}