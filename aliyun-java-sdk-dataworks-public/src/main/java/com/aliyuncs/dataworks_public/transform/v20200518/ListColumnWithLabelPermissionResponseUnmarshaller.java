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

import com.aliyuncs.dataworks_public.model.v20200518.ListColumnWithLabelPermissionResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListColumnWithLabelPermissionResponse.ColumnMetaItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListColumnWithLabelPermissionResponseUnmarshaller {

	public static ListColumnWithLabelPermissionResponse unmarshall(ListColumnWithLabelPermissionResponse listColumnWithLabelPermissionResponse, UnmarshallerContext _ctx) {
		
		listColumnWithLabelPermissionResponse.setRequestId(_ctx.stringValue("ListColumnWithLabelPermissionResponse.RequestId"));

		List<ColumnMetaItem> columnMeta = new ArrayList<ColumnMetaItem>();
		for (int i = 0; i < _ctx.lengthValue("ListColumnWithLabelPermissionResponse.ColumnMeta.Length"); i++) {
			ColumnMetaItem columnMetaItem = new ColumnMetaItem();
			columnMetaItem.setGuid(_ctx.stringValue("ListColumnWithLabelPermissionResponse.ColumnMeta["+ i +"].Guid"));
			columnMetaItem.setName(_ctx.stringValue("ListColumnWithLabelPermissionResponse.ColumnMeta["+ i +"].Name"));
			columnMetaItem.setComment(_ctx.stringValue("ListColumnWithLabelPermissionResponse.ColumnMeta["+ i +"].Comment"));
			columnMetaItem.setSecurityLevel(_ctx.stringValue("ListColumnWithLabelPermissionResponse.ColumnMeta["+ i +"].SecurityLevel"));
			columnMetaItem.setDeadline(_ctx.stringValue("ListColumnWithLabelPermissionResponse.ColumnMeta["+ i +"].Deadline"));
			columnMetaItem.setGrantedLabel(_ctx.stringValue("ListColumnWithLabelPermissionResponse.ColumnMeta["+ i +"].GrantedLabel"));

			columnMeta.add(columnMetaItem);
		}
		listColumnWithLabelPermissionResponse.setColumnMeta(columnMeta);
	 
	 	return listColumnWithLabelPermissionResponse;
	}
}