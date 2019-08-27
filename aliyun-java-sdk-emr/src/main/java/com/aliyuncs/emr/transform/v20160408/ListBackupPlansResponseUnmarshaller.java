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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListBackupPlansResponse;
import com.aliyuncs.emr.model.v20160408.ListBackupPlansResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBackupPlansResponseUnmarshaller {

	public static ListBackupPlansResponse unmarshall(ListBackupPlansResponse listBackupPlansResponse, UnmarshallerContext _ctx) {
		
		listBackupPlansResponse.setRequestId(_ctx.stringValue("ListBackupPlansResponse.RequestId"));
		listBackupPlansResponse.setPageNumber(_ctx.integerValue("ListBackupPlansResponse.PageNumber"));
		listBackupPlansResponse.setPageSize(_ctx.integerValue("ListBackupPlansResponse.PageSize"));
		listBackupPlansResponse.setTotalCount(_ctx.integerValue("ListBackupPlansResponse.TotalCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListBackupPlansResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setId(_ctx.stringValue("ListBackupPlansResponse.Items["+ i +"].Id"));
			item.setName(_ctx.stringValue("ListBackupPlansResponse.Items["+ i +"].Name"));
			item.setDescription(_ctx.stringValue("ListBackupPlansResponse.Items["+ i +"].Description"));
			item.setClusterId(_ctx.stringValue("ListBackupPlansResponse.Items["+ i +"].ClusterId"));
			item.setRootPath(_ctx.stringValue("ListBackupPlansResponse.Items["+ i +"].RootPath"));

			items.add(item);
		}
		listBackupPlansResponse.setItems(items);
	 
	 	return listBackupPlansResponse;
	}
}