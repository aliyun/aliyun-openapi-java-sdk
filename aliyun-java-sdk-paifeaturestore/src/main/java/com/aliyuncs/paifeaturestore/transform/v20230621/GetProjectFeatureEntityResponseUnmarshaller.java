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

package com.aliyuncs.paifeaturestore.transform.v20230621;

import com.aliyuncs.paifeaturestore.model.v20230621.GetProjectFeatureEntityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectFeatureEntityResponseUnmarshaller {

	public static GetProjectFeatureEntityResponse unmarshall(GetProjectFeatureEntityResponse getProjectFeatureEntityResponse, UnmarshallerContext _ctx) {
		
		getProjectFeatureEntityResponse.setRequestId(_ctx.stringValue("GetProjectFeatureEntityResponse.RequestId"));
		getProjectFeatureEntityResponse.setName(_ctx.stringValue("GetProjectFeatureEntityResponse.Name"));
		getProjectFeatureEntityResponse.setFeatureEntityId(_ctx.stringValue("GetProjectFeatureEntityResponse.FeatureEntityId"));
		getProjectFeatureEntityResponse.setProjectName(_ctx.stringValue("GetProjectFeatureEntityResponse.ProjectName"));
		getProjectFeatureEntityResponse.setWorkspaceId(_ctx.stringValue("GetProjectFeatureEntityResponse.WorkspaceId"));
		getProjectFeatureEntityResponse.setJoinId(_ctx.stringValue("GetProjectFeatureEntityResponse.JoinId"));
	 
	 	return getProjectFeatureEntityResponse;
	}
}