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

import com.aliyuncs.reid.model.v20190928.DescribeBaseStatisticsResponse;
import com.aliyuncs.reid.model.v20190928.DescribeBaseStatisticsResponse.BaseStatisticsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBaseStatisticsResponseUnmarshaller {

	public static DescribeBaseStatisticsResponse unmarshall(DescribeBaseStatisticsResponse describeBaseStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeBaseStatisticsResponse.setRequestId(_ctx.stringValue("DescribeBaseStatisticsResponse.RequestId"));
		describeBaseStatisticsResponse.setErrorCode(_ctx.stringValue("DescribeBaseStatisticsResponse.ErrorCode"));
		describeBaseStatisticsResponse.setCursorTime(_ctx.stringValue("DescribeBaseStatisticsResponse.CursorTime"));
		describeBaseStatisticsResponse.setErrorMessage(_ctx.stringValue("DescribeBaseStatisticsResponse.ErrorMessage"));
		describeBaseStatisticsResponse.setMessage(_ctx.stringValue("DescribeBaseStatisticsResponse.Message"));
		describeBaseStatisticsResponse.setCode(_ctx.stringValue("DescribeBaseStatisticsResponse.Code"));
		describeBaseStatisticsResponse.setDynamicCode(_ctx.stringValue("DescribeBaseStatisticsResponse.DynamicCode"));
		describeBaseStatisticsResponse.setSuccess(_ctx.booleanValue("DescribeBaseStatisticsResponse.Success"));
		describeBaseStatisticsResponse.setDynamicMessage(_ctx.stringValue("DescribeBaseStatisticsResponse.DynamicMessage"));

		List<BaseStatisticsItem> baseStatistics = new ArrayList<BaseStatisticsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBaseStatisticsResponse.BaseStatistics.Length"); i++) {
			BaseStatisticsItem baseStatisticsItem = new BaseStatisticsItem();
			baseStatisticsItem.setMaleUvCount(_ctx.integerValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].MaleUvCount"));
			baseStatisticsItem.setTime(_ctx.stringValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].Time"));
			baseStatisticsItem.setStoreId(_ctx.longValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].StoreId"));
			baseStatisticsItem.setFemaleUvCount(_ctx.integerValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].FemaleUvCount"));
			baseStatisticsItem.setOldCount(_ctx.integerValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].OldCount"));
			baseStatisticsItem.setNewCount(_ctx.integerValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].NewCount"));
			baseStatisticsItem.setLocationId(_ctx.longValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].LocationId"));
			baseStatisticsItem.setSummaryType(_ctx.stringValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].SummaryType"));
			baseStatisticsItem.setStayPeriod(_ctx.longValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].StayPeriod"));
			baseStatisticsItem.setUvCount(_ctx.integerValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].UvCount"));
			baseStatisticsItem.setOnlyBodyUvCount(_ctx.integerValue("DescribeBaseStatisticsResponse.BaseStatistics["+ i +"].OnlyBodyUvCount"));

			baseStatistics.add(baseStatisticsItem);
		}
		describeBaseStatisticsResponse.setBaseStatistics(baseStatistics);
	 
	 	return describeBaseStatisticsResponse;
	}
}