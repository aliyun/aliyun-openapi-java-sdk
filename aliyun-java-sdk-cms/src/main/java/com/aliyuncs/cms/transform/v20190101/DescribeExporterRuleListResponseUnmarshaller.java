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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeExporterRuleListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeExporterRuleListResponse.Datapoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExporterRuleListResponseUnmarshaller {

	public static DescribeExporterRuleListResponse unmarshall(DescribeExporterRuleListResponse describeExporterRuleListResponse, UnmarshallerContext _ctx) {
		
		describeExporterRuleListResponse.setRequestId(_ctx.stringValue("DescribeExporterRuleListResponse.RequestId"));
		describeExporterRuleListResponse.setCode(_ctx.stringValue("DescribeExporterRuleListResponse.Code"));
		describeExporterRuleListResponse.setMessage(_ctx.stringValue("DescribeExporterRuleListResponse.Message"));
		describeExporterRuleListResponse.setTotal(_ctx.integerValue("DescribeExporterRuleListResponse.Total"));
		describeExporterRuleListResponse.setPageNumber(_ctx.integerValue("DescribeExporterRuleListResponse.PageNumber"));
		describeExporterRuleListResponse.setSuccess(_ctx.booleanValue("DescribeExporterRuleListResponse.Success"));

		List<Datapoint> datapoints = new ArrayList<Datapoint>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExporterRuleListResponse.Datapoints.Length"); i++) {
			Datapoint datapoint = new Datapoint();
			datapoint.setRuleName(_ctx.stringValue("DescribeExporterRuleListResponse.Datapoints["+ i +"].RuleName"));
			datapoint.setNamespace(_ctx.stringValue("DescribeExporterRuleListResponse.Datapoints["+ i +"].Namespace"));
			datapoint.setMetricName(_ctx.stringValue("DescribeExporterRuleListResponse.Datapoints["+ i +"].MetricName"));
			datapoint.setEnabled(_ctx.booleanValue("DescribeExporterRuleListResponse.Datapoints["+ i +"].Enabled"));
			datapoint.setTargetWindows(_ctx.stringValue("DescribeExporterRuleListResponse.Datapoints["+ i +"].TargetWindows"));
			datapoint.setDescribe(_ctx.stringValue("DescribeExporterRuleListResponse.Datapoints["+ i +"].Describe"));
			datapoint.setDimension(_ctx.stringValue("DescribeExporterRuleListResponse.Datapoints["+ i +"].Dimension"));
			datapoint.setCreateTime(_ctx.longValue("DescribeExporterRuleListResponse.Datapoints["+ i +"].CreateTime"));

			List<String> dstName = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeExporterRuleListResponse.Datapoints["+ i +"].DstName.Length"); j++) {
				dstName.add(_ctx.stringValue("DescribeExporterRuleListResponse.Datapoints["+ i +"].DstName["+ j +"]"));
			}
			datapoint.setDstName(dstName);

			datapoints.add(datapoint);
		}
		describeExporterRuleListResponse.setDatapoints(datapoints);
	 
	 	return describeExporterRuleListResponse;
	}
}