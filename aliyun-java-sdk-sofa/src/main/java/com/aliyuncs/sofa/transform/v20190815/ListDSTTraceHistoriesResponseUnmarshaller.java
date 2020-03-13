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

import com.aliyuncs.sofa.model.v20190815.ListDSTTraceHistoriesResponse;
import com.aliyuncs.sofa.model.v20190815.ListDSTTraceHistoriesResponse.HistoriesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDSTTraceHistoriesResponseUnmarshaller {

	public static ListDSTTraceHistoriesResponse unmarshall(ListDSTTraceHistoriesResponse listDSTTraceHistoriesResponse, UnmarshallerContext _ctx) {
		
		listDSTTraceHistoriesResponse.setRequestId(_ctx.stringValue("ListDSTTraceHistoriesResponse.RequestId"));
		listDSTTraceHistoriesResponse.setResultCode(_ctx.stringValue("ListDSTTraceHistoriesResponse.ResultCode"));
		listDSTTraceHistoriesResponse.setResultMessage(_ctx.stringValue("ListDSTTraceHistoriesResponse.ResultMessage"));

		List<HistoriesItem> histories = new ArrayList<HistoriesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDSTTraceHistoriesResponse.Histories.Length"); i++) {
			HistoriesItem historiesItem = new HistoriesItem();
			historiesItem.setCreateTime(_ctx.stringValue("ListDSTTraceHistoriesResponse.Histories["+ i +"].CreateTime"));
			historiesItem.setTraceId(_ctx.stringValue("ListDSTTraceHistoriesResponse.Histories["+ i +"].TraceId"));
			historiesItem.setUserId(_ctx.stringValue("ListDSTTraceHistoriesResponse.Histories["+ i +"].UserId"));

			histories.add(historiesItem);
		}
		listDSTTraceHistoriesResponse.setHistories(histories);
	 
	 	return listDSTTraceHistoriesResponse;
	}
}