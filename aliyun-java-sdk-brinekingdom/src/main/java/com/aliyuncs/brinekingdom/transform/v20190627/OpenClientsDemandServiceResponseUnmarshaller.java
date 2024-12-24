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

package com.aliyuncs.brinekingdom.transform.v20190627;

import com.aliyuncs.brinekingdom.model.v20190627.OpenClientsDemandServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpenClientsDemandServiceResponseUnmarshaller {

	public static OpenClientsDemandServiceResponse unmarshall(OpenClientsDemandServiceResponse openClientsDemandServiceResponse, UnmarshallerContext _ctx) {
		
		openClientsDemandServiceResponse.setRequestId(_ctx.stringValue("OpenClientsDemandServiceResponse.RequestId"));
		openClientsDemandServiceResponse.setSourceId(_ctx.stringValue("OpenClientsDemandServiceResponse.SourceId"));
		openClientsDemandServiceResponse.setErrorMsg(_ctx.stringValue("OpenClientsDemandServiceResponse.ErrorMsg"));
		openClientsDemandServiceResponse.setDemandId(_ctx.longValue("OpenClientsDemandServiceResponse.DemandId"));
		openClientsDemandServiceResponse.setSource(_ctx.stringValue("OpenClientsDemandServiceResponse.Source"));
		openClientsDemandServiceResponse.setResultCode(_ctx.stringValue("OpenClientsDemandServiceResponse.ResultCode"));
		openClientsDemandServiceResponse.setSuccess(_ctx.booleanValue("OpenClientsDemandServiceResponse.Success"));
	 
	 	return openClientsDemandServiceResponse;
	}
}