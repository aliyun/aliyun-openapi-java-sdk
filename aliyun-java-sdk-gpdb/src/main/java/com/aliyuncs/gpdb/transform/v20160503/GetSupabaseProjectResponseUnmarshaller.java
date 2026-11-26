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

package com.aliyuncs.gpdb.transform.v20160503;

import com.aliyuncs.gpdb.model.v20160503.GetSupabaseProjectResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSupabaseProjectResponseUnmarshaller {

	public static GetSupabaseProjectResponse unmarshall(GetSupabaseProjectResponse getSupabaseProjectResponse, UnmarshallerContext _ctx) {
		
		getSupabaseProjectResponse.setRequestId(_ctx.stringValue("GetSupabaseProjectResponse.RequestId"));
		getSupabaseProjectResponse.setDBSecurityIpList(_ctx.stringValue("GetSupabaseProjectResponse.DBSecurityIpList"));
		getSupabaseProjectResponse.setDashboardUserName(_ctx.stringValue("GetSupabaseProjectResponse.DashboardUserName"));
		getSupabaseProjectResponse.setEni(_ctx.stringValue("GetSupabaseProjectResponse.Eni"));
		getSupabaseProjectResponse.setLightweight(_ctx.stringValue("GetSupabaseProjectResponse.Lightweight"));
		getSupabaseProjectResponse.setProjectName(_ctx.stringValue("GetSupabaseProjectResponse.ProjectName"));
		getSupabaseProjectResponse.setDiskPerformanceLevel(_ctx.stringValue("GetSupabaseProjectResponse.DiskPerformanceLevel"));
		getSupabaseProjectResponse.setAppliedIdleTimeHours(_ctx.stringValue("GetSupabaseProjectResponse.AppliedIdleTimeHours"));
		getSupabaseProjectResponse.setInstanceVersion(_ctx.stringValue("GetSupabaseProjectResponse.InstanceVersion"));
		getSupabaseProjectResponse.setPrivateConnectUrl(_ctx.stringValue("GetSupabaseProjectResponse.PrivateConnectUrl"));
		getSupabaseProjectResponse.setDashboardPassword(_ctx.stringValue("GetSupabaseProjectResponse.DashboardPassword"));
		getSupabaseProjectResponse.setProjectDescription(_ctx.stringValue("GetSupabaseProjectResponse.ProjectDescription"));
		getSupabaseProjectResponse.setEngine(_ctx.stringValue("GetSupabaseProjectResponse.Engine"));
		getSupabaseProjectResponse.setPublicConnectUrl(_ctx.stringValue("GetSupabaseProjectResponse.PublicConnectUrl"));
		getSupabaseProjectResponse.setStatus(_ctx.stringValue("GetSupabaseProjectResponse.Status"));
		getSupabaseProjectResponse.setEngineVersion(_ctx.stringValue("GetSupabaseProjectResponse.EngineVersion"));
		getSupabaseProjectResponse.setStorageType(_ctx.stringValue("GetSupabaseProjectResponse.StorageType"));
		getSupabaseProjectResponse.setZoneId(_ctx.stringValue("GetSupabaseProjectResponse.ZoneId"));
		getSupabaseProjectResponse.setCreateTime(_ctx.stringValue("GetSupabaseProjectResponse.CreateTime"));
		getSupabaseProjectResponse.setVSwitchId(_ctx.stringValue("GetSupabaseProjectResponse.VSwitchId"));
		getSupabaseProjectResponse.setProjectId(_ctx.stringValue("GetSupabaseProjectResponse.ProjectId"));
		getSupabaseProjectResponse.setStorageSize(_ctx.longValue("GetSupabaseProjectResponse.StorageSize"));
		getSupabaseProjectResponse.setPayType(_ctx.stringValue("GetSupabaseProjectResponse.PayType"));
		getSupabaseProjectResponse.setProjectSpec(_ctx.stringValue("GetSupabaseProjectResponse.ProjectSpec"));
		getSupabaseProjectResponse.setVpcId(_ctx.stringValue("GetSupabaseProjectResponse.VpcId"));
		getSupabaseProjectResponse.setSecurityIpList(_ctx.stringValue("GetSupabaseProjectResponse.SecurityIpList"));
		getSupabaseProjectResponse.setRegionId(_ctx.stringValue("GetSupabaseProjectResponse.RegionId"));
		getSupabaseProjectResponse.setAutoScale(_ctx.stringValue("GetSupabaseProjectResponse.AutoScale"));
	 
	 	return getSupabaseProjectResponse;
	}
}