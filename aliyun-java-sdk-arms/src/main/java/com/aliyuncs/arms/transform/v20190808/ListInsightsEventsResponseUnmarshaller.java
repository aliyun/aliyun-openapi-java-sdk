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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.ListInsightsEventsResponse;
import com.aliyuncs.arms.model.v20190808.ListInsightsEventsResponse.ProblemInfos;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInsightsEventsResponseUnmarshaller {

	public static ListInsightsEventsResponse unmarshall(ListInsightsEventsResponse listInsightsEventsResponse, UnmarshallerContext _ctx) {
		
		listInsightsEventsResponse.setRequestId(_ctx.stringValue("ListInsightsEventsResponse.RequestId"));

		List<ProblemInfos> insightsEvents = new ArrayList<ProblemInfos>();
		for (int i = 0; i < _ctx.lengthValue("ListInsightsEventsResponse.InsightsEvents.Length"); i++) {
			ProblemInfos problemInfos = new ProblemInfos();
			problemInfos.setTitle(_ctx.stringValue("ListInsightsEventsResponse.InsightsEvents["+ i +"].Title"));
			problemInfos.setDesc(_ctx.stringValue("ListInsightsEventsResponse.InsightsEvents["+ i +"].Desc"));
			problemInfos.setType(_ctx.stringValue("ListInsightsEventsResponse.InsightsEvents["+ i +"].Type"));
			problemInfos.setPid(_ctx.stringValue("ListInsightsEventsResponse.InsightsEvents["+ i +"].Pid"));
			problemInfos.setLevel(_ctx.stringValue("ListInsightsEventsResponse.InsightsEvents["+ i +"].Level"));
			problemInfos.setDate(_ctx.longValue("ListInsightsEventsResponse.InsightsEvents["+ i +"].Date"));

			insightsEvents.add(problemInfos);
		}
		listInsightsEventsResponse.setInsightsEvents(insightsEvents);
	 
	 	return listInsightsEventsResponse;
	}
}