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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryMsDrmClientsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsDrmClientsResponse.ClientInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsDrmClientsResponseUnmarshaller {

	public static QueryMsDrmClientsResponse unmarshall(QueryMsDrmClientsResponse queryMsDrmClientsResponse, UnmarshallerContext _ctx) {
		
		queryMsDrmClientsResponse.setRequestId(_ctx.stringValue("QueryMsDrmClientsResponse.RequestId"));
		queryMsDrmClientsResponse.setResultCode(_ctx.stringValue("QueryMsDrmClientsResponse.ResultCode"));
		queryMsDrmClientsResponse.setResultMessage(_ctx.stringValue("QueryMsDrmClientsResponse.ResultMessage"));
		queryMsDrmClientsResponse.setCurrentPage(_ctx.longValue("QueryMsDrmClientsResponse.CurrentPage"));
		queryMsDrmClientsResponse.setPageSize(_ctx.longValue("QueryMsDrmClientsResponse.PageSize"));
		queryMsDrmClientsResponse.setStartIndex(_ctx.longValue("QueryMsDrmClientsResponse.StartIndex"));
		queryMsDrmClientsResponse.setTotalSize(_ctx.longValue("QueryMsDrmClientsResponse.TotalSize"));

		List<ClientInfosItem> clientInfos = new ArrayList<ClientInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsDrmClientsResponse.ClientInfos.Length"); i++) {
			ClientInfosItem clientInfosItem = new ClientInfosItem();
			clientInfosItem.setIp(_ctx.stringValue("QueryMsDrmClientsResponse.ClientInfos["+ i +"].Ip"));
			clientInfosItem.setPushValue(_ctx.stringValue("QueryMsDrmClientsResponse.ClientInfos["+ i +"].PushValue"));
			clientInfosItem.setValue(_ctx.stringValue("QueryMsDrmClientsResponse.ClientInfos["+ i +"].Value"));
			clientInfosItem.setZone(_ctx.stringValue("QueryMsDrmClientsResponse.ClientInfos["+ i +"].Zone"));

			clientInfos.add(clientInfosItem);
		}
		queryMsDrmClientsResponse.setClientInfos(clientInfos);
	 
	 	return queryMsDrmClientsResponse;
	}
}