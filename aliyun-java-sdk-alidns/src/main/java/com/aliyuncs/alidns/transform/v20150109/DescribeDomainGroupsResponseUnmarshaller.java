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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeDomainGroupsResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDomainGroupsResponse.DomainGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainGroupsResponseUnmarshaller {

	public static DescribeDomainGroupsResponse unmarshall(DescribeDomainGroupsResponse describeDomainGroupsResponse, UnmarshallerContext context) {
		
		describeDomainGroupsResponse.setRequestId(context.stringValue("DescribeDomainGroupsResponse.RequestId"));
		describeDomainGroupsResponse.setTotalCount(context.longValue("DescribeDomainGroupsResponse.TotalCount"));
		describeDomainGroupsResponse.setPageNumber(context.longValue("DescribeDomainGroupsResponse.PageNumber"));
		describeDomainGroupsResponse.setPageSize(context.longValue("DescribeDomainGroupsResponse.PageSize"));

		List<DomainGroup> domainGroups = new ArrayList<DomainGroup>();
		for (int i = 0; i < context.lengthValue("DescribeDomainGroupsResponse.DomainGroups.Length"); i++) {
			DomainGroup domainGroup = new DomainGroup();
			domainGroup.setGroupId(context.stringValue("DescribeDomainGroupsResponse.DomainGroups["+ i +"].GroupId"));
			domainGroup.setGroupName(context.stringValue("DescribeDomainGroupsResponse.DomainGroups["+ i +"].GroupName"));
			domainGroup.setDomainCount(context.longValue("DescribeDomainGroupsResponse.DomainGroups["+ i +"].DomainCount"));

			domainGroups.add(domainGroup);
		}
		describeDomainGroupsResponse.setDomainGroups(domainGroups);
	 
	 	return describeDomainGroupsResponse;
	}
}