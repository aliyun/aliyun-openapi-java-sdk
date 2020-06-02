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

package com.aliyuncs.cr.transform.v20181201;

import com.aliyuncs.cr.model.v20181201.GetChartRepositoryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetChartRepositoryResponseUnmarshaller {

	public static GetChartRepositoryResponse unmarshall(GetChartRepositoryResponse getChartRepositoryResponse, UnmarshallerContext _ctx) {
		
		getChartRepositoryResponse.setRequestId(_ctx.stringValue("GetChartRepositoryResponse.RequestId"));
		getChartRepositoryResponse.setIsSuccess(_ctx.booleanValue("GetChartRepositoryResponse.IsSuccess"));
		getChartRepositoryResponse.setCode(_ctx.stringValue("GetChartRepositoryResponse.Code"));
		getChartRepositoryResponse.setInstanceId(_ctx.stringValue("GetChartRepositoryResponse.InstanceId"));
		getChartRepositoryResponse.setRepoId(_ctx.stringValue("GetChartRepositoryResponse.RepoId"));
		getChartRepositoryResponse.setRepoNamespaceName(_ctx.stringValue("GetChartRepositoryResponse.RepoNamespaceName"));
		getChartRepositoryResponse.setRepoName(_ctx.stringValue("GetChartRepositoryResponse.RepoName"));
		getChartRepositoryResponse.setRepoStatus(_ctx.stringValue("GetChartRepositoryResponse.RepoStatus"));
		getChartRepositoryResponse.setRepoType(_ctx.stringValue("GetChartRepositoryResponse.RepoType"));
		getChartRepositoryResponse.setSummary(_ctx.stringValue("GetChartRepositoryResponse.Summary"));
		getChartRepositoryResponse.setCreateTime(_ctx.longValue("GetChartRepositoryResponse.CreateTime"));
		getChartRepositoryResponse.setModifiedTime(_ctx.longValue("GetChartRepositoryResponse.ModifiedTime"));
	 
	 	return getChartRepositoryResponse;
	}
}