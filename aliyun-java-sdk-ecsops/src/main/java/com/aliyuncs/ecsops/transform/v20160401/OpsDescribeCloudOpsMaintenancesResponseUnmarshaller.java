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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsMaintenancesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCloudOpsMaintenancesResponse.MaintenanceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeCloudOpsMaintenancesResponseUnmarshaller {

	public static OpsDescribeCloudOpsMaintenancesResponse unmarshall(OpsDescribeCloudOpsMaintenancesResponse opsDescribeCloudOpsMaintenancesResponse, UnmarshallerContext _ctx) {
		
		opsDescribeCloudOpsMaintenancesResponse.setRequestId(_ctx.stringValue("OpsDescribeCloudOpsMaintenancesResponse.RequestId"));
		opsDescribeCloudOpsMaintenancesResponse.setTotalCount(_ctx.integerValue("OpsDescribeCloudOpsMaintenancesResponse.TotalCount"));
		opsDescribeCloudOpsMaintenancesResponse.setPageSize(_ctx.integerValue("OpsDescribeCloudOpsMaintenancesResponse.PageSize"));
		opsDescribeCloudOpsMaintenancesResponse.setBizMessage(_ctx.stringValue("OpsDescribeCloudOpsMaintenancesResponse.BizMessage"));
		opsDescribeCloudOpsMaintenancesResponse.setPage(_ctx.integerValue("OpsDescribeCloudOpsMaintenancesResponse.Page"));
		opsDescribeCloudOpsMaintenancesResponse.setCount(_ctx.integerValue("OpsDescribeCloudOpsMaintenancesResponse.Count"));
		opsDescribeCloudOpsMaintenancesResponse.setBizCode(_ctx.stringValue("OpsDescribeCloudOpsMaintenancesResponse.BizCode"));

		List<MaintenanceInfo> data = new ArrayList<MaintenanceInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeCloudOpsMaintenancesResponse.Data.Length"); i++) {
			MaintenanceInfo maintenanceInfo = new MaintenanceInfo();
			maintenanceInfo.setUpdateTime(_ctx.stringValue("OpsDescribeCloudOpsMaintenancesResponse.Data["+ i +"].UpdateTime"));
			maintenanceInfo.setComment(_ctx.stringValue("OpsDescribeCloudOpsMaintenancesResponse.Data["+ i +"].Comment"));
			maintenanceInfo.setSn(_ctx.stringValue("OpsDescribeCloudOpsMaintenancesResponse.Data["+ i +"].Sn"));
			maintenanceInfo.setMaintenanceTime(_ctx.stringValue("OpsDescribeCloudOpsMaintenancesResponse.Data["+ i +"].MaintenanceTime"));
			maintenanceInfo.setHostname(_ctx.stringValue("OpsDescribeCloudOpsMaintenancesResponse.Data["+ i +"].Hostname"));
			maintenanceInfo.setNcIp(_ctx.stringValue("OpsDescribeCloudOpsMaintenancesResponse.Data["+ i +"].NcIp"));
			maintenanceInfo.setNotifyStatus(_ctx.stringValue("OpsDescribeCloudOpsMaintenancesResponse.Data["+ i +"].NotifyStatus"));
			maintenanceInfo.setBizStatus(_ctx.stringValue("OpsDescribeCloudOpsMaintenancesResponse.Data["+ i +"].BizStatus"));
			maintenanceInfo.setVmNum(_ctx.stringValue("OpsDescribeCloudOpsMaintenancesResponse.Data["+ i +"].VmNum"));
			maintenanceInfo.setNcId(_ctx.stringValue("OpsDescribeCloudOpsMaintenancesResponse.Data["+ i +"].NcId"));
			maintenanceInfo.setOpsType(_ctx.stringValue("OpsDescribeCloudOpsMaintenancesResponse.Data["+ i +"].OpsType"));
			maintenanceInfo.setMaintenanceStatus(_ctx.stringValue("OpsDescribeCloudOpsMaintenancesResponse.Data["+ i +"].MaintenanceStatus"));
			maintenanceInfo.setMaintenanceReason(_ctx.stringValue("OpsDescribeCloudOpsMaintenancesResponse.Data["+ i +"].MaintenanceReason"));
			maintenanceInfo.setOpsUser(_ctx.stringValue("OpsDescribeCloudOpsMaintenancesResponse.Data["+ i +"].OpsUser"));
			maintenanceInfo.setNotifyTime(_ctx.stringValue("OpsDescribeCloudOpsMaintenancesResponse.Data["+ i +"].NotifyTime"));
			maintenanceInfo.setExtraData(_ctx.stringValue("OpsDescribeCloudOpsMaintenancesResponse.Data["+ i +"].ExtraData"));
			maintenanceInfo.setDomainType(_ctx.stringValue("OpsDescribeCloudOpsMaintenancesResponse.Data["+ i +"].DomainType"));

			data.add(maintenanceInfo);
		}
		opsDescribeCloudOpsMaintenancesResponse.setData(data);
	 
	 	return opsDescribeCloudOpsMaintenancesResponse;
	}
}