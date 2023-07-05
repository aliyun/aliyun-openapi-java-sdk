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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.QueryCheckItemSummariesResponse;
import com.aliyuncs.advisor_share.model.v20180608.QueryCheckItemSummariesResponse.CheckItemSummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCheckItemSummariesResponseUnmarshaller {

	public static QueryCheckItemSummariesResponse unmarshall(QueryCheckItemSummariesResponse queryCheckItemSummariesResponse, UnmarshallerContext _ctx) {
		
		queryCheckItemSummariesResponse.setRequestId(_ctx.stringValue("QueryCheckItemSummariesResponse.RequestId"));

		List<CheckItemSummary> data = new ArrayList<CheckItemSummary>();
		for (int i = 0; i < _ctx.lengthValue("QueryCheckItemSummariesResponse.Data.Length"); i++) {
			CheckItemSummary checkItemSummary = new CheckItemSummary();
			checkItemSummary.setImpressionCount(_ctx.longValue("QueryCheckItemSummariesResponse.Data["+ i +"].ImpressionCount"));
			checkItemSummary.setAdviceCount(_ctx.longValue("QueryCheckItemSummariesResponse.Data["+ i +"].AdviceCount"));
			checkItemSummary.setConversionRate(_ctx.floatValue("QueryCheckItemSummariesResponse.Data["+ i +"].ConversionRate"));
			checkItemSummary.setProduct(_ctx.stringValue("QueryCheckItemSummariesResponse.Data["+ i +"].Product"));
			checkItemSummary.setCheckId(_ctx.stringValue("QueryCheckItemSummariesResponse.Data["+ i +"].CheckId"));
			checkItemSummary.setDetailViewCount(_ctx.longValue("QueryCheckItemSummariesResponse.Data["+ i +"].DetailViewCount"));
			checkItemSummary.setCategory(_ctx.stringValue("QueryCheckItemSummariesResponse.Data["+ i +"].Category"));
			checkItemSummary.setAcceptedCount(_ctx.longValue("QueryCheckItemSummariesResponse.Data["+ i +"].AcceptedCount"));

			data.add(checkItemSummary);
		}
		queryCheckItemSummariesResponse.setData(data);
	 
	 	return queryCheckItemSummariesResponse;
	}
}