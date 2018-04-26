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

	public static QueryDomainGroupListResponse unmarshall(QueryDomainGroupListResponse queryDomainGroupListResponse, UnmarshallerContext context) {
		
		queryDomainGroupListResponse.setRequestId(context.stringValue("QueryDomainGroupListResponse.RequestId"));

		List<DomainGroup> data = new ArrayList<DomainGroup>();
		for (int i = 0; i < context.lengthValue("QueryDomainGroupListResponse.Data.Length"); i++) {
			DomainGroup domainGroup = new DomainGroup();
			domainGroup.setDomainGroupId(context.stringValue("QueryDomainGroupListResponse.Data["+ i +"].DomainGroupId"));
			domainGroup.setDomainGroupName(context.stringValue("QueryDomainGroupListResponse.Data["+ i +"].DomainGroupName"));
			domainGroup.setTotalNumber(context.integerValue("QueryDomainGroupListResponse.Data["+ i +"].TotalNumber"));
			domainGroup.setCreationDate(context.stringValue("QueryDomainGroupListResponse.Data["+ i +"].CreationDate"));
			domainGroup.setModificationDate(context.stringValue("QueryDomainGroupListResponse.Data["+ i +"].ModificationDate"));
			domainGroup.setDomainGroupStatus(context.stringValue("QueryDomainGroupListResponse.Data["+ i +"].DomainGroupStatus"));
			domainGroup.setBeingDeleted(context.booleanValue("QueryDomainGroupListResponse.Data["+ i +"].BeingDeleted"));

			data.add(domainGroup);
		}
		queryDomainGroupListResponse.setData(data);
	 
	 	return queryDomainGroupListResponse;
	}
}