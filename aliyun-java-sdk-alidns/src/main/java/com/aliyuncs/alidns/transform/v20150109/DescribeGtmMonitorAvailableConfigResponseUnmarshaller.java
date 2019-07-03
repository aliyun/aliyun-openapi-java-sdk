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

	public static DescribeGtmMonitorAvailableConfigResponse unmarshall(DescribeGtmMonitorAvailableConfigResponse describeGtmMonitorAvailableConfigResponse, UnmarshallerContext _ctx) {
		
		describeGtmMonitorAvailableConfigResponse.setRequestId(_ctx.stringValue("DescribeGtmMonitorAvailableConfigResponse.RequestId"));

		List<IspCityNode> ispCityNodes = new ArrayList<IspCityNode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGtmMonitorAvailableConfigResponse.IspCityNodes.Length"); i++) {
			IspCityNode ispCityNode = new IspCityNode();
			ispCityNode.setIspName(_ctx.stringValue("DescribeGtmMonitorAvailableConfigResponse.IspCityNodes["+ i +"].IspName"));
			ispCityNode.setIspCode(_ctx.stringValue("DescribeGtmMonitorAvailableConfigResponse.IspCityNodes["+ i +"].IspCode"));
			ispCityNode.setCityName(_ctx.stringValue("DescribeGtmMonitorAvailableConfigResponse.IspCityNodes["+ i +"].CityName"));
			ispCityNode.setCityCode(_ctx.stringValue("DescribeGtmMonitorAvailableConfigResponse.IspCityNodes["+ i +"].CityCode"));
			ispCityNode.setDefaultSelected(_ctx.booleanValue("DescribeGtmMonitorAvailableConfigResponse.IspCityNodes["+ i +"].DefaultSelected"));
			ispCityNode.setMainland(_ctx.booleanValue("DescribeGtmMonitorAvailableConfigResponse.IspCityNodes["+ i +"].Mainland"));

			ispCityNodes.add(ispCityNode);
		}
		describeGtmMonitorAvailableConfigResponse.setIspCityNodes(ispCityNodes);
	 
	 	return describeGtmMonitorAvailableConfigResponse;
	}
}