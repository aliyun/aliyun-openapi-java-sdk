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

package com.aliyuncs.nis.transform.v20211216;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nis.model.v20211216.GetTransitRouterFlowTopNResponse;
import com.aliyuncs.nis.model.v20211216.GetTransitRouterFlowTopNResponse.TrFlowlogTopN;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTransitRouterFlowTopNResponseUnmarshaller {

	public static GetTransitRouterFlowTopNResponse unmarshall(GetTransitRouterFlowTopNResponse getTransitRouterFlowTopNResponse, UnmarshallerContext _ctx) {
		
		getTransitRouterFlowTopNResponse.setRequestId(_ctx.stringValue("GetTransitRouterFlowTopNResponse.RequestId"));

		List<TrFlowlogTopN> transitRouterFlowTopN = new ArrayList<TrFlowlogTopN>();
		for (int i = 0; i < _ctx.lengthValue("GetTransitRouterFlowTopNResponse.TransitRouterFlowTopN.Length"); i++) {
			TrFlowlogTopN trFlowlogTopN = new TrFlowlogTopN();
			trFlowlogTopN.setAccountId(_ctx.stringValue("GetTransitRouterFlowTopNResponse.TransitRouterFlowTopN["+ i +"].AccountId"));
			trFlowlogTopN.setCenId(_ctx.stringValue("GetTransitRouterFlowTopNResponse.TransitRouterFlowTopN["+ i +"].CenId"));
			trFlowlogTopN.setThisRegion(_ctx.stringValue("GetTransitRouterFlowTopNResponse.TransitRouterFlowTopN["+ i +"].ThisRegion"));
			trFlowlogTopN.setThisIp(_ctx.stringValue("GetTransitRouterFlowTopNResponse.TransitRouterFlowTopN["+ i +"].ThisIp"));
			trFlowlogTopN.setThisPort(_ctx.stringValue("GetTransitRouterFlowTopNResponse.TransitRouterFlowTopN["+ i +"].ThisPort"));
			trFlowlogTopN.setOtherRegion(_ctx.stringValue("GetTransitRouterFlowTopNResponse.TransitRouterFlowTopN["+ i +"].OtherRegion"));
			trFlowlogTopN.setOtherIp(_ctx.stringValue("GetTransitRouterFlowTopNResponse.TransitRouterFlowTopN["+ i +"].OtherIp"));
			trFlowlogTopN.setOtherPort(_ctx.stringValue("GetTransitRouterFlowTopNResponse.TransitRouterFlowTopN["+ i +"].OtherPort"));
			trFlowlogTopN.setBizProtocol(_ctx.stringValue("GetTransitRouterFlowTopNResponse.TransitRouterFlowTopN["+ i +"].Protocol"));
			trFlowlogTopN.setStartTime(_ctx.stringValue("GetTransitRouterFlowTopNResponse.TransitRouterFlowTopN["+ i +"].StartTime"));
			trFlowlogTopN.setEndTime(_ctx.stringValue("GetTransitRouterFlowTopNResponse.TransitRouterFlowTopN["+ i +"].EndTime"));
			trFlowlogTopN.setPackets(_ctx.doubleValue("GetTransitRouterFlowTopNResponse.TransitRouterFlowTopN["+ i +"].Packets"));
			trFlowlogTopN.setBytes(_ctx.doubleValue("GetTransitRouterFlowTopNResponse.TransitRouterFlowTopN["+ i +"].Bytes"));
			trFlowlogTopN.setBandwithPackageId(_ctx.stringValue("GetTransitRouterFlowTopNResponse.TransitRouterFlowTopN["+ i +"].BandwithPackageId"));

			transitRouterFlowTopN.add(trFlowlogTopN);
		}
		getTransitRouterFlowTopNResponse.setTransitRouterFlowTopN(transitRouterFlowTopN);
	 
	 	return getTransitRouterFlowTopNResponse;
	}
}