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

import com.aliyuncs.sas.model.v20181203.DescribeExposedStatisticsDetailResponse;
import com.aliyuncs.sas.model.v20181203.DescribeExposedStatisticsDetailResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribeExposedStatisticsDetailResponse.StatisticsDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExposedStatisticsDetailResponseUnmarshaller {

	public static DescribeExposedStatisticsDetailResponse unmarshall(DescribeExposedStatisticsDetailResponse describeExposedStatisticsDetailResponse, UnmarshallerContext _ctx) {
		
		describeExposedStatisticsDetailResponse.setRequestId(_ctx.stringValue("DescribeExposedStatisticsDetailResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(_ctx.integerValue("DescribeExposedStatisticsDetailResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeExposedStatisticsDetailResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeExposedStatisticsDetailResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeExposedStatisticsDetailResponse.PageInfo.CurrentPage"));
		describeExposedStatisticsDetailResponse.setPageInfo(pageInfo);

		List<StatisticsDetail> statisticsDetails = new ArrayList<StatisticsDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExposedStatisticsDetailResponse.StatisticsDetails.Length"); i++) {
			StatisticsDetail statisticsDetail = new StatisticsDetail();
			statisticsDetail.setExposureComponent(_ctx.stringValue("DescribeExposedStatisticsDetailResponse.StatisticsDetails["+ i +"].ExposureComponent"));
			statisticsDetail.setExposureType(_ctx.stringValue("DescribeExposedStatisticsDetailResponse.StatisticsDetails["+ i +"].ExposureType"));
			statisticsDetail.setExposureTypeId(_ctx.stringValue("DescribeExposedStatisticsDetailResponse.StatisticsDetails["+ i +"].ExposureTypeId"));
			statisticsDetail.setExposurePort(_ctx.stringValue("DescribeExposedStatisticsDetailResponse.StatisticsDetails["+ i +"].ExposurePort"));
			statisticsDetail.setExposureIp(_ctx.stringValue("DescribeExposedStatisticsDetailResponse.StatisticsDetails["+ i +"].ExposureIp"));
			statisticsDetail.setExposureTypeInstanceName(_ctx.stringValue("DescribeExposedStatisticsDetailResponse.StatisticsDetails["+ i +"].ExposureTypeInstanceName"));
			statisticsDetail.setExposedCount(_ctx.integerValue("DescribeExposedStatisticsDetailResponse.StatisticsDetails["+ i +"].ExposedCount"));
			statisticsDetail.setRegionId(_ctx.stringValue("DescribeExposedStatisticsDetailResponse.StatisticsDetails["+ i +"].RegionId"));

			statisticsDetails.add(statisticsDetail);
		}
		describeExposedStatisticsDetailResponse.setStatisticsDetails(statisticsDetails);
	 
	 	return describeExposedStatisticsDetailResponse;
	}
}