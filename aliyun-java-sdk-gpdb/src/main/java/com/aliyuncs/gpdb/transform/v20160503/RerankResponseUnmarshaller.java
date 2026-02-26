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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.RerankResponse;
import com.aliyuncs.gpdb.model.v20160503.RerankResponse.ResultsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class RerankResponseUnmarshaller {

	public static RerankResponse unmarshall(RerankResponse rerankResponse, UnmarshallerContext _ctx) {
		
		rerankResponse.setRequestId(_ctx.stringValue("RerankResponse.RequestId"));
		rerankResponse.setMessage(_ctx.stringValue("RerankResponse.Message"));
		rerankResponse.setStatus(_ctx.stringValue("RerankResponse.Status"));
		rerankResponse.setTokens(_ctx.integerValue("RerankResponse.Tokens"));

		List<ResultsItem> results = new ArrayList<ResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("RerankResponse.Results.Length"); i++) {
			ResultsItem resultsItem = new ResultsItem();
			resultsItem.setDocument(_ctx.stringValue("RerankResponse.Results["+ i +"].Document"));
			resultsItem.setIndex(_ctx.integerValue("RerankResponse.Results["+ i +"].Index"));
			resultsItem.setRelevanceScore(_ctx.floatValue("RerankResponse.Results["+ i +"].RelevanceScore"));

			results.add(resultsItem);
		}
		rerankResponse.setResults(results);
	 
	 	return rerankResponse;
	}
}