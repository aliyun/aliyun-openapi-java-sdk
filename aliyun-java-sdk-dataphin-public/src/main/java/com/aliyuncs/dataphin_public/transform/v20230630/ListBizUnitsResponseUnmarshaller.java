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

import com.aliyuncs.dataphin_public.model.v20230630.ListBizUnitsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListBizUnitsResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.ListBizUnitsResponse.Data.BizUnitInfo;
import com.aliyuncs.dataphin_public.model.v20230630.ListBizUnitsResponse.Data.BizUnitInfo.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBizUnitsResponseUnmarshaller {

	public static ListBizUnitsResponse unmarshall(ListBizUnitsResponse listBizUnitsResponse, UnmarshallerContext _ctx) {
		
		listBizUnitsResponse.setRequestId(_ctx.stringValue("ListBizUnitsResponse.RequestId"));
		listBizUnitsResponse.setSuccess(_ctx.booleanValue("ListBizUnitsResponse.Success"));
		listBizUnitsResponse.setHttpStatusCode(_ctx.integerValue("ListBizUnitsResponse.HttpStatusCode"));
		listBizUnitsResponse.setCode(_ctx.stringValue("ListBizUnitsResponse.Code"));
		listBizUnitsResponse.setMessage(_ctx.stringValue("ListBizUnitsResponse.Message"));

		Data data = new Data();

		List<BizUnitInfo> bizUnitList = new ArrayList<BizUnitInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListBizUnitsResponse.Data.BizUnitList.Length"); i++) {
			BizUnitInfo bizUnitInfo = new BizUnitInfo();
			bizUnitInfo.setId(_ctx.longValue("ListBizUnitsResponse.Data.BizUnitList["+ i +"].Id"));
			bizUnitInfo.setName(_ctx.stringValue("ListBizUnitsResponse.Data.BizUnitList["+ i +"].Name"));
			bizUnitInfo.setDisplayName(_ctx.stringValue("ListBizUnitsResponse.Data.BizUnitList["+ i +"].DisplayName"));
			bizUnitInfo.setDescription(_ctx.stringValue("ListBizUnitsResponse.Data.BizUnitList["+ i +"].Description"));
			bizUnitInfo.setOwnerUserId(_ctx.stringValue("ListBizUnitsResponse.Data.BizUnitList["+ i +"].OwnerUserId"));
			bizUnitInfo.setOwnerName(_ctx.stringValue("ListBizUnitsResponse.Data.BizUnitList["+ i +"].OwnerName"));
			bizUnitInfo.setGmtCreate(_ctx.stringValue("ListBizUnitsResponse.Data.BizUnitList["+ i +"].GmtCreate"));
			bizUnitInfo.setGmtModified(_ctx.stringValue("ListBizUnitsResponse.Data.BizUnitList["+ i +"].GmtModified"));
			bizUnitInfo.setLastModifier(_ctx.stringValue("ListBizUnitsResponse.Data.BizUnitList["+ i +"].LastModifier"));
			bizUnitInfo.setLastModifierName(_ctx.stringValue("ListBizUnitsResponse.Data.BizUnitList["+ i +"].LastModifierName"));
			bizUnitInfo.setIcon(_ctx.stringValue("ListBizUnitsResponse.Data.BizUnitList["+ i +"].Icon"));
			bizUnitInfo.setEnv(_ctx.stringValue("ListBizUnitsResponse.Data.BizUnitList["+ i +"].Env"));
			bizUnitInfo.setMode(_ctx.stringValue("ListBizUnitsResponse.Data.BizUnitList["+ i +"].Mode"));

			List<User> accountList = new ArrayList<User>();
			for (int j = 0; j < _ctx.lengthValue("ListBizUnitsResponse.Data.BizUnitList["+ i +"].AccountList.Length"); j++) {
				User user = new User();
				user.setId(_ctx.stringValue("ListBizUnitsResponse.Data.BizUnitList["+ i +"].AccountList["+ j +"].Id"));

				accountList.add(user);
			}
			bizUnitInfo.setAccountList(accountList);

			bizUnitList.add(bizUnitInfo);
		}
		data.setBizUnitList(bizUnitList);
		listBizUnitsResponse.setData(data);
	 
	 	return listBizUnitsResponse;
	}
}