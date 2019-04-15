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

import com.aliyuncs.aegis.model.v20161111.DescribeStratetyDetailResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeStratetyDetailResponse.Strategy;
import com.aliyuncs.aegis.model.v20161111.DescribeStratetyDetailResponse.Strategy.RiskTypeWhiteListQueryResult;
import com.aliyuncs.aegis.model.v20161111.DescribeStratetyDetailResponse.Strategy.RiskTypeWhiteListQueryResult.SubType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStratetyDetailResponseUnmarshaller {

	public static DescribeStratetyDetailResponse unmarshall(DescribeStratetyDetailResponse describeStratetyDetailResponse, UnmarshallerContext context) {
		
		describeStratetyDetailResponse.setRequestId(context.stringValue("DescribeStratetyDetailResponse.RequestId"));

		Strategy strategy = new Strategy();
		strategy.setCycleDays(context.integerValue("DescribeStratetyDetailResponse.Strategy.CycleDays"));
		strategy.setName(context.stringValue("DescribeStratetyDetailResponse.Strategy.Name"));
		strategy.setId(context.integerValue("DescribeStratetyDetailResponse.Strategy.Id"));
		strategy.setCycleStartTime(context.integerValue("DescribeStratetyDetailResponse.Strategy.CycleStartTime"));
		strategy.setType(context.integerValue("DescribeStratetyDetailResponse.Strategy.Type"));

		List<RiskTypeWhiteListQueryResult> riskTypeWhiteListQueryResultList = new ArrayList<RiskTypeWhiteListQueryResult>();
		for (int i = 0; i < context.lengthValue("DescribeStratetyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList.Length"); i++) {
			RiskTypeWhiteListQueryResult riskTypeWhiteListQueryResult = new RiskTypeWhiteListQueryResult();
			riskTypeWhiteListQueryResult.setTypeName(context.stringValue("DescribeStratetyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].TypeName"));
			riskTypeWhiteListQueryResult.setAlias(context.stringValue("DescribeStratetyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].Alias"));
			riskTypeWhiteListQueryResult.setOn(context.booleanValue("DescribeStratetyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].On"));

			List<SubType> subTypes = new ArrayList<SubType>();
			for (int j = 0; j < context.lengthValue("DescribeStratetyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes.Length"); j++) {
				SubType subType = new SubType();
				subType.setTypeName(context.stringValue("DescribeStratetyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].TypeName"));
				subType.setAlias(context.stringValue("DescribeStratetyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].Alias"));
				subType.setOn(context.booleanValue("DescribeStratetyDetailResponse.Strategy.RiskTypeWhiteListQueryResultList["+ i +"].SubTypes["+ j +"].On"));

				subTypes.add(subType);
			}
			riskTypeWhiteListQueryResult.setSubTypes(subTypes);

			riskTypeWhiteListQueryResultList.add(riskTypeWhiteListQueryResult);
		}
		strategy.setRiskTypeWhiteListQueryResultList(riskTypeWhiteListQueryResultList);
		describeStratetyDetailResponse.setStrategy(strategy);
	 
	 	return describeStratetyDetailResponse;
	}
}