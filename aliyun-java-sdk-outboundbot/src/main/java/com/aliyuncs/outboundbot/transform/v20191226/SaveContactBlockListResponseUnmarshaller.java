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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.SaveContactBlockListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveContactBlockListResponseUnmarshaller {

	public static SaveContactBlockListResponse unmarshall(SaveContactBlockListResponse saveContactBlockListResponse, UnmarshallerContext _ctx) {
		
		saveContactBlockListResponse.setRequestId(_ctx.stringValue("SaveContactBlockListResponse.RequestId"));
		saveContactBlockListResponse.setSuccess(_ctx.booleanValue("SaveContactBlockListResponse.Success"));
		saveContactBlockListResponse.setCode(_ctx.stringValue("SaveContactBlockListResponse.Code"));
		saveContactBlockListResponse.setMessage(_ctx.stringValue("SaveContactBlockListResponse.Message"));
		saveContactBlockListResponse.setHttpStatusCode(_ctx.integerValue("SaveContactBlockListResponse.HttpStatusCode"));
		saveContactBlockListResponse.setAffectedRows(_ctx.integerValue("SaveContactBlockListResponse.AffectedRows"));
	 
	 	return saveContactBlockListResponse;
	}
}