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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsAddNcExceptionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsAddNcExceptionResponseUnmarshaller {

	public static OpsAddNcExceptionResponse unmarshall(OpsAddNcExceptionResponse opsAddNcExceptionResponse, UnmarshallerContext _ctx) {
		
		opsAddNcExceptionResponse.setRequestId(_ctx.stringValue("OpsAddNcExceptionResponse.RequestId"));
		opsAddNcExceptionResponse.setStatus(_ctx.stringValue("OpsAddNcExceptionResponse.Status"));
		opsAddNcExceptionResponse.setFinished(_ctx.booleanValue("OpsAddNcExceptionResponse.Finished"));
		opsAddNcExceptionResponse.setErrorInfo(_ctx.stringValue("OpsAddNcExceptionResponse.ErrorInfo"));
		opsAddNcExceptionResponse.setToken(_ctx.stringValue("OpsAddNcExceptionResponse.Token"));
		opsAddNcExceptionResponse.setResult(_ctx.stringValue("OpsAddNcExceptionResponse.Result"));
	 
	 	return opsAddNcExceptionResponse;
	}
}