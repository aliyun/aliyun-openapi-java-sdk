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

package com.aliyuncs.retailbot.transform.v20210224;

import com.aliyuncs.retailbot.model.v20210224.UpdateBlackEntryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateBlackEntryResponseUnmarshaller {

	public static UpdateBlackEntryResponse unmarshall(UpdateBlackEntryResponse updateBlackEntryResponse, UnmarshallerContext _ctx) {
		
		updateBlackEntryResponse.setRequestId(_ctx.stringValue("UpdateBlackEntryResponse.RequestId"));
		updateBlackEntryResponse.setData(_ctx.integerValue("UpdateBlackEntryResponse.Data"));
		updateBlackEntryResponse.setSuccess(_ctx.booleanValue("UpdateBlackEntryResponse.Success"));
		updateBlackEntryResponse.setCode(_ctx.stringValue("UpdateBlackEntryResponse.Code"));
		updateBlackEntryResponse.setMessage(_ctx.stringValue("UpdateBlackEntryResponse.Message"));
		updateBlackEntryResponse.setHttpStatusCode(_ctx.integerValue("UpdateBlackEntryResponse.HttpStatusCode"));
	 
	 	return updateBlackEntryResponse;
	}
}