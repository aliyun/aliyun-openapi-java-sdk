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

package com.aliyuncs.cams.transform.v20200606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cams.model.v20200606.ListProductCatalogResponse;
import com.aliyuncs.cams.model.v20200606.ListProductCatalogResponse.Model;
import com.aliyuncs.cams.model.v20200606.ListProductCatalogResponse.Model.Paging;
import com.aliyuncs.cams.model.v20200606.ListProductCatalogResponse.Model.Paging.Cursors;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProductCatalogResponseUnmarshaller {

	public static ListProductCatalogResponse unmarshall(ListProductCatalogResponse listProductCatalogResponse, UnmarshallerContext _ctx) {
		
		listProductCatalogResponse.setRequestId(_ctx.stringValue("ListProductCatalogResponse.RequestId"));
		listProductCatalogResponse.setAccessDeniedDetail(_ctx.stringValue("ListProductCatalogResponse.AccessDeniedDetail"));
		listProductCatalogResponse.setMessage(_ctx.stringValue("ListProductCatalogResponse.Message"));
		listProductCatalogResponse.setCode(_ctx.stringValue("ListProductCatalogResponse.Code"));
		listProductCatalogResponse.setSuccess(_ctx.booleanValue("ListProductCatalogResponse.Success"));

		Model model = new Model();

		List<Map<Object, Object>> data = _ctx.listMapValue("ListProductCatalogResponse.Model.Data");
		model.setData(data);

		Paging paging = new Paging();

		Cursors cursors = new Cursors();
		cursors.setBefore(_ctx.stringValue("ListProductCatalogResponse.Model.Paging.Cursors.Before"));
		cursors.setAfter(_ctx.stringValue("ListProductCatalogResponse.Model.Paging.Cursors.After"));
		paging.setCursors(cursors);
		model.setPaging(paging);
		listProductCatalogResponse.setModel(model);
	 
	 	return listProductCatalogResponse;
	}
}