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

	public static GetClusterDetailsResponse unmarshall(GetClusterDetailsResponse getClusterDetailsResponse, UnmarshallerContext context) {
		
		getClusterDetailsResponse.setRequestId(context.stringValue("GetClusterDetailsResponse.RequestId"));

		Details details = new Details();
		details.setClusterId(context.stringValue("GetClusterDetailsResponse.Details.ClusterId"));
		details.setRegionId(context.stringValue("GetClusterDetailsResponse.Details.RegionId"));
		details.setZoneId(context.stringValue("GetClusterDetailsResponse.Details.ZoneId"));
		details.setState(context.stringValue("GetClusterDetailsResponse.Details.State"));
		details.setDescription(context.stringValue("GetClusterDetailsResponse.Details.Description"));
		details.setDisplayName(context.stringValue("GetClusterDetailsResponse.Details.DisplayName"));
		details.setOwnerId(context.stringValue("GetClusterDetailsResponse.Details.OwnerId"));
		details.setOperator(context.stringValue("GetClusterDetailsResponse.Details.Operator"));
		details.setStorageType(context.stringValue("GetClusterDetailsResponse.Details.StorageType"));
		details.setGmtCreate(context.longValue("GetClusterDetailsResponse.Details.GmtCreate"));
		details.setGmtModified(context.longValue("GetClusterDetailsResponse.Details.GmtModified"));
		details.setUserOssInfo(context.stringValue("GetClusterDetailsResponse.Details.UserOssInfo"));
		details.setUserVpcId(context.stringValue("GetClusterDetailsResponse.Details.UserVpcId"));
		details.setUserSGId(context.stringValue("GetClusterDetailsResponse.Details.UserSGId"));
		details.setUserVSwitchList(context.stringValue("GetClusterDetailsResponse.Details.UserVSwitchList"));
		details.setIsMixDeploy(context.booleanValue("GetClusterDetailsResponse.Details.IsMixDeploy"));
		details.setInstanceInfos(context.stringValue("GetClusterDetailsResponse.Details.InstanceInfos"));
		getClusterDetailsResponse.setDetails(details);
	 
	 	return getClusterDetailsResponse;
	}
}