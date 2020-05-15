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

import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqMessageTraceResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqMessageTraceResponse.Data;
import com.aliyuncs.sofa.model.v20190815.QueryMqSofamqMessageTraceResponse.Data.TrackListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMqSofamqMessageTraceResponseUnmarshaller {

	public static QueryMqSofamqMessageTraceResponse unmarshall(QueryMqSofamqMessageTraceResponse queryMqSofamqMessageTraceResponse, UnmarshallerContext _ctx) {
		
		queryMqSofamqMessageTraceResponse.setRequestId(_ctx.stringValue("QueryMqSofamqMessageTraceResponse.RequestId"));
		queryMqSofamqMessageTraceResponse.setResultCode(_ctx.stringValue("QueryMqSofamqMessageTraceResponse.ResultCode"));
		queryMqSofamqMessageTraceResponse.setResultMessage(_ctx.stringValue("QueryMqSofamqMessageTraceResponse.ResultMessage"));

		Data data = new Data();

		List<TrackListItem> trackList = new ArrayList<TrackListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMqSofamqMessageTraceResponse.Data.TrackList.Length"); i++) {
			TrackListItem trackListItem = new TrackListItem();
			trackListItem.setConsumerGroup(_ctx.stringValue("QueryMqSofamqMessageTraceResponse.Data.TrackList["+ i +"].ConsumerGroup"));
			trackListItem.setInstanceId(_ctx.stringValue("QueryMqSofamqMessageTraceResponse.Data.TrackList["+ i +"].InstanceId"));
			trackListItem.setTrackType(_ctx.stringValue("QueryMqSofamqMessageTraceResponse.Data.TrackList["+ i +"].TrackType"));

			trackList.add(trackListItem);
		}
		data.setTrackList(trackList);
		queryMqSofamqMessageTraceResponse.setData(data);
	 
	 	return queryMqSofamqMessageTraceResponse;
	}
}