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

import com.aliyuncs.zhuque.model.v20160701.GetProjectIdByBusinessInfoResponse;
import com.aliyuncs.zhuque.model.v20160701.GetProjectIdByBusinessInfoResponse.ProjectId;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectIdByBusinessInfoResponseUnmarshaller {

	public static GetProjectIdByBusinessInfoResponse unmarshall(GetProjectIdByBusinessInfoResponse getProjectIdByBusinessInfoResponse, UnmarshallerContext context) {
		
		getProjectIdByBusinessInfoResponse.setRequestId(context.stringValue("GetProjectIdByBusinessInfoResponse.RequestId"));
		getProjectIdByBusinessInfoResponse.setResult(context.stringValue("GetProjectIdByBusinessInfoResponse.Result"));
		getProjectIdByBusinessInfoResponse.setMessage(context.stringValue("GetProjectIdByBusinessInfoResponse.Message"));

		ProjectId projectId = new ProjectId();
		projectId.setProjectId(context.stringValue("GetProjectIdByBusinessInfoResponse.ProjectId.ProjectId"));
		getProjectIdByBusinessInfoResponse.setProjectId(projectId);
	 
	 	return getProjectIdByBusinessInfoResponse;
	}
}