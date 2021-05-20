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

import com.aliyuncs.vcs.model.v20200515.AddProfileCatalogResponse;
import com.aliyuncs.vcs.model.v20200515.AddProfileCatalogResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddProfileCatalogResponseUnmarshaller {

	public static AddProfileCatalogResponse unmarshall(AddProfileCatalogResponse addProfileCatalogResponse, UnmarshallerContext _ctx) {
		
		addProfileCatalogResponse.setRequestId(_ctx.stringValue("AddProfileCatalogResponse.RequestId"));
		addProfileCatalogResponse.setMessage(_ctx.stringValue("AddProfileCatalogResponse.Message"));
		addProfileCatalogResponse.setCode(_ctx.stringValue("AddProfileCatalogResponse.Code"));

		Data data = new Data();
		data.setIsvSubId(_ctx.stringValue("AddProfileCatalogResponse.Data.IsvSubId"));
		data.setCatalogName(_ctx.stringValue("AddProfileCatalogResponse.Data.CatalogName"));
		data.setCatalogId(_ctx.longValue("AddProfileCatalogResponse.Data.CatalogId"));
		addProfileCatalogResponse.setData(data);
	 
	 	return addProfileCatalogResponse;
	}
}