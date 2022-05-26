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

import com.aliyuncs.account_crm.model.v20160606.GetAgAccountAkResponse;
import com.aliyuncs.account_crm.model.v20160606.GetAgAccountAkResponse.AccountAkDto;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAgAccountAkResponseUnmarshaller {

	public static GetAgAccountAkResponse unmarshall(GetAgAccountAkResponse getAgAccountAkResponse, UnmarshallerContext _ctx) {
		
		getAgAccountAkResponse.setRequestId(_ctx.stringValue("GetAgAccountAkResponse.RequestId"));
		getAgAccountAkResponse.setCode(_ctx.stringValue("GetAgAccountAkResponse.Code"));
		getAgAccountAkResponse.setMessage(_ctx.stringValue("GetAgAccountAkResponse.Message"));
		getAgAccountAkResponse.setSuccess(_ctx.stringValue("GetAgAccountAkResponse.Success"));

		AccountAkDto accountAkDto = new AccountAkDto();
		accountAkDto.setAk(_ctx.stringValue("GetAgAccountAkResponse.AccountAkDto.Ak"));
		accountAkDto.setSecret(_ctx.stringValue("GetAgAccountAkResponse.AccountAkDto.Secret"));
		getAgAccountAkResponse.setAccountAkDto(accountAkDto);
	 
	 	return getAgAccountAkResponse;
	}
}