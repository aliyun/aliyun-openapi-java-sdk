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

package com.aliyuncs.domain.transform.v20180129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180129.QueryDomainAdminDivisionResponse;
import com.aliyuncs.domain.model.v20180129.QueryDomainAdminDivisionResponse.AdminDivision;
import com.aliyuncs.domain.model.v20180129.QueryDomainAdminDivisionResponse.AdminDivision.ChildrenItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDomainAdminDivisionResponseUnmarshaller {

	public static QueryDomainAdminDivisionResponse unmarshall(QueryDomainAdminDivisionResponse queryDomainAdminDivisionResponse, UnmarshallerContext _ctx) {
		
		queryDomainAdminDivisionResponse.setRequestId(_ctx.stringValue("QueryDomainAdminDivisionResponse.RequestId"));

		List<AdminDivision> adminDivisions = new ArrayList<AdminDivision>();
		for (int i = 0; i < _ctx.lengthValue("QueryDomainAdminDivisionResponse.AdminDivisions.Length"); i++) {
			AdminDivision adminDivision = new AdminDivision();
			adminDivision.setDivisionName(_ctx.stringValue("QueryDomainAdminDivisionResponse.AdminDivisions["+ i +"].DivisionName"));

			List<ChildrenItem> children = new ArrayList<ChildrenItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryDomainAdminDivisionResponse.AdminDivisions["+ i +"].Children.Length"); j++) {
				ChildrenItem childrenItem = new ChildrenItem();
				childrenItem.setChildDivisionName(_ctx.stringValue("QueryDomainAdminDivisionResponse.AdminDivisions["+ i +"].Children["+ j +"].ChildDivisionName"));

				children.add(childrenItem);
			}
			adminDivision.setChildren(children);

			adminDivisions.add(adminDivision);
		}
		queryDomainAdminDivisionResponse.setAdminDivisions(adminDivisions);
	 
	 	return queryDomainAdminDivisionResponse;
	}
}