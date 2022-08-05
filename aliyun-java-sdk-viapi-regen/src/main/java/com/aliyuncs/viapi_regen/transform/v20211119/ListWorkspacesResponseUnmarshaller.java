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

package com.aliyuncs.viapi_regen.transform.v20211119;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.viapi_regen.model.v20211119.ListWorkspacesResponse;
import com.aliyuncs.viapi_regen.model.v20211119.ListWorkspacesResponse.Data;
import com.aliyuncs.viapi_regen.model.v20211119.ListWorkspacesResponse.Data.Element;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkspacesResponseUnmarshaller {

	public static ListWorkspacesResponse unmarshall(ListWorkspacesResponse listWorkspacesResponse, UnmarshallerContext _ctx) {
		
		listWorkspacesResponse.setRequestId(_ctx.stringValue("ListWorkspacesResponse.RequestId"));
		listWorkspacesResponse.setMessage(_ctx.stringValue("ListWorkspacesResponse.Message"));
		listWorkspacesResponse.setCode(_ctx.stringValue("ListWorkspacesResponse.Code"));

		Data data = new Data();
		data.setCurrentPage(_ctx.longValue("ListWorkspacesResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.longValue("ListWorkspacesResponse.Data.PageSize"));
		data.setTotalPage(_ctx.longValue("ListWorkspacesResponse.Data.TotalPage"));
		data.setTotalCount(_ctx.longValue("ListWorkspacesResponse.Data.TotalCount"));

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("ListWorkspacesResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setId(_ctx.longValue("ListWorkspacesResponse.Data.Elements["+ i +"].Id"));
			element.setGmtCreate(_ctx.longValue("ListWorkspacesResponse.Data.Elements["+ i +"].GmtCreate"));
			element.setName(_ctx.stringValue("ListWorkspacesResponse.Data.Elements["+ i +"].Name"));
			element.setDescription(_ctx.stringValue("ListWorkspacesResponse.Data.Elements["+ i +"].Description"));
			element.setType(_ctx.stringValue("ListWorkspacesResponse.Data.Elements["+ i +"].Type"));

			elements.add(element);
		}
		data.setElements(elements);
		listWorkspacesResponse.setData(data);
	 
	 	return listWorkspacesResponse;
	}
}