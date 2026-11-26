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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeModelOperatorUsageResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeModelOperatorUsageResponse.KeysItem;
import com.aliyuncs.gpdb.model.v20160503.DescribeModelOperatorUsageResponse.KeysItem.SeriesItem;
import com.aliyuncs.gpdb.model.v20160503.DescribeModelOperatorUsageResponse.KeysItem.SeriesItem.ValuesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeModelOperatorUsageResponseUnmarshaller {

	public static DescribeModelOperatorUsageResponse unmarshall(DescribeModelOperatorUsageResponse describeModelOperatorUsageResponse, UnmarshallerContext _ctx) {
		
		describeModelOperatorUsageResponse.setRequestId(_ctx.stringValue("DescribeModelOperatorUsageResponse.RequestId"));
		describeModelOperatorUsageResponse.setEndTime(_ctx.stringValue("DescribeModelOperatorUsageResponse.EndTime"));
		describeModelOperatorUsageResponse.setStartTime(_ctx.stringValue("DescribeModelOperatorUsageResponse.StartTime"));
		describeModelOperatorUsageResponse.setPeriod(_ctx.integerValue("DescribeModelOperatorUsageResponse.Period"));

		List<KeysItem> keys = new ArrayList<KeysItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeModelOperatorUsageResponse.Keys.Length"); i++) {
			KeysItem keysItem = new KeysItem();
			keysItem.setUnit(_ctx.stringValue("DescribeModelOperatorUsageResponse.Keys["+ i +"].Unit"));
			keysItem.setName(_ctx.stringValue("DescribeModelOperatorUsageResponse.Keys["+ i +"].Name"));

			List<SeriesItem> series = new ArrayList<SeriesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeModelOperatorUsageResponse.Keys["+ i +"].Series.Length"); j++) {
				SeriesItem seriesItem = new SeriesItem();
				seriesItem.setRole(_ctx.stringValue("DescribeModelOperatorUsageResponse.Keys["+ i +"].Series["+ j +"].Role"));
				seriesItem.setApiKeyId(_ctx.integerValue("DescribeModelOperatorUsageResponse.Keys["+ i +"].Series["+ j +"].ApiKeyId"));
				seriesItem.setName(_ctx.stringValue("DescribeModelOperatorUsageResponse.Keys["+ i +"].Series["+ j +"].Name"));

				List<ValuesItem> values = new ArrayList<ValuesItem>();
				for (int k = 0; k < _ctx.lengthValue("DescribeModelOperatorUsageResponse.Keys["+ i +"].Series["+ j +"].Values.Length"); k++) {
					ValuesItem valuesItem = new ValuesItem();

					List<String> point = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("DescribeModelOperatorUsageResponse.Keys["+ i +"].Series["+ j +"].Values["+ k +"].Point.Length"); l++) {
						point.add(_ctx.stringValue("DescribeModelOperatorUsageResponse.Keys["+ i +"].Series["+ j +"].Values["+ k +"].Point["+ l +"]"));
					}
					valuesItem.setPoint(point);

					values.add(valuesItem);
				}
				seriesItem.setValues(values);

				series.add(seriesItem);
			}
			keysItem.setSeries(series);

			keys.add(keysItem);
		}
		describeModelOperatorUsageResponse.setKeys(keys);
	 
	 	return describeModelOperatorUsageResponse;
	}
}