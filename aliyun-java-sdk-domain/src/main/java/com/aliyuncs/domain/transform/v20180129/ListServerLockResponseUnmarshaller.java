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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServerLockResponseUnmarshaller {

	public static ListServerLockResponse unmarshall(ListServerLockResponse listServerLockResponse, UnmarshallerContext context) {
		
		listServerLockResponse.setRequestId(context.stringValue("ListServerLockResponse.RequestId"));
		listServerLockResponse.setTotalItemNum(context.integerValue("ListServerLockResponse.TotalItemNum"));
		listServerLockResponse.setCurrentPageNum(context.integerValue("ListServerLockResponse.CurrentPageNum"));
		listServerLockResponse.setTotalPageNum(context.integerValue("ListServerLockResponse.TotalPageNum"));
		listServerLockResponse.setPageSize(context.integerValue("ListServerLockResponse.PageSize"));
		listServerLockResponse.setPrePage(context.booleanValue("ListServerLockResponse.PrePage"));
		listServerLockResponse.setNextPage(context.booleanValue("ListServerLockResponse.NextPage"));

		List<QueryTransferInResponse> data = new ArrayList<QueryTransferInResponse>();
		for (int i = 0; i < context.lengthValue("ListServerLockResponse.Data.Length"); i++) {
			QueryTransferInResponse queryTransferInResponse = new QueryTransferInResponse();
			queryTransferInResponse.setGmtCreate(context.stringValue("ListServerLockResponse.Data["+ i +"].GmtCreate"));
			queryTransferInResponse.setGmtModified(context.stringValue("ListServerLockResponse.Data["+ i +"].GmtModified"));
			queryTransferInResponse.setUserId(context.stringValue("ListServerLockResponse.Data["+ i +"].UserId"));
			queryTransferInResponse.setDomainName(context.stringValue("ListServerLockResponse.Data["+ i +"].DomainName"));
			queryTransferInResponse.setDomainInstanceId(context.stringValue("ListServerLockResponse.Data["+ i +"].DomainInstanceId"));
			queryTransferInResponse.setLockProductId(context.stringValue("ListServerLockResponse.Data["+ i +"].LockProductId"));
			queryTransferInResponse.setStartDate(context.stringValue("ListServerLockResponse.Data["+ i +"].StartDate"));
			queryTransferInResponse.setExpireDate(context.stringValue("ListServerLockResponse.Data["+ i +"].ExpireDate"));
			queryTransferInResponse.setLockInstanceId(context.stringValue("ListServerLockResponse.Data["+ i +"].LockInstanceId"));
			queryTransferInResponse.setServerLockStatus(context.stringValue("ListServerLockResponse.Data["+ i +"].ServerLockStatus"));

			data.add(queryTransferInResponse);
		}
		listServerLockResponse.setData(data);
	 
	 	return listServerLockResponse;
	}
}