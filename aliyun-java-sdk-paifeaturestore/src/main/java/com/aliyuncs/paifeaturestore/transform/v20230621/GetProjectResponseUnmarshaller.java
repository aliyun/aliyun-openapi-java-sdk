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

import com.aliyuncs.paifeaturestore.model.v20230621.GetProjectResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectResponseUnmarshaller {

	public static GetProjectResponse unmarshall(GetProjectResponse getProjectResponse, UnmarshallerContext _ctx) {
		
		getProjectResponse.setRequestId(_ctx.stringValue("GetProjectResponse.RequestId"));
		getProjectResponse.setName(_ctx.stringValue("GetProjectResponse.Name"));
		getProjectResponse.setDescription(_ctx.stringValue("GetProjectResponse.Description"));
		getProjectResponse.setOfflineDatasourceType(_ctx.stringValue("GetProjectResponse.OfflineDatasourceType"));
		getProjectResponse.setOfflineDatasourceId(_ctx.stringValue("GetProjectResponse.OfflineDatasourceId"));
		getProjectResponse.setOfflineDatasourceName(_ctx.stringValue("GetProjectResponse.OfflineDatasourceName"));
		getProjectResponse.setOnlineDatasourceType(_ctx.stringValue("GetProjectResponse.OnlineDatasourceType"));
		getProjectResponse.setOnlineDatasourceId(_ctx.stringValue("GetProjectResponse.OnlineDatasourceId"));
		getProjectResponse.setOnlineDatasourceName(_ctx.stringValue("GetProjectResponse.OnlineDatasourceName"));
		getProjectResponse.setOfflineLifecycle(_ctx.integerValue("GetProjectResponse.OfflineLifecycle"));
		getProjectResponse.setFeatureEntityCount(_ctx.integerValue("GetProjectResponse.FeatureEntityCount"));
		getProjectResponse.setFeatureViewCount(_ctx.integerValue("GetProjectResponse.FeatureViewCount"));
		getProjectResponse.setModelCount(_ctx.integerValue("GetProjectResponse.ModelCount"));
		getProjectResponse.setOwner(_ctx.stringValue("GetProjectResponse.Owner"));
		getProjectResponse.setGmtCreateTime(_ctx.stringValue("GetProjectResponse.GmtCreateTime"));
		getProjectResponse.setGmtModifiedTime(_ctx.stringValue("GetProjectResponse.GmtModifiedTime"));
	 
	 	return getProjectResponse;
	}
}