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

package com.aliyuncs.scsp.transform.v20200702;

import com.aliyuncs.scsp.model.v20200702.TransferToThirdCallResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TransferToThirdCallResponseUnmarshaller {

	public static TransferToThirdCallResponse unmarshall(TransferToThirdCallResponse transferToThirdCallResponse, UnmarshallerContext _ctx) {
		
		transferToThirdCallResponse.setRequestId(_ctx.stringValue("TransferToThirdCallResponse.RequestId"));
		transferToThirdCallResponse.setMessage(_ctx.stringValue("TransferToThirdCallResponse.Message"));
		transferToThirdCallResponse.setCode(_ctx.stringValue("TransferToThirdCallResponse.Code"));
		transferToThirdCallResponse.setSuccess(_ctx.booleanValue("TransferToThirdCallResponse.Success"));
	 
	 	return transferToThirdCallResponse;
	}
}