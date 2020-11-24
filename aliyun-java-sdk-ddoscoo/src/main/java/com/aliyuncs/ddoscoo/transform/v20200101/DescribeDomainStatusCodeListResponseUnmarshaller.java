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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeDomainStatusCodeListResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeDomainStatusCodeListResponse.StatusCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainStatusCodeListResponseUnmarshaller {

	public static DescribeDomainStatusCodeListResponse unmarshall(DescribeDomainStatusCodeListResponse describeDomainStatusCodeListResponse, UnmarshallerContext _ctx) {
		
		describeDomainStatusCodeListResponse.setRequestId(_ctx.stringValue("DescribeDomainStatusCodeListResponse.RequestId"));

		List<StatusCode> statusCodeList = new ArrayList<StatusCode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainStatusCodeListResponse.StatusCodeList.Length"); i++) {
			StatusCode statusCode = new StatusCode();
			statusCode.setIndex(_ctx.integerValue("DescribeDomainStatusCodeListResponse.StatusCodeList["+ i +"].Index"));
			statusCode.setTime(_ctx.longValue("DescribeDomainStatusCodeListResponse.StatusCodeList["+ i +"].Time"));
			statusCode.setStatus2XX(_ctx.longValue("DescribeDomainStatusCodeListResponse.StatusCodeList["+ i +"].Status2XX"));
			statusCode.setStatus501(_ctx.longValue("DescribeDomainStatusCodeListResponse.StatusCodeList["+ i +"].Status501"));
			statusCode.setStatus502(_ctx.longValue("DescribeDomainStatusCodeListResponse.StatusCodeList["+ i +"].Status502"));
			statusCode.setStatus503(_ctx.longValue("DescribeDomainStatusCodeListResponse.StatusCodeList["+ i +"].Status503"));
			statusCode.setStatus504(_ctx.longValue("DescribeDomainStatusCodeListResponse.StatusCodeList["+ i +"].Status504"));
			statusCode.setStatus200(_ctx.longValue("DescribeDomainStatusCodeListResponse.StatusCodeList["+ i +"].Status200"));
			statusCode.setStatus405(_ctx.longValue("DescribeDomainStatusCodeListResponse.StatusCodeList["+ i +"].Status405"));
			statusCode.setStatus5XX(_ctx.longValue("DescribeDomainStatusCodeListResponse.StatusCodeList["+ i +"].Status5XX"));
			statusCode.setStatus4XX(_ctx.longValue("DescribeDomainStatusCodeListResponse.StatusCodeList["+ i +"].Status4XX"));
			statusCode.setStatus403(_ctx.longValue("DescribeDomainStatusCodeListResponse.StatusCodeList["+ i +"].Status403"));
			statusCode.setStatus404(_ctx.longValue("DescribeDomainStatusCodeListResponse.StatusCodeList["+ i +"].Status404"));
			statusCode.setStatus3XX(_ctx.longValue("DescribeDomainStatusCodeListResponse.StatusCodeList["+ i +"].Status3XX"));

			statusCodeList.add(statusCode);
		}
		describeDomainStatusCodeListResponse.setStatusCodeList(statusCodeList);
	 
	 	return describeDomainStatusCodeListResponse;
	}
}