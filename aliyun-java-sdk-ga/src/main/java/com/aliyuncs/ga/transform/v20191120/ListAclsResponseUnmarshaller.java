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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.ListAclsResponse;
import com.aliyuncs.ga.model.v20191120.ListAclsResponse.GaAcls;
import com.aliyuncs.ga.model.v20191120.ListAclsResponse.GaAcls.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAclsResponseUnmarshaller {

	public static ListAclsResponse unmarshall(ListAclsResponse listAclsResponse, UnmarshallerContext _ctx) {
		
		listAclsResponse.setRequestId(_ctx.stringValue("ListAclsResponse.RequestId"));
		listAclsResponse.setTotalCount(_ctx.integerValue("ListAclsResponse.TotalCount"));
		listAclsResponse.setNextToken(_ctx.stringValue("ListAclsResponse.NextToken"));
		listAclsResponse.setMaxResults(_ctx.integerValue("ListAclsResponse.MaxResults"));

		List<GaAcls> acls = new ArrayList<GaAcls>();
		for (int i = 0; i < _ctx.lengthValue("ListAclsResponse.Acls.Length"); i++) {
			GaAcls gaAcls = new GaAcls();
			gaAcls.setAclId(_ctx.stringValue("ListAclsResponse.Acls["+ i +"].AclId"));
			gaAcls.setAclName(_ctx.stringValue("ListAclsResponse.Acls["+ i +"].AclName"));
			gaAcls.setAddressIPVersion(_ctx.stringValue("ListAclsResponse.Acls["+ i +"].AddressIPVersion"));
			gaAcls.setAclStatus(_ctx.stringValue("ListAclsResponse.Acls["+ i +"].AclStatus"));
			gaAcls.setResourceGroupId(_ctx.stringValue("ListAclsResponse.Acls["+ i +"].ResourceGroupId"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAclsResponse.Acls["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("ListAclsResponse.Acls["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("ListAclsResponse.Acls["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			gaAcls.setTags(tags);

			acls.add(gaAcls);
		}
		listAclsResponse.setAcls(acls);
	 
	 	return listAclsResponse;
	}
}