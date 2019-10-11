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

package com.aliyuncs.airec.transform.v20181012;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20181012.RecommendResponse;
import com.aliyuncs.airec.model.v20181012.RecommendResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecommendResponseUnmarshaller {

	public static RecommendResponse unmarshall(RecommendResponse recommendResponse, UnmarshallerContext _ctx) {
		
		recommendResponse.setRequestId(_ctx.stringValue("RecommendResponse.RequestId"));
		recommendResponse.setCode(_ctx.stringValue("RecommendResponse.Code"));
		recommendResponse.setMessage(_ctx.stringValue("RecommendResponse.Message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("RecommendResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setTraceId(_ctx.stringValue("RecommendResponse.Result["+ i +"].TraceId"));
			resultItem.setItemId(_ctx.stringValue("RecommendResponse.Result["+ i +"].ItemId"));
			resultItem.setItemType(_ctx.stringValue("RecommendResponse.Result["+ i +"].ItemType"));
			resultItem.setMatchInfo(_ctx.stringValue("RecommendResponse.Result["+ i +"].MatchInfo"));
			resultItem.setWeight(_ctx.floatValue("RecommendResponse.Result["+ i +"].Weight"));
			resultItem.setPosition(_ctx.integerValue("RecommendResponse.Result["+ i +"].Position"));
			resultItem.setTraceInfo(_ctx.stringValue("RecommendResponse.Result["+ i +"].TraceInfo"));

			result.add(resultItem);
		}
		recommendResponse.setResult(result);
	 
	 	return recommendResponse;
	}
}