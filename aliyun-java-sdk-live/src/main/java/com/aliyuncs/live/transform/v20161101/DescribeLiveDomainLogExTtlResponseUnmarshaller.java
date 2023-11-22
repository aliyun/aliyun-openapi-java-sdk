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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainLogExTtlResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainLogExTtlResponse.DomainLogDetail;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainLogExTtlResponse.DomainLogDetail.LogInfoDetail;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainLogExTtlResponse.DomainLogDetail.PageInfos;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainLogExTtlResponseUnmarshaller {

	public static DescribeLiveDomainLogExTtlResponse unmarshall(DescribeLiveDomainLogExTtlResponse describeLiveDomainLogExTtlResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainLogExTtlResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainLogExTtlResponse.RequestId"));
		describeLiveDomainLogExTtlResponse.setDomainName(_ctx.stringValue("DescribeLiveDomainLogExTtlResponse.DomainName"));

		List<DomainLogDetail> domainLogDetails = new ArrayList<DomainLogDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainLogExTtlResponse.DomainLogDetails.Length"); i++) {
			DomainLogDetail domainLogDetail = new DomainLogDetail();
			domainLogDetail.setLogCount(_ctx.longValue("DescribeLiveDomainLogExTtlResponse.DomainLogDetails["+ i +"].LogCount"));

			PageInfos pageInfos = new PageInfos();
			pageInfos.setPageIndex(_ctx.longValue("DescribeLiveDomainLogExTtlResponse.DomainLogDetails["+ i +"].PageInfos.PageIndex"));
			pageInfos.setPageSize(_ctx.longValue("DescribeLiveDomainLogExTtlResponse.DomainLogDetails["+ i +"].PageInfos.PageSize"));
			pageInfos.setTotal(_ctx.longValue("DescribeLiveDomainLogExTtlResponse.DomainLogDetails["+ i +"].PageInfos.Total"));
			domainLogDetail.setPageInfos(pageInfos);

			List<LogInfoDetail> logInfos = new ArrayList<LogInfoDetail>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveDomainLogExTtlResponse.DomainLogDetails["+ i +"].LogInfos.Length"); j++) {
				LogInfoDetail logInfoDetail = new LogInfoDetail();
				logInfoDetail.setEndTime(_ctx.stringValue("DescribeLiveDomainLogExTtlResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].EndTime"));
				logInfoDetail.setLogSize(_ctx.longValue("DescribeLiveDomainLogExTtlResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogSize"));
				logInfoDetail.setStartTime(_ctx.stringValue("DescribeLiveDomainLogExTtlResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].StartTime"));
				logInfoDetail.setLogName(_ctx.stringValue("DescribeLiveDomainLogExTtlResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogName"));
				logInfoDetail.setLogPath(_ctx.stringValue("DescribeLiveDomainLogExTtlResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogPath"));

				logInfos.add(logInfoDetail);
			}
			domainLogDetail.setLogInfos(logInfos);

			domainLogDetails.add(domainLogDetail);
		}
		describeLiveDomainLogExTtlResponse.setDomainLogDetails(domainLogDetails);
	 
	 	return describeLiveDomainLogExTtlResponse;
	}
}