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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeBroadcastTablesResponse;
import com.aliyuncs.drds.model.v20190123.DescribeBroadcastTablesResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBroadcastTablesResponseUnmarshaller {

	public static DescribeBroadcastTablesResponse unmarshall(DescribeBroadcastTablesResponse describeBroadcastTablesResponse, UnmarshallerContext _ctx) {
		
		describeBroadcastTablesResponse.setRequestId(_ctx.stringValue("DescribeBroadcastTablesResponse.RequestId"));
		describeBroadcastTablesResponse.setSuccess(_ctx.booleanValue("DescribeBroadcastTablesResponse.Success"));
		describeBroadcastTablesResponse.setIsShard(_ctx.booleanValue("DescribeBroadcastTablesResponse.IsShard"));
		describeBroadcastTablesResponse.setPageNumber(_ctx.integerValue("DescribeBroadcastTablesResponse.PageNumber"));
		describeBroadcastTablesResponse.setPageSize(_ctx.integerValue("DescribeBroadcastTablesResponse.PageSize"));
		describeBroadcastTablesResponse.setTotal(_ctx.integerValue("DescribeBroadcastTablesResponse.Total"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBroadcastTablesResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setTable(_ctx.stringValue("DescribeBroadcastTablesResponse.List["+ i +"].Table"));
			listItem.setBroadcastType(_ctx.stringValue("DescribeBroadcastTablesResponse.List["+ i +"].BroadcastType"));
			listItem.setIsShard(_ctx.booleanValue("DescribeBroadcastTablesResponse.List["+ i +"].IsShard"));
			listItem.setDbInstType(_ctx.integerValue("DescribeBroadcastTablesResponse.List["+ i +"].DbInstType"));
			listItem.setBroadcast(_ctx.booleanValue("DescribeBroadcastTablesResponse.List["+ i +"].Broadcast"));
			listItem.setStatus(_ctx.integerValue("DescribeBroadcastTablesResponse.List["+ i +"].Status"));

			list.add(listItem);
		}
		describeBroadcastTablesResponse.setList(list);
	 
	 	return describeBroadcastTablesResponse;
	}
}