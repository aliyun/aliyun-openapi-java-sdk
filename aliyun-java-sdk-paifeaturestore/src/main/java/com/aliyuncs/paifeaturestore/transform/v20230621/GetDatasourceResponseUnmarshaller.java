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

import com.aliyuncs.paifeaturestore.model.v20230621.GetDatasourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDatasourceResponseUnmarshaller {

	public static GetDatasourceResponse unmarshall(GetDatasourceResponse getDatasourceResponse, UnmarshallerContext _ctx) {
		
		getDatasourceResponse.setRequestId(_ctx.stringValue("GetDatasourceResponse.RequestId"));
		getDatasourceResponse.setDatasourceId(_ctx.stringValue("GetDatasourceResponse.DatasourceId"));
		getDatasourceResponse.setName(_ctx.stringValue("GetDatasourceResponse.Name"));
		getDatasourceResponse.setType(_ctx.stringValue("GetDatasourceResponse.Type"));
		getDatasourceResponse.setUri(_ctx.stringValue("GetDatasourceResponse.Uri"));
		getDatasourceResponse.setConfig(_ctx.stringValue("GetDatasourceResponse.Config"));
		getDatasourceResponse.setWorkspaceId(_ctx.stringValue("GetDatasourceResponse.WorkspaceId"));
		getDatasourceResponse.setGmtCreateTime(_ctx.stringValue("GetDatasourceResponse.GmtCreateTime"));
		getDatasourceResponse.setGmtModifiedTime(_ctx.stringValue("GetDatasourceResponse.GmtModifiedTime"));
	 
	 	return getDatasourceResponse;
	}
}