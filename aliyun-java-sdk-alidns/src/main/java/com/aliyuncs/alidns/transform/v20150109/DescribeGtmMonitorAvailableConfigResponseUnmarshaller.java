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

import com.aliyuncs.alidns.model.v20150109.DescribeGtmMonitorAvailableConfigResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeGtmMonitorAvailableConfigResponse.IspCityNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGtmMonitorAvailableConfigResponseUnmarshaller {

	public static DescribeGtmMonitorAvailableConfigResponse unmarshall(DescribeGtmMonitorAvailableConfigResponse describeGtmMonitorAvailableConfigResponse, UnmarshallerContext context) {
		
		describeGtmMonitorAvailableConfigResponse.setRequestId(context.stringValue("DescribeGtmMonitorAvailableConfigResponse.RequestId"));

		List<IspCityNode> ispCityNodes = new ArrayList<IspCityNode>();
		for (int i = 0; i < context.lengthValue("DescribeGtmMonitorAvailableConfigResponse.IspCityNodes.Length"); i++) {
			IspCityNode ispCityNode = new IspCityNode();
			ispCityNode.setIspName(context.stringValue("DescribeGtmMonitorAvailableConfigResponse.IspCityNodes["+ i +"].IspName"));
			ispCityNode.setIspCode(context.stringValue("DescribeGtmMonitorAvailableConfigResponse.IspCityNodes["+ i +"].IspCode"));
			ispCityNode.setCityName(context.stringValue("DescribeGtmMonitorAvailableConfigResponse.IspCityNodes["+ i +"].CityName"));
			ispCityNode.setCityCode(context.stringValue("DescribeGtmMonitorAvailableConfigResponse.IspCityNodes["+ i +"].CityCode"));
			ispCityNode.setDefaultSelected(context.booleanValue("DescribeGtmMonitorAvailableConfigResponse.IspCityNodes["+ i +"].DefaultSelected"));
			ispCityNode.setMainland(context.booleanValue("DescribeGtmMonitorAvailableConfigResponse.IspCityNodes["+ i +"].Mainland"));

			ispCityNodes.add(ispCityNode);
		}
		describeGtmMonitorAvailableConfigResponse.setIspCityNodes(ispCityNodes);
	 
	 	return describeGtmMonitorAvailableConfigResponse;
	}
}