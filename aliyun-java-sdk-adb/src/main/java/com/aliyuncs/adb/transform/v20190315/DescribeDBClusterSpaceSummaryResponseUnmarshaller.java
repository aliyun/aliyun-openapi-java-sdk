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

package com.aliyuncs.adb.transform.v20190315;

import com.aliyuncs.adb.model.v20190315.DescribeDBClusterSpaceSummaryResponse;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterSpaceSummaryResponse.Data;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterSpaceSummaryResponse.Data.ColdData;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterSpaceSummaryResponse.Data.DataGrowth;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterSpaceSummaryResponse.Data.HotData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterSpaceSummaryResponseUnmarshaller {

	public static DescribeDBClusterSpaceSummaryResponse unmarshall(DescribeDBClusterSpaceSummaryResponse describeDBClusterSpaceSummaryResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterSpaceSummaryResponse.setRequestId(_ctx.stringValue("DescribeDBClusterSpaceSummaryResponse.RequestId"));

		Data data = new Data();
		data.setTotalSize(_ctx.stringValue("DescribeDBClusterSpaceSummaryResponse.Data.TotalSize"));

		HotData hotData = new HotData();
		hotData.setTotalSize(_ctx.longValue("DescribeDBClusterSpaceSummaryResponse.Data.HotData.TotalSize"));
		hotData.setDataSize(_ctx.longValue("DescribeDBClusterSpaceSummaryResponse.Data.HotData.DataSize"));
		hotData.setIndexSize(_ctx.longValue("DescribeDBClusterSpaceSummaryResponse.Data.HotData.IndexSize"));
		hotData.setPrimaryKeyIndexSize(_ctx.longValue("DescribeDBClusterSpaceSummaryResponse.Data.HotData.PrimaryKeyIndexSize"));
		hotData.setOtherSize(_ctx.longValue("DescribeDBClusterSpaceSummaryResponse.Data.HotData.OtherSize"));
		data.setHotData(hotData);

		ColdData coldData = new ColdData();
		coldData.setTotalSize(_ctx.longValue("DescribeDBClusterSpaceSummaryResponse.Data.ColdData.TotalSize"));
		coldData.setDataSize(_ctx.longValue("DescribeDBClusterSpaceSummaryResponse.Data.ColdData.DataSize"));
		coldData.setIndexSize(_ctx.longValue("DescribeDBClusterSpaceSummaryResponse.Data.ColdData.IndexSize"));
		coldData.setPrimaryKeyIndexSize(_ctx.longValue("DescribeDBClusterSpaceSummaryResponse.Data.ColdData.PrimaryKeyIndexSize"));
		coldData.setOtherSize(_ctx.longValue("DescribeDBClusterSpaceSummaryResponse.Data.ColdData.OtherSize"));
		data.setColdData(coldData);

		DataGrowth dataGrowth = new DataGrowth();
		dataGrowth.setDayGrowth(_ctx.longValue("DescribeDBClusterSpaceSummaryResponse.Data.DataGrowth.DayGrowth"));
		dataGrowth.setWeekGrowth(_ctx.longValue("DescribeDBClusterSpaceSummaryResponse.Data.DataGrowth.WeekGrowth"));
		data.setDataGrowth(dataGrowth);
		describeDBClusterSpaceSummaryResponse.setData(data);
	 
	 	return describeDBClusterSpaceSummaryResponse;
	}
}