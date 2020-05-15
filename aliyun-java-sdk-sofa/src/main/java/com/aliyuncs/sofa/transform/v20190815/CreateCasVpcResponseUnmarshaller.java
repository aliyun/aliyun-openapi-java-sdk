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

import com.aliyuncs.sofa.model.v20190815.CreateCasVpcResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCasVpcResponseUnmarshaller {

	public static CreateCasVpcResponse unmarshall(CreateCasVpcResponse createCasVpcResponse, UnmarshallerContext _ctx) {
		
		createCasVpcResponse.setRequestId(_ctx.stringValue("CreateCasVpcResponse.RequestId"));
		createCasVpcResponse.setResultCode(_ctx.stringValue("CreateCasVpcResponse.ResultCode"));
		createCasVpcResponse.setResultMessage(_ctx.stringValue("CreateCasVpcResponse.ResultMessage"));
		createCasVpcResponse.setVpcSequence(_ctx.stringValue("CreateCasVpcResponse.VpcSequence"));
	 
	 	return createCasVpcResponse;
	}
}