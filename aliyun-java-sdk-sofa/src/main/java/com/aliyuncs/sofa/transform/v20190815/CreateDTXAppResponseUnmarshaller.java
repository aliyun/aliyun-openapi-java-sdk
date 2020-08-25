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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.CreateDTXAppResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDTXAppResponseUnmarshaller {

	public static CreateDTXAppResponse unmarshall(CreateDTXAppResponse createDTXAppResponse, UnmarshallerContext _ctx) {
		
		createDTXAppResponse.setRequestId(_ctx.stringValue("CreateDTXAppResponse.RequestId"));
		createDTXAppResponse.setResultCode(_ctx.stringValue("CreateDTXAppResponse.ResultCode"));
		createDTXAppResponse.setResultMessage(_ctx.stringValue("CreateDTXAppResponse.ResultMessage"));
		createDTXAppResponse.setMsg(_ctx.stringValue("CreateDTXAppResponse.Msg"));
		createDTXAppResponse.setSuccess(_ctx.booleanValue("CreateDTXAppResponse.Success"));
	 
	 	return createDTXAppResponse;
	}
}