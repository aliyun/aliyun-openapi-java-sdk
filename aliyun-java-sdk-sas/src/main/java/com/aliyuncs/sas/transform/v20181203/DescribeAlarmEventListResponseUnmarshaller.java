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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeAlarmEventListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeAlarmEventListResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribeAlarmEventListResponse.SuspEventsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlarmEventListResponseUnmarshaller {

	public static DescribeAlarmEventListResponse unmarshall(DescribeAlarmEventListResponse describeAlarmEventListResponse, UnmarshallerContext _ctx) {
		
		describeAlarmEventListResponse.setRequestId(_ctx.stringValue("DescribeAlarmEventListResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(_ctx.integerValue("DescribeAlarmEventListResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeAlarmEventListResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeAlarmEventListResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeAlarmEventListResponse.PageInfo.CurrentPage"));
		describeAlarmEventListResponse.setPageInfo(pageInfo);

		List<SuspEventsItem> suspEvents = new ArrayList<SuspEventsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAlarmEventListResponse.SuspEvents.Length"); i++) {
			SuspEventsItem suspEventsItem = new SuspEventsItem();
			suspEventsItem.setAlarmUniqueInfo(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].AlarmUniqueInfo"));
			suspEventsItem.setSolution(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].Solution"));
			suspEventsItem.setLevel(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].Level"));
			suspEventsItem.setCanBeDealOnLine(_ctx.booleanValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].CanBeDealOnLine"));
			suspEventsItem.setDescription(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].Description"));
			suspEventsItem.setStartTime(_ctx.longValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].StartTime"));
			suspEventsItem.setEndTime(_ctx.longValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].EndTime"));
			suspEventsItem.setOperateTime(_ctx.longValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].OperateTime"));
			suspEventsItem.setAlarmEventType(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].AlarmEventType"));
			suspEventsItem.setSuspiciousEventCount(_ctx.integerValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].SuspiciousEventCount"));
			suspEventsItem.setUuid(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].Uuid"));
			suspEventsItem.setInstanceName(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].InstanceName"));
			suspEventsItem.setInternetIp(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].InternetIp"));
			suspEventsItem.setIntranetIp(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].IntranetIp"));
			suspEventsItem.setAlarmEventName(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].AlarmEventName"));
			suspEventsItem.setSaleVersion(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].SaleVersion"));
			suspEventsItem.setDataSource(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].DataSource"));
			suspEventsItem.setCanCancelFault(_ctx.booleanValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].CanCancelFault"));
			suspEventsItem.setDealed(_ctx.booleanValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].Dealed"));
			suspEventsItem.setGmtModified(_ctx.longValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].GmtModified"));
			suspEventsItem.setHasTraceInfo(_ctx.booleanValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].HasTraceInfo"));
			suspEventsItem.setSecurityEventIds(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].SecurityEventIds"));
			suspEventsItem.setOperateErrorCode(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].OperateErrorCode"));
			suspEventsItem.setAlarmEventNameOriginal(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].AlarmEventNameOriginal"));
			suspEventsItem.setInstanceId(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].InstanceId"));
			suspEventsItem.setContainHwMode(_ctx.booleanValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].ContainHwMode"));
			suspEventsItem.setStages(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].Stages"));
			suspEventsItem.setContainerImageId(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].ContainerImageId"));
			suspEventsItem.setContainerImageName(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].ContainerImageName"));
			suspEventsItem.setContainerId(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].ContainerId"));
			suspEventsItem.setK8sNamespace(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].K8sNamespace"));
			suspEventsItem.setK8sClusterId(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].K8sClusterId"));
			suspEventsItem.setK8sNodeId(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].K8sNodeId"));
			suspEventsItem.setK8sPodName(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].K8sPodName"));
			suspEventsItem.setK8sNodeName(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].K8sNodeName"));

			suspEvents.add(suspEventsItem);
		}
		describeAlarmEventListResponse.setSuspEvents(suspEvents);
	 
	 	return describeAlarmEventListResponse;
	}
}