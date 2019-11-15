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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import com.aliyuncs.openanalytics_open.model.v20180619.GetEndPointResponse;
import com.aliyuncs.openanalytics_open.model.v20180619.GetEndPointResponse.EndPointInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEndPointResponseUnmarshaller {

	public static GetEndPointResponse unmarshall(GetEndPointResponse getEndPointResponse, UnmarshallerContext _ctx) {
		
		getEndPointResponse.setRequestId(_ctx.stringValue("GetEndPointResponse.RequestId"));
		getEndPointResponse.setRegionId(_ctx.stringValue("GetEndPointResponse.RegionId"));

		EndPointInfo endPointInfo = new EndPointInfo();
		endPointInfo.setEndPointID(_ctx.stringValue("GetEndPointResponse.EndPointInfo.endPointID"));
		endPointInfo.setDomainURL(_ctx.stringValue("GetEndPointResponse.EndPointInfo.domainURL"));
		endPointInfo.setHost(_ctx.stringValue("GetEndPointResponse.EndPointInfo.host"));
		endPointInfo.setPort(_ctx.stringValue("GetEndPointResponse.EndPointInfo.port"));
		endPointInfo.setNetworkType(_ctx.stringValue("GetEndPointResponse.EndPointInfo.networkType"));
		endPointInfo.setVpcID(_ctx.stringValue("GetEndPointResponse.EndPointInfo.vpcID"));
		endPointInfo.setVSwitch(_ctx.stringValue("GetEndPointResponse.EndPointInfo.vSwitch"));
		endPointInfo.setZone(_ctx.stringValue("GetEndPointResponse.EndPointInfo.zone"));
		endPointInfo.setAllowIP(_ctx.stringValue("GetEndPointResponse.EndPointInfo.allowIP"));
		endPointInfo.setStatus(_ctx.stringValue("GetEndPointResponse.EndPointInfo.status"));
		endPointInfo.setProduct(_ctx.stringValue("GetEndPointResponse.EndPointInfo.product"));
		getEndPointResponse.setEndPointInfo(endPointInfo);
	 
	 	return getEndPointResponse;
	}
}