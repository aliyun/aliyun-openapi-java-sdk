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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainLogResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainLogResponse.DomainLogDetail;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainLogResponse.DomainLogDetail.LogInfoDetail;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainLogResponse.DomainLogDetail.PageInfos;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainLogResponseUnmarshaller {

	public static DescribeVodDomainLogResponse unmarshall(DescribeVodDomainLogResponse describeVodDomainLogResponse, UnmarshallerContext context) {
		
		describeVodDomainLogResponse.setRequestId(context.stringValue("DescribeVodDomainLogResponse.RequestId"));

		List<DomainLogDetail> domainLogDetails = new ArrayList<DomainLogDetail>();
		for (int i = 0; i < context.lengthValue("DescribeVodDomainLogResponse.DomainLogDetails.Length"); i++) {
			DomainLogDetail domainLogDetail = new DomainLogDetail();
			domainLogDetail.setDomainName(context.stringValue("DescribeVodDomainLogResponse.DomainLogDetails["+ i +"].DomainName"));
			domainLogDetail.setLogCount(context.longValue("DescribeVodDomainLogResponse.DomainLogDetails["+ i +"].LogCount"));

			PageInfos pageInfos = new PageInfos();
			pageInfos.setPageNumber(context.longValue("DescribeVodDomainLogResponse.DomainLogDetails["+ i +"].PageInfos.PageNumber"));
			pageInfos.setPageSize(context.longValue("DescribeVodDomainLogResponse.DomainLogDetails["+ i +"].PageInfos.PageSize"));
			pageInfos.setTotal(context.longValue("DescribeVodDomainLogResponse.DomainLogDetails["+ i +"].PageInfos.Total"));
			domainLogDetail.setPageInfos(pageInfos);

			List<LogInfoDetail> logInfos = new ArrayList<LogInfoDetail>();
			for (int j = 0; j < context.lengthValue("DescribeVodDomainLogResponse.DomainLogDetails["+ i +"].LogInfos.Length"); j++) {
				LogInfoDetail logInfoDetail = new LogInfoDetail();
				logInfoDetail.setLogName(context.stringValue("DescribeVodDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogName"));
				logInfoDetail.setLogPath(context.stringValue("DescribeVodDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogPath"));
				logInfoDetail.setLogSize(context.longValue("DescribeVodDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].LogSize"));
				logInfoDetail.setStartTime(context.stringValue("DescribeVodDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].StartTime"));
				logInfoDetail.setEndTime(context.stringValue("DescribeVodDomainLogResponse.DomainLogDetails["+ i +"].LogInfos["+ j +"].EndTime"));

				logInfos.add(logInfoDetail);
			}
			domainLogDetail.setLogInfos(logInfos);

			domainLogDetails.add(domainLogDetail);
		}
		describeVodDomainLogResponse.setDomainLogDetails(domainLogDetails);
	 
	 	return describeVodDomainLogResponse;
	}
}