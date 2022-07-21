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

import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleBlackListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleBlackListResponse.DescribeMetricRuleBlackListItem;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleBlackListResponse.DescribeMetricRuleBlackListItem.MetricsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMetricRuleBlackListResponseUnmarshaller {

	public static DescribeMetricRuleBlackListResponse unmarshall(DescribeMetricRuleBlackListResponse describeMetricRuleBlackListResponse, UnmarshallerContext _ctx) {
		
		describeMetricRuleBlackListResponse.setRequestId(_ctx.stringValue("DescribeMetricRuleBlackListResponse.RequestId"));
		describeMetricRuleBlackListResponse.setCode(_ctx.stringValue("DescribeMetricRuleBlackListResponse.Code"));
		describeMetricRuleBlackListResponse.setMessage(_ctx.stringValue("DescribeMetricRuleBlackListResponse.Message"));
		describeMetricRuleBlackListResponse.setTotal(_ctx.integerValue("DescribeMetricRuleBlackListResponse.Total"));
		describeMetricRuleBlackListResponse.setSuccess(_ctx.booleanValue("DescribeMetricRuleBlackListResponse.Success"));

		List<DescribeMetricRuleBlackListItem> describeMetricRuleBlackList = new ArrayList<DescribeMetricRuleBlackListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMetricRuleBlackListResponse.DescribeMetricRuleBlackList.Length"); i++) {
			DescribeMetricRuleBlackListItem describeMetricRuleBlackListItem = new DescribeMetricRuleBlackListItem();
			describeMetricRuleBlackListItem.setEffectiveTime(_ctx.stringValue("DescribeMetricRuleBlackListResponse.DescribeMetricRuleBlackList["+ i +"].EffectiveTime"));
			describeMetricRuleBlackListItem.setUpdateTime(_ctx.stringValue("DescribeMetricRuleBlackListResponse.DescribeMetricRuleBlackList["+ i +"].UpdateTime"));
			describeMetricRuleBlackListItem.setCreateTime(_ctx.stringValue("DescribeMetricRuleBlackListResponse.DescribeMetricRuleBlackList["+ i +"].CreateTime"));
			describeMetricRuleBlackListItem.setScopeType(_ctx.stringValue("DescribeMetricRuleBlackListResponse.DescribeMetricRuleBlackList["+ i +"].ScopeType"));
			describeMetricRuleBlackListItem.setIsEnable(_ctx.booleanValue("DescribeMetricRuleBlackListResponse.DescribeMetricRuleBlackList["+ i +"].IsEnable"));
			describeMetricRuleBlackListItem.setNamespace(_ctx.stringValue("DescribeMetricRuleBlackListResponse.DescribeMetricRuleBlackList["+ i +"].Namespace"));
			describeMetricRuleBlackListItem.setCategory(_ctx.stringValue("DescribeMetricRuleBlackListResponse.DescribeMetricRuleBlackList["+ i +"].Category"));
			describeMetricRuleBlackListItem.setEnableEndTime(_ctx.longValue("DescribeMetricRuleBlackListResponse.DescribeMetricRuleBlackList["+ i +"].EnableEndTime"));
			describeMetricRuleBlackListItem.setName(_ctx.stringValue("DescribeMetricRuleBlackListResponse.DescribeMetricRuleBlackList["+ i +"].Name"));
			describeMetricRuleBlackListItem.setEnableStartTime(_ctx.longValue("DescribeMetricRuleBlackListResponse.DescribeMetricRuleBlackList["+ i +"].EnableStartTime"));
			describeMetricRuleBlackListItem.setId(_ctx.stringValue("DescribeMetricRuleBlackListResponse.DescribeMetricRuleBlackList["+ i +"].Id"));

			List<String> instances = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMetricRuleBlackListResponse.DescribeMetricRuleBlackList["+ i +"].Instances.Length"); j++) {
				instances.add(_ctx.stringValue("DescribeMetricRuleBlackListResponse.DescribeMetricRuleBlackList["+ i +"].Instances["+ j +"]"));
			}
			describeMetricRuleBlackListItem.setInstances(instances);

			List<String> scopeValue = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMetricRuleBlackListResponse.DescribeMetricRuleBlackList["+ i +"].ScopeValue.Length"); j++) {
				scopeValue.add(_ctx.stringValue("DescribeMetricRuleBlackListResponse.DescribeMetricRuleBlackList["+ i +"].ScopeValue["+ j +"]"));
			}
			describeMetricRuleBlackListItem.setScopeValue(scopeValue);

			List<MetricsItem> metrics = new ArrayList<MetricsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMetricRuleBlackListResponse.DescribeMetricRuleBlackList["+ i +"].Metrics.Length"); j++) {
				MetricsItem metricsItem = new MetricsItem();
				metricsItem.setResource(_ctx.stringValue("DescribeMetricRuleBlackListResponse.DescribeMetricRuleBlackList["+ i +"].Metrics["+ j +"].Resource"));
				metricsItem.setMetricName(_ctx.stringValue("DescribeMetricRuleBlackListResponse.DescribeMetricRuleBlackList["+ i +"].Metrics["+ j +"].MetricName"));

				metrics.add(metricsItem);
			}
			describeMetricRuleBlackListItem.setMetrics(metrics);

			describeMetricRuleBlackList.add(describeMetricRuleBlackListItem);
		}
		describeMetricRuleBlackListResponse.setDescribeMetricRuleBlackList(describeMetricRuleBlackList);
	 
	 	return describeMetricRuleBlackListResponse;
	}
}