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

import com.aliyuncs.openanalytics_open.model.v20180619.AddEndPointResponse;
import com.aliyuncs.openanalytics_open.model.v20180619.AddEndPointResponse.EndPointInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddEndPointResponseUnmarshaller {

	public static AddEndPointResponse unmarshall(AddEndPointResponse addEndPointResponse, UnmarshallerContext _ctx) {
		
		addEndPointResponse.setRequestId(_ctx.stringValue("AddEndPointResponse.RequestId"));
		addEndPointResponse.setRegionId(_ctx.stringValue("AddEndPointResponse.RegionId"));

		EndPointInfo endPointInfo = new EndPointInfo();
		endPointInfo.setDomainURL(_ctx.stringValue("AddEndPointResponse.EndPointInfo.domainURL"));
		endPointInfo.setHost(_ctx.stringValue("AddEndPointResponse.EndPointInfo.host"));
		endPointInfo.setPort(_ctx.stringValue("AddEndPointResponse.EndPointInfo.port"));
		endPointInfo.setNetworkType(_ctx.stringValue("AddEndPointResponse.EndPointInfo.networkType"));
		endPointInfo.setVpcID(_ctx.stringValue("AddEndPointResponse.EndPointInfo.vpcID"));
		endPointInfo.setVSwitch(_ctx.stringValue("AddEndPointResponse.EndPointInfo.vSwitch"));
		endPointInfo.setZone(_ctx.stringValue("AddEndPointResponse.EndPointInfo.zone"));
		endPointInfo.setAllowIP(_ctx.stringValue("AddEndPointResponse.EndPointInfo.allowIP"));
		endPointInfo.setEndPointID(_ctx.stringValue("AddEndPointResponse.EndPointInfo.endPointID"));
		endPointInfo.setStatus(_ctx.stringValue("AddEndPointResponse.EndPointInfo.status"));
		endPointInfo.setProduct(_ctx.stringValue("AddEndPointResponse.EndPointInfo.product"));
		addEndPointResponse.setEndPointInfo(endPointInfo);
	 
	 	return addEndPointResponse;
	}
}