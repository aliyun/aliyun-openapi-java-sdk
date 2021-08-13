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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeBindableSmartAccessGatewaysResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeBindableSmartAccessGatewaysResponse.SmartAccessGateway;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBindableSmartAccessGatewaysResponseUnmarshaller {

	public static DescribeBindableSmartAccessGatewaysResponse unmarshall(DescribeBindableSmartAccessGatewaysResponse describeBindableSmartAccessGatewaysResponse, UnmarshallerContext _ctx) {
		
		describeBindableSmartAccessGatewaysResponse.setRequestId(_ctx.stringValue("DescribeBindableSmartAccessGatewaysResponse.RequestId"));
		describeBindableSmartAccessGatewaysResponse.setTotalCount(_ctx.integerValue("DescribeBindableSmartAccessGatewaysResponse.TotalCount"));
		describeBindableSmartAccessGatewaysResponse.setPageSize(_ctx.integerValue("DescribeBindableSmartAccessGatewaysResponse.PageSize"));
		describeBindableSmartAccessGatewaysResponse.setPageNumber(_ctx.integerValue("DescribeBindableSmartAccessGatewaysResponse.PageNumber"));

		List<SmartAccessGateway> smartAccessGateways = new ArrayList<SmartAccessGateway>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBindableSmartAccessGatewaysResponse.SmartAccessGateways.Length"); i++) {
			SmartAccessGateway smartAccessGateway = new SmartAccessGateway();
			smartAccessGateway.setSmartAGId(_ctx.stringValue("DescribeBindableSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].SmartAGId"));
			smartAccessGateway.setName(_ctx.stringValue("DescribeBindableSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Name"));
			smartAccessGateway.setSmartAGUid(_ctx.longValue("DescribeBindableSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].SmartAGUid"));

			smartAccessGateways.add(smartAccessGateway);
		}
		describeBindableSmartAccessGatewaysResponse.setSmartAccessGateways(smartAccessGateways);
	 
	 	return describeBindableSmartAccessGatewaysResponse;
	}
}