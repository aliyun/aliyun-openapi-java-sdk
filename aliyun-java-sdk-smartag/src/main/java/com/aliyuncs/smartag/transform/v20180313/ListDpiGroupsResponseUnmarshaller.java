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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.ListDpiGroupsResponse;
import com.aliyuncs.smartag.model.v20180313.ListDpiGroupsResponse.DpiGroupItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDpiGroupsResponseUnmarshaller {

	public static ListDpiGroupsResponse unmarshall(ListDpiGroupsResponse listDpiGroupsResponse, UnmarshallerContext _ctx) {
		
		listDpiGroupsResponse.setRequestId(_ctx.stringValue("ListDpiGroupsResponse.RequestId"));
		listDpiGroupsResponse.setTotalCount(_ctx.integerValue("ListDpiGroupsResponse.TotalCount"));
		listDpiGroupsResponse.setNextToken(_ctx.stringValue("ListDpiGroupsResponse.NextToken"));

		List<DpiGroupItem> dpiGroup = new ArrayList<DpiGroupItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDpiGroupsResponse.DpiGroup.Length"); i++) {
			DpiGroupItem dpiGroupItem = new DpiGroupItem();
			dpiGroupItem.setMinSignatureDbVersion(_ctx.stringValue("ListDpiGroupsResponse.DpiGroup["+ i +"].MinSignatureDbVersion"));
			dpiGroupItem.setDpiGroupName(_ctx.stringValue("ListDpiGroupsResponse.DpiGroup["+ i +"].DpiGroupName"));
			dpiGroupItem.setDpiGroupId(_ctx.stringValue("ListDpiGroupsResponse.DpiGroup["+ i +"].DpiGroupId"));
			dpiGroupItem.setMinEngineVersion(_ctx.stringValue("ListDpiGroupsResponse.DpiGroup["+ i +"].MinEngineVersion"));

			dpiGroup.add(dpiGroupItem);
		}
		listDpiGroupsResponse.setDpiGroup(dpiGroup);
	 
	 	return listDpiGroupsResponse;
	}
}