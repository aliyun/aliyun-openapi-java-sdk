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

import com.aliyuncs.account_crm.model.v20160606.QuerySecurityInfoResponse;
import com.aliyuncs.account_crm.model.v20160606.QuerySecurityInfoResponse.AccountSecurityInfoDto;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySecurityInfoResponseUnmarshaller {

	public static QuerySecurityInfoResponse unmarshall(QuerySecurityInfoResponse querySecurityInfoResponse, UnmarshallerContext _ctx) {
		
		querySecurityInfoResponse.setRequestId(_ctx.stringValue("QuerySecurityInfoResponse.RequestId"));
		querySecurityInfoResponse.setCode(_ctx.stringValue("QuerySecurityInfoResponse.Code"));
		querySecurityInfoResponse.setMessage(_ctx.stringValue("QuerySecurityInfoResponse.Message"));
		querySecurityInfoResponse.setSuccess(_ctx.booleanValue("QuerySecurityInfoResponse.Success"));

		AccountSecurityInfoDto accountSecurityInfoDto = new AccountSecurityInfoDto();
		accountSecurityInfoDto.setPk(_ctx.stringValue("QuerySecurityInfoResponse.AccountSecurityInfoDto.Pk"));
		accountSecurityInfoDto.setSecurityEmail(_ctx.stringValue("QuerySecurityInfoResponse.AccountSecurityInfoDto.SecurityEmail"));
		accountSecurityInfoDto.setSecurityMobile(_ctx.stringValue("QuerySecurityInfoResponse.AccountSecurityInfoDto.SecurityMobile"));
		accountSecurityInfoDto.setProfileType(_ctx.stringValue("QuerySecurityInfoResponse.AccountSecurityInfoDto.ProfileType"));
		accountSecurityInfoDto.setName(_ctx.stringValue("QuerySecurityInfoResponse.AccountSecurityInfoDto.Name"));
		accountSecurityInfoDto.setAliyunId(_ctx.stringValue("QuerySecurityInfoResponse.AccountSecurityInfoDto.AliyunId"));
		accountSecurityInfoDto.setNationalityCode(_ctx.stringValue("QuerySecurityInfoResponse.AccountSecurityInfoDto.NationalityCode"));
		querySecurityInfoResponse.setAccountSecurityInfoDto(accountSecurityInfoDto);
	 
	 	return querySecurityInfoResponse;
	}
}