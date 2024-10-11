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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetMyTenantsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetMyTenantsResponse.TenantInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMyTenantsResponseUnmarshaller {

	public static GetMyTenantsResponse unmarshall(GetMyTenantsResponse getMyTenantsResponse, UnmarshallerContext _ctx) {
		
		getMyTenantsResponse.setRequestId(_ctx.stringValue("GetMyTenantsResponse.RequestId"));
		getMyTenantsResponse.setSuccess(_ctx.booleanValue("GetMyTenantsResponse.Success"));
		getMyTenantsResponse.setHttpStatusCode(_ctx.integerValue("GetMyTenantsResponse.HttpStatusCode"));
		getMyTenantsResponse.setCode(_ctx.stringValue("GetMyTenantsResponse.Code"));
		getMyTenantsResponse.setMessage(_ctx.stringValue("GetMyTenantsResponse.Message"));

		List<TenantInfo> tenantList = new ArrayList<TenantInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetMyTenantsResponse.TenantList.Length"); i++) {
			TenantInfo tenantInfo = new TenantInfo();
			tenantInfo.setId(_ctx.longValue("GetMyTenantsResponse.TenantList["+ i +"].Id"));
			tenantInfo.setName(_ctx.stringValue("GetMyTenantsResponse.TenantList["+ i +"].Name"));
			tenantInfo.setOwnerId(_ctx.stringValue("GetMyTenantsResponse.TenantList["+ i +"].OwnerId"));
			tenantInfo.setDescription(_ctx.stringValue("GetMyTenantsResponse.TenantList["+ i +"].Description"));
			tenantInfo.setDeleted(_ctx.booleanValue("GetMyTenantsResponse.TenantList["+ i +"].Deleted"));
			tenantInfo.setDeleteTime(_ctx.longValue("GetMyTenantsResponse.TenantList["+ i +"].DeleteTime"));
			tenantInfo.setTitleType(_ctx.stringValue("GetMyTenantsResponse.TenantList["+ i +"].TitleType"));
			tenantInfo.setOpsTenant(_ctx.booleanValue("GetMyTenantsResponse.TenantList["+ i +"].OpsTenant"));
			tenantInfo.setResourceLimited(_ctx.booleanValue("GetMyTenantsResponse.TenantList["+ i +"].ResourceLimited"));
			tenantInfo.setVisible(_ctx.booleanValue("GetMyTenantsResponse.TenantList["+ i +"].Visible"));

			List<String> tenantTypeList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetMyTenantsResponse.TenantList["+ i +"].TenantTypeList.Length"); j++) {
				tenantTypeList.add(_ctx.stringValue("GetMyTenantsResponse.TenantList["+ i +"].TenantTypeList["+ j +"]"));
			}
			tenantInfo.setTenantTypeList(tenantTypeList);

			tenantList.add(tenantInfo);
		}
		getMyTenantsResponse.setTenantList(tenantList);
	 
	 	return getMyTenantsResponse;
	}
}