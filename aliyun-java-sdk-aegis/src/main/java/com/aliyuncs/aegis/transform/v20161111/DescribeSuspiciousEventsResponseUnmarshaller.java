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
package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeSuspiciousEventsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSuspiciousEventsResponseUnmarshaller {

	public static DescribeSuspiciousEventsResponse unmarshall(DescribeSuspiciousEventsResponse describeSuspiciousEventsResponse, UnmarshallerContext context) {
		
		describeSuspiciousEventsResponse.setRequestId(context.stringValue("DescribeSuspiciousEventsResponse.RequestId"));
		describeSuspiciousEventsResponse.setPageSize(context.integerValue("DescribeSuspiciousEventsResponse.PageSize"));
		describeSuspiciousEventsResponse.setTotalCount(context.integerValue("DescribeSuspiciousEventsResponse.TotalCount"));
		describeSuspiciousEventsResponse.setCurrentPage(context.integerValue("DescribeSuspiciousEventsResponse.CurrentPage"));
		describeSuspiciousEventsResponse.setHttpStatusCode(context.integerValue("DescribeSuspiciousEventsResponse.HttpStatusCode"));

		List<String> suspiciousEvents = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeSuspiciousEventsResponse.SuspiciousEvents.Length"); i++) {
			suspiciousEvents.add(context.stringValue("DescribeSuspiciousEventsResponse.SuspiciousEvents["+ i +"]"));
		}
		describeSuspiciousEventsResponse.setSuspiciousEvents(suspiciousEvents);
	 
	 	return describeSuspiciousEventsResponse;
	}
}