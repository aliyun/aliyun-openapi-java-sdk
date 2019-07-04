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

package com.aliyuncs.green.transform.v20170823;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20170823.DescribeWebsiteStatResponse;
import com.aliyuncs.green.model.v20170823.DescribeWebsiteStatResponse.WebsiteStat;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebsiteStatResponseUnmarshaller {

	public static DescribeWebsiteStatResponse unmarshall(DescribeWebsiteStatResponse describeWebsiteStatResponse, UnmarshallerContext _ctx) {
		
		describeWebsiteStatResponse.setRequestId(_ctx.stringValue("DescribeWebsiteStatResponse.RequestId"));
		describeWebsiteStatResponse.setTotalCount(_ctx.integerValue("DescribeWebsiteStatResponse.TotalCount"));

		List<WebsiteStat> websiteStatList = new ArrayList<WebsiteStat>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebsiteStatResponse.WebsiteStatList.Length"); i++) {
			WebsiteStat websiteStat = new WebsiteStat();
			websiteStat.setSubServiceModule(_ctx.stringValue("DescribeWebsiteStatResponse.WebsiteStatList["+ i +"].SubServiceModule"));
			websiteStat.setInstanceCount(_ctx.integerValue("DescribeWebsiteStatResponse.WebsiteStatList["+ i +"].InstanceCount"));
			websiteStat.setScanCount(_ctx.integerValue("DescribeWebsiteStatResponse.WebsiteStatList["+ i +"].ScanCount"));
			websiteStat.setRiskCount(_ctx.integerValue("DescribeWebsiteStatResponse.WebsiteStatList["+ i +"].RiskCount"));

			websiteStatList.add(websiteStat);
		}
		describeWebsiteStatResponse.setWebsiteStatList(websiteStatList);
	 
	 	return describeWebsiteStatResponse;
	}
}