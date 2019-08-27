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

package com.aliyuncs.foas.transform.v20181111;

import com.aliyuncs.foas.model.v20181111.GetClusterDetailsResponse;
import com.aliyuncs.foas.model.v20181111.GetClusterDetailsResponse.Details;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClusterDetailsResponseUnmarshaller {

	public static GetClusterDetailsResponse unmarshall(GetClusterDetailsResponse getClusterDetailsResponse, UnmarshallerContext _ctx) {
		
		getClusterDetailsResponse.setRequestId(_ctx.stringValue("GetClusterDetailsResponse.RequestId"));

		Details details = new Details();
		details.setClusterId(_ctx.stringValue("GetClusterDetailsResponse.Details.ClusterId"));
		details.setRegionId(_ctx.stringValue("GetClusterDetailsResponse.Details.RegionId"));
		details.setZoneId(_ctx.stringValue("GetClusterDetailsResponse.Details.ZoneId"));
		details.setState(_ctx.stringValue("GetClusterDetailsResponse.Details.State"));
		details.setDescription(_ctx.stringValue("GetClusterDetailsResponse.Details.Description"));
		details.setDisplayName(_ctx.stringValue("GetClusterDetailsResponse.Details.DisplayName"));
		details.setOwnerId(_ctx.stringValue("GetClusterDetailsResponse.Details.OwnerId"));
		details.setOperator(_ctx.stringValue("GetClusterDetailsResponse.Details.Operator"));
		details.setStorageType(_ctx.stringValue("GetClusterDetailsResponse.Details.StorageType"));
		details.setGmtCreate(_ctx.longValue("GetClusterDetailsResponse.Details.GmtCreate"));
		details.setGmtModified(_ctx.longValue("GetClusterDetailsResponse.Details.GmtModified"));
		details.setUserOssInfo(_ctx.stringValue("GetClusterDetailsResponse.Details.UserOssInfo"));
		details.setUserVpcId(_ctx.stringValue("GetClusterDetailsResponse.Details.UserVpcId"));
		details.setUserSGId(_ctx.stringValue("GetClusterDetailsResponse.Details.UserSGId"));
		details.setUserVSwitchList(_ctx.stringValue("GetClusterDetailsResponse.Details.UserVSwitchList"));
		details.setIsMixDeploy(_ctx.booleanValue("GetClusterDetailsResponse.Details.IsMixDeploy"));
		details.setInstanceInfos(_ctx.stringValue("GetClusterDetailsResponse.Details.InstanceInfos"));
		getClusterDetailsResponse.setDetails(details);
	 
	 	return getClusterDetailsResponse;
	}
}