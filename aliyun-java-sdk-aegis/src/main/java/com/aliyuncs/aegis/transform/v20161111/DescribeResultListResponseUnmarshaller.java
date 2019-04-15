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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeResultListResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeResultListResponse.PageInfo;
import com.aliyuncs.aegis.model.v20161111.DescribeResultListResponse.ResultListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResultListResponseUnmarshaller {

	public static DescribeResultListResponse unmarshall(DescribeResultListResponse describeResultListResponse, UnmarshallerContext context) {
		
		describeResultListResponse.setRequestId(context.stringValue("DescribeResultListResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(context.integerValue("DescribeResultListResponse.PageInfo.Count"));
		pageInfo.setPageSize(context.integerValue("DescribeResultListResponse.PageInfo.PageSize"));
		pageInfo.setCurrentPage(context.integerValue("DescribeResultListResponse.PageInfo.CurrentPage"));
		pageInfo.setTotalCount(context.integerValue("DescribeResultListResponse.PageInfo.TotalCount"));
		describeResultListResponse.setPageInfo(pageInfo);

		List<ResultListItem> resultList = new ArrayList<ResultListItem>();
		for (int i = 0; i < context.lengthValue("DescribeResultListResponse.ResultList.Length"); i++) {
			ResultListItem resultListItem = new ResultListItem();
			resultListItem.setLastTimestamp(context.longValue("DescribeResultListResponse.ResultList["+ i +"].LastTimestamp"));
			resultListItem.setModifiedTimestamp(context.longValue("DescribeResultListResponse.ResultList["+ i +"].ModifiedTimestamp"));
			resultListItem.setWarnLevel(context.stringValue("DescribeResultListResponse.ResultList["+ i +"].WarnLevel"));
			resultListItem.setUniqueKey(context.stringValue("DescribeResultListResponse.ResultList["+ i +"].UniqueKey"));
			resultListItem.setLastOperate(context.longValue("DescribeResultListResponse.ResultList["+ i +"].LastOperate"));
			resultListItem.setCreateTimestamp(context.longValue("DescribeResultListResponse.ResultList["+ i +"].CreateTimestamp"));
			resultListItem.setRuleDescription(context.stringValue("DescribeResultListResponse.ResultList["+ i +"].RuleDescription"));
			resultListItem.setRuleType(context.stringValue("DescribeResultListResponse.ResultList["+ i +"].RuleType"));
			resultListItem.setRuleName(context.stringValue("DescribeResultListResponse.ResultList["+ i +"].RuleName"));
			resultListItem.setDetails(context.stringValue("DescribeResultListResponse.ResultList["+ i +"].Details"));
			resultListItem.setId(context.integerValue("DescribeResultListResponse.ResultList["+ i +"].Id"));
			resultListItem.setAliUid(context.longValue("DescribeResultListResponse.ResultList["+ i +"].AliUid"));
			resultListItem.setRuleId(context.integerValue("DescribeResultListResponse.ResultList["+ i +"].RuleId"));
			resultListItem.setStatus(context.integerValue("DescribeResultListResponse.ResultList["+ i +"].Status"));
			resultListItem.setFieldKey(context.stringValue("DescribeResultListResponse.ResultList["+ i +"].FieldKey"));
			resultListItem.setInternetIp(context.stringValue("DescribeResultListResponse.ResultList["+ i +"].InternetIp"));
			resultListItem.setIntranetIp(context.stringValue("DescribeResultListResponse.ResultList["+ i +"].IntranetIp"));
			resultListItem.setInstanceId(context.stringValue("DescribeResultListResponse.ResultList["+ i +"].InstanceId"));
			resultListItem.setInstanceName(context.stringValue("DescribeResultListResponse.ResultList["+ i +"].InstanceName"));
			resultListItem.setFieldKey1(context.stringValue("DescribeResultListResponse.ResultList["+ i +"].FieldKey"));

			resultList.add(resultListItem);
		}
		describeResultListResponse.setResultList(resultList);
	 
	 	return describeResultListResponse;
	}
}