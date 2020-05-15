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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeEventDetailResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeEventDetailResponse.Event;
import com.aliyuncs.sddp.model.v20190103.DescribeEventDetailResponse.Event.Detail;
import com.aliyuncs.sddp.model.v20190103.DescribeEventDetailResponse.Event.Detail.ChartItem;
import com.aliyuncs.sddp.model.v20190103.DescribeEventDetailResponse.Event.Detail.ChartItem.Data;
import com.aliyuncs.sddp.model.v20190103.DescribeEventDetailResponse.Event.Detail.ContentItem;
import com.aliyuncs.sddp.model.v20190103.DescribeEventDetailResponse.Event.Detail.ResourceInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventDetailResponseUnmarshaller {

	public static DescribeEventDetailResponse unmarshall(DescribeEventDetailResponse describeEventDetailResponse, UnmarshallerContext _ctx) {
		
		describeEventDetailResponse.setRequestId(_ctx.stringValue("DescribeEventDetailResponse.RequestId"));

		Event event = new Event();
		event.setId(_ctx.longValue("DescribeEventDetailResponse.Event.Id"));
		event.setUserId(_ctx.longValue("DescribeEventDetailResponse.Event.UserId"));
		event.setLoginName(_ctx.stringValue("DescribeEventDetailResponse.Event.LoginName"));
		event.setDisplayName(_ctx.stringValue("DescribeEventDetailResponse.Event.DisplayName"));
		event.setProductCode(_ctx.stringValue("DescribeEventDetailResponse.Event.ProductCode"));
		event.setTypeCode(_ctx.stringValue("DescribeEventDetailResponse.Event.TypeCode"));
		event.setTypeName(_ctx.stringValue("DescribeEventDetailResponse.Event.TypeName"));
		event.setSubTypeCode(_ctx.stringValue("DescribeEventDetailResponse.Event.SubTypeCode"));
		event.setSubTypeName(_ctx.stringValue("DescribeEventDetailResponse.Event.SubTypeName"));
		event.setAlertTime(_ctx.longValue("DescribeEventDetailResponse.Event.AlertTime"));
		event.setDataInstance(_ctx.stringValue("DescribeEventDetailResponse.Event.DataInstance"));
		event.setEventTime(_ctx.longValue("DescribeEventDetailResponse.Event.EventTime"));
		event.setStatus(_ctx.integerValue("DescribeEventDetailResponse.Event.Status"));
		event.setStatusName(_ctx.stringValue("DescribeEventDetailResponse.Event.StatusName"));
		event.setDealUserId(_ctx.longValue("DescribeEventDetailResponse.Event.DealUserId"));
		event.setDealLoginName(_ctx.stringValue("DescribeEventDetailResponse.Event.DealLoginName"));
		event.setDealDisplayName(_ctx.stringValue("DescribeEventDetailResponse.Event.DealDisplayName"));
		event.setDealTime(_ctx.longValue("DescribeEventDetailResponse.Event.DealTime"));
		event.setDepartName(_ctx.stringValue("DescribeEventDetailResponse.Event.DepartName"));
		event.setBacked(_ctx.booleanValue("DescribeEventDetailResponse.Event.Backed"));
		event.setDealReason(_ctx.stringValue("DescribeEventDetailResponse.Event.DealReason"));

		Detail detail = new Detail();

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEventDetailResponse.Event.Detail.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setLabel(_ctx.stringValue("DescribeEventDetailResponse.Event.Detail.Content["+ i +"].Label"));
			contentItem.setValue(_ctx.stringValue("DescribeEventDetailResponse.Event.Detail.Content["+ i +"].Value"));

			content.add(contentItem);
		}
		detail.setContent(content);

		List<ChartItem> chart = new ArrayList<ChartItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEventDetailResponse.Event.Detail.Chart.Length"); i++) {
			ChartItem chartItem = new ChartItem();
			chartItem.setLabel(_ctx.stringValue("DescribeEventDetailResponse.Event.Detail.Chart["+ i +"].Label"));
			chartItem.setXLabel(_ctx.stringValue("DescribeEventDetailResponse.Event.Detail.Chart["+ i +"].XLabel"));
			chartItem.setYLabel(_ctx.stringValue("DescribeEventDetailResponse.Event.Detail.Chart["+ i +"].YLabel"));
			chartItem.setType(_ctx.stringValue("DescribeEventDetailResponse.Event.Detail.Chart["+ i +"].Type"));

			Data data = new Data();
			data.setX(_ctx.stringValue("DescribeEventDetailResponse.Event.Detail.Chart["+ i +"].Data.X"));
			data.setY(_ctx.stringValue("DescribeEventDetailResponse.Event.Detail.Chart["+ i +"].Data.Y"));
			chartItem.setData(data);

			chart.add(chartItem);
		}
		detail.setChart(chart);

		List<ResourceInfoItem> resourceInfo = new ArrayList<ResourceInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEventDetailResponse.Event.Detail.ResourceInfo.Length"); i++) {
			ResourceInfoItem resourceInfoItem = new ResourceInfoItem();
			resourceInfoItem.setLabel(_ctx.stringValue("DescribeEventDetailResponse.Event.Detail.ResourceInfo["+ i +"].Label"));
			resourceInfoItem.setValue(_ctx.stringValue("DescribeEventDetailResponse.Event.Detail.ResourceInfo["+ i +"].Value"));

			resourceInfo.add(resourceInfoItem);
		}
		detail.setResourceInfo(resourceInfo);
		event.setDetail(detail);
		describeEventDetailResponse.setEvent(event);
	 
	 	return describeEventDetailResponse;
	}
}