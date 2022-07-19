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

import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqConsumerConnectionResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqConsumerConnectionResponse.Data;
import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqConsumerConnectionResponse.Data.ConnectionListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMqSofamqConsumerConnectionResponseUnmarshaller {

	public static QueryMqSofamqConsumerConnectionResponse unmarshall(QueryMqSofamqConsumerConnectionResponse queryMqSofamqConsumerConnectionResponse, UnmarshallerContext _ctx) {
		
		queryMqSofamqConsumerConnectionResponse.setRequestId(_ctx.stringValue("QueryMqSofamqConsumerConnectionResponse.RequestId"));
		queryMqSofamqConsumerConnectionResponse.setResultMessage(_ctx.stringValue("QueryMqSofamqConsumerConnectionResponse.ResultMessage"));
		queryMqSofamqConsumerConnectionResponse.setResultCode(_ctx.stringValue("QueryMqSofamqConsumerConnectionResponse.ResultCode"));

		Data data = new Data();

		List<ConnectionListItem> connectionList = new ArrayList<ConnectionListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMqSofamqConsumerConnectionResponse.Data.ConnectionList.Length"); i++) {
			ConnectionListItem connectionListItem = new ConnectionListItem();
			connectionListItem.setRemoteIp(_ctx.stringValue("QueryMqSofamqConsumerConnectionResponse.Data.ConnectionList["+ i +"].RemoteIp"));
			connectionListItem.setClientAddr(_ctx.stringValue("QueryMqSofamqConsumerConnectionResponse.Data.ConnectionList["+ i +"].ClientAddr"));
			connectionListItem.setVersion(_ctx.stringValue("QueryMqSofamqConsumerConnectionResponse.Data.ConnectionList["+ i +"].Version"));
			connectionListItem.setLanguage(_ctx.stringValue("QueryMqSofamqConsumerConnectionResponse.Data.ConnectionList["+ i +"].Language"));
			connectionListItem.setClientId(_ctx.stringValue("QueryMqSofamqConsumerConnectionResponse.Data.ConnectionList["+ i +"].ClientId"));

			connectionList.add(connectionListItem);
		}
		data.setConnectionList(connectionList);
		queryMqSofamqConsumerConnectionResponse.setData(data);
	 
	 	return queryMqSofamqConsumerConnectionResponse;
	}
}