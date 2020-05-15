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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeSimilarSecurityEventsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeSimilarSecurityEventsResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribeSimilarSecurityEventsResponse.SimpleSecurityEvent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSimilarSecurityEventsResponseUnmarshaller {

	public static DescribeSimilarSecurityEventsResponse unmarshall(DescribeSimilarSecurityEventsResponse describeSimilarSecurityEventsResponse, UnmarshallerContext _ctx) {
		
		describeSimilarSecurityEventsResponse.setRequestId(_ctx.stringValue("DescribeSimilarSecurityEventsResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(_ctx.integerValue("DescribeSimilarSecurityEventsResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeSimilarSecurityEventsResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeSimilarSecurityEventsResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeSimilarSecurityEventsResponse.PageInfo.CurrentPage"));
		describeSimilarSecurityEventsResponse.setPageInfo(pageInfo);

		List<SimpleSecurityEvent> securityEventsResponse = new ArrayList<SimpleSecurityEvent>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSimilarSecurityEventsResponse.SecurityEventsResponse.Length"); i++) {
			SimpleSecurityEvent simpleSecurityEvent = new SimpleSecurityEvent();
			simpleSecurityEvent.setSecurityEventId(_ctx.longValue("DescribeSimilarSecurityEventsResponse.SecurityEventsResponse["+ i +"].SecurityEventId"));
			simpleSecurityEvent.setUuid(_ctx.stringValue("DescribeSimilarSecurityEventsResponse.SecurityEventsResponse["+ i +"].Uuid"));
			simpleSecurityEvent.setEventType(_ctx.stringValue("DescribeSimilarSecurityEventsResponse.SecurityEventsResponse["+ i +"].EventType"));
			simpleSecurityEvent.setEventName(_ctx.stringValue("DescribeSimilarSecurityEventsResponse.SecurityEventsResponse["+ i +"].EventName"));
			simpleSecurityEvent.setOccurrenceTime(_ctx.longValue("DescribeSimilarSecurityEventsResponse.SecurityEventsResponse["+ i +"].OccurrenceTime"));
			simpleSecurityEvent.setLastTime(_ctx.longValue("DescribeSimilarSecurityEventsResponse.SecurityEventsResponse["+ i +"].LastTime"));

			securityEventsResponse.add(simpleSecurityEvent);
		}
		describeSimilarSecurityEventsResponse.setSecurityEventsResponse(securityEventsResponse);
	 
	 	return describeSimilarSecurityEventsResponse;
	}
}