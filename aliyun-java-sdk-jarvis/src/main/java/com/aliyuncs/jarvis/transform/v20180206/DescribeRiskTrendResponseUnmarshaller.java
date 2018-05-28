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

package com.aliyuncs.jarvis.transform.v20180206;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.jarvis.model.v20180206.DescribeRiskTrendResponse;
import com.aliyuncs.jarvis.model.v20180206.DescribeRiskTrendResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRiskTrendResponseUnmarshaller {

	public static DescribeRiskTrendResponse unmarshall(DescribeRiskTrendResponse describeRiskTrendResponse, UnmarshallerContext context) {
		
		describeRiskTrendResponse.setRequestId(context.stringValue("DescribeRiskTrendResponse.RequestId"));
		describeRiskTrendResponse.setTotalCount(context.stringValue("DescribeRiskTrendResponse.TotalCount"));
		describeRiskTrendResponse.setModule(context.stringValue("DescribeRiskTrendResponse.Module"));

		List<DataItem> dataList = new ArrayList<DataItem>();
		for (int i = 0; i < context.lengthValue("DescribeRiskTrendResponse.DataList.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setUpdateTime(context.stringValue("DescribeRiskTrendResponse.DataList["+ i +"].UpdateTime"));
			dataItem.setNewRiskCount(context.integerValue("DescribeRiskTrendResponse.DataList["+ i +"].NewRiskCount"));
			dataItem.setTotalRiskCount(context.integerValue("DescribeRiskTrendResponse.DataList["+ i +"].TotalRiskCount"));

			dataList.add(dataItem);
		}
		describeRiskTrendResponse.setDataList(dataList);
	 
	 	return describeRiskTrendResponse;
	}
}