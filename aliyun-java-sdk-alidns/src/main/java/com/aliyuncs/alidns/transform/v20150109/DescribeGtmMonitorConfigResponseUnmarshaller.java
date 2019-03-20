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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeGtmMonitorConfigResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeGtmMonitorConfigResponse.IspCityNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGtmMonitorConfigResponseUnmarshaller {

	public static DescribeGtmMonitorConfigResponse unmarshall(DescribeGtmMonitorConfigResponse describeGtmMonitorConfigResponse, UnmarshallerContext context) {
		
		describeGtmMonitorConfigResponse.setRequestId(context.stringValue("DescribeGtmMonitorConfigResponse.RequestId"));
		describeGtmMonitorConfigResponse.setMonitorConfigId(context.stringValue("DescribeGtmMonitorConfigResponse.MonitorConfigId"));
		describeGtmMonitorConfigResponse.setCreateTime(context.stringValue("DescribeGtmMonitorConfigResponse.CreateTime"));
		describeGtmMonitorConfigResponse.setCreateTimestamp(context.longValue("DescribeGtmMonitorConfigResponse.CreateTimestamp"));
		describeGtmMonitorConfigResponse.setUpdateTime(context.stringValue("DescribeGtmMonitorConfigResponse.UpdateTime"));
		describeGtmMonitorConfigResponse.setUpdateTimestamp(context.longValue("DescribeGtmMonitorConfigResponse.UpdateTimestamp"));
		describeGtmMonitorConfigResponse.setName(context.stringValue("DescribeGtmMonitorConfigResponse.Name"));
		describeGtmMonitorConfigResponse.setProtocolType(context.stringValue("DescribeGtmMonitorConfigResponse.ProtocolType"));
		describeGtmMonitorConfigResponse.setInterval(context.integerValue("DescribeGtmMonitorConfigResponse.Interval"));
		describeGtmMonitorConfigResponse.setEvaluationCount(context.integerValue("DescribeGtmMonitorConfigResponse.EvaluationCount"));
		describeGtmMonitorConfigResponse.setTimeout(context.integerValue("DescribeGtmMonitorConfigResponse.Timeout"));
		describeGtmMonitorConfigResponse.setMonitorExtendInfo(context.stringValue("DescribeGtmMonitorConfigResponse.MonitorExtendInfo"));

		List<IspCityNode> ispCityNodes = new ArrayList<IspCityNode>();
		for (int i = 0; i < context.lengthValue("DescribeGtmMonitorConfigResponse.IspCityNodes.Length"); i++) {
			IspCityNode ispCityNode = new IspCityNode();
			ispCityNode.setCountryName(context.stringValue("DescribeGtmMonitorConfigResponse.IspCityNodes["+ i +"].CountryName"));
			ispCityNode.setCountryCode(context.stringValue("DescribeGtmMonitorConfigResponse.IspCityNodes["+ i +"].CountryCode"));
			ispCityNode.setCityName(context.stringValue("DescribeGtmMonitorConfigResponse.IspCityNodes["+ i +"].CityName"));
			ispCityNode.setCityCode(context.stringValue("DescribeGtmMonitorConfigResponse.IspCityNodes["+ i +"].CityCode"));

			ispCityNodes.add(ispCityNode);
		}
		describeGtmMonitorConfigResponse.setIspCityNodes(ispCityNodes);
	 
	 	return describeGtmMonitorConfigResponse;
	}
}