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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeEventCountCurveResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeEventCountCurveResponse.CurveData;
import com.aliyuncs.aegis.model.v20161111.DescribeEventCountCurveResponse.CurveData.Item;
import com.aliyuncs.aegis.model.v20161111.DescribeEventCountCurveResponse.CurveData.Item.DataItem;
import com.aliyuncs.aegis.model.v20161111.DescribeEventCountCurveResponse.CurveData.TimeScope;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEventCountCurveResponseUnmarshaller {

	public static DescribeEventCountCurveResponse unmarshall(DescribeEventCountCurveResponse describeEventCountCurveResponse, UnmarshallerContext context) {
		
		describeEventCountCurveResponse.setRequestId(context.stringValue("DescribeEventCountCurveResponse.RequestId"));
		describeEventCountCurveResponse.setSuccess(context.booleanValue("DescribeEventCountCurveResponse.Success"));

		CurveData curveData = new CurveData();

		TimeScope timeScope = new TimeScope();
		timeScope.setStart(context.longValue("DescribeEventCountCurveResponse.CurveData.TimeScope.Start"));
		timeScope.setEnd(context.longValue("DescribeEventCountCurveResponse.CurveData.TimeScope.End"));
		timeScope.setInterval(context.integerValue("DescribeEventCountCurveResponse.CurveData.TimeScope.Interval"));
		timeScope.setStep(context.integerValue("DescribeEventCountCurveResponse.CurveData.TimeScope.Step"));
		curveData.setTimeScope(timeScope);

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("DescribeEventCountCurveResponse.CurveData.Items.Length"); i++) {
			Item item = new Item();
			item.setName(context.stringValue("DescribeEventCountCurveResponse.CurveData.Items["+ i +"].Name"));

			List<DataItem> data = new ArrayList<DataItem>();
			for (int j = 0; j < context.lengthValue("DescribeEventCountCurveResponse.CurveData.Items["+ i +"].Data.Length"); j++) {
				DataItem dataItem = new DataItem();
				dataItem.setHigh(context.integerValue("DescribeEventCountCurveResponse.CurveData.Items["+ i +"].Data["+ j +"].High"));
				dataItem.setTotal(context.integerValue("DescribeEventCountCurveResponse.CurveData.Items["+ i +"].Data["+ j +"].Total"));
				dataItem.setLow(context.integerValue("DescribeEventCountCurveResponse.CurveData.Items["+ i +"].Data["+ j +"].Low"));
				dataItem.setSerious(context.integerValue("DescribeEventCountCurveResponse.CurveData.Items["+ i +"].Data["+ j +"].Serious"));
				dataItem.setSuspicious(context.integerValue("DescribeEventCountCurveResponse.CurveData.Items["+ i +"].Data["+ j +"].Suspicious"));
				dataItem.setRemind(context.integerValue("DescribeEventCountCurveResponse.CurveData.Items["+ i +"].Data["+ j +"].Remind"));
				dataItem.setMedium(context.integerValue("DescribeEventCountCurveResponse.CurveData.Items["+ i +"].Data["+ j +"].Medium"));

				data.add(dataItem);
			}
			item.setData(data);

			items.add(item);
		}
		curveData.setItems(items);
		describeEventCountCurveResponse.setCurveData(curveData);
	 
	 	return describeEventCountCurveResponse;
	}
}