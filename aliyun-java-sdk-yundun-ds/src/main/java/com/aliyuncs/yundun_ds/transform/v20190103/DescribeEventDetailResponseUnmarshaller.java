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

package com.aliyuncs.yundun_ds.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.yundun_ds.model.v20190103.DescribeEventDetailResponse;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeEventDetailResponse.Event;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeEventDetailResponse.Event.Detail;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeEventDetailResponse.Event.Detail.ChartItem;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeEventDetailResponse.Event.Detail.ChartItem.Data;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeEventDetailResponse.Event.Detail.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventDetailResponseUnmarshaller {

	public static DescribeEventDetailResponse unmarshall(DescribeEventDetailResponse describeEventDetailResponse, UnmarshallerContext context) {
		
		describeEventDetailResponse.setRequestId(context.stringValue("DescribeEventDetailResponse.RequestId"));

		Event event = new Event();
		event.setId(context.longValue("DescribeEventDetailResponse.Event.Id"));
		event.setUserId(context.longValue("DescribeEventDetailResponse.Event.UserId"));
		event.setLoginName(context.stringValue("DescribeEventDetailResponse.Event.LoginName"));
		event.setDisplayName(context.stringValue("DescribeEventDetailResponse.Event.DisplayName"));
		event.setProductCode(context.stringValue("DescribeEventDetailResponse.Event.ProductCode"));
		event.setTypeCode(context.stringValue("DescribeEventDetailResponse.Event.TypeCode"));
		event.setTypeName(context.stringValue("DescribeEventDetailResponse.Event.TypeName"));
		event.setTelephoneNum(context.stringValue("DescribeEventDetailResponse.Event.TelephoneNum"));
		event.setSubTypeCode(context.stringValue("DescribeEventDetailResponse.Event.SubTypeCode"));
		event.setSubTypeName(context.stringValue("DescribeEventDetailResponse.Event.SubTypeName"));
		event.setAlertTime(context.longValue("DescribeEventDetailResponse.Event.AlertTime"));
		event.setDataInstance(context.stringValue("DescribeEventDetailResponse.Event.DataInstance"));
		event.setEventTime(context.longValue("DescribeEventDetailResponse.Event.EventTime"));
		event.setStatus(context.integerValue("DescribeEventDetailResponse.Event.Status"));
		event.setStatusName(context.stringValue("DescribeEventDetailResponse.Event.StatusName"));
		event.setDealUserId(context.longValue("DescribeEventDetailResponse.Event.DealUserId"));
		event.setDealLoginName(context.stringValue("DescribeEventDetailResponse.Event.DealLoginName"));
		event.setDealDisplayName(context.stringValue("DescribeEventDetailResponse.Event.DealDisplayName"));
		event.setDealTime(context.longValue("DescribeEventDetailResponse.Event.DealTime"));
		event.setDepartName(context.stringValue("DescribeEventDetailResponse.Event.DepartName"));
		event.setBacked(context.booleanValue("DescribeEventDetailResponse.Event.Backed"));
		event.setDealReason(context.stringValue("DescribeEventDetailResponse.Event.DealReason"));

		Detail detail = new Detail();

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < context.lengthValue("DescribeEventDetailResponse.Event.Detail.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setLabel(context.stringValue("DescribeEventDetailResponse.Event.Detail.Content["+ i +"].Label"));
			contentItem.setValue(context.stringValue("DescribeEventDetailResponse.Event.Detail.Content["+ i +"].Value"));

			content.add(contentItem);
		}
		detail.setContent(content);

		List<ChartItem> chart = new ArrayList<ChartItem>();
		for (int i = 0; i < context.lengthValue("DescribeEventDetailResponse.Event.Detail.Chart.Length"); i++) {
			ChartItem chartItem = new ChartItem();
			chartItem.setLabel(context.stringValue("DescribeEventDetailResponse.Event.Detail.Chart["+ i +"].Label"));
			chartItem.setXLabel(context.stringValue("DescribeEventDetailResponse.Event.Detail.Chart["+ i +"].XLabel"));
			chartItem.setYLabel(context.stringValue("DescribeEventDetailResponse.Event.Detail.Chart["+ i +"].YLabel"));

			Data data = new Data();
			data.setX(context.stringValue("DescribeEventDetailResponse.Event.Detail.Chart["+ i +"].Data.X"));
			data.setY(context.stringValue("DescribeEventDetailResponse.Event.Detail.Chart["+ i +"].Data.Y"));
			chartItem.setData(data);

			chart.add(chartItem);
		}
		detail.setChart(chart);
		event.setDetail(detail);
		describeEventDetailResponse.setEvent(event);
	 
	 	return describeEventDetailResponse;
	}
}