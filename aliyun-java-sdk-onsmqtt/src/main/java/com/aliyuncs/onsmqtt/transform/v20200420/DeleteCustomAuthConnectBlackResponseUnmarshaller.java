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

package com.aliyuncs.onsmqtt.transform.v20200420;

import com.aliyuncs.onsmqtt.model.v20200420.DeleteCustomAuthConnectBlackResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteCustomAuthConnectBlackResponseUnmarshaller {

	public static DeleteCustomAuthConnectBlackResponse unmarshall(DeleteCustomAuthConnectBlackResponse deleteCustomAuthConnectBlackResponse, UnmarshallerContext _ctx) {
		
		deleteCustomAuthConnectBlackResponse.setRequestId(_ctx.stringValue("DeleteCustomAuthConnectBlackResponse.RequestId"));
		deleteCustomAuthConnectBlackResponse.setCode(_ctx.integerValue("DeleteCustomAuthConnectBlackResponse.Code"));
		deleteCustomAuthConnectBlackResponse.setSuccess(_ctx.booleanValue("DeleteCustomAuthConnectBlackResponse.Success"));
		deleteCustomAuthConnectBlackResponse.setMessage(_ctx.stringValue("DeleteCustomAuthConnectBlackResponse.Message"));
	 
	 	return deleteCustomAuthConnectBlackResponse;
	}
}