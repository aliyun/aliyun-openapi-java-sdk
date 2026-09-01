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

package com.aliyuncs.quickbi_public.transform.v20220101;

import com.aliyuncs.quickbi_public.model.v20220101.GetDataSourceConnectionInfoResponse;
import com.aliyuncs.quickbi_public.model.v20220101.GetDataSourceConnectionInfoResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataSourceConnectionInfoResponseUnmarshaller {

	public static GetDataSourceConnectionInfoResponse unmarshall(GetDataSourceConnectionInfoResponse getDataSourceConnectionInfoResponse, UnmarshallerContext _ctx) {
		
		getDataSourceConnectionInfoResponse.setRequestId(_ctx.stringValue("GetDataSourceConnectionInfoResponse.RequestId"));
		getDataSourceConnectionInfoResponse.setSuccess(_ctx.booleanValue("GetDataSourceConnectionInfoResponse.Success"));

		Result result = new Result();
		result.setModifyUser(_ctx.stringValue("GetDataSourceConnectionInfoResponse.Result.ModifyUser"));
		result.setAddress(_ctx.stringValue("GetDataSourceConnectionInfoResponse.Result.Address"));
		result.setInstance(_ctx.stringValue("GetDataSourceConnectionInfoResponse.Result.Instance"));
		result.setInstanceId(_ctx.stringValue("GetDataSourceConnectionInfoResponse.Result.InstanceId"));
		result.setCreatorId(_ctx.stringValue("GetDataSourceConnectionInfoResponse.Result.CreatorId"));
		result.setPort(_ctx.stringValue("GetDataSourceConnectionInfoResponse.Result.Port"));
		result.setSchema(_ctx.stringValue("GetDataSourceConnectionInfoResponse.Result.Schema"));
		result.setWorkspaceId(_ctx.stringValue("GetDataSourceConnectionInfoResponse.Result.WorkspaceId"));
		result.setDsId(_ctx.stringValue("GetDataSourceConnectionInfoResponse.Result.DsId"));
		result.setParentDsType(_ctx.stringValue("GetDataSourceConnectionInfoResponse.Result.ParentDsType"));
		result.setDsVersion(_ctx.stringValue("GetDataSourceConnectionInfoResponse.Result.DsVersion"));
		result.setShowName(_ctx.stringValue("GetDataSourceConnectionInfoResponse.Result.ShowName"));
		result.setAuthLevel(_ctx.stringValue("GetDataSourceConnectionInfoResponse.Result.AuthLevel"));
		result.setDsType(_ctx.stringValue("GetDataSourceConnectionInfoResponse.Result.DsType"));
		result.setProject(_ctx.stringValue("GetDataSourceConnectionInfoResponse.Result.Project"));
		result.setNoSasl(_ctx.booleanValue("GetDataSourceConnectionInfoResponse.Result.NoSasl"));
		getDataSourceConnectionInfoResponse.setResult(result);
	 
	 	return getDataSourceConnectionInfoResponse;
	}
}