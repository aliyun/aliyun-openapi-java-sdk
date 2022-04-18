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
import com.aliyuncs.sddp.model.v20190103.DescribeEventDetailResponse.Event.HandleInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventDetailResponseUnmarshaller {

	public static DescribeEventDetailResponse unmarshall(DescribeEventDetailResponse describeEventDetailResponse, UnmarshallerContext _ctx) {
		
		describeEventDetailResponse.setRequestId(_ctx.stringValue("DescribeEventDetailResponse.RequestId"));

		Event event = new Event();
		event.setDisplayName(_ctx.stringValue("DescribeEventDetailResponse.Event.DisplayName"));
		event.setStatus(_ctx.integerValue("DescribeEventDetailResponse.Event.Status"));
		event.setDealReason(_ctx.stringValue("DescribeEventDetailResponse.Event.DealReason"));
		event.setUserId(_ctx.longValue("DescribeEventDetailResponse.Event.UserId"));
		event.setStatusName(_ctx.stringValue("DescribeEventDetailResponse.Event.StatusName"));
		event.setDepartName(_ctx.stringValue("DescribeEventDetailResponse.Event.DepartName"));
		event.setDealTime(_ctx.longValue("DescribeEventDetailResponse.Event.DealTime"));
		event.setDealLoginName(_ctx.stringValue("DescribeEventDetailResponse.Event.DealLoginName"));
		event.setSubTypeName(_ctx.stringValue("DescribeEventDetailResponse.Event.SubTypeName"));
		event.setBacked(_ctx.booleanValue("DescribeEventDetailResponse.Event.Backed"));
		event.setDataInstance(_ctx.stringValue("DescribeEventDetailResponse.Event.DataInstance"));
		event.setEventTime(_ctx.longValue("DescribeEventDetailResponse.Event.EventTime"));
		event.setLoginName(_ctx.stringValue("DescribeEventDetailResponse.Event.LoginName"));
		event.setUserIdValue(_ctx.stringValue("DescribeEventDetailResponse.Event.UserIdValue"));
		event.setSubTypeCode(_ctx.stringValue("DescribeEventDetailResponse.Event.SubTypeCode"));
		event.setLogDetail(_ctx.stringValue("DescribeEventDetailResponse.Event.LogDetail"));
		event.setTypeCode(_ctx.stringValue("DescribeEventDetailResponse.Event.TypeCode"));
		event.setDealUserIdValue(_ctx.stringValue("DescribeEventDetailResponse.Event.dealUserIdValue"));
		event.setAlertTime(_ctx.longValue("DescribeEventDetailResponse.Event.AlertTime"));
		event.setDealUserId(_ctx.longValue("DescribeEventDetailResponse.Event.DealUserId"));
		event.setTypeName(_ctx.stringValue("DescribeEventDetailResponse.Event.TypeName"));
		event.setDealDisplayName(_ctx.stringValue("DescribeEventDetailResponse.Event.DealDisplayName"));
		event.setId(_ctx.longValue("DescribeEventDetailResponse.Event.Id"));
		event.setProductCode(_ctx.stringValue("DescribeEventDetailResponse.Event.ProductCode"));

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
			chartItem.setType(_ctx.stringValue("DescribeEventDetailResponse.Event.Detail.Chart["+ i +"].Type"));
			chartItem.setLabel(_ctx.stringValue("DescribeEventDetailResponse.Event.Detail.Chart["+ i +"].Label"));
			chartItem.setXLabel(_ctx.stringValue("DescribeEventDetailResponse.Event.Detail.Chart["+ i +"].XLabel"));
			chartItem.setYLabel(_ctx.stringValue("DescribeEventDetailResponse.Event.Detail.Chart["+ i +"].YLabel"));

			Data data = new Data();

			List<String> y = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEventDetailResponse.Event.Detail.Chart["+ i +"].Data.Y.Length"); j++) {
				y.add(_ctx.stringValue("DescribeEventDetailResponse.Event.Detail.Chart["+ i +"].Data.Y["+ j +"]"));
			}
			data.setY(y);

			List<String> x = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeEventDetailResponse.Event.Detail.Chart["+ i +"].Data.X.Length"); j++) {
				x.add(_ctx.stringValue("DescribeEventDetailResponse.Event.Detail.Chart["+ i +"].Data.X["+ j +"]"));
			}
			data.setX(x);
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

		List<HandleInfo> handleInfoList = new ArrayList<HandleInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEventDetailResponse.Event.HandleInfoList.Length"); i++) {
			HandleInfo handleInfo = new HandleInfo();
			handleInfo.setStatus(_ctx.integerValue("DescribeEventDetailResponse.Event.HandleInfoList["+ i +"].Status"));
			handleInfo.setEnableTime(_ctx.longValue("DescribeEventDetailResponse.Event.HandleInfoList["+ i +"].EnableTime"));
			handleInfo.setHandlerValue(_ctx.integerValue("DescribeEventDetailResponse.Event.HandleInfoList["+ i +"].HandlerValue"));
			handleInfo.setDisableTime(_ctx.longValue("DescribeEventDetailResponse.Event.HandleInfoList["+ i +"].DisableTime"));
			handleInfo.setHandlerName(_ctx.stringValue("DescribeEventDetailResponse.Event.HandleInfoList["+ i +"].HandlerName"));
			handleInfo.setHandlerType(_ctx.stringValue("DescribeEventDetailResponse.Event.HandleInfoList["+ i +"].HandlerType"));
			handleInfo.setCurrentValue(_ctx.stringValue("DescribeEventDetailResponse.Event.HandleInfoList["+ i +"].CurrentValue"));
			handleInfo.setId(_ctx.longValue("DescribeEventDetailResponse.Event.HandleInfoList["+ i +"].Id"));

			handleInfoList.add(handleInfo);
		}
		event.setHandleInfoList(handleInfoList);
		describeEventDetailResponse.setEvent(event);
	 
	 	return describeEventDetailResponse;
	}
}