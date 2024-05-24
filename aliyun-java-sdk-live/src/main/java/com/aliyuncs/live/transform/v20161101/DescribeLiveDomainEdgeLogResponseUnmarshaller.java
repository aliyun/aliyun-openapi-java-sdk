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

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainEdgeLogResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainEdgeLogResponse.DomainLogDetail;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainEdgeLogResponse.DomainLogDetail.LogInfoDetail;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainEdgeLogResponse.DomainLogDetail.PageInfos;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainEdgeLogResponseUnmarshaller {

	public static DescribeLiveDomainEdgeLogResponse unmarshall(DescribeLiveDomainEdgeLogResponse describeLiveDomainEdgeLogResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainEdgeLogResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainEdgeLogResponse.RequestId"));
		describeLiveDomainEdgeLogResponse.setDomainName(_ctx.stringValue("DescribeLiveDomainEdgeLogResponse.DomainName"));

		List<DomainLogDetail> domainLogDetails = new ArrayList<DomainLogDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainEdgeLogResponse.DomainLogDetails.Length"); i++) {
			DomainLogDetail domainLogDetail = new DomainLogDetail();
			domainLogDetail.setLogCount(_ctx.longValue("DescribeLiveDomainEdgeLogResponse.DomainLogDetails["+ i +"].LogCount"));

			PageInfos pageInfos = new PageInfos();
			pageInfos.setPageIndex(_ctx.longValue("DescribeLiveDomainEdgeLogResponse.DomainLogDetails["+ i +"].PageInfos.PageIndex"));
			pageInfos.setPageSize(_ctx.longValue("DescribeLiveDomainEdgeLogResponse.DomainLogDetails["+ i +"].PageInfos.PageSize"));
			pageInfos.setTotal(_ctx.longValue("DescribeLiveDomainEdgeLogResponse.DomainLogDetails["+ i +"].PageInfos.Total"));
			domainLogDetail.setPageInfos(pageInfos);

			List<LogInfoDetail> logInfos = new ArrayList<LogInfoDetail>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveDomainEdgeLogResponse.DomainLogDetails["+ i +"].LogInfos.Length"); j++) {
				LogInfoDetail logInfoDetail = new LogInfoDetail();
				logInfoDetail.setEndTime(_ctx.stringValue("DescribeLiveDomainEdgeLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].EndTime"));
				logInfoDetail.setLogName(_ctx.stringValue("DescribeLiveDomainEdgeLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogName"));
				logInfoDetail.setLogPath(_ctx.stringValue("DescribeLiveDomainEdgeLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogPath"));
				logInfoDetail.setLogSize(_ctx.longValue("DescribeLiveDomainEdgeLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogSize"));
				logInfoDetail.setStartTime(_ctx.stringValue("DescribeLiveDomainEdgeLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].StartTime"));

				logInfos.add(logInfoDetail);
			}
			domainLogDetail.setLogInfos(logInfos);

			domainLogDetails.add(domainLogDetail);
		}
		describeLiveDomainEdgeLogResponse.setDomainLogDetails(domainLogDetails);
	 
	 	return describeLiveDomainEdgeLogResponse;
	}
}