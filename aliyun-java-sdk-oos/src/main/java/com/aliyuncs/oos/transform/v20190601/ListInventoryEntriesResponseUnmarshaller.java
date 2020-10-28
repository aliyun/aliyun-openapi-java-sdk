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

package com.aliyuncs.oos.transform.v20190601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oos.model.v20190601.ListInventoryEntriesResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInventoryEntriesResponseUnmarshaller {

	public static ListInventoryEntriesResponse unmarshall(ListInventoryEntriesResponse listInventoryEntriesResponse, UnmarshallerContext _ctx) {
		
		listInventoryEntriesResponse.setRequestId(_ctx.stringValue("ListInventoryEntriesResponse.RequestId"));
		listInventoryEntriesResponse.setNextToken(_ctx.stringValue("ListInventoryEntriesResponse.NextToken"));
		listInventoryEntriesResponse.setInstanceId(_ctx.stringValue("ListInventoryEntriesResponse.InstanceId"));
		listInventoryEntriesResponse.setCaptureTime(_ctx.stringValue("ListInventoryEntriesResponse.CaptureTime"));
		listInventoryEntriesResponse.setTypeName(_ctx.stringValue("ListInventoryEntriesResponse.TypeName"));
		listInventoryEntriesResponse.setSchemaVersion(_ctx.stringValue("ListInventoryEntriesResponse.SchemaVersion"));
		listInventoryEntriesResponse.setMaxResults(_ctx.integerValue("ListInventoryEntriesResponse.MaxResults"));

		List<Map<Object, Object>> entries = _ctx.listMapValue("ListInventoryEntriesResponse.Entries");
		listInventoryEntriesResponse.setEntries(entries);
	 
	 	return listInventoryEntriesResponse;
	}
}