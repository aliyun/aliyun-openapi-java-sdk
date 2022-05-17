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

import com.aliyuncs.retailbot.model.v20210224.ListSyncMessagesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSyncMessagesResponseUnmarshaller {

	public static ListSyncMessagesResponse unmarshall(ListSyncMessagesResponse listSyncMessagesResponse, UnmarshallerContext _ctx) {
		
		listSyncMessagesResponse.setRequestId(_ctx.stringValue("ListSyncMessagesResponse.RequestId"));
		listSyncMessagesResponse.setSuccess(_ctx.booleanValue("ListSyncMessagesResponse.Success"));
		listSyncMessagesResponse.setCode(_ctx.stringValue("ListSyncMessagesResponse.Code"));
		listSyncMessagesResponse.setMessage(_ctx.stringValue("ListSyncMessagesResponse.Message"));
	 
	 	return listSyncMessagesResponse;
	}
}