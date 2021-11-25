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

package com.aliyuncs.copyright.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.copyright.model.v20190123.GetPatentTimeStatisticsInfoResponse;
import com.aliyuncs.copyright.model.v20190123.GetPatentTimeStatisticsInfoResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPatentTimeStatisticsInfoResponseUnmarshaller {

	public static GetPatentTimeStatisticsInfoResponse unmarshall(GetPatentTimeStatisticsInfoResponse getPatentTimeStatisticsInfoResponse, UnmarshallerContext _ctx) {
		
		getPatentTimeStatisticsInfoResponse.setRequestId(_ctx.stringValue("GetPatentTimeStatisticsInfoResponse.RequestId"));
		getPatentTimeStatisticsInfoResponse.setPageNum(_ctx.integerValue("GetPatentTimeStatisticsInfoResponse.PageNum"));
		getPatentTimeStatisticsInfoResponse.setSuccess(_ctx.booleanValue("GetPatentTimeStatisticsInfoResponse.Success"));
		getPatentTimeStatisticsInfoResponse.setTotalItemNum(_ctx.integerValue("GetPatentTimeStatisticsInfoResponse.TotalItemNum"));
		getPatentTimeStatisticsInfoResponse.setPageSize(_ctx.integerValue("GetPatentTimeStatisticsInfoResponse.PageSize"));
		getPatentTimeStatisticsInfoResponse.setTotalPageNum(_ctx.integerValue("GetPatentTimeStatisticsInfoResponse.TotalPageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPatentTimeStatisticsInfoResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setType(_ctx.stringValue("GetPatentTimeStatisticsInfoResponse.Data["+ i +"].Type"));
			dataItem.setHalfMonthCount(_ctx.longValue("GetPatentTimeStatisticsInfoResponse.Data["+ i +"].HalfMonthCount"));
			dataItem.setMonthCount(_ctx.longValue("GetPatentTimeStatisticsInfoResponse.Data["+ i +"].MonthCount"));
			dataItem.setTwoMonthCount(_ctx.longValue("GetPatentTimeStatisticsInfoResponse.Data["+ i +"].TwoMonthCount"));
			dataItem.setThreeMonthCount(_ctx.longValue("GetPatentTimeStatisticsInfoResponse.Data["+ i +"].ThreeMonthCount"));
			dataItem.setExpiredCount(_ctx.longValue("GetPatentTimeStatisticsInfoResponse.Data["+ i +"].ExpiredCount"));

			data.add(dataItem);
		}
		getPatentTimeStatisticsInfoResponse.setData(data);
	 
	 	return getPatentTimeStatisticsInfoResponse;
	}
}