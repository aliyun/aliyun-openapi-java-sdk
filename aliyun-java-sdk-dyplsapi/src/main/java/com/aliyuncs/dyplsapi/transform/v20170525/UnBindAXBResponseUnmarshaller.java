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

import com.aliyuncs.dyplsapi.model.v20170525.UnBindAXBResponse;
import com.aliyuncs.dyplsapi.model.v20170525.UnBindAXBResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnBindAXBResponseUnmarshaller {

	public static UnBindAXBResponse unmarshall(UnBindAXBResponse unBindAXBResponse, UnmarshallerContext _ctx) {
		
		unBindAXBResponse.setRequestId(_ctx.stringValue("UnBindAXBResponse.RequestId"));
		unBindAXBResponse.setAccessDeniedDetail(_ctx.stringValue("UnBindAXBResponse.AccessDeniedDetail"));
		unBindAXBResponse.setMessage(_ctx.stringValue("UnBindAXBResponse.Message"));
		unBindAXBResponse.setCode(_ctx.stringValue("UnBindAXBResponse.Code"));
		unBindAXBResponse.setSuccess(_ctx.booleanValue("UnBindAXBResponse.Success"));

		Data data = new Data();
		data.setMessage(_ctx.stringValue("UnBindAXBResponse.Data.Message"));
		data.setCode(_ctx.stringValue("UnBindAXBResponse.Data.Code"));
		data.setSuccess(_ctx.booleanValue("UnBindAXBResponse.Data.Success"));
		unBindAXBResponse.setData(data);
	 
	 	return unBindAXBResponse;
	}
}