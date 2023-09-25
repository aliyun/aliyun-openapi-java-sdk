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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListExtensionsResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListExtensionsResponse.PagingInfo;
import com.aliyuncs.dataworks_public.model.v20200518.ListExtensionsResponse.PagingInfo.ExtensionsItem;
import com.aliyuncs.dataworks_public.model.v20200518.ListExtensionsResponse.PagingInfo.ExtensionsItem.BindEventListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExtensionsResponseUnmarshaller {

	public static ListExtensionsResponse unmarshall(ListExtensionsResponse listExtensionsResponse, UnmarshallerContext _ctx) {
		
		listExtensionsResponse.setRequestId(_ctx.stringValue("ListExtensionsResponse.RequestId"));

		PagingInfo pagingInfo = new PagingInfo();
		pagingInfo.setPageNumber(_ctx.integerValue("ListExtensionsResponse.PagingInfo.PageNumber"));
		pagingInfo.setPageSize(_ctx.integerValue("ListExtensionsResponse.PagingInfo.PageSize"));
		pagingInfo.setTotalCount(_ctx.integerValue("ListExtensionsResponse.PagingInfo.TotalCount"));

		List<ExtensionsItem> extensions = new ArrayList<ExtensionsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListExtensionsResponse.PagingInfo.Extensions.Length"); i++) {
			ExtensionsItem extensionsItem = new ExtensionsItem();
			extensionsItem.setStatus(_ctx.integerValue("ListExtensionsResponse.PagingInfo.Extensions["+ i +"].Status"));
			extensionsItem.setExtensionDesc(_ctx.stringValue("ListExtensionsResponse.PagingInfo.Extensions["+ i +"].ExtensionDesc"));
			extensionsItem.setExtensionName(_ctx.stringValue("ListExtensionsResponse.PagingInfo.Extensions["+ i +"].ExtensionName"));
			extensionsItem.setOwner(_ctx.stringValue("ListExtensionsResponse.PagingInfo.Extensions["+ i +"].Owner"));
			extensionsItem.setExtensionCode(_ctx.stringValue("ListExtensionsResponse.PagingInfo.Extensions["+ i +"].ExtensionCode"));

			List<BindEventListItem> bindEventList = new ArrayList<BindEventListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListExtensionsResponse.PagingInfo.Extensions["+ i +"].BindEventList.Length"); j++) {
				BindEventListItem bindEventListItem = new BindEventListItem();
				bindEventListItem.setEventName(_ctx.stringValue("ListExtensionsResponse.PagingInfo.Extensions["+ i +"].BindEventList["+ j +"].EventName"));
				bindEventListItem.setEventCode(_ctx.stringValue("ListExtensionsResponse.PagingInfo.Extensions["+ i +"].BindEventList["+ j +"].EventCode"));

				bindEventList.add(bindEventListItem);
			}
			extensionsItem.setBindEventList(bindEventList);

			extensions.add(extensionsItem);
		}
		pagingInfo.setExtensions(extensions);
		listExtensionsResponse.setPagingInfo(pagingInfo);
	 
	 	return listExtensionsResponse;
	}
}