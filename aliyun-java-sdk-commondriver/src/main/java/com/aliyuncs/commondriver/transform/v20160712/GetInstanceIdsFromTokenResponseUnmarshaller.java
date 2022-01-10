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

import com.aliyuncs.commondriver.model.v20160712.GetInstanceIdsFromTokenResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceIdsFromTokenResponseUnmarshaller {

	public static GetInstanceIdsFromTokenResponse unmarshall(GetInstanceIdsFromTokenResponse getInstanceIdsFromTokenResponse, UnmarshallerContext _ctx) {
		
		getInstanceIdsFromTokenResponse.setRequestId(_ctx.stringValue("GetInstanceIdsFromTokenResponse.RequestId"));
		getInstanceIdsFromTokenResponse.setMessage(_ctx.stringValue("GetInstanceIdsFromTokenResponse.Message"));
		getInstanceIdsFromTokenResponse.setData(_ctx.stringValue("GetInstanceIdsFromTokenResponse.Data"));
		getInstanceIdsFromTokenResponse.setI18nKey(_ctx.stringValue("GetInstanceIdsFromTokenResponse.I18nKey"));
		getInstanceIdsFromTokenResponse.setCode(_ctx.stringValue("GetInstanceIdsFromTokenResponse.Code"));
		getInstanceIdsFromTokenResponse.setSuccess(_ctx.booleanValue("GetInstanceIdsFromTokenResponse.Success"));
	 
	 	return getInstanceIdsFromTokenResponse;
	}
}