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

package com.aliyuncs.dysmsapi.transform.v20170525;

import com.aliyuncs.dysmsapi.model.v20170525.DeleteSmsSignResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteSmsSignResponseUnmarshaller {

	public static DeleteSmsSignResponse unmarshall(DeleteSmsSignResponse deleteSmsSignResponse, UnmarshallerContext _ctx) {
		
		deleteSmsSignResponse.setRequestId(_ctx.stringValue("DeleteSmsSignResponse.RequestId"));
		deleteSmsSignResponse.setSignName(_ctx.stringValue("DeleteSmsSignResponse.SignName"));
		deleteSmsSignResponse.setCode(_ctx.stringValue("DeleteSmsSignResponse.Code"));
		deleteSmsSignResponse.setMessage(_ctx.stringValue("DeleteSmsSignResponse.Message"));
	 
	 	return deleteSmsSignResponse;
	}
}