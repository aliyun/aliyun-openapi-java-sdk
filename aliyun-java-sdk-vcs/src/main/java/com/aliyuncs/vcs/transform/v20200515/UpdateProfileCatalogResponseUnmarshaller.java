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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.UpdateProfileCatalogResponse;
import com.aliyuncs.vcs.model.v20200515.UpdateProfileCatalogResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateProfileCatalogResponseUnmarshaller {

	public static UpdateProfileCatalogResponse unmarshall(UpdateProfileCatalogResponse updateProfileCatalogResponse, UnmarshallerContext _ctx) {
		
		updateProfileCatalogResponse.setRequestId(_ctx.stringValue("UpdateProfileCatalogResponse.RequestId"));
		updateProfileCatalogResponse.setMessage(_ctx.stringValue("UpdateProfileCatalogResponse.Message"));
		updateProfileCatalogResponse.setCode(_ctx.stringValue("UpdateProfileCatalogResponse.Code"));

		Data data = new Data();
		data.setCatalogId(_ctx.longValue("UpdateProfileCatalogResponse.Data.CatalogId"));
		data.setCatalogName(_ctx.stringValue("UpdateProfileCatalogResponse.Data.CatalogName"));
		data.setIsvSubId(_ctx.stringValue("UpdateProfileCatalogResponse.Data.IsvSubId"));
		data.setParentCatalogId(_ctx.stringValue("UpdateProfileCatalogResponse.Data.ParentCatalogId"));
		data.setProfileCount(_ctx.longValue("UpdateProfileCatalogResponse.Data.ProfileCount"));
		updateProfileCatalogResponse.setData(data);
	 
	 	return updateProfileCatalogResponse;
	}
}