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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeIndexRecommendationResponse;
import com.aliyuncs.dds.model.v20151201.DescribeIndexRecommendationResponse.Analyzation;
import com.aliyuncs.dds.model.v20151201.DescribeIndexRecommendationResponse.Analyzation.Recommendation;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIndexRecommendationResponseUnmarshaller {

	public static DescribeIndexRecommendationResponse unmarshall(DescribeIndexRecommendationResponse describeIndexRecommendationResponse, UnmarshallerContext context) {
		
		describeIndexRecommendationResponse.setRequestId(context.stringValue("DescribeIndexRecommendationResponse.RequestId"));
		describeIndexRecommendationResponse.setTotalRecordCount(context.integerValue("DescribeIndexRecommendationResponse.TotalRecordCount"));
		describeIndexRecommendationResponse.setPageNumber(context.integerValue("DescribeIndexRecommendationResponse.PageNumber"));
		describeIndexRecommendationResponse.setPageRecordCount(context.integerValue("DescribeIndexRecommendationResponse.PageRecordCount"));

		List<Analyzation> analyzations = new ArrayList<Analyzation>();
		for (int i = 0; i < context.lengthValue("DescribeIndexRecommendationResponse.Analyzations.Length"); i++) {
			Analyzation analyzation = new Analyzation();
			analyzation.setDatabase(context.stringValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].Database"));
			analyzation.setNamespace(context.stringValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].Namespace"));
			analyzation.setOperation(context.stringValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].Operation"));
			analyzation.setQuery(context.stringValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].Query"));
			analyzation.setSort(context.stringValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].Sort"));
			analyzation.setCount(context.longValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].Count"));
			analyzation.setTotalExecutionTime(context.longValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].TotalExecutionTime"));
			analyzation.setAverageExecutionTime(context.longValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].AverageExecutionTime"));
			analyzation.setAverageReturnRowCount(context.longValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].AverageReturnRowCount"));
			analyzation.setAverageDocsExaminedCount(context.longValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].AverageDocsExaminedCount"));
			analyzation.setAverageKeysExaminedCount(context.longValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].AverageKeysExaminedCount"));
			analyzation.setInMemorySort(context.stringValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].InMemorySort"));
			analyzation.setLastExecutionTime(context.stringValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].LastExecutionTime"));
			analyzation.setExecutionPlan(context.stringValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].ExecutionPlan"));

			List<String> indexCombines = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].IndexCombines.Length"); j++) {
				indexCombines.add(context.stringValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].IndexCombines["+ j +"]"));
			}
			analyzation.setIndexCombines(indexCombines);

			List<Recommendation> indexRecommendations = new ArrayList<Recommendation>();
			for (int j = 0; j < context.lengthValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].IndexRecommendations.Length"); j++) {
				Recommendation recommendation = new Recommendation();
				recommendation.setRecmdType(context.stringValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].IndexRecommendations["+ j +"].RecmdType"));
				recommendation.setContent(context.stringValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].IndexRecommendations["+ j +"].Content"));

				indexRecommendations.add(recommendation);
			}
			analyzation.setIndexRecommendations(indexRecommendations);

			analyzations.add(analyzation);
		}
		describeIndexRecommendationResponse.setAnalyzations(analyzations);
	 
	 	return describeIndexRecommendationResponse;
	}
}