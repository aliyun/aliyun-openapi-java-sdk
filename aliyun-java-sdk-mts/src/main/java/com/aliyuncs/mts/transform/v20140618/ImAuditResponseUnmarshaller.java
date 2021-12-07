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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.ImAuditResponse;
import com.aliyuncs.mts.model.v20140618.ImAuditResponse.ImageResults;
import com.aliyuncs.mts.model.v20140618.ImAuditResponse.ImageResults.ResultItem;
import com.aliyuncs.mts.model.v20140618.ImAuditResponse.ImageResults.ResultItem.Result;
import com.aliyuncs.mts.model.v20140618.ImAuditResponse.TextResults;
import com.aliyuncs.mts.model.v20140618.ImAuditResponse.TextResults.ResultItem2;
import com.aliyuncs.mts.model.v20140618.ImAuditResponse.TextResults.ResultItem2.Result4;
import com.aliyuncs.mts.model.v20140618.ImAuditResponse.TextResults.ResultItem2.Result4.DetailsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImAuditResponseUnmarshaller {

	public static ImAuditResponse unmarshall(ImAuditResponse imAuditResponse, UnmarshallerContext _ctx) {
		
		imAuditResponse.setRequestId(_ctx.stringValue("ImAuditResponse.RequestId"));
		imAuditResponse.setTextQuotaExceed(_ctx.booleanValue("ImAuditResponse.TextQuotaExceed"));
		imAuditResponse.setImageQuotaExceed(_ctx.booleanValue("ImAuditResponse.ImageQuotaExceed"));

		ImageResults imageResults = new ImageResults();

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ImAuditResponse.ImageResults.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCode(_ctx.longValue("ImAuditResponse.ImageResults.result["+ i +"].code"));
			resultItem.setDataId(_ctx.stringValue("ImAuditResponse.ImageResults.result["+ i +"].dataId"));
			resultItem.setExtras(_ctx.mapValue("ImAuditResponse.ImageResults.result["+ i +"].extras"));
			resultItem.setMsg(_ctx.stringValue("ImAuditResponse.ImageResults.result["+ i +"].msg"));
			resultItem.setTaskId(_ctx.stringValue("ImAuditResponse.ImageResults.result["+ i +"].taskId"));
			resultItem.setUrl(_ctx.stringValue("ImAuditResponse.ImageResults.result["+ i +"].url"));

			List<Result> results = new ArrayList<Result>();
			for (int j = 0; j < _ctx.lengthValue("ImAuditResponse.ImageResults.result["+ i +"].results.Length"); j++) {
				Result result3 = new Result();
				result3.setLabel(_ctx.stringValue("ImAuditResponse.ImageResults.result["+ i +"].results["+ j +"].Label"));
				result3.setRate(_ctx.doubleValue("ImAuditResponse.ImageResults.result["+ i +"].results["+ j +"].Rate"));
				result3.setScene(_ctx.stringValue("ImAuditResponse.ImageResults.result["+ i +"].results["+ j +"].Scene"));
				result3.setSuggestion(_ctx.stringValue("ImAuditResponse.ImageResults.result["+ i +"].results["+ j +"].Suggestion"));

				results.add(result3);
			}
			resultItem.setResults(results);

			result.add(resultItem);
		}
		imageResults.setResult(result);
		imAuditResponse.setImageResults(imageResults);

		TextResults textResults = new TextResults();

		List<ResultItem2> result1 = new ArrayList<ResultItem2>();
		for (int i = 0; i < _ctx.lengthValue("ImAuditResponse.TextResults.result.Length"); i++) {
			ResultItem2 resultItem2 = new ResultItem2();
			resultItem2.setCode(_ctx.longValue("ImAuditResponse.TextResults.result["+ i +"].code"));
			resultItem2.setContent(_ctx.stringValue("ImAuditResponse.TextResults.result["+ i +"].content"));
			resultItem2.setDataId(_ctx.stringValue("ImAuditResponse.TextResults.result["+ i +"].dataId"));
			resultItem2.setMsg(_ctx.stringValue("ImAuditResponse.TextResults.result["+ i +"].msg"));
			resultItem2.setTaskId(_ctx.stringValue("ImAuditResponse.TextResults.result["+ i +"].taskId"));

			List<Result4> results3 = new ArrayList<Result4>();
			for (int j = 0; j < _ctx.lengthValue("ImAuditResponse.TextResults.result["+ i +"].results.Length"); j++) {
				Result4 result4 = new Result4();
				result4.setLabel(_ctx.stringValue("ImAuditResponse.TextResults.result["+ i +"].results["+ j +"].label"));
				result4.setRate(_ctx.doubleValue("ImAuditResponse.TextResults.result["+ i +"].results["+ j +"].rate"));
				result4.setScene(_ctx.stringValue("ImAuditResponse.TextResults.result["+ i +"].results["+ j +"].scene"));
				result4.setSuggestion(_ctx.stringValue("ImAuditResponse.TextResults.result["+ i +"].results["+ j +"].suggestion"));

				List<DetailsItem> details = new ArrayList<DetailsItem>();
				for (int k = 0; k < _ctx.lengthValue("ImAuditResponse.TextResults.result["+ i +"].results["+ j +"].details.Length"); k++) {
					DetailsItem detailsItem = new DetailsItem();
					detailsItem.setLabel(_ctx.stringValue("ImAuditResponse.TextResults.result["+ i +"].results["+ j +"].details["+ k +"].Label"));

					details.add(detailsItem);
				}
				result4.setDetails(details);

				results3.add(result4);
			}
			resultItem2.setResults3(results3);

			result1.add(resultItem2);
		}
		textResults.setResult1(result1);
		imAuditResponse.setTextResults(textResults);
	 
	 	return imAuditResponse;
	}
}