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

package com.aliyuncs.mpserverless.transform.v20190930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpserverless.model.v20190930.ListExtensionsResponse;
import com.aliyuncs.mpserverless.model.v20190930.ListExtensionsResponse.ExtensionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExtensionsResponseUnmarshaller {

	public static ListExtensionsResponse unmarshall(ListExtensionsResponse listExtensionsResponse, UnmarshallerContext _ctx) {
		
		listExtensionsResponse.setRequestId(_ctx.stringValue("ListExtensionsResponse.RequestId"));
		listExtensionsResponse.setHttpStatusCode(_ctx.stringValue("ListExtensionsResponse.HttpStatusCode"));
		listExtensionsResponse.setSuccess(_ctx.booleanValue("ListExtensionsResponse.Success"));
		listExtensionsResponse.setCode(_ctx.stringValue("ListExtensionsResponse.Code"));
		listExtensionsResponse.setMessage(_ctx.stringValue("ListExtensionsResponse.Message"));
		listExtensionsResponse.setPageSize(_ctx.integerValue("ListExtensionsResponse.PageSize"));
		listExtensionsResponse.setPageNumber(_ctx.integerValue("ListExtensionsResponse.PageNumber"));
		listExtensionsResponse.setTotalCount(_ctx.integerValue("ListExtensionsResponse.TotalCount"));

		List<ExtensionsItem> extensions = new ArrayList<ExtensionsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListExtensionsResponse.Extensions.Length"); i++) {
			ExtensionsItem extensionsItem = new ExtensionsItem();
			extensionsItem.setExtensionId(_ctx.stringValue("ListExtensionsResponse.Extensions["+ i +"].ExtensionId"));
			extensionsItem.setExtensionName(_ctx.stringValue("ListExtensionsResponse.Extensions["+ i +"].ExtensionName"));
			extensionsItem.setExtensionDesc(_ctx.stringValue("ListExtensionsResponse.Extensions["+ i +"].ExtensionDesc"));
			extensionsItem.setExtensionDocumentationLink(_ctx.stringValue("ListExtensionsResponse.Extensions["+ i +"].ExtensionDocumentationLink"));
			extensionsItem.setEnabled(_ctx.stringValue("ListExtensionsResponse.Extensions["+ i +"].Enabled"));

			extensions.add(extensionsItem);
		}
		listExtensionsResponse.setExtensions(extensions);
	 
	 	return listExtensionsResponse;
	}
}