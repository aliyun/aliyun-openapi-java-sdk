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

package com.aliyuncs.account_crm.transform.v20160606;

import com.aliyuncs.account_crm.model.v20160606.AuthAndRefreshLoginTicketResponse;
import com.aliyuncs.account_crm.model.v20160606.AuthAndRefreshLoginTicketResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AuthAndRefreshLoginTicketResponseUnmarshaller {

	public static AuthAndRefreshLoginTicketResponse unmarshall(AuthAndRefreshLoginTicketResponse authAndRefreshLoginTicketResponse, UnmarshallerContext _ctx) {
		
		authAndRefreshLoginTicketResponse.setRequestId(_ctx.stringValue("AuthAndRefreshLoginTicketResponse.RequestId"));
		authAndRefreshLoginTicketResponse.setCode(_ctx.stringValue("AuthAndRefreshLoginTicketResponse.Code"));
		authAndRefreshLoginTicketResponse.setMsg(_ctx.stringValue("AuthAndRefreshLoginTicketResponse.Msg"));

		Data data = new Data();
		data.setNewLoginTicket(_ctx.stringValue("AuthAndRefreshLoginTicketResponse.Data.NewLoginTicket"));
		authAndRefreshLoginTicketResponse.setData(data);
	 
	 	return authAndRefreshLoginTicketResponse;
	}
}