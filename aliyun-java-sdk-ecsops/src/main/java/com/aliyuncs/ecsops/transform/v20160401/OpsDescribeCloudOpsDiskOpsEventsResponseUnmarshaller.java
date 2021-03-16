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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsDiskOpsEventsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsDiskOpsEventsResponse.DiskOpsEventInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeCloudOpsDiskOpsEventsResponseUnmarshaller {

	public static OpsDescribeCloudOpsDiskOpsEventsResponse unmarshall(OpsDescribeCloudOpsDiskOpsEventsResponse opsDescribeCloudOpsDiskOpsEventsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeCloudOpsDiskOpsEventsResponse.setRequestId(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.RequestId"));
		opsDescribeCloudOpsDiskOpsEventsResponse.setBizCode(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.BizCode"));
		opsDescribeCloudOpsDiskOpsEventsResponse.setBizMessage(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.BizMessage"));
		opsDescribeCloudOpsDiskOpsEventsResponse.setCount(_ctx.integerValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Count"));
		opsDescribeCloudOpsDiskOpsEventsResponse.setPage(_ctx.integerValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Page"));
		opsDescribeCloudOpsDiskOpsEventsResponse.setPageSize(_ctx.integerValue("OpsDescribeCloudOpsDiskOpsEventsResponse.PageSize"));
		opsDescribeCloudOpsDiskOpsEventsResponse.setTotalCount(_ctx.integerValue("OpsDescribeCloudOpsDiskOpsEventsResponse.TotalCount"));

		List<DiskOpsEventInfo> data = new ArrayList<DiskOpsEventInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data.Length"); i++) {
			DiskOpsEventInfo diskOpsEventInfo = new DiskOpsEventInfo();
			diskOpsEventInfo.setDeployMode(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].DeployMode"));
			diskOpsEventInfo.setDevice(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].Device"));
			diskOpsEventInfo.setDiskStatus(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].DiskStatus"));
			diskOpsEventInfo.setDiskType(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].DiskType"));
			diskOpsEventInfo.setEventStatus(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].EventStatus"));
			diskOpsEventInfo.setEventType(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].EventType"));
			diskOpsEventInfo.setHouyiDiskId(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].HouyiDiskId"));
			diskOpsEventInfo.setId(_ctx.integerValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].Id"));
			diskOpsEventInfo.setIdcOrderId(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].IdcOrderId"));
			diskOpsEventInfo.setIoType(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].IoType"));
			diskOpsEventInfo.setIsHotSwap(_ctx.integerValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].IsHotSwap"));
			diskOpsEventInfo.setMaintenanceId(_ctx.integerValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].MaintenanceId"));
			diskOpsEventInfo.setStorageDeviceId(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].StorageDeviceId"));
			diskOpsEventInfo.setTef(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].Tef"));
			diskOpsEventInfo.setTes(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].Tes"));
			diskOpsEventInfo.setTnb(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].Tnb"));
			diskOpsEventInfo.setTp(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].Tp"));
			diskOpsEventInfo.setVmName(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].VmName"));
			diskOpsEventInfo.setYaochiDiskId(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].YaochiDiskId"));

			data.add(diskOpsEventInfo);
		}
		opsDescribeCloudOpsDiskOpsEventsResponse.setData(data);
	 
	 	return opsDescribeCloudOpsDiskOpsEventsResponse;
	}
}