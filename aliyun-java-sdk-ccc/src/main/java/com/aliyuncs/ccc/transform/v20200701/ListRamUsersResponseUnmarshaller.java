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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListRamUsersResponse;
import com.aliyuncs.ccc.model.v20200701.ListRamUsersResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListRamUsersResponse.Data.RamUser;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRamUsersResponseUnmarshaller {

	public static ListRamUsersResponse unmarshall(ListRamUsersResponse listRamUsersResponse, UnmarshallerContext _ctx) {
		
		listRamUsersResponse.setRequestId(_ctx.stringValue("ListRamUsersResponse.RequestId"));
		listRamUsersResponse.setCode(_ctx.stringValue("ListRamUsersResponse.Code"));
		listRamUsersResponse.setHttpStatusCode(_ctx.integerValue("ListRamUsersResponse.HttpStatusCode"));
		listRamUsersResponse.setMessage(_ctx.stringValue("ListRamUsersResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListRamUsersResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("ListRamUsersResponse.Params["+ i +"]"));
		}
		listRamUsersResponse.setParams(params);

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListRamUsersResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListRamUsersResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListRamUsersResponse.Data.TotalCount"));

		List<RamUser> list = new ArrayList<RamUser>();
		for (int i = 0; i < _ctx.lengthValue("ListRamUsersResponse.Data.List.Length"); i++) {
			RamUser ramUser = new RamUser();
			ramUser.setAliyunUid(_ctx.longValue("ListRamUsersResponse.Data.List["+ i +"].AliyunUid"));
			ramUser.setDisplayName(_ctx.stringValue("ListRamUsersResponse.Data.List["+ i +"].DisplayName"));
			ramUser.setEmail(_ctx.stringValue("ListRamUsersResponse.Data.List["+ i +"].Email"));
			ramUser.setLoginName(_ctx.stringValue("ListRamUsersResponse.Data.List["+ i +"].LoginName"));
			ramUser.setMobile(_ctx.stringValue("ListRamUsersResponse.Data.List["+ i +"].Mobile"));
			ramUser.setPrimary(_ctx.booleanValue("ListRamUsersResponse.Data.List["+ i +"].Primary"));
			ramUser.setRamId(_ctx.stringValue("ListRamUsersResponse.Data.List["+ i +"].RamId"));

			list.add(ramUser);
		}
		data.setList(list);
		listRamUsersResponse.setData(data);
	 
	 	return listRamUsersResponse;
	}
}