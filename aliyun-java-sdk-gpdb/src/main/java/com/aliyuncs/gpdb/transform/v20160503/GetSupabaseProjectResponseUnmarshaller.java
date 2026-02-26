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
		getSupabaseProjectResponse.setProjectName(_ctx.stringValue("GetSupabaseProjectResponse.ProjectName"));
		getSupabaseProjectResponse.setProjectSpec(_ctx.stringValue("GetSupabaseProjectResponse.ProjectSpec"));
		getSupabaseProjectResponse.setStatus(_ctx.stringValue("GetSupabaseProjectResponse.Status"));
		getSupabaseProjectResponse.setPublicConnectUrl(_ctx.stringValue("GetSupabaseProjectResponse.PublicConnectUrl"));
		getSupabaseProjectResponse.setPrivateConnectUrl(_ctx.stringValue("GetSupabaseProjectResponse.PrivateConnectUrl"));
		getSupabaseProjectResponse.setRegionId(_ctx.stringValue("GetSupabaseProjectResponse.RegionId"));
		getSupabaseProjectResponse.setZoneId(_ctx.stringValue("GetSupabaseProjectResponse.ZoneId"));
		getSupabaseProjectResponse.setVpcId(_ctx.stringValue("GetSupabaseProjectResponse.VpcId"));
		getSupabaseProjectResponse.setVSwitchId(_ctx.stringValue("GetSupabaseProjectResponse.VSwitchId"));
		getSupabaseProjectResponse.setSecurityIpList(_ctx.stringValue("GetSupabaseProjectResponse.SecurityIpList"));
		getSupabaseProjectResponse.setDiskPerformanceLevel(_ctx.stringValue("GetSupabaseProjectResponse.DiskPerformanceLevel"));
		getSupabaseProjectResponse.setEngine(_ctx.stringValue("GetSupabaseProjectResponse.Engine"));
		getSupabaseProjectResponse.setEngineVersion(_ctx.stringValue("GetSupabaseProjectResponse.EngineVersion"));
		getSupabaseProjectResponse.setStorageSize(_ctx.longValue("GetSupabaseProjectResponse.StorageSize"));
		getSupabaseProjectResponse.setCreateTime(_ctx.stringValue("GetSupabaseProjectResponse.CreateTime"));
		getSupabaseProjectResponse.setDashboardUserName(_ctx.stringValue("GetSupabaseProjectResponse.DashboardUserName"));
		getSupabaseProjectResponse.setProjectId(_ctx.stringValue("GetSupabaseProjectResponse.ProjectId"));
		getSupabaseProjectResponse.setDashboardPassword(_ctx.stringValue("GetSupabaseProjectResponse.DashboardPassword"));
	 
	 	return getSupabaseProjectResponse;
	}
}