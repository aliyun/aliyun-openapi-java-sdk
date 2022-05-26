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

import com.aliyuncs.account_crm.model.v20160606.RegisterInternalAccountForBucResponse;
import com.aliyuncs.account_crm.model.v20160606.RegisterInternalAccountForBucResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RegisterInternalAccountForBucResponseUnmarshaller {

	public static RegisterInternalAccountForBucResponse unmarshall(RegisterInternalAccountForBucResponse registerInternalAccountForBucResponse, UnmarshallerContext _ctx) {
		
		registerInternalAccountForBucResponse.setRequestId(_ctx.stringValue("RegisterInternalAccountForBucResponse.RequestId"));
		registerInternalAccountForBucResponse.setMsg(_ctx.stringValue("RegisterInternalAccountForBucResponse.Msg"));
		registerInternalAccountForBucResponse.setCode(_ctx.stringValue("RegisterInternalAccountForBucResponse.Code"));
		registerInternalAccountForBucResponse.setMessage(_ctx.stringValue("RegisterInternalAccountForBucResponse.Message"));
		registerInternalAccountForBucResponse.setLocalizedMessage(_ctx.stringValue("RegisterInternalAccountForBucResponse.LocalizedMessage"));

		Data data = new Data();
		data.setParentPk(_ctx.stringValue("RegisterInternalAccountForBucResponse.Data.ParentPk"));
		data.setPk(_ctx.stringValue("RegisterInternalAccountForBucResponse.Data.Pk"));
		data.setSite(_ctx.stringValue("RegisterInternalAccountForBucResponse.Data.Site"));
		data.setHavanaId(_ctx.stringValue("RegisterInternalAccountForBucResponse.Data.HavanaId"));
		data.setAccountStatus(_ctx.stringValue("RegisterInternalAccountForBucResponse.Data.AccountStatus"));
		data.setLastLoginTime(_ctx.stringValue("RegisterInternalAccountForBucResponse.Data.LastLoginTime"));
		data.setPartnerPk(_ctx.stringValue("RegisterInternalAccountForBucResponse.Data.PartnerPk"));
		data.setAccountStructure(_ctx.stringValue("RegisterInternalAccountForBucResponse.Data.AccountStructure"));
		data.setOwnerBid(_ctx.stringValue("RegisterInternalAccountForBucResponse.Data.OwnerBid"));
		data.setExtendInfo(_ctx.stringValue("RegisterInternalAccountForBucResponse.Data.ExtendInfo"));
		registerInternalAccountForBucResponse.setData(data);
	 
	 	return registerInternalAccountForBucResponse;
	}
}