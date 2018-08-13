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

import com.aliyuncs.smartag.model.v20180313.DescribeSmartAccessGatewaysResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSmartAccessGatewaysResponse.SmartAccessGateway;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSmartAccessGatewaysResponseUnmarshaller {

	public static DescribeSmartAccessGatewaysResponse unmarshall(DescribeSmartAccessGatewaysResponse describeSmartAccessGatewaysResponse, UnmarshallerContext context) {
		
		describeSmartAccessGatewaysResponse.setRequestId(context.stringValue("DescribeSmartAccessGatewaysResponse.RequestId"));
		describeSmartAccessGatewaysResponse.setTotalCount(context.integerValue("DescribeSmartAccessGatewaysResponse.TotalCount"));
		describeSmartAccessGatewaysResponse.setPageNumber(context.integerValue("DescribeSmartAccessGatewaysResponse.PageNumber"));
		describeSmartAccessGatewaysResponse.setPageSize(context.integerValue("DescribeSmartAccessGatewaysResponse.PageSize"));

		List<SmartAccessGateway> smartAccessGateways = new ArrayList<SmartAccessGateway>();
		for (int i = 0; i < context.lengthValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways.Length"); i++) {
			SmartAccessGateway smartAccessGateway = new SmartAccessGateway();
			smartAccessGateway.setSmartAGId(context.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].SmartAGId"));
			smartAccessGateway.setName(context.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Name"));
			smartAccessGateway.setCity(context.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].City"));
			smartAccessGateway.setMaxBandwidth(context.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].MaxBandwidth"));
			smartAccessGateway.setStatus(context.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Status"));
			smartAccessGateway.setCidrBlock(context.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].CidrBlock"));
			smartAccessGateway.setAssociatedCcnId(context.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].AssociatedCcnId"));
			smartAccessGateway.setAssociatedCcnName(context.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].AssociatedCcnName"));
			smartAccessGateway.setDescription(context.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Description"));
			smartAccessGateway.setCreateTime(context.longValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].CreateTime"));
			smartAccessGateway.setEndTime(context.longValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].EndTime"));
			smartAccessGateway.setSoftwareVersion(context.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].SoftwareVersion"));
			smartAccessGateway.setHardwareVersion(context.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].HardwareVersion"));
			smartAccessGateway.setSerialNumber(context.stringValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].SerialNumber"));
			smartAccessGateway.setSecurityLockThreshold(context.integerValue("DescribeSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].SecurityLockThreshold"));

			smartAccessGateways.add(smartAccessGateway);
		}
		describeSmartAccessGatewaysResponse.setSmartAccessGateways(smartAccessGateways);
	 
	 	return describeSmartAccessGatewaysResponse;
	}
}