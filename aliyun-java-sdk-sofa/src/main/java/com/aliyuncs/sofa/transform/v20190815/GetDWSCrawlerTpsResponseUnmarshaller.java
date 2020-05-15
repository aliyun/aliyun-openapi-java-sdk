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

import com.aliyuncs.sofa.model.v20190815.GetDWSCrawlerTpsResponse;
import com.aliyuncs.sofa.model.v20190815.GetDWSCrawlerTpsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDWSCrawlerTpsResponseUnmarshaller {

	public static GetDWSCrawlerTpsResponse unmarshall(GetDWSCrawlerTpsResponse getDWSCrawlerTpsResponse, UnmarshallerContext _ctx) {
		
		getDWSCrawlerTpsResponse.setRequestId(_ctx.stringValue("GetDWSCrawlerTpsResponse.RequestId"));
		getDWSCrawlerTpsResponse.setResultCode(_ctx.stringValue("GetDWSCrawlerTpsResponse.ResultCode"));
		getDWSCrawlerTpsResponse.setResultMessage(_ctx.stringValue("GetDWSCrawlerTpsResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDWSCrawlerTpsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTimestamp(_ctx.longValue("GetDWSCrawlerTpsResponse.Data["+ i +"].Timestamp"));
			dataItem.setValue(_ctx.stringValue("GetDWSCrawlerTpsResponse.Data["+ i +"].Value"));

			data.add(dataItem);
		}
		getDWSCrawlerTpsResponse.setData(data);
	 
	 	return getDWSCrawlerTpsResponse;
	}
}