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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetBizUnitInfoResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetBizUnitInfoResponse.BizUnitInfo;
import com.aliyuncs.dataphin_public.model.v20230630.GetBizUnitInfoResponse.BizUnitInfo.EnvName;
import com.aliyuncs.dataphin_public.model.v20230630.GetBizUnitInfoResponse.BizUnitInfo.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBizUnitInfoResponseUnmarshaller {

	public static GetBizUnitInfoResponse unmarshall(GetBizUnitInfoResponse getBizUnitInfoResponse, UnmarshallerContext _ctx) {
		
		getBizUnitInfoResponse.setRequestId(_ctx.stringValue("GetBizUnitInfoResponse.RequestId"));
		getBizUnitInfoResponse.setSuccess(_ctx.booleanValue("GetBizUnitInfoResponse.Success"));
		getBizUnitInfoResponse.setHttpStatusCode(_ctx.integerValue("GetBizUnitInfoResponse.HttpStatusCode"));
		getBizUnitInfoResponse.setCode(_ctx.stringValue("GetBizUnitInfoResponse.Code"));
		getBizUnitInfoResponse.setMessage(_ctx.stringValue("GetBizUnitInfoResponse.Message"));

		BizUnitInfo bizUnitInfo = new BizUnitInfo();
		bizUnitInfo.setId(_ctx.longValue("GetBizUnitInfoResponse.BizUnitInfo.Id"));
		bizUnitInfo.setName(_ctx.stringValue("GetBizUnitInfoResponse.BizUnitInfo.Name"));
		bizUnitInfo.setDisplayName(_ctx.stringValue("GetBizUnitInfoResponse.BizUnitInfo.DisplayName"));
		bizUnitInfo.setDescription(_ctx.stringValue("GetBizUnitInfoResponse.BizUnitInfo.Description"));
		bizUnitInfo.setOwnerUserId(_ctx.stringValue("GetBizUnitInfoResponse.BizUnitInfo.OwnerUserId"));
		bizUnitInfo.setOwnerName(_ctx.stringValue("GetBizUnitInfoResponse.BizUnitInfo.OwnerName"));
		bizUnitInfo.setGmtCreate(_ctx.stringValue("GetBizUnitInfoResponse.BizUnitInfo.GmtCreate"));
		bizUnitInfo.setGmtModified(_ctx.stringValue("GetBizUnitInfoResponse.BizUnitInfo.GmtModified"));
		bizUnitInfo.setLastModifier(_ctx.stringValue("GetBizUnitInfoResponse.BizUnitInfo.LastModifier"));
		bizUnitInfo.setLastModifierName(_ctx.stringValue("GetBizUnitInfoResponse.BizUnitInfo.LastModifierName"));
		bizUnitInfo.setIcon(_ctx.stringValue("GetBizUnitInfoResponse.BizUnitInfo.Icon"));
		bizUnitInfo.setMode(_ctx.stringValue("GetBizUnitInfoResponse.BizUnitInfo.Mode"));
		bizUnitInfo.setDataDomainCount(_ctx.integerValue("GetBizUnitInfoResponse.BizUnitInfo.DataDomainCount"));
		bizUnitInfo.setBizObjectCount(_ctx.integerValue("GetBizUnitInfoResponse.BizUnitInfo.BizObjectCount"));
		bizUnitInfo.setBizProcessCount(_ctx.integerValue("GetBizUnitInfoResponse.BizUnitInfo.BizProcessCount"));

		List<EnvName> envList = new ArrayList<EnvName>();
		for (int i = 0; i < _ctx.lengthValue("GetBizUnitInfoResponse.BizUnitInfo.EnvList.Length"); i++) {
			EnvName envName = new EnvName();
			envName.setEnvName(_ctx.stringValue("GetBizUnitInfoResponse.BizUnitInfo.EnvList["+ i +"].EnvName"));
			envName.setName(_ctx.stringValue("GetBizUnitInfoResponse.BizUnitInfo.EnvList["+ i +"].Name"));
			envName.setDisplayName(_ctx.stringValue("GetBizUnitInfoResponse.BizUnitInfo.EnvList["+ i +"].DisplayName"));

			envList.add(envName);
		}
		bizUnitInfo.setEnvList(envList);

		List<User> accountList = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("GetBizUnitInfoResponse.BizUnitInfo.AccountList.Length"); i++) {
			User user = new User();
			user.setId(_ctx.stringValue("GetBizUnitInfoResponse.BizUnitInfo.AccountList["+ i +"].Id"));

			accountList.add(user);
		}
		bizUnitInfo.setAccountList(accountList);

		List<User> businessLeaderList = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("GetBizUnitInfoResponse.BizUnitInfo.BusinessLeaderList.Length"); i++) {
			User user1 = new User();
			user1.setId(_ctx.stringValue("GetBizUnitInfoResponse.BizUnitInfo.BusinessLeaderList["+ i +"].Id"));

			businessLeaderList.add(user1);
		}
		bizUnitInfo.setBusinessLeaderList(businessLeaderList);

		List<User> dataLeaderList = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("GetBizUnitInfoResponse.BizUnitInfo.DataLeaderList.Length"); i++) {
			User user2 = new User();
			user2.setId(_ctx.stringValue("GetBizUnitInfoResponse.BizUnitInfo.DataLeaderList["+ i +"].Id"));

			dataLeaderList.add(user2);
		}
		bizUnitInfo.setDataLeaderList(dataLeaderList);
		getBizUnitInfoResponse.setBizUnitInfo(bizUnitInfo);
	 
	 	return getBizUnitInfoResponse;
	}
}