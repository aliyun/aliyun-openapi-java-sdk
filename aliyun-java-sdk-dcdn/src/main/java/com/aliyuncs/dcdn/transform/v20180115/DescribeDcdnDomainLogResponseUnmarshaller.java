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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainLogResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainLogResponse.DomainLogDetail;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainLogResponse.DomainLogDetail.LogInfoDetail;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainLogResponse.DomainLogDetail.PageInfos;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainLogResponseUnmarshaller {

	public static DescribeDcdnDomainLogResponse unmarshall(DescribeDcdnDomainLogResponse describeDcdnDomainLogResponse, UnmarshallerContext context) {
		
		describeDcdnDomainLogResponse.setRequestId(context.stringValue("DescribeDcdnDomainLogResponse.RequestId"));
		describeDcdnDomainLogResponse.setDomainName(context.stringValue("DescribeDcdnDomainLogResponse.DomainName"));

		List<DomainLogDetail> domainLogDetails = new ArrayList<DomainLogDetail>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnDomainLogResponse.DomainLogDetails.Length"); i++) {
			DomainLogDetail domainLogDetail = new DomainLogDetail();
			domainLogDetail.setLogCount(context.longValue("DescribeDcdnDomainLogResponse.DomainLogDetails["+ i +"].LogCount"));

			PageInfos pageInfos = new PageInfos();
			pageInfos.setPageIndex(context.longValue("DescribeDcdnDomainLogResponse.DomainLogDetails["+ i +"].PageInfos.PageIndex"));
			pageInfos.setPageSize(context.longValue("DescribeDcdnDomainLogResponse.DomainLogDetails["+ i +"].PageInfos.PageSize"));
			pageInfos.setTotal(context.longValue("DescribeDcdnDomainLogResponse.DomainLogDetails["+ i +"].PageInfos.Total"));
			domainLogDetail.setPageInfos(pageInfos);

			List<LogInfoDetail> logInfos = new ArrayList<LogInfoDetail>();
			for (int j = 0; j < context.lengthValue("DescribeDcdnDomainLogResponse.DomainLogDetails["+ i +"].LogInfos.Length"); j++) {
				LogInfoDetail logInfoDetail = new LogInfoDetail();
				logInfoDetail.setLogName(context.stringValue("DescribeDcdnDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogName"));
				logInfoDetail.setLogPath(context.stringValue("DescribeDcdnDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogPath"));
				logInfoDetail.setLogSize(context.longValue("DescribeDcdnDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogSize"));
				logInfoDetail.setStartTime(context.stringValue("DescribeDcdnDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].StartTime"));
				logInfoDetail.setEndTime(context.stringValue("DescribeDcdnDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].EndTime"));

				logInfos.add(logInfoDetail);
			}
			domainLogDetail.setLogInfos(logInfos);

			domainLogDetails.add(domainLogDetail);
		}
		describeDcdnDomainLogResponse.setDomainLogDetails(domainLogDetails);
	 
	 	return describeDcdnDomainLogResponse;
	}
}