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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.zhuque.model.v20160701.ListProjectsResponse;
import com.aliyuncs.zhuque.model.v20160701.ListProjectsResponse.ProjectRespItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectsResponseUnmarshaller {

	public static ListProjectsResponse unmarshall(ListProjectsResponse listProjectsResponse, UnmarshallerContext context) {
		
		listProjectsResponse.setRequestId(context.stringValue("ListProjectsResponse.RequestId"));
		listProjectsResponse.setResult(context.stringValue("ListProjectsResponse.Result"));
		listProjectsResponse.setMessage(context.stringValue("ListProjectsResponse.Message"));

		List<ProjectRespItem> projectResp = new ArrayList<ProjectRespItem>();
		for (int i = 0; i < context.lengthValue("ListProjectsResponse.ProjectResp.Length"); i++) {
			ProjectRespItem projectRespItem = new ProjectRespItem();
			projectRespItem.setId(context.integerValue("ListProjectsResponse.ProjectResp["+ i +"].Id"));
			projectRespItem.setProjectId(context.stringValue("ListProjectsResponse.ProjectResp["+ i +"].ProjectId"));
			projectRespItem.setProjectName(context.stringValue("ListProjectsResponse.ProjectResp["+ i +"].ProjectName"));
			projectRespItem.setProjectType(context.stringValue("ListProjectsResponse.ProjectResp["+ i +"].ProjectType"));
			projectRespItem.setCloudInstance(context.stringValue("ListProjectsResponse.ProjectResp["+ i +"].CloudInstance"));
			projectRespItem.setDisplayName(context.stringValue("ListProjectsResponse.ProjectResp["+ i +"].DisplayName"));
			projectRespItem.setCloudType(context.stringValue("ListProjectsResponse.ProjectResp["+ i +"].CloudType"));
			projectRespItem.setRegion(context.stringValue("ListProjectsResponse.ProjectResp["+ i +"].Region"));
			projectRespItem.setAzone(context.stringValue("ListProjectsResponse.ProjectResp["+ i +"].Azone"));
			projectRespItem.setManager(context.stringValue("ListProjectsResponse.ProjectResp["+ i +"].Manager"));
			projectRespItem.setCustomerId(context.stringValue("ListProjectsResponse.ProjectResp["+ i +"].CustomerId"));
			projectRespItem.setCurrentVersion(context.stringValue("ListProjectsResponse.ProjectResp["+ i +"].CurrentVersion"));
			projectRespItem.setDeliveryDay(context.stringValue("ListProjectsResponse.ProjectResp["+ i +"].DeliveryDay"));
			projectRespItem.setDescription(context.stringValue("ListProjectsResponse.ProjectResp["+ i +"].Description"));
			projectRespItem.setUpdateTime(context.stringValue("ListProjectsResponse.ProjectResp["+ i +"].UpdateTime"));
			projectRespItem.setOrigin(context.stringValue("ListProjectsResponse.ProjectResp["+ i +"].Origin"));
			projectRespItem.setLockVersion(context.stringValue("ListProjectsResponse.ProjectResp["+ i +"].LockVersion"));
			projectRespItem.setStep(context.floatValue("ListProjectsResponse.ProjectResp["+ i +"].Step"));
			projectRespItem.setCreator(context.stringValue("ListProjectsResponse.ProjectResp["+ i +"].Creator"));

			projectResp.add(projectRespItem);
		}
		listProjectsResponse.setProjectResp(projectResp);
	 
	 	return listProjectsResponse;
	}
}