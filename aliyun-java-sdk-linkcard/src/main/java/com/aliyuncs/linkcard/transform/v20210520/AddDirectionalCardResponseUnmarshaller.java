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

package com.aliyuncs.linkcard.transform.v20210520;

import com.aliyuncs.linkcard.model.v20210520.AddDirectionalCardResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddDirectionalCardResponseUnmarshaller {

	public static AddDirectionalCardResponse unmarshall(AddDirectionalCardResponse addDirectionalCardResponse, UnmarshallerContext _ctx) {
		
		addDirectionalCardResponse.setRequestId(_ctx.stringValue("AddDirectionalCardResponse.RequestId"));
		addDirectionalCardResponse.setData(_ctx.stringValue("AddDirectionalCardResponse.Data"));
		addDirectionalCardResponse.setErrorMessage(_ctx.stringValue("AddDirectionalCardResponse.ErrorMessage"));
		addDirectionalCardResponse.setSuccess(_ctx.booleanValue("AddDirectionalCardResponse.Success"));
		addDirectionalCardResponse.setLocalizedMessage(_ctx.stringValue("AddDirectionalCardResponse.LocalizedMessage"));
		addDirectionalCardResponse.setCode(_ctx.stringValue("AddDirectionalCardResponse.Code"));
	 
	 	return addDirectionalCardResponse;
	}
}