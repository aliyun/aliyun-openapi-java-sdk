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

import com.aliyuncs.domain.model.v20180129.QueryDomainGroupListResponse;
import com.aliyuncs.domain.model.v20180129.QueryDomainGroupListResponse.DomainGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDomainGroupListResponseUnmarshaller {

	public static QueryDomainGroupListResponse unmarshall(QueryDomainGroupListResponse queryDomainGroupListResponse, UnmarshallerContext _ctx) {
		
		queryDomainGroupListResponse.setRequestId(_ctx.stringValue("QueryDomainGroupListResponse.RequestId"));

		List<DomainGroup> data = new ArrayList<DomainGroup>();
		for (int i = 0; i < _ctx.lengthValue("QueryDomainGroupListResponse.Data.Length"); i++) {
			DomainGroup domainGroup = new DomainGroup();
			domainGroup.setDomainGroupId(_ctx.stringValue("QueryDomainGroupListResponse.Data["+ i +"].DomainGroupId"));
			domainGroup.setDomainGroupName(_ctx.stringValue("QueryDomainGroupListResponse.Data["+ i +"].DomainGroupName"));
			domainGroup.setTotalNumber(_ctx.integerValue("QueryDomainGroupListResponse.Data["+ i +"].TotalNumber"));
			domainGroup.setCreationDate(_ctx.stringValue("QueryDomainGroupListResponse.Data["+ i +"].CreationDate"));
			domainGroup.setModificationDate(_ctx.stringValue("QueryDomainGroupListResponse.Data["+ i +"].ModificationDate"));
			domainGroup.setDomainGroupStatus(_ctx.stringValue("QueryDomainGroupListResponse.Data["+ i +"].DomainGroupStatus"));
			domainGroup.setBeingDeleted(_ctx.booleanValue("QueryDomainGroupListResponse.Data["+ i +"].BeingDeleted"));

			data.add(domainGroup);
		}
		queryDomainGroupListResponse.setData(data);
	 
	 	return queryDomainGroupListResponse;
	}
}