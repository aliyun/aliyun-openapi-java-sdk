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

import com.aliyuncs.account_crm.model.v20160606.AuthAndActiveWithHidResponse;
import com.aliyuncs.account_crm.model.v20160606.AuthAndActiveWithHidResponse.Data;
import com.aliyuncs.account_crm.model.v20160606.AuthAndActiveWithHidResponse.Data.AccountModel;
import com.aliyuncs.account_crm.model.v20160606.AuthAndActiveWithHidResponse.Data.SessionModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class AuthAndActiveWithHidResponseUnmarshaller {

	public static AuthAndActiveWithHidResponse unmarshall(AuthAndActiveWithHidResponse authAndActiveWithHidResponse, UnmarshallerContext _ctx) {
		
		authAndActiveWithHidResponse.setRequestId(_ctx.stringValue("AuthAndActiveWithHidResponse.RequestId"));
		authAndActiveWithHidResponse.setCode(_ctx.stringValue("AuthAndActiveWithHidResponse.Code"));
		authAndActiveWithHidResponse.setMsg(_ctx.stringValue("AuthAndActiveWithHidResponse.Msg"));

		Data data = new Data();

		AccountModel accountModel = new AccountModel();
		accountModel.setEmail(_ctx.stringValue("AuthAndActiveWithHidResponse.Data.AccountModel.Email"));
		accountModel.setMobile(_ctx.stringValue("AuthAndActiveWithHidResponse.Data.AccountModel.Mobile"));
		accountModel.setHavanaId(_ctx.longValue("AuthAndActiveWithHidResponse.Data.AccountModel.HavanaId"));
		accountModel.setCreateTime(_ctx.longValue("AuthAndActiveWithHidResponse.Data.AccountModel.CreateTime"));
		accountModel.setPK(_ctx.stringValue("AuthAndActiveWithHidResponse.Data.AccountModel.PK"));
		accountModel.setAliyunId(_ctx.stringValue("AuthAndActiveWithHidResponse.Data.AccountModel.AliyunId"));
		data.setAccountModel(accountModel);

		SessionModel sessionModel = new SessionModel();
		sessionModel.setAliyunPK(_ctx.stringValue("AuthAndActiveWithHidResponse.Data.SessionModel.AliyunPK"));
		sessionModel.setLoginTicket(_ctx.stringValue("AuthAndActiveWithHidResponse.Data.SessionModel.LoginTicket"));
		data.setSessionModel(sessionModel);
		authAndActiveWithHidResponse.setData(data);
	 
	 	return authAndActiveWithHidResponse;
	}
}