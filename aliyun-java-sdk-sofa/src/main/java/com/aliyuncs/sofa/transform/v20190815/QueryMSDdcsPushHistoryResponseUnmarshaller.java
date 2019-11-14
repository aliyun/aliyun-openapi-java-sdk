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

import com.aliyuncs.sofa.model.v20190815.QueryMSDdcsPushHistoryResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMSDdcsPushHistoryResponse.HistoryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMSDdcsPushHistoryResponseUnmarshaller {

	public static QueryMSDdcsPushHistoryResponse unmarshall(QueryMSDdcsPushHistoryResponse queryMSDdcsPushHistoryResponse, UnmarshallerContext _ctx) {
		
		queryMSDdcsPushHistoryResponse.setRequestId(_ctx.stringValue("QueryMSDdcsPushHistoryResponse.RequestId"));

		List<HistoryItem> history = new ArrayList<HistoryItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMSDdcsPushHistoryResponse.History.Length"); i++) {
			HistoryItem historyItem = new HistoryItem();
			historyItem.setChangeType(_ctx.stringValue("QueryMSDdcsPushHistoryResponse.History["+ i +"].ChangeType"));
			historyItem.setDataId(_ctx.stringValue("QueryMSDdcsPushHistoryResponse.History["+ i +"].DataId"));
			historyItem.setEnv(_ctx.stringValue("QueryMSDdcsPushHistoryResponse.History["+ i +"].Env"));
			historyItem.setGmtEnd(_ctx.longValue("QueryMSDdcsPushHistoryResponse.History["+ i +"].GmtEnd"));
			historyItem.setGmtStart(_ctx.longValue("QueryMSDdcsPushHistoryResponse.History["+ i +"].GmtStart"));
			historyItem.setId(_ctx.longValue("QueryMSDdcsPushHistoryResponse.History["+ i +"].Id"));
			historyItem.setInfluenceApp(_ctx.stringValue("QueryMSDdcsPushHistoryResponse.History["+ i +"].InfluenceApp"));
			historyItem.setOperator(_ctx.stringValue("QueryMSDdcsPushHistoryResponse.History["+ i +"].Operator"));
			historyItem.setPlatform(_ctx.stringValue("QueryMSDdcsPushHistoryResponse.History["+ i +"].Platform"));
			historyItem.setPushResult(_ctx.stringValue("QueryMSDdcsPushHistoryResponse.History["+ i +"].PushResult"));
			historyItem.setPushType(_ctx.stringValue("QueryMSDdcsPushHistoryResponse.History["+ i +"].PushType"));
			historyItem.setTarget(_ctx.stringValue("QueryMSDdcsPushHistoryResponse.History["+ i +"].Target"));
			historyItem.setTitle(_ctx.stringValue("QueryMSDdcsPushHistoryResponse.History["+ i +"].Title"));
			historyItem.setValue(_ctx.stringValue("QueryMSDdcsPushHistoryResponse.History["+ i +"].Value"));

			history.add(historyItem);
		}
		queryMSDdcsPushHistoryResponse.setHistory(history);
	 
	 	return queryMSDdcsPushHistoryResponse;
	}
}