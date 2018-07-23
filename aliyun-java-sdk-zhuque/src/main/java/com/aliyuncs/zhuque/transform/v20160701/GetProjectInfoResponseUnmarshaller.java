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

package com.aliyuncs.zhuque.transform.v20160701;

import com.aliyuncs.zhuque.model.v20160701.GetProjectInfoResponse;
import com.aliyuncs.zhuque.model.v20160701.GetProjectInfoResponse.ProjectBaseInfoResp;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectInfoResponseUnmarshaller {

	public static GetProjectInfoResponse unmarshall(GetProjectInfoResponse getProjectInfoResponse, UnmarshallerContext context) {
		
		getProjectInfoResponse.setRequestId(context.stringValue("GetProjectInfoResponse.RequestId"));
		getProjectInfoResponse.setResult(context.stringValue("GetProjectInfoResponse.Result"));
		getProjectInfoResponse.setMessage(context.stringValue("GetProjectInfoResponse.Message"));

		ProjectBaseInfoResp projectBaseInfoResp = new ProjectBaseInfoResp();
		projectBaseInfoResp.setId(context.integerValue("GetProjectInfoResponse.ProjectBaseInfoResp.Id"));
		projectBaseInfoResp.setProjectId(context.stringValue("GetProjectInfoResponse.ProjectBaseInfoResp.ProjectId"));
		projectBaseInfoResp.setProjectName(context.stringValue("GetProjectInfoResponse.ProjectBaseInfoResp.ProjectName"));
		projectBaseInfoResp.setProjectType(context.stringValue("GetProjectInfoResponse.ProjectBaseInfoResp.ProjectType"));
		projectBaseInfoResp.setCloudInstance(context.stringValue("GetProjectInfoResponse.ProjectBaseInfoResp.CloudInstance"));
		projectBaseInfoResp.setDisplayName(context.stringValue("GetProjectInfoResponse.ProjectBaseInfoResp.DisplayName"));
		projectBaseInfoResp.setCloudType(context.stringValue("GetProjectInfoResponse.ProjectBaseInfoResp.CloudType"));
		projectBaseInfoResp.setRegion(context.stringValue("GetProjectInfoResponse.ProjectBaseInfoResp.Region"));
		projectBaseInfoResp.setAzone(context.stringValue("GetProjectInfoResponse.ProjectBaseInfoResp.Azone"));
		projectBaseInfoResp.setManager(context.stringValue("GetProjectInfoResponse.ProjectBaseInfoResp.Manager"));
		projectBaseInfoResp.setCustomerId(context.stringValue("GetProjectInfoResponse.ProjectBaseInfoResp.CustomerId"));
		projectBaseInfoResp.setCurrentVersion(context.stringValue("GetProjectInfoResponse.ProjectBaseInfoResp.CurrentVersion"));
		projectBaseInfoResp.setDeliveryDay(context.stringValue("GetProjectInfoResponse.ProjectBaseInfoResp.DeliveryDay"));
		projectBaseInfoResp.setDescription(context.stringValue("GetProjectInfoResponse.ProjectBaseInfoResp.Description"));
		projectBaseInfoResp.setUpdateTime(context.stringValue("GetProjectInfoResponse.ProjectBaseInfoResp.UpdateTime"));
		projectBaseInfoResp.setOrigin(context.stringValue("GetProjectInfoResponse.ProjectBaseInfoResp.Origin"));
		getProjectInfoResponse.setProjectBaseInfoResp(projectBaseInfoResp);
	 
	 	return getProjectInfoResponse;
	}
}