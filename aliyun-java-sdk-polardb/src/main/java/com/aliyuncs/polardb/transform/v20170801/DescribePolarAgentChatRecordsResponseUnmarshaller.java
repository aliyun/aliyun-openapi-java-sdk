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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribePolarAgentChatRecordsResponse;
import com.aliyuncs.polardb.model.v20170801.DescribePolarAgentChatRecordsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePolarAgentChatRecordsResponseUnmarshaller {

	public static DescribePolarAgentChatRecordsResponse unmarshall(DescribePolarAgentChatRecordsResponse describePolarAgentChatRecordsResponse, UnmarshallerContext _ctx) {
		
		describePolarAgentChatRecordsResponse.setRequestId(_ctx.stringValue("DescribePolarAgentChatRecordsResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePolarAgentChatRecordsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSessionId(_ctx.stringValue("DescribePolarAgentChatRecordsResponse.Data["+ i +"].SessionId"));
			dataItem.setQueryId(_ctx.stringValue("DescribePolarAgentChatRecordsResponse.Data["+ i +"].QueryId"));
			dataItem.setQuery(_ctx.stringValue("DescribePolarAgentChatRecordsResponse.Data["+ i +"].Query"));
			dataItem.setAnswer(_ctx.stringValue("DescribePolarAgentChatRecordsResponse.Data["+ i +"].Answer"));
			dataItem.setFeedbackType(_ctx.stringValue("DescribePolarAgentChatRecordsResponse.Data["+ i +"].FeedbackType"));

			data.add(dataItem);
		}
		describePolarAgentChatRecordsResponse.setData(data);
	 
	 	return describePolarAgentChatRecordsResponse;
	}
}