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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeHistoryEventsResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeHistoryEventsResponse.ItemsItem;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeHistoryEventsResponse.ItemsItem.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHistoryEventsResponseUnmarshaller {

	public static DescribeHistoryEventsResponse unmarshall(DescribeHistoryEventsResponse describeHistoryEventsResponse, UnmarshallerContext _ctx) {
		
		describeHistoryEventsResponse.setRequestId(_ctx.stringValue("DescribeHistoryEventsResponse.RequestId"));
		describeHistoryEventsResponse.setPageNumber(_ctx.integerValue("DescribeHistoryEventsResponse.PageNumber"));
		describeHistoryEventsResponse.setPageSize(_ctx.integerValue("DescribeHistoryEventsResponse.PageSize"));
		describeHistoryEventsResponse.setTotalCount(_ctx.integerValue("DescribeHistoryEventsResponse.TotalCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHistoryEventsResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setId(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Id"));
			itemsItem.setRegion(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Region"));
			itemsItem.setSource(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Source"));
			itemsItem.setSpecversion(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Specversion"));
			itemsItem.setSubject(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Subject"));
			itemsItem.setTime(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Time"));
			itemsItem.setType(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Type"));

			Data data = new Data();
			data.setEventType(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.EventType"));
			data.setEventId(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.EventId"));
			data.setCmsProduct(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.CmsProduct"));
			data.setDbType(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.DbType"));
			data.setDetailImpact(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.DetailImpact"));
			data.setDetailReason(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.DetailReason"));
			data.setEndTime(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.EndTime"));
			data.setEventCategory(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.EventCategory"));
			data.setEventCode(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.EventCode"));
			data.setEventDetail(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.EventDetail"));
			data.setEventImpact(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.EventImpact"));
			data.setEventLevel(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.EventLevel"));
			data.setEventReason(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.EventReason"));
			data.setEventStatus(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.EventStatus"));
			data.setGmtCreated(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.GmtCreated"));
			data.setGmtModified(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.GmtModified"));
			data.setHandleStatus(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.HandleStatus"));
			data.setHasLifeCycle(_ctx.integerValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.HasLifeCycle"));
			data.setInstanceId(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.InstanceId"));
			data.setInstanceName(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.InstanceName"));
			data.setIsClosed(_ctx.integerValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.IsClosed"));
			data.setProduct(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.Product"));
			data.setRegionId(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.RegionId"));
			data.setResourceType(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.ResourceType"));
			data.setSourceType(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.SourceType"));
			data.setStartTime(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.StartTime"));
			data.setUid(_ctx.stringValue("DescribeHistoryEventsResponse.Items["+ i +"].Data.Uid"));
			itemsItem.setData(data);

			items.add(itemsItem);
		}
		describeHistoryEventsResponse.setItems(items);
	 
	 	return describeHistoryEventsResponse;
	}
}