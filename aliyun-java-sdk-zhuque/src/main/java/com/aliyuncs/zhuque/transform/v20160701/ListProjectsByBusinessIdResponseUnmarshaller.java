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

import com.aliyuncs.zhuque.model.v20160701.ListProjectsByBusinessIdResponse;
import com.aliyuncs.zhuque.model.v20160701.ListProjectsByBusinessIdResponse.ProjectRespItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProjectsByBusinessIdResponseUnmarshaller {

	public static ListProjectsByBusinessIdResponse unmarshall(ListProjectsByBusinessIdResponse listProjectsByBusinessIdResponse, UnmarshallerContext context) {
		
		listProjectsByBusinessIdResponse.setRequestId(context.stringValue("ListProjectsByBusinessIdResponse.RequestId"));
		listProjectsByBusinessIdResponse.setResult(context.stringValue("ListProjectsByBusinessIdResponse.Result"));
		listProjectsByBusinessIdResponse.setMessage(context.stringValue("ListProjectsByBusinessIdResponse.Message"));

		List<ProjectRespItem> projectResp = new ArrayList<ProjectRespItem>();
		for (int i = 0; i < context.lengthValue("ListProjectsByBusinessIdResponse.ProjectResp.Length"); i++) {
			ProjectRespItem projectRespItem = new ProjectRespItem();
			projectRespItem.setId(context.integerValue("ListProjectsByBusinessIdResponse.ProjectResp["+ i +"].Id"));
			projectRespItem.setProjectId(context.stringValue("ListProjectsByBusinessIdResponse.ProjectResp["+ i +"].ProjectId"));
			projectRespItem.setProjectName(context.stringValue("ListProjectsByBusinessIdResponse.ProjectResp["+ i +"].ProjectName"));
			projectRespItem.setProjectType(context.stringValue("ListProjectsByBusinessIdResponse.ProjectResp["+ i +"].ProjectType"));
			projectRespItem.setCloudInstance(context.stringValue("ListProjectsByBusinessIdResponse.ProjectResp["+ i +"].CloudInstance"));
			projectRespItem.setDisplayName(context.stringValue("ListProjectsByBusinessIdResponse.ProjectResp["+ i +"].DisplayName"));
			projectRespItem.setCloudType(context.stringValue("ListProjectsByBusinessIdResponse.ProjectResp["+ i +"].CloudType"));
			projectRespItem.setRegion(context.stringValue("ListProjectsByBusinessIdResponse.ProjectResp["+ i +"].Region"));
			projectRespItem.setAzone(context.stringValue("ListProjectsByBusinessIdResponse.ProjectResp["+ i +"].Azone"));
			projectRespItem.setManager(context.stringValue("ListProjectsByBusinessIdResponse.ProjectResp["+ i +"].Manager"));
			projectRespItem.setCustomerId(context.stringValue("ListProjectsByBusinessIdResponse.ProjectResp["+ i +"].CustomerId"));
			projectRespItem.setCurrentVersion(context.stringValue("ListProjectsByBusinessIdResponse.ProjectResp["+ i +"].CurrentVersion"));
			projectRespItem.setDeliveryDay(context.stringValue("ListProjectsByBusinessIdResponse.ProjectResp["+ i +"].DeliveryDay"));
			projectRespItem.setDescription(context.stringValue("ListProjectsByBusinessIdResponse.ProjectResp["+ i +"].Description"));
			projectRespItem.setUpdateTime(context.stringValue("ListProjectsByBusinessIdResponse.ProjectResp["+ i +"].UpdateTime"));
			projectRespItem.setOrigin(context.stringValue("ListProjectsByBusinessIdResponse.ProjectResp["+ i +"].Origin"));
			projectRespItem.setLockVersion(context.stringValue("ListProjectsByBusinessIdResponse.ProjectResp["+ i +"].LockVersion"));
			projectRespItem.setStep(context.floatValue("ListProjectsByBusinessIdResponse.ProjectResp["+ i +"].Step"));
			projectRespItem.setCreator(context.stringValue("ListProjectsByBusinessIdResponse.ProjectResp["+ i +"].Creator"));

			projectResp.add(projectRespItem);
		}
		listProjectsByBusinessIdResponse.setProjectResp(projectResp);
	 
	 	return listProjectsByBusinessIdResponse;
	}
}