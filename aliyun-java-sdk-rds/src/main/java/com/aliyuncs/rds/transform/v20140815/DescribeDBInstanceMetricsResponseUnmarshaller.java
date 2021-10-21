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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceMetricsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceMetricsResponse.Metrics;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceMetricsResponseUnmarshaller {

	public static DescribeDBInstanceMetricsResponse unmarshall(DescribeDBInstanceMetricsResponse describeDBInstanceMetricsResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceMetricsResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceMetricsResponse.RequestId"));
		describeDBInstanceMetricsResponse.setTotalRecordCount(_ctx.integerValue("DescribeDBInstanceMetricsResponse.TotalRecordCount"));

		List<Metrics> items = new ArrayList<Metrics>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceMetricsResponse.Items.Length"); i++) {
			Metrics metrics = new Metrics();
			metrics.setGroupKey(_ctx.stringValue("DescribeDBInstanceMetricsResponse.Items["+ i +"].GroupKey"));
			metrics.setSortRule(_ctx.integerValue("DescribeDBInstanceMetricsResponse.Items["+ i +"].SortRule"));
			metrics.setDescription(_ctx.stringValue("DescribeDBInstanceMetricsResponse.Items["+ i +"].Description"));
			metrics.setUnit(_ctx.stringValue("DescribeDBInstanceMetricsResponse.Items["+ i +"].Unit"));
			metrics.setDbType(_ctx.stringValue("DescribeDBInstanceMetricsResponse.Items["+ i +"].DbType"));
			metrics.setMetricsKey(_ctx.stringValue("DescribeDBInstanceMetricsResponse.Items["+ i +"].MetricsKey"));
			metrics.setGroupKeyType(_ctx.stringValue("DescribeDBInstanceMetricsResponse.Items["+ i +"].GroupKeyType"));
			metrics.setBizMethod(_ctx.stringValue("DescribeDBInstanceMetricsResponse.Items["+ i +"].Method"));
			metrics.setDimension(_ctx.stringValue("DescribeDBInstanceMetricsResponse.Items["+ i +"].Dimension"));
			metrics.setMetricsKeyAlias(_ctx.stringValue("DescribeDBInstanceMetricsResponse.Items["+ i +"].MetricsKeyAlias"));

			items.add(metrics);
		}
		describeDBInstanceMetricsResponse.setItems(items);
	 
	 	return describeDBInstanceMetricsResponse;
	}
}