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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.VerifyCenResponse;
import com.aliyuncs.ecd.model.v20200930.VerifyCenResponse.RouteEntry;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyCenResponseUnmarshaller {

	public static VerifyCenResponse unmarshall(VerifyCenResponse verifyCenResponse, UnmarshallerContext _ctx) {
		
		verifyCenResponse.setRequestId(_ctx.stringValue("VerifyCenResponse.RequestId"));
		verifyCenResponse.setStatus(_ctx.stringValue("VerifyCenResponse.Status"));

		List<String> cidrBlocks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("VerifyCenResponse.CidrBlocks.Length"); i++) {
			cidrBlocks.add(_ctx.stringValue("VerifyCenResponse.CidrBlocks["+ i +"]"));
		}
		verifyCenResponse.setCidrBlocks(cidrBlocks);

		List<RouteEntry> routeEntries = new ArrayList<RouteEntry>();
		for (int i = 0; i < _ctx.lengthValue("VerifyCenResponse.RouteEntries.Length"); i++) {
			RouteEntry routeEntry = new RouteEntry();
			routeEntry.setStatus(_ctx.stringValue("VerifyCenResponse.RouteEntries["+ i +"].Status"));
			routeEntry.setNextHopInstanceId(_ctx.stringValue("VerifyCenResponse.RouteEntries["+ i +"].NextHopInstanceId"));
			routeEntry.setDestinationCidrBlock(_ctx.stringValue("VerifyCenResponse.RouteEntries["+ i +"].DestinationCidrBlock"));
			routeEntry.setRegionId(_ctx.stringValue("VerifyCenResponse.RouteEntries["+ i +"].RegionId"));

			routeEntries.add(routeEntry);
		}
		verifyCenResponse.setRouteEntries(routeEntries);
	 
	 	return verifyCenResponse;
	}
}