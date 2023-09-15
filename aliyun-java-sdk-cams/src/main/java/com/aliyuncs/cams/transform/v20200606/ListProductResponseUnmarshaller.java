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

import com.aliyuncs.cams.model.v20200606.ListProductResponse;
import com.aliyuncs.cams.model.v20200606.ListProductResponse.Model;
import com.aliyuncs.cams.model.v20200606.ListProductResponse.Model.Paging;
import com.aliyuncs.cams.model.v20200606.ListProductResponse.Model.Paging.Cursors;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProductResponseUnmarshaller {

	public static ListProductResponse unmarshall(ListProductResponse listProductResponse, UnmarshallerContext _ctx) {
		
		listProductResponse.setRequestId(_ctx.stringValue("ListProductResponse.RequestId"));
		listProductResponse.setAccessDeniedDetail(_ctx.stringValue("ListProductResponse.AccessDeniedDetail"));
		listProductResponse.setMessage(_ctx.stringValue("ListProductResponse.Message"));
		listProductResponse.setCode(_ctx.stringValue("ListProductResponse.Code"));
		listProductResponse.setSuccess(_ctx.booleanValue("ListProductResponse.Success"));

		Model model = new Model();

		List<Map<Object, Object>> data = _ctx.listMapValue("ListProductResponse.Model.Data");
		model.setData(data);

		Paging paging = new Paging();

		Cursors cursors = new Cursors();
		cursors.setBefore(_ctx.stringValue("ListProductResponse.Model.Paging.Cursors.Before"));
		cursors.setAfter(_ctx.stringValue("ListProductResponse.Model.Paging.Cursors.After"));
		paging.setCursors(cursors);
		model.setPaging(paging);
		listProductResponse.setModel(model);
	 
	 	return listProductResponse;
	}
}