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

import com.aliyuncs.advisor_share.model.v20180608.QueryUserSourceSummariesResponse;
import com.aliyuncs.advisor_share.model.v20180608.QueryUserSourceSummariesResponse.UserSourceSummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserSourceSummariesResponseUnmarshaller {

	public static QueryUserSourceSummariesResponse unmarshall(QueryUserSourceSummariesResponse queryUserSourceSummariesResponse, UnmarshallerContext _ctx) {
		
		queryUserSourceSummariesResponse.setRequestId(_ctx.stringValue("QueryUserSourceSummariesResponse.RequestId"));

		List<UserSourceSummary> data = new ArrayList<UserSourceSummary>();
		for (int i = 0; i < _ctx.lengthValue("QueryUserSourceSummariesResponse.Data.Length"); i++) {
			UserSourceSummary userSourceSummary = new UserSourceSummary();
			userSourceSummary.setSource(_ctx.stringValue("QueryUserSourceSummariesResponse.Data["+ i +"].Source"));
			userSourceSummary.setCount(_ctx.longValue("QueryUserSourceSummariesResponse.Data["+ i +"].Count"));
			userSourceSummary.setRate(_ctx.floatValue("QueryUserSourceSummariesResponse.Data["+ i +"].Rate"));

			data.add(userSourceSummary);
		}
		queryUserSourceSummariesResponse.setData(data);
	 
	 	return queryUserSourceSummariesResponse;
	}
}