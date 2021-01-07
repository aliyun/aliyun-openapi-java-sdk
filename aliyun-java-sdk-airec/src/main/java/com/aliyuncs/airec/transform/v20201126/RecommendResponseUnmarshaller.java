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

package com.aliyuncs.airec.transform.v20201126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.RecommendResponse;
import com.aliyuncs.airec.model.v20201126.RecommendResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecommendResponseUnmarshaller {

	public static RecommendResponse unmarshall(RecommendResponse recommendResponse, UnmarshallerContext _ctx) {
		
		recommendResponse.setCode(_ctx.stringValue("RecommendResponse.code"));
		recommendResponse.setMessage(_ctx.stringValue("RecommendResponse.message"));
		recommendResponse.setRequestId(_ctx.stringValue("RecommendResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("RecommendResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setItemId(_ctx.stringValue("RecommendResponse.result["+ i +"].itemId"));
			resultItem.setItemType(_ctx.stringValue("RecommendResponse.result["+ i +"].itemType"));
			resultItem.setMatchInfo(_ctx.stringValue("RecommendResponse.result["+ i +"].matchInfo"));
			resultItem.setPosition(_ctx.integerValue("RecommendResponse.result["+ i +"].position"));
			resultItem.setTraceId(_ctx.stringValue("RecommendResponse.result["+ i +"].traceId"));
			resultItem.setTraceInfo(_ctx.stringValue("RecommendResponse.result["+ i +"].traceInfo"));
			resultItem.setWeight(_ctx.floatValue("RecommendResponse.result["+ i +"].weight"));

			result.add(resultItem);
		}
		recommendResponse.setResult(result);
	 
	 	return recommendResponse;
	}
}