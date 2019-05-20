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

package com.aliyuncs.yundun_ds.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataCountsResponse;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataCountsResponse.DataCount;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataCountsResponse.DataCount.Column;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataCountsResponse.DataCount.Instance;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataCountsResponse.DataCount.Oss;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataCountsResponse.DataCount.Table;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeDataCountsResponse.DataCount._Package;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataCountsResponseUnmarshaller {

	public static DescribeDataCountsResponse unmarshall(DescribeDataCountsResponse describeDataCountsResponse, UnmarshallerContext context) {
		
		describeDataCountsResponse.setRequestId(context.stringValue("DescribeDataCountsResponse.RequestId"));

		List<DataCount> dataCountList = new ArrayList<DataCount>();
		for (int i = 0; i < context.lengthValue("DescribeDataCountsResponse.DataCountList.Length"); i++) {
			DataCount dataCount = new DataCount();
			dataCount.setProductId(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].ProductId"));
			dataCount.setProductCode(context.stringValue("DescribeDataCountsResponse.DataCountList["+ i +"].ProductCode"));

			Instance instance = new Instance();
			instance.setTotalCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Instance.TotalCount"));
			instance.setCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Instance.Count"));
			instance.setSensitiveCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Instance.SensitiveCount"));
			instance.setLastCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Instance.LastCount"));
			instance.setLastSensitiveCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Instance.LastSensitiveCount"));
			dataCount.setInstance(instance);

			Table table = new Table();
			table.setTotalCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Table.TotalCount"));
			table.setCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Table.Count"));
			table.setSensitiveCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Table.SensitiveCount"));
			table.setLastCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Table.LastCount"));
			table.setLastSensitiveCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Table.LastSensitiveCount"));
			dataCount.setTable(table);

			_Package _package = new _Package();
			_package.setTotalCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Package.TotalCount"));
			_package.setCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Package.Count"));
			_package.setSensitiveCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Package.SensitiveCount"));
			_package.setLastCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Package.LastCount"));
			_package.setLastSensitiveCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Package.LastSensitiveCount"));
			dataCount.set_Package(_package);

			Column column = new Column();
			column.setTotalCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Column.TotalCount"));
			column.setCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Column.Count"));
			column.setSensitiveCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Column.SensitiveCount"));
			column.setLastCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Column.LastCount"));
			column.setLastSensitiveCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Column.LastSensitiveCount"));
			dataCount.setColumn(column);

			Oss oss = new Oss();
			oss.setTotalCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Oss.TotalCount"));
			oss.setCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Oss.Count"));
			oss.setSensitiveCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Oss.SensitiveCount"));
			oss.setLastCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Oss.LastCount"));
			oss.setLastSensitiveCount(context.longValue("DescribeDataCountsResponse.DataCountList["+ i +"].Oss.LastSensitiveCount"));
			dataCount.setOss(oss);

			dataCountList.add(dataCount);
		}
		describeDataCountsResponse.setDataCountList(dataCountList);
	 
	 	return describeDataCountsResponse;
	}
}