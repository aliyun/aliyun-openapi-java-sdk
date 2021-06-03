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

import com.aliyuncs.ens.model.v20171110.DescribeDeviceServiceResponse;
import com.aliyuncs.ens.model.v20171110.DescribeDeviceServiceResponse.ResourceDetailInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeviceServiceResponseUnmarshaller {

	public static DescribeDeviceServiceResponse unmarshall(DescribeDeviceServiceResponse describeDeviceServiceResponse, UnmarshallerContext _ctx) {
		
		describeDeviceServiceResponse.setRequestId(_ctx.stringValue("DescribeDeviceServiceResponse.RequestId"));

		List<ResourceDetailInfo> resourceDetailInfos = new ArrayList<ResourceDetailInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeviceServiceResponse.ResourceDetailInfos.Length"); i++) {
			ResourceDetailInfo resourceDetailInfo = new ResourceDetailInfo();
			resourceDetailInfo.setRegionID(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].RegionID"));
			resourceDetailInfo.setID(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].ID"));
			resourceDetailInfo.setIP(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].IP"));
			resourceDetailInfo.setServer(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].Server"));
			resourceDetailInfo.setStatus(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].Status"));
			resourceDetailInfo.setType(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].Type"));
			resourceDetailInfo.setMac(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].Mac"));
			resourceDetailInfo.setISP(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].ISP"));

			resourceDetailInfos.add(resourceDetailInfo);
		}
		describeDeviceServiceResponse.setResourceDetailInfos(resourceDetailInfos);
	 
	 	return describeDeviceServiceResponse;
	}
}