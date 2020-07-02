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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.GetMetaDBInfoResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaDBInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetaDBInfoResponseUnmarshaller {

	public static GetMetaDBInfoResponse unmarshall(GetMetaDBInfoResponse getMetaDBInfoResponse, UnmarshallerContext _ctx) {
		
		getMetaDBInfoResponse.setRequestId(_ctx.stringValue("GetMetaDBInfoResponse.RequestId"));
		getMetaDBInfoResponse.setErrorCode(_ctx.stringValue("GetMetaDBInfoResponse.ErrorCode"));
		getMetaDBInfoResponse.setErrorMessage(_ctx.stringValue("GetMetaDBInfoResponse.ErrorMessage"));
		getMetaDBInfoResponse.setHttpStatusCode(_ctx.integerValue("GetMetaDBInfoResponse.HttpStatusCode"));
		getMetaDBInfoResponse.setSuccess(_ctx.booleanValue("GetMetaDBInfoResponse.Success"));

		Data data = new Data();
		data.setAppGuid(_ctx.stringValue("GetMetaDBInfoResponse.Data.AppGuid"));
		data.setTenantId(_ctx.longValue("GetMetaDBInfoResponse.Data.TenantId"));
		data.setEndpoint(_ctx.stringValue("GetMetaDBInfoResponse.Data.Endpoint"));
		data.setProjectId(_ctx.longValue("GetMetaDBInfoResponse.Data.ProjectId"));
		data.setEnvType(_ctx.integerValue("GetMetaDBInfoResponse.Data.EnvType"));
		data.setProjectName(_ctx.stringValue("GetMetaDBInfoResponse.Data.ProjectName"));
		data.setProjectNameCn(_ctx.stringValue("GetMetaDBInfoResponse.Data.ProjectNameCn"));
		data.setCreateTime(_ctx.longValue("GetMetaDBInfoResponse.Data.CreateTime"));
		data.setModifyTime(_ctx.longValue("GetMetaDBInfoResponse.Data.ModifyTime"));
		data.setOwnerId(_ctx.stringValue("GetMetaDBInfoResponse.Data.OwnerId"));
		data.setOwnerName(_ctx.stringValue("GetMetaDBInfoResponse.Data.OwnerName"));
		getMetaDBInfoResponse.setData(data);
	 
	 	return getMetaDBInfoResponse;
	}
}