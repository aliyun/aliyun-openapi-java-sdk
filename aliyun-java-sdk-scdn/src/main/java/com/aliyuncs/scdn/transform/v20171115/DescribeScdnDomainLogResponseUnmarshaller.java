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

package com.aliyuncs.scdn.transform.v20171115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainLogResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainLogResponse.DomainLogDetail;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainLogResponse.DomainLogDetail.LogInfoDetail;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainLogResponse.DomainLogDetail.PageInfos;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainLogResponseUnmarshaller {

	public static DescribeScdnDomainLogResponse unmarshall(DescribeScdnDomainLogResponse describeScdnDomainLogResponse, UnmarshallerContext _ctx) {
		
		describeScdnDomainLogResponse.setRequestId(_ctx.stringValue("DescribeScdnDomainLogResponse.RequestId"));
		describeScdnDomainLogResponse.setDomainName(_ctx.stringValue("DescribeScdnDomainLogResponse.DomainName"));

		List<DomainLogDetail> domainLogDetails = new ArrayList<DomainLogDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDomainLogResponse.DomainLogDetails.Length"); i++) {
			DomainLogDetail domainLogDetail = new DomainLogDetail();
			domainLogDetail.setLogCount(_ctx.longValue("DescribeScdnDomainLogResponse.DomainLogDetails["+ i +"].LogCount"));

			PageInfos pageInfos = new PageInfos();
			pageInfos.setPageNumber(_ctx.longValue("DescribeScdnDomainLogResponse.DomainLogDetails["+ i +"].PageInfos.PageNumber"));
			pageInfos.setPageSize(_ctx.longValue("DescribeScdnDomainLogResponse.DomainLogDetails["+ i +"].PageInfos.PageSize"));
			pageInfos.setTotal(_ctx.longValue("DescribeScdnDomainLogResponse.DomainLogDetails["+ i +"].PageInfos.Total"));
			domainLogDetail.setPageInfos(pageInfos);

			List<LogInfoDetail> logInfos = new ArrayList<LogInfoDetail>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScdnDomainLogResponse.DomainLogDetails["+ i +"].LogInfos.Length"); j++) {
				LogInfoDetail logInfoDetail = new LogInfoDetail();
				logInfoDetail.setLogName(_ctx.stringValue("DescribeScdnDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogName"));
				logInfoDetail.setLogPath(_ctx.stringValue("DescribeScdnDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogPath"));
				logInfoDetail.setLogSize(_ctx.longValue("DescribeScdnDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogSize"));
				logInfoDetail.setStartTime(_ctx.stringValue("DescribeScdnDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].StartTime"));
				logInfoDetail.setEndTime(_ctx.stringValue("DescribeScdnDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].EndTime"));

				logInfos.add(logInfoDetail);
			}
			domainLogDetail.setLogInfos(logInfos);

			domainLogDetails.add(domainLogDetail);
		}
		describeScdnDomainLogResponse.setDomainLogDetails(domainLogDetails);
	 
	 	return describeScdnDomainLogResponse;
	}
}