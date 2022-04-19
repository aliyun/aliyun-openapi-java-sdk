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
import com.aliyuncs.sas.model.v20181203.DescribeAlarmEventListResponse.SuspEventsItem.TacticItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlarmEventListResponseUnmarshaller {

	public static DescribeAlarmEventListResponse unmarshall(DescribeAlarmEventListResponse describeAlarmEventListResponse, UnmarshallerContext _ctx) {
		
		describeAlarmEventListResponse.setRequestId(_ctx.stringValue("DescribeAlarmEventListResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeAlarmEventListResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeAlarmEventListResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeAlarmEventListResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeAlarmEventListResponse.PageInfo.Count"));
		describeAlarmEventListResponse.setPageInfo(pageInfo);

		List<SuspEventsItem> suspEvents = new ArrayList<SuspEventsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAlarmEventListResponse.SuspEvents.Length"); i++) {
			SuspEventsItem suspEventsItem = new SuspEventsItem();
			suspEventsItem.setDealed(_ctx.booleanValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].Dealed"));
			suspEventsItem.setStages(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].Stages"));
			suspEventsItem.setInternetIp(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].InternetIp"));
			suspEventsItem.setSuspiciousEventCount(_ctx.integerValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].SuspiciousEventCount"));
			suspEventsItem.setK8sClusterName(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].K8sClusterName"));
			suspEventsItem.setContainerImageId(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].ContainerImageId"));
			suspEventsItem.setGmtModified(_ctx.longValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].GmtModified"));
			suspEventsItem.setAlarmEventNameOriginal(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].AlarmEventNameOriginal"));
			suspEventsItem.setAlarmUniqueInfo(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].AlarmUniqueInfo"));
			suspEventsItem.setCanCancelFault(_ctx.booleanValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].CanCancelFault"));
			suspEventsItem.setAppName(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].AppName"));
			suspEventsItem.setSecurityEventIds(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].SecurityEventIds"));
			suspEventsItem.setK8sClusterId(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].K8sClusterId"));
			suspEventsItem.setContainerImageName(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].ContainerImageName"));
			suspEventsItem.setCanBeDealOnLine(_ctx.booleanValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].CanBeDealOnLine"));
			suspEventsItem.setDescription(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].Description"));
			suspEventsItem.setContainHwMode(_ctx.booleanValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].ContainHwMode"));
			suspEventsItem.setK8sNodeId(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].K8sNodeId"));
			suspEventsItem.setInstanceName(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].InstanceName"));
			suspEventsItem.setSaleVersion(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].SaleVersion"));
			suspEventsItem.setOperateErrorCode(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].OperateErrorCode"));
			suspEventsItem.setSolution(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].Solution"));
			suspEventsItem.setHasTraceInfo(_ctx.booleanValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].HasTraceInfo"));
			suspEventsItem.setDataSource(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].DataSource"));
			suspEventsItem.setOperateTime(_ctx.longValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].OperateTime"));
			suspEventsItem.setInstanceId(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].InstanceId"));
			suspEventsItem.setIntranetIp(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].IntranetIp"));
			suspEventsItem.setEndTime(_ctx.longValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].EndTime"));
			suspEventsItem.setUuid(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].Uuid"));
			suspEventsItem.setStartTime(_ctx.longValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].StartTime"));
			suspEventsItem.setK8sPodName(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].K8sPodName"));
			suspEventsItem.setContainerId(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].ContainerId"));
			suspEventsItem.setAlarmEventType(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].AlarmEventType"));
			suspEventsItem.setK8sNamespace(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].K8sNamespace"));
			suspEventsItem.setK8sNodeName(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].K8sNodeName"));
			suspEventsItem.setAlarmEventName(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].AlarmEventName"));
			suspEventsItem.setLevel(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].Level"));

			List<TacticItem> tacticItems = new ArrayList<TacticItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].TacticItems.Length"); j++) {
				TacticItem tacticItem = new TacticItem();
				tacticItem.setTacticId(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].TacticItems["+ j +"].TacticId"));
				tacticItem.setTacticDisplayName(_ctx.stringValue("DescribeAlarmEventListResponse.SuspEvents["+ i +"].TacticItems["+ j +"].TacticDisplayName"));

				tacticItems.add(tacticItem);
			}
			suspEventsItem.setTacticItems(tacticItems);

			suspEvents.add(suspEventsItem);
		}
		describeAlarmEventListResponse.setSuspEvents(suspEvents);
	 
	 	return describeAlarmEventListResponse;
	}
}