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

import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqConsumerAccumulateResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqConsumerAccumulateResponse.Data;
import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqConsumerAccumulateResponse.Data.DetailInTopicListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMqSofamqConsumerAccumulateResponseUnmarshaller {

	public static QueryMqSofamqConsumerAccumulateResponse unmarshall(QueryMqSofamqConsumerAccumulateResponse queryMqSofamqConsumerAccumulateResponse, UnmarshallerContext _ctx) {
		
		queryMqSofamqConsumerAccumulateResponse.setRequestId(_ctx.stringValue("QueryMqSofamqConsumerAccumulateResponse.RequestId"));
		queryMqSofamqConsumerAccumulateResponse.setResultCode(_ctx.stringValue("QueryMqSofamqConsumerAccumulateResponse.ResultCode"));
		queryMqSofamqConsumerAccumulateResponse.setResultMessage(_ctx.stringValue("QueryMqSofamqConsumerAccumulateResponse.ResultMessage"));

		Data data = new Data();
		data.setConsumeTps(_ctx.stringValue("QueryMqSofamqConsumerAccumulateResponse.Data.ConsumeTps"));
		data.setDelayTime(_ctx.longValue("QueryMqSofamqConsumerAccumulateResponse.Data.DelayTime"));
		data.setLastTimestamp(_ctx.longValue("QueryMqSofamqConsumerAccumulateResponse.Data.LastTimestamp"));
		data.setOnline(_ctx.booleanValue("QueryMqSofamqConsumerAccumulateResponse.Data.Online"));
		data.setTotalDiff(_ctx.longValue("QueryMqSofamqConsumerAccumulateResponse.Data.TotalDiff"));

		List<DetailInTopicListItem> detailInTopicList = new ArrayList<DetailInTopicListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMqSofamqConsumerAccumulateResponse.Data.DetailInTopicList.Length"); i++) {
			DetailInTopicListItem detailInTopicListItem = new DetailInTopicListItem();
			detailInTopicListItem.setDelayTime(_ctx.longValue("QueryMqSofamqConsumerAccumulateResponse.Data.DetailInTopicList["+ i +"].DelayTime"));
			detailInTopicListItem.setLastTimestamp(_ctx.longValue("QueryMqSofamqConsumerAccumulateResponse.Data.DetailInTopicList["+ i +"].LastTimestamp"));
			detailInTopicListItem.setTopic(_ctx.stringValue("QueryMqSofamqConsumerAccumulateResponse.Data.DetailInTopicList["+ i +"].Topic"));
			detailInTopicListItem.setTotalDiff(_ctx.longValue("QueryMqSofamqConsumerAccumulateResponse.Data.DetailInTopicList["+ i +"].TotalDiff"));

			detailInTopicList.add(detailInTopicListItem);
		}
		data.setDetailInTopicList(detailInTopicList);
		queryMqSofamqConsumerAccumulateResponse.setData(data);
	 
	 	return queryMqSofamqConsumerAccumulateResponse;
	}
}