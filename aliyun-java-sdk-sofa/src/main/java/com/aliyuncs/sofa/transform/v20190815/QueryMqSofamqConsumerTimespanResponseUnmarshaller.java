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

import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqConsumerTimespanResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqConsumerTimespanResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMqSofamqConsumerTimespanResponseUnmarshaller {

	public static QueryMqSofamqConsumerTimespanResponse unmarshall(QueryMqSofamqConsumerTimespanResponse queryMqSofamqConsumerTimespanResponse, UnmarshallerContext _ctx) {
		
		queryMqSofamqConsumerTimespanResponse.setRequestId(_ctx.stringValue("QueryMqSofamqConsumerTimespanResponse.RequestId"));
		queryMqSofamqConsumerTimespanResponse.setResultCode(_ctx.stringValue("QueryMqSofamqConsumerTimespanResponse.ResultCode"));
		queryMqSofamqConsumerTimespanResponse.setResultMessage(_ctx.stringValue("QueryMqSofamqConsumerTimespanResponse.ResultMessage"));

		Data data = new Data();
		data.setConsumeTimestamp(_ctx.longValue("QueryMqSofamqConsumerTimespanResponse.Data.ConsumeTimestamp"));
		data.setInstanceId(_ctx.stringValue("QueryMqSofamqConsumerTimespanResponse.Data.InstanceId"));
		data.setMaxTimestamp(_ctx.longValue("QueryMqSofamqConsumerTimespanResponse.Data.MaxTimestamp"));
		data.setMinTimestamp(_ctx.longValue("QueryMqSofamqConsumerTimespanResponse.Data.MinTimestamp"));
		data.setTopic(_ctx.stringValue("QueryMqSofamqConsumerTimespanResponse.Data.Topic"));
		queryMqSofamqConsumerTimespanResponse.setData(data);
	 
	 	return queryMqSofamqConsumerTimespanResponse;
	}
}