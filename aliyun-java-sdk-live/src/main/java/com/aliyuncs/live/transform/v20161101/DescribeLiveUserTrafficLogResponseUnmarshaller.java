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

import com.aliyuncs.live.model.v20161101.DescribeLiveUserTrafficLogResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveUserTrafficLogResponse.DomainLogDetail;
import com.aliyuncs.live.model.v20161101.DescribeLiveUserTrafficLogResponse.DomainLogDetail.LogInfoDetail;
import com.aliyuncs.live.model.v20161101.DescribeLiveUserTrafficLogResponse.DomainLogDetail.PageInfos;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveUserTrafficLogResponseUnmarshaller {

	public static DescribeLiveUserTrafficLogResponse unmarshall(DescribeLiveUserTrafficLogResponse describeLiveUserTrafficLogResponse, UnmarshallerContext _ctx) {
		
		describeLiveUserTrafficLogResponse.setRequestId(_ctx.stringValue("DescribeLiveUserTrafficLogResponse.RequestId"));
		describeLiveUserTrafficLogResponse.setDomainName(_ctx.stringValue("DescribeLiveUserTrafficLogResponse.DomainName"));

		List<DomainLogDetail> domainLogDetails = new ArrayList<DomainLogDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveUserTrafficLogResponse.DomainLogDetails.Length"); i++) {
			DomainLogDetail domainLogDetail = new DomainLogDetail();
			domainLogDetail.setLogCount(_ctx.longValue("DescribeLiveUserTrafficLogResponse.DomainLogDetails["+ i +"].LogCount"));

			PageInfos pageInfos = new PageInfos();
			pageInfos.setPageIndex(_ctx.longValue("DescribeLiveUserTrafficLogResponse.DomainLogDetails["+ i +"].PageInfos.PageIndex"));
			pageInfos.setPageSize(_ctx.longValue("DescribeLiveUserTrafficLogResponse.DomainLogDetails["+ i +"].PageInfos.PageSize"));
			pageInfos.setTotal(_ctx.longValue("DescribeLiveUserTrafficLogResponse.DomainLogDetails["+ i +"].PageInfos.Total"));
			domainLogDetail.setPageInfos(pageInfos);

			List<LogInfoDetail> logInfos = new ArrayList<LogInfoDetail>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUserTrafficLogResponse.DomainLogDetails["+ i +"].LogInfos.Length"); j++) {
				LogInfoDetail logInfoDetail = new LogInfoDetail();
				logInfoDetail.setEndTime(_ctx.stringValue("DescribeLiveUserTrafficLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].EndTime"));
				logInfoDetail.setLogSize(_ctx.longValue("DescribeLiveUserTrafficLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogSize"));
				logInfoDetail.setStartTime(_ctx.stringValue("DescribeLiveUserTrafficLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].StartTime"));
				logInfoDetail.setLogName(_ctx.stringValue("DescribeLiveUserTrafficLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogName"));
				logInfoDetail.setLogPath(_ctx.stringValue("DescribeLiveUserTrafficLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogPath"));

				logInfos.add(logInfoDetail);
			}
			domainLogDetail.setLogInfos(logInfos);

			domainLogDetails.add(domainLogDetail);
		}
		describeLiveUserTrafficLogResponse.setDomainLogDetails(domainLogDetails);
	 
	 	return describeLiveUserTrafficLogResponse;
	}
}