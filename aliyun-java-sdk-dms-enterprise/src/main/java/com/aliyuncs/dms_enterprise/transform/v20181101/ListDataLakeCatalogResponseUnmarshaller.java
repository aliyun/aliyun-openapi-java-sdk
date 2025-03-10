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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListDataLakeCatalogResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListDataLakeCatalogResponse.Catalog;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataLakeCatalogResponseUnmarshaller {

	public static ListDataLakeCatalogResponse unmarshall(ListDataLakeCatalogResponse listDataLakeCatalogResponse, UnmarshallerContext _ctx) {
		
		listDataLakeCatalogResponse.setRequestId(_ctx.stringValue("ListDataLakeCatalogResponse.RequestId"));
		listDataLakeCatalogResponse.setSuccess(_ctx.booleanValue("ListDataLakeCatalogResponse.Success"));
		listDataLakeCatalogResponse.setErrorCode(_ctx.stringValue("ListDataLakeCatalogResponse.ErrorCode"));
		listDataLakeCatalogResponse.setErrorMessage(_ctx.stringValue("ListDataLakeCatalogResponse.ErrorMessage"));

		List<Catalog> cataLogList = new ArrayList<Catalog>();
		for (int i = 0; i < _ctx.lengthValue("ListDataLakeCatalogResponse.CataLogList.Length"); i++) {
			Catalog catalog = new Catalog();
			catalog.setDescription(_ctx.stringValue("ListDataLakeCatalogResponse.CataLogList["+ i +"].Description"));
			catalog.setName(_ctx.stringValue("ListDataLakeCatalogResponse.CataLogList["+ i +"].Name"));
			catalog.setLocation(_ctx.stringValue("ListDataLakeCatalogResponse.CataLogList["+ i +"].Location"));

			cataLogList.add(catalog);
		}
		listDataLakeCatalogResponse.setCataLogList(cataLogList);
	 
	 	return listDataLakeCatalogResponse;
	}
}