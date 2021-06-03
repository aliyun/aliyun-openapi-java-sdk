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

import com.aliyuncs.ens.model.v20171110.RescaleDeviceServiceResponse;
import com.aliyuncs.ens.model.v20171110.RescaleDeviceServiceResponse.ResourceDetailInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class RescaleDeviceServiceResponseUnmarshaller {

	public static RescaleDeviceServiceResponse unmarshall(RescaleDeviceServiceResponse rescaleDeviceServiceResponse, UnmarshallerContext _ctx) {
		
		rescaleDeviceServiceResponse.setRequestId(_ctx.stringValue("RescaleDeviceServiceResponse.RequestId"));

		List<ResourceDetailInfo> resourceDetailInfos = new ArrayList<ResourceDetailInfo>();
		for (int i = 0; i < _ctx.lengthValue("RescaleDeviceServiceResponse.ResourceDetailInfos.Length"); i++) {
			ResourceDetailInfo resourceDetailInfo = new ResourceDetailInfo();
			resourceDetailInfo.setRegionID(_ctx.stringValue("RescaleDeviceServiceResponse.ResourceDetailInfos["+ i +"].RegionID"));
			resourceDetailInfo.setID(_ctx.stringValue("RescaleDeviceServiceResponse.ResourceDetailInfos["+ i +"].ID"));
			resourceDetailInfo.setIP(_ctx.stringValue("RescaleDeviceServiceResponse.ResourceDetailInfos["+ i +"].IP"));
			resourceDetailInfo.setServer(_ctx.stringValue("RescaleDeviceServiceResponse.ResourceDetailInfos["+ i +"].Server"));
			resourceDetailInfo.setType(_ctx.stringValue("RescaleDeviceServiceResponse.ResourceDetailInfos["+ i +"].Type"));
			resourceDetailInfo.setStatus(_ctx.stringValue("RescaleDeviceServiceResponse.ResourceDetailInfos["+ i +"].Status"));
			resourceDetailInfo.setMac(_ctx.stringValue("RescaleDeviceServiceResponse.ResourceDetailInfos["+ i +"].Mac"));
			resourceDetailInfo.setISP(_ctx.stringValue("RescaleDeviceServiceResponse.ResourceDetailInfos["+ i +"].ISP"));

			resourceDetailInfos.add(resourceDetailInfo);
		}
		rescaleDeviceServiceResponse.setResourceDetailInfos(resourceDetailInfos);
	 
	 	return rescaleDeviceServiceResponse;
	}
}