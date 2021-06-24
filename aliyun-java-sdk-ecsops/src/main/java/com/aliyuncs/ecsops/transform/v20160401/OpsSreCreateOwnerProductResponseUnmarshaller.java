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

import com.aliyuncs.ecsops.model.v20160401.OpsSreCreateOwnerProductResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsSreCreateOwnerProductResponseUnmarshaller {

	public static OpsSreCreateOwnerProductResponse unmarshall(OpsSreCreateOwnerProductResponse opsSreCreateOwnerProductResponse, UnmarshallerContext _ctx) {
		
		opsSreCreateOwnerProductResponse.setRequestId(_ctx.stringValue("OpsSreCreateOwnerProductResponse.RequestId"));
		opsSreCreateOwnerProductResponse.setMessage(_ctx.stringValue("OpsSreCreateOwnerProductResponse.Message"));
		opsSreCreateOwnerProductResponse.setCode(_ctx.stringValue("OpsSreCreateOwnerProductResponse.Code"));
		opsSreCreateOwnerProductResponse.setSuccess(_ctx.stringValue("OpsSreCreateOwnerProductResponse.Success"));
	 
	 	return opsSreCreateOwnerProductResponse;
	}
}