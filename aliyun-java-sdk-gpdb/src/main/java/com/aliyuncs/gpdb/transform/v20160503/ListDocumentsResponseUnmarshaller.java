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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.ListDocumentsResponse;
import com.aliyuncs.gpdb.model.v20160503.ListDocumentsResponse.DocumentList;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDocumentsResponseUnmarshaller {

	public static ListDocumentsResponse unmarshall(ListDocumentsResponse listDocumentsResponse, UnmarshallerContext _ctx) {
		
		listDocumentsResponse.setRequestId(_ctx.stringValue("ListDocumentsResponse.RequestId"));
		listDocumentsResponse.setMessage(_ctx.stringValue("ListDocumentsResponse.Message"));
		listDocumentsResponse.setStatus(_ctx.stringValue("ListDocumentsResponse.Status"));
		listDocumentsResponse.setNextToken(_ctx.stringValue("ListDocumentsResponse.NextToken"));
		listDocumentsResponse.setCount(_ctx.integerValue("ListDocumentsResponse.Count"));

		List<DocumentList> items = new ArrayList<DocumentList>();
		for (int i = 0; i < _ctx.lengthValue("ListDocumentsResponse.Items.Length"); i++) {
			DocumentList documentList = new DocumentList();
			documentList.setFileName(_ctx.stringValue("ListDocumentsResponse.Items["+ i +"].FileName"));
			documentList.setSource(_ctx.stringValue("ListDocumentsResponse.Items["+ i +"].Source"));

			items.add(documentList);
		}
		listDocumentsResponse.setItems(items);
	 
	 	return listDocumentsResponse;
	}
}