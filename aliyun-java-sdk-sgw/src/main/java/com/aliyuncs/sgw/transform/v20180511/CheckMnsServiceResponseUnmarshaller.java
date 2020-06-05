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

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.CheckMnsServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckMnsServiceResponseUnmarshaller {

	public static CheckMnsServiceResponse unmarshall(CheckMnsServiceResponse checkMnsServiceResponse, UnmarshallerContext _ctx) {
		
		checkMnsServiceResponse.setRequestId(_ctx.stringValue("CheckMnsServiceResponse.RequestId"));
		checkMnsServiceResponse.setSuccess(_ctx.booleanValue("CheckMnsServiceResponse.Success"));
		checkMnsServiceResponse.setCode(_ctx.stringValue("CheckMnsServiceResponse.Code"));
		checkMnsServiceResponse.setMessage(_ctx.stringValue("CheckMnsServiceResponse.Message"));
		checkMnsServiceResponse.setIsEnabled(_ctx.booleanValue("CheckMnsServiceResponse.IsEnabled"));
		checkMnsServiceResponse.setCheckMessage(_ctx.stringValue("CheckMnsServiceResponse.CheckMessage"));
	 
	 	return checkMnsServiceResponse;
	}
}