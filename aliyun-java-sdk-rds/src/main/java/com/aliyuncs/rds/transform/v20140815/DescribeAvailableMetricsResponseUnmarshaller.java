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

import com.aliyuncs.rds.model.v20140815.DescribeAvailableMetricsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeAvailableMetricsResponse.Metrics;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvailableMetricsResponseUnmarshaller {

	public static DescribeAvailableMetricsResponse unmarshall(DescribeAvailableMetricsResponse describeAvailableMetricsResponse, UnmarshallerContext _ctx) {
		
		describeAvailableMetricsResponse.setRequestId(_ctx.stringValue("DescribeAvailableMetricsResponse.RequestId"));
		describeAvailableMetricsResponse.setTotalRecordCount(_ctx.integerValue("DescribeAvailableMetricsResponse.TotalRecordCount"));

		List<Metrics> items = new ArrayList<Metrics>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableMetricsResponse.Items.Length"); i++) {
			Metrics metrics = new Metrics();
			metrics.setGroupKey(_ctx.stringValue("DescribeAvailableMetricsResponse.Items["+ i +"].GroupKey"));
			metrics.setSortRule(_ctx.integerValue("DescribeAvailableMetricsResponse.Items["+ i +"].SortRule"));
			metrics.setDescription(_ctx.stringValue("DescribeAvailableMetricsResponse.Items["+ i +"].Description"));
			metrics.setUnit(_ctx.stringValue("DescribeAvailableMetricsResponse.Items["+ i +"].Unit"));
			metrics.setDbType(_ctx.stringValue("DescribeAvailableMetricsResponse.Items["+ i +"].DbType"));
			metrics.setMetricsKey(_ctx.stringValue("DescribeAvailableMetricsResponse.Items["+ i +"].MetricsKey"));
			metrics.setGroupKeyType(_ctx.stringValue("DescribeAvailableMetricsResponse.Items["+ i +"].GroupKeyType"));
			metrics.setMetricsKeyAlias(_ctx.stringValue("DescribeAvailableMetricsResponse.Items["+ i +"].MetricsKeyAlias"));
			metrics.setBizMethod(_ctx.stringValue("DescribeAvailableMetricsResponse.Items["+ i +"].Method"));
			metrics.setDimension(_ctx.stringValue("DescribeAvailableMetricsResponse.Items["+ i +"].Dimension"));

			items.add(metrics);
		}
		describeAvailableMetricsResponse.setItems(items);
	 
	 	return describeAvailableMetricsResponse;
	}
}