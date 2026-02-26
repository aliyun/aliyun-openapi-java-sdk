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

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainLogResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainLogResponse.DomainLogDetail;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainLogResponse.DomainLogDetail.LogInfoDetail;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainLogResponse.DomainLogDetail.PageInfos;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainLogResponseUnmarshaller {

	public static DescribeLiveDomainLogResponse unmarshall(DescribeLiveDomainLogResponse describeLiveDomainLogResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainLogResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainLogResponse.RequestId"));
		describeLiveDomainLogResponse.setDomainName(_ctx.stringValue("DescribeLiveDomainLogResponse.DomainName"));

		List<DomainLogDetail> domainLogDetails = new ArrayList<DomainLogDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainLogResponse.DomainLogDetails.Length"); i++) {
			DomainLogDetail domainLogDetail = new DomainLogDetail();
			domainLogDetail.setLogCount(_ctx.longValue("DescribeLiveDomainLogResponse.DomainLogDetails["+ i +"].LogCount"));

			PageInfos pageInfos = new PageInfos();
			pageInfos.setPageIndex(_ctx.longValue("DescribeLiveDomainLogResponse.DomainLogDetails["+ i +"].PageInfos.PageIndex"));
			pageInfos.setPageSize(_ctx.longValue("DescribeLiveDomainLogResponse.DomainLogDetails["+ i +"].PageInfos.PageSize"));
			pageInfos.setTotal(_ctx.longValue("DescribeLiveDomainLogResponse.DomainLogDetails["+ i +"].PageInfos.Total"));
			domainLogDetail.setPageInfos(pageInfos);

			List<LogInfoDetail> logInfos = new ArrayList<LogInfoDetail>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveDomainLogResponse.DomainLogDetails["+ i +"].LogInfos.Length"); j++) {
				LogInfoDetail logInfoDetail = new LogInfoDetail();
				logInfoDetail.setEndTime(_ctx.stringValue("DescribeLiveDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].EndTime"));
				logInfoDetail.setLogSize(_ctx.longValue("DescribeLiveDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogSize"));
				logInfoDetail.setStartTime(_ctx.stringValue("DescribeLiveDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].StartTime"));
				logInfoDetail.setLogName(_ctx.stringValue("DescribeLiveDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogName"));
				logInfoDetail.setLogPath(_ctx.stringValue("DescribeLiveDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogPath"));

				logInfos.add(logInfoDetail);
			}
			domainLogDetail.setLogInfos(logInfos);

			domainLogDetails.add(domainLogDetail);
		}
		describeLiveDomainLogResponse.setDomainLogDetails(domainLogDetails);
	 
	 	return describeLiveDomainLogResponse;
	}
}