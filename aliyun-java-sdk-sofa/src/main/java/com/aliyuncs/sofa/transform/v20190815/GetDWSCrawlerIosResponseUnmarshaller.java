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

import com.aliyuncs.sofa.model.v20190815.GetDWSCrawlerIosResponse;
import com.aliyuncs.sofa.model.v20190815.GetDWSCrawlerIosResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDWSCrawlerIosResponseUnmarshaller {

	public static GetDWSCrawlerIosResponse unmarshall(GetDWSCrawlerIosResponse getDWSCrawlerIosResponse, UnmarshallerContext _ctx) {
		
		getDWSCrawlerIosResponse.setRequestId(_ctx.stringValue("GetDWSCrawlerIosResponse.RequestId"));
		getDWSCrawlerIosResponse.setResultCode(_ctx.stringValue("GetDWSCrawlerIosResponse.ResultCode"));
		getDWSCrawlerIosResponse.setResultMessage(_ctx.stringValue("GetDWSCrawlerIosResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDWSCrawlerIosResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTimestamp(_ctx.longValue("GetDWSCrawlerIosResponse.Data["+ i +"].Timestamp"));
			dataItem.setValue(_ctx.stringValue("GetDWSCrawlerIosResponse.Data["+ i +"].Value"));

			data.add(dataItem);
		}
		getDWSCrawlerIosResponse.setData(data);
	 
	 	return getDWSCrawlerIosResponse;
	}
}