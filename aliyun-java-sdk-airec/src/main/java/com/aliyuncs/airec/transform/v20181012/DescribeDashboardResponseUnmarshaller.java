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

package com.aliyuncs.airec.transform.v20181012;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20181012.DescribeDashboardResponse;
import com.aliyuncs.airec.model.v20181012.DescribeDashboardResponse.ResultItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDashboardResponseUnmarshaller {

	public static DescribeDashboardResponse unmarshall(DescribeDashboardResponse describeDashboardResponse, UnmarshallerContext context) {
		
		describeDashboardResponse.setRequestId(context.stringValue("DescribeDashboardResponse.RequestId"));
		describeDashboardResponse.setCode(context.stringValue("DescribeDashboardResponse.Code"));
		describeDashboardResponse.setMessage(context.stringValue("DescribeDashboardResponse.Message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < context.lengthValue("DescribeDashboardResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setBizDate(context.longValue("DescribeDashboardResponse.Result["+ i +"].BizDate"));
			resultItem.setPv(context.longValue("DescribeDashboardResponse.Result["+ i +"].Pv"));
			resultItem.setUv(context.longValue("DescribeDashboardResponse.Result["+ i +"].Uv"));
			resultItem.setClick(context.longValue("DescribeDashboardResponse.Result["+ i +"].Click"));
			resultItem.setCtr(context.floatValue("DescribeDashboardResponse.Result["+ i +"].Ctr"));
			resultItem.setUvCtr(context.floatValue("DescribeDashboardResponse.Result["+ i +"].UvCtr"));
			resultItem.setPerUvBhv(context.floatValue("DescribeDashboardResponse.Result["+ i +"].PerUvBhv"));
			resultItem.setPerUvClick(context.floatValue("DescribeDashboardResponse.Result["+ i +"].PerUvClick"));
			resultItem.setClickUser(context.longValue("DescribeDashboardResponse.Result["+ i +"].ClickUser"));
			resultItem.setActiveItem(context.longValue("DescribeDashboardResponse.Result["+ i +"].ActiveItem"));

			result.add(resultItem);
		}
		describeDashboardResponse.setResult(result);
	 
	 	return describeDashboardResponse;
	}
}