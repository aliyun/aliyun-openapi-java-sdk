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

package com.aliyuncs.dyplsapi.transform.v20170525;

import com.aliyuncs.dyplsapi.model.v20170525.UnBindXBResponse;
import com.aliyuncs.dyplsapi.model.v20170525.UnBindXBResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnBindXBResponseUnmarshaller {

	public static UnBindXBResponse unmarshall(UnBindXBResponse unBindXBResponse, UnmarshallerContext _ctx) {
		
		unBindXBResponse.setRequestId(_ctx.stringValue("UnBindXBResponse.RequestId"));
		unBindXBResponse.setAccessDeniedDetail(_ctx.stringValue("UnBindXBResponse.AccessDeniedDetail"));
		unBindXBResponse.setMessage(_ctx.stringValue("UnBindXBResponse.Message"));
		unBindXBResponse.setCode(_ctx.stringValue("UnBindXBResponse.Code"));
		unBindXBResponse.setSuccess(_ctx.booleanValue("UnBindXBResponse.Success"));

		Data data = new Data();
		data.setMessage(_ctx.stringValue("UnBindXBResponse.Data.Message"));
		data.setCode(_ctx.stringValue("UnBindXBResponse.Data.Code"));
		data.setSuccess(_ctx.booleanValue("UnBindXBResponse.Data.Success"));
		unBindXBResponse.setData(data);
	 
	 	return unBindXBResponse;
	}
}