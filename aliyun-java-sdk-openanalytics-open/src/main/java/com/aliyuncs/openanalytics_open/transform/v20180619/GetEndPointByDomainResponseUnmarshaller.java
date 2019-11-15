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

import com.aliyuncs.openanalytics_open.model.v20180619.GetEndPointByDomainResponse;
import com.aliyuncs.openanalytics_open.model.v20180619.GetEndPointByDomainResponse.EndPointInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEndPointByDomainResponseUnmarshaller {

	public static GetEndPointByDomainResponse unmarshall(GetEndPointByDomainResponse getEndPointByDomainResponse, UnmarshallerContext _ctx) {
		
		getEndPointByDomainResponse.setRequestId(_ctx.stringValue("GetEndPointByDomainResponse.RequestId"));
		getEndPointByDomainResponse.setRegionId(_ctx.stringValue("GetEndPointByDomainResponse.RegionId"));

		EndPointInfo endPointInfo = new EndPointInfo();
		endPointInfo.setEndPointID(_ctx.stringValue("GetEndPointByDomainResponse.EndPointInfo.endPointID"));
		endPointInfo.setDomainURL(_ctx.stringValue("GetEndPointByDomainResponse.EndPointInfo.domainURL"));
		endPointInfo.setHost(_ctx.stringValue("GetEndPointByDomainResponse.EndPointInfo.host"));
		endPointInfo.setPort(_ctx.stringValue("GetEndPointByDomainResponse.EndPointInfo.port"));
		endPointInfo.setNetworkType(_ctx.stringValue("GetEndPointByDomainResponse.EndPointInfo.networkType"));
		endPointInfo.setVpcID(_ctx.stringValue("GetEndPointByDomainResponse.EndPointInfo.vpcID"));
		endPointInfo.setVSwitch(_ctx.stringValue("GetEndPointByDomainResponse.EndPointInfo.vSwitch"));
		endPointInfo.setZone(_ctx.stringValue("GetEndPointByDomainResponse.EndPointInfo.zone"));
		endPointInfo.setAllowIP(_ctx.stringValue("GetEndPointByDomainResponse.EndPointInfo.allowIP"));
		endPointInfo.setCloudInstanceID(_ctx.stringValue("GetEndPointByDomainResponse.EndPointInfo.cloudInstanceID"));
		endPointInfo.setProduct(_ctx.stringValue("GetEndPointByDomainResponse.EndPointInfo.product"));
		getEndPointByDomainResponse.setEndPointInfo(endPointInfo);
	 
	 	return getEndPointByDomainResponse;
	}
}