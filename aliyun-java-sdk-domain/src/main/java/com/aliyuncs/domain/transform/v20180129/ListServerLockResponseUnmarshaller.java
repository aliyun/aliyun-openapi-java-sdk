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

package com.aliyuncs.domain.transform.v20180129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180129.ListServerLockResponse;
import com.aliyuncs.domain.model.v20180129.ListServerLockResponse.QueryTransferInResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServerLockResponseUnmarshaller {

	public static ListServerLockResponse unmarshall(ListServerLockResponse listServerLockResponse, UnmarshallerContext _ctx) {
		
		listServerLockResponse.setRequestId(_ctx.stringValue("ListServerLockResponse.RequestId"));
		listServerLockResponse.setPrePage(_ctx.booleanValue("ListServerLockResponse.PrePage"));
		listServerLockResponse.setCurrentPageNum(_ctx.integerValue("ListServerLockResponse.CurrentPageNum"));
		listServerLockResponse.setPageSize(_ctx.integerValue("ListServerLockResponse.PageSize"));
		listServerLockResponse.setTotalPageNum(_ctx.integerValue("ListServerLockResponse.TotalPageNum"));
		listServerLockResponse.setTotalItemNum(_ctx.integerValue("ListServerLockResponse.TotalItemNum"));
		listServerLockResponse.setNextPage(_ctx.booleanValue("ListServerLockResponse.NextPage"));

		List<QueryTransferInResponse> data = new ArrayList<QueryTransferInResponse>();
		for (int i = 0; i < _ctx.lengthValue("ListServerLockResponse.Data.Length"); i++) {
			QueryTransferInResponse queryTransferInResponse = new QueryTransferInResponse();
			queryTransferInResponse.setServerLockStatus(_ctx.stringValue("ListServerLockResponse.Data["+ i +"].ServerLockStatus"));
			queryTransferInResponse.setLockInstanceId(_ctx.stringValue("ListServerLockResponse.Data["+ i +"].LockInstanceId"));
			queryTransferInResponse.setUserId(_ctx.stringValue("ListServerLockResponse.Data["+ i +"].UserId"));
			queryTransferInResponse.setGmtCreate(_ctx.stringValue("ListServerLockResponse.Data["+ i +"].GmtCreate"));
			queryTransferInResponse.setExpireDate(_ctx.stringValue("ListServerLockResponse.Data["+ i +"].ExpireDate"));
			queryTransferInResponse.setStartDate(_ctx.stringValue("ListServerLockResponse.Data["+ i +"].StartDate"));
			queryTransferInResponse.setLockProductId(_ctx.stringValue("ListServerLockResponse.Data["+ i +"].LockProductId"));
			queryTransferInResponse.setDomainInstanceId(_ctx.stringValue("ListServerLockResponse.Data["+ i +"].DomainInstanceId"));
			queryTransferInResponse.setGmtModified(_ctx.stringValue("ListServerLockResponse.Data["+ i +"].GmtModified"));
			queryTransferInResponse.setDomainName(_ctx.stringValue("ListServerLockResponse.Data["+ i +"].DomainName"));

			data.add(queryTransferInResponse);
		}
		listServerLockResponse.setData(data);
	 
	 	return listServerLockResponse;
	}
}