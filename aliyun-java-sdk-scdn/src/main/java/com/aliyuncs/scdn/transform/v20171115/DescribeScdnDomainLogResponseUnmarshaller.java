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
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainLogResponse.DomainLogDetail.PageInfoDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainLogResponseUnmarshaller {

	public static DescribeScdnDomainLogResponse unmarshall(DescribeScdnDomainLogResponse describeScdnDomainLogResponse, UnmarshallerContext context) {
		
		describeScdnDomainLogResponse.setRequestId(context.stringValue("DescribeScdnDomainLogResponse.RequestId"));
		describeScdnDomainLogResponse.setDomainName(context.stringValue("DescribeScdnDomainLogResponse.DomainName"));

		List<DomainLogDetail> domainLogDetails = new ArrayList<DomainLogDetail>();
		for (int i = 0; i < context.lengthValue("DescribeScdnDomainLogResponse.DomainLogDetails.Length"); i++) {
			DomainLogDetail domainLogDetail = new DomainLogDetail();
			domainLogDetail.setLogCount(context.longValue("DescribeScdnDomainLogResponse.DomainLogDetails["+ i +"].LogCount"));

			List<PageInfoDetail> pageInfos = new ArrayList<PageInfoDetail>();
			for (int j = 0; j < context.lengthValue("DescribeScdnDomainLogResponse.DomainLogDetails["+ i +"].PageInfos.Length"); j++) {
				PageInfoDetail pageInfoDetail = new PageInfoDetail();
				pageInfoDetail.setPageIndex(context.longValue("DescribeScdnDomainLogResponse.DomainLogDetails["+ i +"].PageInfos["+ j +"].PageIndex"));
				pageInfoDetail.setPageSize(context.longValue("DescribeScdnDomainLogResponse.DomainLogDetails["+ i +"].PageInfos["+ j +"].PageSize"));
				pageInfoDetail.setTotal(context.longValue("DescribeScdnDomainLogResponse.DomainLogDetails["+ i +"].PageInfos["+ j +"].Total"));

				pageInfos.add(pageInfoDetail);
			}
			domainLogDetail.setPageInfos(pageInfos);

			List<LogInfoDetail> logInfos = new ArrayList<LogInfoDetail>();
			for (int j = 0; j < context.lengthValue("DescribeScdnDomainLogResponse.DomainLogDetails["+ i +"].LogInfos.Length"); j++) {
				LogInfoDetail logInfoDetail = new LogInfoDetail();
				logInfoDetail.setLogName(context.stringValue("DescribeScdnDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogName"));
				logInfoDetail.setLogPath(context.stringValue("DescribeScdnDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogPath"));
				logInfoDetail.setLogSize(context.longValue("DescribeScdnDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogSize"));
				logInfoDetail.setStartTime(context.stringValue("DescribeScdnDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].StartTime"));
				logInfoDetail.setEndTime(context.stringValue("DescribeScdnDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].EndTime"));

				logInfos.add(logInfoDetail);
			}
			domainLogDetail.setLogInfos(logInfos);

			domainLogDetails.add(domainLogDetail);
		}
		describeScdnDomainLogResponse.setDomainLogDetails(domainLogDetails);
	 
	 	return describeScdnDomainLogResponse;
	}
}