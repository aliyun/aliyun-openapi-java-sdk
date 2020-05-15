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

package com.aliyuncs.digitalstore.transform.v20200107;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.digitalstore.model.v20200107.ListMenusResponse;
import com.aliyuncs.digitalstore.model.v20200107.ListMenusResponse.DataItem;
import com.aliyuncs.digitalstore.model.v20200107.ListMenusResponse.DataItem.AclItem;
import com.aliyuncs.digitalstore.model.v20200107.ListMenusResponse.DataItem.ChildModuleItem;
import com.aliyuncs.digitalstore.model.v20200107.ListMenusResponse.DataItem.ChildModuleItem.AclItem2;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMenusResponseUnmarshaller {

	public static ListMenusResponse unmarshall(ListMenusResponse listMenusResponse, UnmarshallerContext _ctx) {
		
		listMenusResponse.setRequestId(_ctx.stringValue("ListMenusResponse.RequestId"));
		listMenusResponse.setSuccess(_ctx.booleanValue("ListMenusResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMenusResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.longValue("ListMenusResponse.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("ListMenusResponse.Data["+ i +"].Name"));
			dataItem.setParentId(_ctx.longValue("ListMenusResponse.Data["+ i +"].ParentId"));
			dataItem.setSequence(_ctx.integerValue("ListMenusResponse.Data["+ i +"].Sequence"));

			List<AclItem> acl = new ArrayList<AclItem>();
			for (int j = 0; j < _ctx.lengthValue("ListMenusResponse.Data["+ i +"].Acl.Length"); j++) {
				AclItem aclItem = new AclItem();
				aclItem.setId(_ctx.longValue("ListMenusResponse.Data["+ i +"].Acl["+ j +"].Id"));
				aclItem.setName(_ctx.stringValue("ListMenusResponse.Data["+ i +"].Acl["+ j +"].Name"));
				aclItem.setCode(_ctx.stringValue("ListMenusResponse.Data["+ i +"].Acl["+ j +"].Code"));
				aclItem.setType(_ctx.integerValue("ListMenusResponse.Data["+ i +"].Acl["+ j +"].Type"));
				aclItem.setStatus(_ctx.integerValue("ListMenusResponse.Data["+ i +"].Acl["+ j +"].Status"));

				acl.add(aclItem);
			}
			dataItem.setAcl(acl);

			List<ChildModuleItem> childModule = new ArrayList<ChildModuleItem>();
			for (int j = 0; j < _ctx.lengthValue("ListMenusResponse.Data["+ i +"].ChildModule.Length"); j++) {
				ChildModuleItem childModuleItem = new ChildModuleItem();
				childModuleItem.setId(_ctx.longValue("ListMenusResponse.Data["+ i +"].ChildModule["+ j +"].Id"));
				childModuleItem.setName(_ctx.stringValue("ListMenusResponse.Data["+ i +"].ChildModule["+ j +"].Name"));
				childModuleItem.setParentId(_ctx.longValue("ListMenusResponse.Data["+ i +"].ChildModule["+ j +"].ParentId"));
				childModuleItem.setSequence(_ctx.integerValue("ListMenusResponse.Data["+ i +"].ChildModule["+ j +"].Sequence"));

				List<AclItem2> acl1 = new ArrayList<AclItem2>();
				for (int k = 0; k < _ctx.lengthValue("ListMenusResponse.Data["+ i +"].ChildModule["+ j +"].Acl.Length"); k++) {
					AclItem2 aclItem2 = new AclItem2();
					aclItem2.setId(_ctx.longValue("ListMenusResponse.Data["+ i +"].ChildModule["+ j +"].Acl["+ k +"].Id"));
					aclItem2.setName(_ctx.stringValue("ListMenusResponse.Data["+ i +"].ChildModule["+ j +"].Acl["+ k +"].Name"));
					aclItem2.setCode(_ctx.stringValue("ListMenusResponse.Data["+ i +"].ChildModule["+ j +"].Acl["+ k +"].Code"));
					aclItem2.setType(_ctx.integerValue("ListMenusResponse.Data["+ i +"].ChildModule["+ j +"].Acl["+ k +"].Type"));
					aclItem2.setStatus(_ctx.integerValue("ListMenusResponse.Data["+ i +"].ChildModule["+ j +"].Acl["+ k +"].Status"));

					acl1.add(aclItem2);
				}
				childModuleItem.setAcl1(acl1);

				childModule.add(childModuleItem);
			}
			dataItem.setChildModule(childModule);

			data.add(dataItem);
		}
		listMenusResponse.setData(data);
	 
	 	return listMenusResponse;
	}
}