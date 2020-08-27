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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeEpnInstancesResponse;
import com.aliyuncs.ens.model.v20171110.DescribeEpnInstancesResponse.EPNInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEpnInstancesResponseUnmarshaller {

	public static DescribeEpnInstancesResponse unmarshall(DescribeEpnInstancesResponse describeEpnInstancesResponse, UnmarshallerContext _ctx) {
		
		describeEpnInstancesResponse.setRequestId(_ctx.stringValue("DescribeEpnInstancesResponse.RequestId"));
		describeEpnInstancesResponse.setTotalCount(_ctx.integerValue("DescribeEpnInstancesResponse.TotalCount"));
		describeEpnInstancesResponse.setPageNumber(_ctx.integerValue("DescribeEpnInstancesResponse.PageNumber"));
		describeEpnInstancesResponse.setPageSize(_ctx.integerValue("DescribeEpnInstancesResponse.PageSize"));

		List<EPNInstance> ePNInstances = new ArrayList<EPNInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEpnInstancesResponse.EPNInstances.Length"); i++) {
			EPNInstance ePNInstance = new EPNInstance();
			ePNInstance.setEPNInstanceId(_ctx.stringValue("DescribeEpnInstancesResponse.EPNInstances["+ i +"].EPNInstanceId"));
			ePNInstance.setEPNInstanceName(_ctx.stringValue("DescribeEpnInstancesResponse.EPNInstances["+ i +"].EPNInstanceName"));
			ePNInstance.setNetworkingModel(_ctx.stringValue("DescribeEpnInstancesResponse.EPNInstances["+ i +"].NetworkingModel"));
			ePNInstance.setModifyTime(_ctx.stringValue("DescribeEpnInstancesResponse.EPNInstances["+ i +"].ModifyTime"));
			ePNInstance.setEPNInstanceType(_ctx.stringValue("DescribeEpnInstancesResponse.EPNInstances["+ i +"].EPNInstanceType"));
			ePNInstance.setStatus(_ctx.stringValue("DescribeEpnInstancesResponse.EPNInstances["+ i +"].Status"));
			ePNInstance.setInternetMaxBandwidthOut(_ctx.integerValue("DescribeEpnInstancesResponse.EPNInstances["+ i +"].InternetMaxBandwidthOut"));
			ePNInstance.setCreationTime(_ctx.stringValue("DescribeEpnInstancesResponse.EPNInstances["+ i +"].CreationTime"));
			ePNInstance.setStartTime(_ctx.stringValue("DescribeEpnInstancesResponse.EPNInstances["+ i +"].StartTime"));
			ePNInstance.setEndTime(_ctx.stringValue("DescribeEpnInstancesResponse.EPNInstances["+ i +"].EndTime"));

			ePNInstances.add(ePNInstance);
		}
		describeEpnInstancesResponse.setEPNInstances(ePNInstances);
	 
	 	return describeEpnInstancesResponse;
	}
}