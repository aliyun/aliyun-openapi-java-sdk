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

package com.aliyuncs.openanalytics.transform.v20180301;

import com.aliyuncs.openanalytics.model.v20180301.GetEndPointByDomainResponse;
import com.aliyuncs.openanalytics.model.v20180301.GetEndPointByDomainResponse.EndPointInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEndPointByDomainResponseUnmarshaller {

	public static GetEndPointByDomainResponse unmarshall(GetEndPointByDomainResponse getEndPointByDomainResponse, UnmarshallerContext context) {
		
		getEndPointByDomainResponse.setRequestId(context.stringValue("GetEndPointByDomainResponse.RequestId"));
		getEndPointByDomainResponse.setRegionId(context.stringValue("GetEndPointByDomainResponse.RegionId"));

		EndPointInfo endPointInfo = new EndPointInfo();
		endPointInfo.setEndPointID(context.stringValue("GetEndPointByDomainResponse.EndPointInfo.endPointID"));
		endPointInfo.setDomainURL(context.stringValue("GetEndPointByDomainResponse.EndPointInfo.domainURL"));
		endPointInfo.setHost(context.stringValue("GetEndPointByDomainResponse.EndPointInfo.host"));
		endPointInfo.setPort(context.stringValue("GetEndPointByDomainResponse.EndPointInfo.port"));
		endPointInfo.setNetworkType(context.stringValue("GetEndPointByDomainResponse.EndPointInfo.networkType"));
		endPointInfo.setVpcID(context.stringValue("GetEndPointByDomainResponse.EndPointInfo.vpcID"));
		endPointInfo.setVSwitch(context.stringValue("GetEndPointByDomainResponse.EndPointInfo.vSwitch"));
		endPointInfo.setZone(context.stringValue("GetEndPointByDomainResponse.EndPointInfo.zone"));
		endPointInfo.setAllowIP(context.stringValue("GetEndPointByDomainResponse.EndPointInfo.allowIP"));
		endPointInfo.setCloudInstanceID(context.stringValue("GetEndPointByDomainResponse.EndPointInfo.cloudInstanceID"));
		getEndPointByDomainResponse.setEndPointInfo(endPointInfo);
	 
	 	return getEndPointByDomainResponse;
	}
}