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
		opsDescribeCloudOpsDiskOpsEventsResponse.setTotalCount(_ctx.integerValue("OpsDescribeCloudOpsDiskOpsEventsResponse.TotalCount"));
		opsDescribeCloudOpsDiskOpsEventsResponse.setPageSize(_ctx.integerValue("OpsDescribeCloudOpsDiskOpsEventsResponse.PageSize"));
		opsDescribeCloudOpsDiskOpsEventsResponse.setBizMessage(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.BizMessage"));
		opsDescribeCloudOpsDiskOpsEventsResponse.setPage(_ctx.integerValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Page"));
		opsDescribeCloudOpsDiskOpsEventsResponse.setCount(_ctx.integerValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Count"));
		opsDescribeCloudOpsDiskOpsEventsResponse.setBizCode(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.BizCode"));

		List<DiskOpsEventInfo> data = new ArrayList<DiskOpsEventInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data.Length"); i++) {
			DiskOpsEventInfo diskOpsEventInfo = new DiskOpsEventInfo();
			diskOpsEventInfo.setYaochiDiskId(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].YaochiDiskId"));
			diskOpsEventInfo.setHouyiDiskId(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].HouyiDiskId"));
			diskOpsEventInfo.setDeployMode(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].DeployMode"));
			diskOpsEventInfo.setMaintenanceId(_ctx.integerValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].MaintenanceId"));
			diskOpsEventInfo.setTes(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].Tes"));
			diskOpsEventInfo.setDiskType(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].DiskType"));
			diskOpsEventInfo.setVmName(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].VmName"));
			diskOpsEventInfo.setDiskStatus(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].DiskStatus"));
			diskOpsEventInfo.setIdcOrderId(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].IdcOrderId"));
			diskOpsEventInfo.setTp(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].Tp"));
			diskOpsEventInfo.setTnb(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].Tnb"));
			diskOpsEventInfo.setEventType(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].EventType"));
			diskOpsEventInfo.setTef(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].Tef"));
			diskOpsEventInfo.setStorageDeviceId(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].StorageDeviceId"));
			diskOpsEventInfo.setDevice(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].Device"));
			diskOpsEventInfo.setEventStatus(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].EventStatus"));
			diskOpsEventInfo.setIsHotSwap(_ctx.integerValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].IsHotSwap"));
			diskOpsEventInfo.setIoType(_ctx.stringValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].IoType"));
			diskOpsEventInfo.setId(_ctx.integerValue("OpsDescribeCloudOpsDiskOpsEventsResponse.Data["+ i +"].Id"));

			data.add(diskOpsEventInfo);
		}
		opsDescribeCloudOpsDiskOpsEventsResponse.setData(data);
	 
	 	return opsDescribeCloudOpsDiskOpsEventsResponse;
	}
}