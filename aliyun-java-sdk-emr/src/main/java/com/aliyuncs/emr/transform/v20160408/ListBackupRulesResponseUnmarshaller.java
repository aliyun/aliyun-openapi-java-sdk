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

import com.aliyuncs.emr.model.v20160408.ListBackupRulesResponse;
import com.aliyuncs.emr.model.v20160408.ListBackupRulesResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBackupRulesResponseUnmarshaller {

	public static ListBackupRulesResponse unmarshall(ListBackupRulesResponse listBackupRulesResponse, UnmarshallerContext _ctx) {
		
		listBackupRulesResponse.setRequestId(_ctx.stringValue("ListBackupRulesResponse.RequestId"));
		listBackupRulesResponse.setPageNumber(_ctx.integerValue("ListBackupRulesResponse.PageNumber"));
		listBackupRulesResponse.setPageSize(_ctx.integerValue("ListBackupRulesResponse.PageSize"));
		listBackupRulesResponse.setTotalCount(_ctx.integerValue("ListBackupRulesResponse.TotalCount"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("ListBackupRulesResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setId(_ctx.stringValue("ListBackupRulesResponse.Items["+ i +"].Id"));
			item.setName(_ctx.stringValue("ListBackupRulesResponse.Items["+ i +"].Name"));
			item.setDescription(_ctx.stringValue("ListBackupRulesResponse.Items["+ i +"].Description"));
			item.setMetadataType(_ctx.stringValue("ListBackupRulesResponse.Items["+ i +"].MetadataType"));
			item.setBackupMethodType(_ctx.stringValue("ListBackupRulesResponse.Items["+ i +"].BackupMethodType"));
			item.setBackupPlanId(_ctx.stringValue("ListBackupRulesResponse.Items["+ i +"].BackupPlanId"));

			items.add(item);
		}
		listBackupRulesResponse.setItems(items);
	 
	 	return listBackupRulesResponse;
	}
}