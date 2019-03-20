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

package com.aliyuncs.httpdns.transform.v20160201;

import com.aliyuncs.httpdns.model.v20160201.GetResolveCountSummaryResponse;
import com.aliyuncs.httpdns.model.v20160201.GetResolveCountSummaryResponse.ResolveSummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResolveCountSummaryResponseUnmarshaller {

	public static GetResolveCountSummaryResponse unmarshall(GetResolveCountSummaryResponse getResolveCountSummaryResponse, UnmarshallerContext context) {
		
		getResolveCountSummaryResponse.setRequestId(context.stringValue("GetResolveCountSummaryResponse.RequestId"));

		ResolveSummary resolveSummary = new ResolveSummary();
		resolveSummary.setHttp(context.longValue("GetResolveCountSummaryResponse.ResolveSummary.Http"));
		resolveSummary.setHttps(context.longValue("GetResolveCountSummaryResponse.ResolveSummary.Https"));
		resolveSummary.setHttp6(context.longValue("GetResolveCountSummaryResponse.ResolveSummary.Http6"));
		resolveSummary.setHttps6(context.longValue("GetResolveCountSummaryResponse.ResolveSummary.Https6"));
		getResolveCountSummaryResponse.setResolveSummary(resolveSummary);
	 
	 	return getResolveCountSummaryResponse;
	}
}