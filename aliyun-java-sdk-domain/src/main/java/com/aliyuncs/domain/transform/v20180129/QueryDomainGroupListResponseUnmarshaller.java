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
import com.aliyuncs.domain.model.v20180129.QueryDomainGroupListResponse.Domain;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDomainGroupListResponseUnmarshaller {

	public static QueryDomainGroupListResponse unmarshall(QueryDomainGroupListResponse queryDomainGroupListResponse, UnmarshallerContext context) {
		
		queryDomainGroupListResponse.setRequestId(context.stringValue("QueryDomainGroupListResponse.RequestId"));

		List<Domain> data = new ArrayList<Domain>();
		for (int i = 0; i < context.lengthValue("QueryDomainGroupListResponse.Data.Length"); i++) {
			Domain domain = new Domain();
			domain.setDomainGroupId(context.stringValue("QueryDomainGroupListResponse.Data["+ i +"].DomainGroupId"));
			domain.setDomainGroupName(context.stringValue("QueryDomainGroupListResponse.Data["+ i +"].DomainGroupName"));
			domain.setTotalNumber(context.integerValue("QueryDomainGroupListResponse.Data["+ i +"].TotalNumber"));
			domain.setCreationDate(context.stringValue("QueryDomainGroupListResponse.Data["+ i +"].CreationDate"));
			domain.setModificationDate(context.stringValue("QueryDomainGroupListResponse.Data["+ i +"].ModificationDate"));

			data.add(domain);
		}
		queryDomainGroupListResponse.setData(data);
	 
	 	return queryDomainGroupListResponse;
	}
}