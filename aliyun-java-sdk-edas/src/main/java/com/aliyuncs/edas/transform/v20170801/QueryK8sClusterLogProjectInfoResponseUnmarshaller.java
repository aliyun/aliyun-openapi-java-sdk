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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.QueryK8sClusterLogProjectInfoResponse;
import com.aliyuncs.edas.model.v20170801.QueryK8sClusterLogProjectInfoResponse.ProjectInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryK8sClusterLogProjectInfoResponseUnmarshaller {

	public static QueryK8sClusterLogProjectInfoResponse unmarshall(QueryK8sClusterLogProjectInfoResponse queryK8sClusterLogProjectInfoResponse, UnmarshallerContext _ctx) {
		
		queryK8sClusterLogProjectInfoResponse.setRequestId(_ctx.stringValue("QueryK8sClusterLogProjectInfoResponse.RequestId"));
		queryK8sClusterLogProjectInfoResponse.setCode(_ctx.integerValue("QueryK8sClusterLogProjectInfoResponse.Code"));
		queryK8sClusterLogProjectInfoResponse.setMessage(_ctx.stringValue("QueryK8sClusterLogProjectInfoResponse.Message"));

		ProjectInfo projectInfo = new ProjectInfo();
		projectInfo.setProjectName(_ctx.stringValue("QueryK8sClusterLogProjectInfoResponse.ProjectInfo.ProjectName"));
		queryK8sClusterLogProjectInfoResponse.setProjectInfo(projectInfo);
	 
	 	return queryK8sClusterLogProjectInfoResponse;
	}
}