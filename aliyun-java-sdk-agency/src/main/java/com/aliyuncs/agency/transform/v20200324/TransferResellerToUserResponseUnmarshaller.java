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

package com.aliyuncs.agency.transform.v20200324;

import com.aliyuncs.agency.model.v20200324.TransferResellerToUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TransferResellerToUserResponseUnmarshaller {

	public static TransferResellerToUserResponse unmarshall(TransferResellerToUserResponse transferResellerToUserResponse, UnmarshallerContext _ctx) {
		
		transferResellerToUserResponse.setRequestId(_ctx.stringValue("TransferResellerToUserResponse.RequestId"));
		transferResellerToUserResponse.setMsg(_ctx.stringValue("TransferResellerToUserResponse.Msg"));
		transferResellerToUserResponse.setCode(_ctx.stringValue("TransferResellerToUserResponse.Code"));
		transferResellerToUserResponse.setData(_ctx.booleanValue("TransferResellerToUserResponse.Data"));
	 
	 	return transferResellerToUserResponse;
	}
}