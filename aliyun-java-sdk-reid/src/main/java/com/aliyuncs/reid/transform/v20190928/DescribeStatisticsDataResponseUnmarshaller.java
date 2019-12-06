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

package com.aliyuncs.reid.transform.v20190928;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.reid.model.v20190928.DescribeStatisticsDataResponse;
import com.aliyuncs.reid.model.v20190928.DescribeStatisticsDataResponse.BaseStatisticsData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStatisticsDataResponseUnmarshaller {

	public static DescribeStatisticsDataResponse unmarshall(DescribeStatisticsDataResponse describeStatisticsDataResponse, UnmarshallerContext _ctx) {
		
		describeStatisticsDataResponse.setRequestId(_ctx.stringValue("DescribeStatisticsDataResponse.RequestId"));
		describeStatisticsDataResponse.setCursorTime(_ctx.stringValue("DescribeStatisticsDataResponse.CursorTime"));
		describeStatisticsDataResponse.setErrorCode(_ctx.stringValue("DescribeStatisticsDataResponse.ErrorCode"));
		describeStatisticsDataResponse.setErrorMessage(_ctx.stringValue("DescribeStatisticsDataResponse.ErrorMessage"));
		describeStatisticsDataResponse.setMessage(_ctx.stringValue("DescribeStatisticsDataResponse.Message"));
		describeStatisticsDataResponse.setCode(_ctx.stringValue("DescribeStatisticsDataResponse.Code"));
		describeStatisticsDataResponse.setDynamicCode(_ctx.stringValue("DescribeStatisticsDataResponse.DynamicCode"));
		describeStatisticsDataResponse.setSuccess(_ctx.booleanValue("DescribeStatisticsDataResponse.Success"));
		describeStatisticsDataResponse.setDynamicMessage(_ctx.stringValue("DescribeStatisticsDataResponse.DynamicMessage"));

		List<BaseStatisticsData> baseStatisticsDatas = new ArrayList<BaseStatisticsData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStatisticsDataResponse.BaseStatisticsDatas.Length"); i++) {
			BaseStatisticsData baseStatisticsData = new BaseStatisticsData();
			baseStatisticsData.setStoreId(_ctx.longValue("DescribeStatisticsDataResponse.BaseStatisticsDatas["+ i +"].StoreId"));
			baseStatisticsData.setTime(_ctx.stringValue("DescribeStatisticsDataResponse.BaseStatisticsDatas["+ i +"].Time"));
			baseStatisticsData.setMaleUvCount(_ctx.integerValue("DescribeStatisticsDataResponse.BaseStatisticsDatas["+ i +"].MaleUvCount"));
			baseStatisticsData.setUvCount(_ctx.integerValue("DescribeStatisticsDataResponse.BaseStatisticsDatas["+ i +"].UvCount"));
			baseStatisticsData.setOnlyBodyUvCount(_ctx.integerValue("DescribeStatisticsDataResponse.BaseStatisticsDatas["+ i +"].OnlyBodyUvCount"));
			baseStatisticsData.setLocationId(_ctx.longValue("DescribeStatisticsDataResponse.BaseStatisticsDatas["+ i +"].LocationId"));
			baseStatisticsData.setSummaryType(_ctx.stringValue("DescribeStatisticsDataResponse.BaseStatisticsDatas["+ i +"].SummaryType"));
			baseStatisticsData.setStayPeriod(_ctx.longValue("DescribeStatisticsDataResponse.BaseStatisticsDatas["+ i +"].StayPeriod"));
			baseStatisticsData.setFemaleUvCount(_ctx.integerValue("DescribeStatisticsDataResponse.BaseStatisticsDatas["+ i +"].FemaleUvCount"));
			baseStatisticsData.setOldCount(_ctx.integerValue("DescribeStatisticsDataResponse.BaseStatisticsDatas["+ i +"].OldCount"));
			baseStatisticsData.setNewCount(_ctx.integerValue("DescribeStatisticsDataResponse.BaseStatisticsDatas["+ i +"].NewCount"));

			baseStatisticsDatas.add(baseStatisticsData);
		}
		describeStatisticsDataResponse.setBaseStatisticsDatas(baseStatisticsDatas);
	 
	 	return describeStatisticsDataResponse;
	}
}