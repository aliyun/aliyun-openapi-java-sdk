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

package com.aliyuncs.commondriver.transform.v20160712;

import com.aliyuncs.commondriver.model.v20160712.PutInstanceIdsToTokenResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PutInstanceIdsToTokenResponseUnmarshaller {

	public static PutInstanceIdsToTokenResponse unmarshall(PutInstanceIdsToTokenResponse putInstanceIdsToTokenResponse, UnmarshallerContext _ctx) {
		
		putInstanceIdsToTokenResponse.setRequestId(_ctx.stringValue("PutInstanceIdsToTokenResponse.RequestId"));
		putInstanceIdsToTokenResponse.setMessage(_ctx.stringValue("PutInstanceIdsToTokenResponse.Message"));
		putInstanceIdsToTokenResponse.setData(_ctx.stringValue("PutInstanceIdsToTokenResponse.Data"));
		putInstanceIdsToTokenResponse.setI18nKey(_ctx.stringValue("PutInstanceIdsToTokenResponse.I18nKey"));
		putInstanceIdsToTokenResponse.setCode(_ctx.stringValue("PutInstanceIdsToTokenResponse.Code"));
		putInstanceIdsToTokenResponse.setSuccess(_ctx.booleanValue("PutInstanceIdsToTokenResponse.Success"));
	 
	 	return putInstanceIdsToTokenResponse;
	}
}