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

package com.aliyuncs.agency.transform.v20171030;

import com.aliyuncs.agency.model.v20171030.TransferFxUserToResellerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TransferFxUserToResellerResponseUnmarshaller {

	public static TransferFxUserToResellerResponse unmarshall(TransferFxUserToResellerResponse transferFxUserToResellerResponse, UnmarshallerContext _ctx) {
		
		transferFxUserToResellerResponse.setCode(_ctx.stringValue("TransferFxUserToResellerResponse.Code"));
		transferFxUserToResellerResponse.setMessage(_ctx.stringValue("TransferFxUserToResellerResponse.Message"));
		transferFxUserToResellerResponse.setData(_ctx.booleanValue("TransferFxUserToResellerResponse.Data"));
		transferFxUserToResellerResponse.setSuccess(_ctx.booleanValue("TransferFxUserToResellerResponse.Success"));
	 
	 	return transferFxUserToResellerResponse;
	}
}