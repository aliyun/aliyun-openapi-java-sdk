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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.GetDataLakeCatalogResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetDataLakeCatalogResponse.Catalog;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataLakeCatalogResponseUnmarshaller {

	public static GetDataLakeCatalogResponse unmarshall(GetDataLakeCatalogResponse getDataLakeCatalogResponse, UnmarshallerContext _ctx) {
		
		getDataLakeCatalogResponse.setRequestId(_ctx.stringValue("GetDataLakeCatalogResponse.RequestId"));
		getDataLakeCatalogResponse.setSuccess(_ctx.booleanValue("GetDataLakeCatalogResponse.Success"));
		getDataLakeCatalogResponse.setErrorCode(_ctx.stringValue("GetDataLakeCatalogResponse.ErrorCode"));
		getDataLakeCatalogResponse.setErrorMessage(_ctx.stringValue("GetDataLakeCatalogResponse.ErrorMessage"));

		Catalog catalog = new Catalog();
		catalog.setDescription(_ctx.stringValue("GetDataLakeCatalogResponse.Catalog.Description"));
		catalog.setName(_ctx.stringValue("GetDataLakeCatalogResponse.Catalog.Name"));
		catalog.setLocation(_ctx.stringValue("GetDataLakeCatalogResponse.Catalog.Location"));
		getDataLakeCatalogResponse.setCatalog(catalog);
	 
	 	return getDataLakeCatalogResponse;
	}
}