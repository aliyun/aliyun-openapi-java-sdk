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
package com.aliyuncs.yundun.transform.v20150227;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.yundun.model.v20150227.TodayqpsByRegionResponse;
import com.aliyuncs.yundun.model.v20150227.TodayqpsByRegionResponse.Region;
import com.aliyuncs.transform.UnmarshallerContext;


public class TodayqpsByRegionResponseUnmarshaller {

	public static TodayqpsByRegionResponse unmarshall(TodayqpsByRegionResponse todayqpsByRegionResponse, UnmarshallerContext context) {
		
		todayqpsByRegionResponse.setRequestId(context.stringValue("TodayqpsByRegionResponse.RequestId"));

		List<Region> data = new ArrayList<Region>();
		for (int i = 0; i < context.lengthValue("TodayqpsByRegionResponse.Data.Length"); i++) {
			Region  region = new Region();
			region.setRegionId(context.stringValue("TodayqpsByRegionResponse.Data["+ i +"].RegionId"));
			region.setRegionNumber(context.longValue("TodayqpsByRegionResponse.Data["+ i +"].RegionNumber"));
			region.setRegionFlow(context.longValue("TodayqpsByRegionResponse.Data["+ i +"].RegionFlow"));

			data.add(region);
		}
		todayqpsByRegionResponse.setData(data);
	 
	 	return todayqpsByRegionResponse;
	}
}