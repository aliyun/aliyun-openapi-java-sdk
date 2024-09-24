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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.DowngradeApplicationApmServiceResponse;
import com.aliyuncs.sae.model.v20190506.DowngradeApplicationApmServiceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DowngradeApplicationApmServiceResponseUnmarshaller {

	public static DowngradeApplicationApmServiceResponse unmarshall(DowngradeApplicationApmServiceResponse downgradeApplicationApmServiceResponse, UnmarshallerContext _ctx) {
		
		downgradeApplicationApmServiceResponse.setRequestId(_ctx.stringValue("DowngradeApplicationApmServiceResponse.RequestId"));
		downgradeApplicationApmServiceResponse.setMessage(_ctx.stringValue("DowngradeApplicationApmServiceResponse.Message"));
		downgradeApplicationApmServiceResponse.setTraceId(_ctx.stringValue("DowngradeApplicationApmServiceResponse.TraceId"));
		downgradeApplicationApmServiceResponse.setErrorCode(_ctx.stringValue("DowngradeApplicationApmServiceResponse.ErrorCode"));
		downgradeApplicationApmServiceResponse.setCode(_ctx.stringValue("DowngradeApplicationApmServiceResponse.Code"));
		downgradeApplicationApmServiceResponse.setSuccess(_ctx.booleanValue("DowngradeApplicationApmServiceResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.booleanValue("DowngradeApplicationApmServiceResponse.Data.Status"));
		downgradeApplicationApmServiceResponse.setData(data);
	 
	 	return downgradeApplicationApmServiceResponse;
	}
}