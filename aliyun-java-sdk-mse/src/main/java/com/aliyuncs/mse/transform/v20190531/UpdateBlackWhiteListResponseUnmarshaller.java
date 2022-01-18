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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.UpdateBlackWhiteListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateBlackWhiteListResponseUnmarshaller {

	public static UpdateBlackWhiteListResponse unmarshall(UpdateBlackWhiteListResponse updateBlackWhiteListResponse, UnmarshallerContext _ctx) {
		
		updateBlackWhiteListResponse.setRequestId(_ctx.stringValue("UpdateBlackWhiteListResponse.RequestId"));
		updateBlackWhiteListResponse.setHttpStatusCode(_ctx.integerValue("UpdateBlackWhiteListResponse.HttpStatusCode"));
		updateBlackWhiteListResponse.setMessage(_ctx.stringValue("UpdateBlackWhiteListResponse.Message"));
		updateBlackWhiteListResponse.setCode(_ctx.integerValue("UpdateBlackWhiteListResponse.Code"));
		updateBlackWhiteListResponse.setSuccess(_ctx.booleanValue("UpdateBlackWhiteListResponse.Success"));
		updateBlackWhiteListResponse.setData(_ctx.longValue("UpdateBlackWhiteListResponse.Data"));
	 
	 	return updateBlackWhiteListResponse;
	}
}