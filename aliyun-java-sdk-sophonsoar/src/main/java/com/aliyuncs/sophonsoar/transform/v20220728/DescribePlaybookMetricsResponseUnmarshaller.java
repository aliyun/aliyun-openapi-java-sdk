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

package com.aliyuncs.sophonsoar.transform.v20220728;

import com.aliyuncs.sophonsoar.model.v20220728.DescribePlaybookMetricsResponse;
import com.aliyuncs.sophonsoar.model.v20220728.DescribePlaybookMetricsResponse.Metrics;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePlaybookMetricsResponseUnmarshaller {

	public static DescribePlaybookMetricsResponse unmarshall(DescribePlaybookMetricsResponse describePlaybookMetricsResponse, UnmarshallerContext _ctx) {
		
		describePlaybookMetricsResponse.setRequestId(_ctx.stringValue("DescribePlaybookMetricsResponse.RequestId"));

		Metrics metrics = new Metrics();
		metrics.setDisplayName(_ctx.stringValue("DescribePlaybookMetricsResponse.Metrics.DisplayName"));
		metrics.setPlaybookUuid(_ctx.stringValue("DescribePlaybookMetricsResponse.Metrics.PlaybookUuid"));
		metrics.setOwnType(_ctx.stringValue("DescribePlaybookMetricsResponse.Metrics.OwnType"));
		metrics.setActive(_ctx.integerValue("DescribePlaybookMetricsResponse.Metrics.Active"));
		metrics.setLastRuntime(_ctx.longValue("DescribePlaybookMetricsResponse.Metrics.LastRuntime"));
		metrics.setPermission(_ctx.integerValue("DescribePlaybookMetricsResponse.Metrics.Permission"));
		metrics.setGmtCreate(_ctx.longValue("DescribePlaybookMetricsResponse.Metrics.GmtCreate"));
		metrics.setHistoryMd5(_ctx.integerValue("DescribePlaybookMetricsResponse.Metrics.HistoryMd5"));
		metrics.setSuccNum(_ctx.integerValue("DescribePlaybookMetricsResponse.Metrics.SuccNum"));
		metrics.setFailNum(_ctx.integerValue("DescribePlaybookMetricsResponse.Metrics.FailNum"));
		metrics.setFailRate(_ctx.doubleValue("DescribePlaybookMetricsResponse.Metrics.FailRate"));
		metrics.setPlaybookStatus(_ctx.integerValue("DescribePlaybookMetricsResponse.Metrics.PlaybookStatus"));
		metrics.setDescription(_ctx.stringValue("DescribePlaybookMetricsResponse.Metrics.Description"));
		describePlaybookMetricsResponse.setMetrics(metrics);
	 
	 	return describePlaybookMetricsResponse;
	}
}