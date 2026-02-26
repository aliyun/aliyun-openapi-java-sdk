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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetStandardStatisticsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardStatisticsResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.GetStandardStatisticsResponse.Data.StandardTypeCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStandardStatisticsResponseUnmarshaller {

	public static GetStandardStatisticsResponse unmarshall(GetStandardStatisticsResponse getStandardStatisticsResponse, UnmarshallerContext _ctx) {
		
		getStandardStatisticsResponse.setRequestId(_ctx.stringValue("GetStandardStatisticsResponse.RequestId"));
		getStandardStatisticsResponse.setSuccess(_ctx.booleanValue("GetStandardStatisticsResponse.Success"));
		getStandardStatisticsResponse.setHttpStatusCode(_ctx.integerValue("GetStandardStatisticsResponse.HttpStatusCode"));
		getStandardStatisticsResponse.setCode(_ctx.stringValue("GetStandardStatisticsResponse.Code"));
		getStandardStatisticsResponse.setMessage(_ctx.stringValue("GetStandardStatisticsResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("GetStandardStatisticsResponse.Data.TotalCount"));

		List<StandardTypeCount> standardTypeCountList = new ArrayList<StandardTypeCount>();
		for (int i = 0; i < _ctx.lengthValue("GetStandardStatisticsResponse.Data.StandardTypeCountList.Length"); i++) {
			StandardTypeCount standardTypeCount = new StandardTypeCount();
			standardTypeCount.setStandardType(_ctx.stringValue("GetStandardStatisticsResponse.Data.StandardTypeCountList["+ i +"].StandardType"));
			standardTypeCount.setCount(_ctx.integerValue("GetStandardStatisticsResponse.Data.StandardTypeCountList["+ i +"].Count"));

			standardTypeCountList.add(standardTypeCount);
		}
		data.setStandardTypeCountList(standardTypeCountList);
		getStandardStatisticsResponse.setData(data);
	 
	 	return getStandardStatisticsResponse;
	}
}