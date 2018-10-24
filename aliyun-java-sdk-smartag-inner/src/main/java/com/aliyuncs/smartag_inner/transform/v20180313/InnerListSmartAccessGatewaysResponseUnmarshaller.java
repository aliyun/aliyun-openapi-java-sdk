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

package com.aliyuncs.smartag_inner.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag_inner.model.v20180313.InnerListSmartAccessGatewaysResponse;
import com.aliyuncs.smartag_inner.model.v20180313.InnerListSmartAccessGatewaysResponse.SmartAccessGateway;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerListSmartAccessGatewaysResponseUnmarshaller {

	public static InnerListSmartAccessGatewaysResponse unmarshall(InnerListSmartAccessGatewaysResponse innerListSmartAccessGatewaysResponse, UnmarshallerContext context) {
		
		innerListSmartAccessGatewaysResponse.setRequestId(context.stringValue("InnerListSmartAccessGatewaysResponse.RequestId"));
		innerListSmartAccessGatewaysResponse.setTotal(context.integerValue("InnerListSmartAccessGatewaysResponse.Total"));
		innerListSmartAccessGatewaysResponse.setPageNumber(context.integerValue("InnerListSmartAccessGatewaysResponse.PageNumber"));
		innerListSmartAccessGatewaysResponse.setPageSize(context.integerValue("InnerListSmartAccessGatewaysResponse.PageSize"));
		innerListSmartAccessGatewaysResponse.setAliUid(context.longValue("InnerListSmartAccessGatewaysResponse.AliUid"));
		innerListSmartAccessGatewaysResponse.setBid(context.stringValue("InnerListSmartAccessGatewaysResponse.Bid"));

		List<SmartAccessGateway> smartAccessGateways = new ArrayList<SmartAccessGateway>();
		for (int i = 0; i < context.lengthValue("InnerListSmartAccessGatewaysResponse.SmartAccessGateways.Length"); i++) {
			SmartAccessGateway smartAccessGateway = new SmartAccessGateway();
			smartAccessGateway.setInstanceId(context.stringValue("InnerListSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].InstanceId"));
			smartAccessGateway.setName(context.stringValue("InnerListSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Name"));
			smartAccessGateway.setCity(context.stringValue("InnerListSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].City"));
			smartAccessGateway.setMaxBandwidth(context.stringValue("InnerListSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].MaxBandwidth"));
			smartAccessGateway.setStatus(context.stringValue("InnerListSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Status"));
			smartAccessGateway.setCidrBlock(context.stringValue("InnerListSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].CidrBlock"));
			smartAccessGateway.setCcnInstanceId(context.stringValue("InnerListSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].CcnInstanceId"));
			smartAccessGateway.setCcnName(context.stringValue("InnerListSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].CcnName"));
			smartAccessGateway.setDescription(context.stringValue("InnerListSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].Description"));
			smartAccessGateway.setCreateTime(context.stringValue("InnerListSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].CreateTime"));
			smartAccessGateway.setEndTime(context.stringValue("InnerListSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].EndTime"));
			smartAccessGateway.setCurrentVersion(context.stringValue("InnerListSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].CurrentVersion"));
			smartAccessGateway.setTargetVersion(context.stringValue("InnerListSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].TargetVersion"));
			smartAccessGateway.setSoftwareVersion(context.stringValue("InnerListSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].SoftwareVersion"));
			smartAccessGateway.setHardwareVersion(context.stringValue("InnerListSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].HardwareVersion"));
			smartAccessGateway.setHealthCheckState(context.stringValue("InnerListSmartAccessGatewaysResponse.SmartAccessGateways["+ i +"].HealthCheckState"));

			smartAccessGateways.add(smartAccessGateway);
		}
		innerListSmartAccessGatewaysResponse.setSmartAccessGateways(smartAccessGateways);
	 
	 	return innerListSmartAccessGatewaysResponse;
	}
}