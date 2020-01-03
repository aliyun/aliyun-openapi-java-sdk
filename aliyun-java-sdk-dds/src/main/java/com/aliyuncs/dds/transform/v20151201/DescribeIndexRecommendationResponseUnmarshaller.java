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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIndexRecommendationResponseUnmarshaller {

	public static DescribeIndexRecommendationResponse unmarshall(DescribeIndexRecommendationResponse describeIndexRecommendationResponse, UnmarshallerContext _ctx) {
		
		describeIndexRecommendationResponse.setRequestId(_ctx.stringValue("DescribeIndexRecommendationResponse.RequestId"));
		describeIndexRecommendationResponse.setTotalRecordCount(_ctx.integerValue("DescribeIndexRecommendationResponse.TotalRecordCount"));
		describeIndexRecommendationResponse.setPageNumber(_ctx.integerValue("DescribeIndexRecommendationResponse.PageNumber"));
		describeIndexRecommendationResponse.setPageRecordCount(_ctx.integerValue("DescribeIndexRecommendationResponse.PageRecordCount"));

		List<Analyzation> analyzations = new ArrayList<Analyzation>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIndexRecommendationResponse.Analyzations.Length"); i++) {
			Analyzation analyzation = new Analyzation();
			analyzation.setDatabase(_ctx.stringValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].Database"));
			analyzation.setNamespace(_ctx.stringValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].Namespace"));
			analyzation.setOperation(_ctx.stringValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].Operation"));
			analyzation.setQuery(_ctx.stringValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].Query"));
			analyzation.setSort(_ctx.stringValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].Sort"));
			analyzation.setCount(_ctx.longValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].Count"));
			analyzation.setTotalExecutionTime(_ctx.longValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].TotalExecutionTime"));
			analyzation.setAverageExecutionTime(_ctx.longValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].AverageExecutionTime"));
			analyzation.setAverageReturnRowCount(_ctx.longValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].AverageReturnRowCount"));
			analyzation.setAverageDocsExaminedCount(_ctx.longValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].AverageDocsExaminedCount"));
			analyzation.setAverageKeysExaminedCount(_ctx.longValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].AverageKeysExaminedCount"));
			analyzation.setInMemorySort(_ctx.stringValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].InMemorySort"));
			analyzation.setLastExecutionTime(_ctx.stringValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].LastExecutionTime"));
			analyzation.setExecutionPlan(_ctx.stringValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].ExecutionPlan"));

			List<String> indexCombines = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].IndexCombines.Length"); j++) {
				indexCombines.add(_ctx.stringValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].IndexCombines["+ j +"]"));
			}
			analyzation.setIndexCombines(indexCombines);

			List<Recommendation> indexRecommendations = new ArrayList<Recommendation>();
			for (int j = 0; j < _ctx.lengthValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].IndexRecommendations.Length"); j++) {
				Recommendation recommendation = new Recommendation();
				recommendation.setRecmdType(_ctx.stringValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].IndexRecommendations["+ j +"].RecmdType"));
				recommendation.setContent(_ctx.stringValue("DescribeIndexRecommendationResponse.Analyzations["+ i +"].IndexRecommendations["+ j +"].Content"));

				indexRecommendations.add(recommendation);
			}
			analyzation.setIndexRecommendations(indexRecommendations);

			analyzations.add(analyzation);
		}
		describeIndexRecommendationResponse.setAnalyzations(analyzations);
	 
	 	return describeIndexRecommendationResponse;
	}
}