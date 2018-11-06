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

import com.aliyuncs.aegis.model.v20161111.DescribeRiskWhiteListResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeRiskWhiteListResponse.WhiteList;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRiskWhiteListResponseUnmarshaller {

	public static DescribeRiskWhiteListResponse unmarshall(DescribeRiskWhiteListResponse describeRiskWhiteListResponse, UnmarshallerContext context) {
		
		describeRiskWhiteListResponse.setRequestId(context.stringValue("DescribeRiskWhiteListResponse.RequestId"));
		describeRiskWhiteListResponse.setCount(context.integerValue("DescribeRiskWhiteListResponse.Count"));
		describeRiskWhiteListResponse.setPageSize(context.integerValue("DescribeRiskWhiteListResponse.PageSize"));
		describeRiskWhiteListResponse.setTotalCount(context.integerValue("DescribeRiskWhiteListResponse.TotalCount"));
		describeRiskWhiteListResponse.setCurrentPage(context.integerValue("DescribeRiskWhiteListResponse.CurrentPage"));

		List<WhiteList> whiteLists = new ArrayList<WhiteList>();
		for (int i = 0; i < context.lengthValue("DescribeRiskWhiteListResponse.WhiteLists.Length"); i++) {
			WhiteList whiteList = new WhiteList();
			whiteList.setRiskId(context.longValue("DescribeRiskWhiteListResponse.WhiteLists["+ i +"].riskId"));
			whiteList.setRiskName(context.stringValue("DescribeRiskWhiteListResponse.WhiteLists["+ i +"].riskName"));
			whiteList.setReason(context.stringValue("DescribeRiskWhiteListResponse.WhiteLists["+ i +"].reason"));

			whiteLists.add(whiteList);
		}
		describeRiskWhiteListResponse.setWhiteLists(whiteLists);
	 
	 	return describeRiskWhiteListResponse;
	}
}