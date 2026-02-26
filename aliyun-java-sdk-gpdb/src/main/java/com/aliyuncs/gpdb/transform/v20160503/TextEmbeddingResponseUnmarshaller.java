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

import com.aliyuncs.gpdb.model.v20160503.TextEmbeddingResponse;
import com.aliyuncs.gpdb.model.v20160503.TextEmbeddingResponse.ResultsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class TextEmbeddingResponseUnmarshaller {

	public static TextEmbeddingResponse unmarshall(TextEmbeddingResponse textEmbeddingResponse, UnmarshallerContext _ctx) {
		
		textEmbeddingResponse.setRequestId(_ctx.stringValue("TextEmbeddingResponse.RequestId"));
		textEmbeddingResponse.setMessage(_ctx.stringValue("TextEmbeddingResponse.Message"));
		textEmbeddingResponse.setStatus(_ctx.stringValue("TextEmbeddingResponse.Status"));
		textEmbeddingResponse.setTextTokens(_ctx.integerValue("TextEmbeddingResponse.TextTokens"));

		List<ResultsItem> results = new ArrayList<ResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("TextEmbeddingResponse.Results.Length"); i++) {
			ResultsItem resultsItem = new ResultsItem();
			resultsItem.setIndex(_ctx.integerValue("TextEmbeddingResponse.Results["+ i +"].Index"));

			List<Double> embedding = new ArrayList<Double>();
			for (int j = 0; j < _ctx.lengthValue("TextEmbeddingResponse.Results["+ i +"].Embedding.Length"); j++) {
				embedding.add(_ctx.doubleValue("TextEmbeddingResponse.Results["+ i +"].Embedding["+ j +"]"));
			}
			resultsItem.setEmbedding(embedding);

			results.add(resultsItem);
		}
		textEmbeddingResponse.setResults(results);
	 
	 	return textEmbeddingResponse;
	}
}