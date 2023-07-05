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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.QueryInspectStrategyWhiteResponse;
import com.aliyuncs.advisor_share.model.v20180608.QueryInspectStrategyWhiteResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryInspectStrategyWhiteResponseUnmarshaller {

	public static QueryInspectStrategyWhiteResponse unmarshall(QueryInspectStrategyWhiteResponse queryInspectStrategyWhiteResponse, UnmarshallerContext _ctx) {
		
		queryInspectStrategyWhiteResponse.setRequestId(_ctx.stringValue("QueryInspectStrategyWhiteResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryInspectStrategyWhiteResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.longValue("QueryInspectStrategyWhiteResponse.Data["+ i +"].Id"));
			dataItem.setRegionId(_ctx.stringValue("QueryInspectStrategyWhiteResponse.Data["+ i +"].RegionId"));
			dataItem.setResourceId(_ctx.stringValue("QueryInspectStrategyWhiteResponse.Data["+ i +"].ResourceId"));
			dataItem.setResourceName(_ctx.stringValue("QueryInspectStrategyWhiteResponse.Data["+ i +"].ResourceName"));

			data.add(dataItem);
		}
		queryInspectStrategyWhiteResponse.setData(data);
	 
	 	return queryInspectStrategyWhiteResponse;
	}
}