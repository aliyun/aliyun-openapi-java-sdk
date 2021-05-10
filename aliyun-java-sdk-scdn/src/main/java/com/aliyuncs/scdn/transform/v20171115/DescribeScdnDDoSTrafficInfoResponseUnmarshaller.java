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

package com.aliyuncs.scdn.transform.v20171115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDDoSTrafficInfoResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDDoSTrafficInfoResponse.TimeScope;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDDoSTrafficInfoResponseUnmarshaller {

	public static DescribeScdnDDoSTrafficInfoResponse unmarshall(DescribeScdnDDoSTrafficInfoResponse describeScdnDDoSTrafficInfoResponse, UnmarshallerContext _ctx) {
		
		describeScdnDDoSTrafficInfoResponse.setRequestId(_ctx.stringValue("DescribeScdnDDoSTrafficInfoResponse.RequestId"));

		List<String> bpsDrops = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDDoSTrafficInfoResponse.BpsDrops.Length"); i++) {
			bpsDrops.add(_ctx.stringValue("DescribeScdnDDoSTrafficInfoResponse.BpsDrops["+ i +"]"));
		}
		describeScdnDDoSTrafficInfoResponse.setBpsDrops(bpsDrops);

		List<String> bpsTotals = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDDoSTrafficInfoResponse.BpsTotals.Length"); i++) {
			bpsTotals.add(_ctx.stringValue("DescribeScdnDDoSTrafficInfoResponse.BpsTotals["+ i +"]"));
		}
		describeScdnDDoSTrafficInfoResponse.setBpsTotals(bpsTotals);

		List<String> ppsTotals = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDDoSTrafficInfoResponse.PpsTotals.Length"); i++) {
			ppsTotals.add(_ctx.stringValue("DescribeScdnDDoSTrafficInfoResponse.PpsTotals["+ i +"]"));
		}
		describeScdnDDoSTrafficInfoResponse.setPpsTotals(ppsTotals);

		List<String> ppsDrops = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDDoSTrafficInfoResponse.PpsDrops.Length"); i++) {
			ppsDrops.add(_ctx.stringValue("DescribeScdnDDoSTrafficInfoResponse.PpsDrops["+ i +"]"));
		}
		describeScdnDDoSTrafficInfoResponse.setPpsDrops(ppsDrops);

		List<TimeScope> timeScopes = new ArrayList<TimeScope>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDDoSTrafficInfoResponse.TimeScopes.Length"); i++) {
			TimeScope timeScope = new TimeScope();
			timeScope.setInterval(_ctx.stringValue("DescribeScdnDDoSTrafficInfoResponse.TimeScopes["+ i +"].Interval"));
			timeScope.setStart(_ctx.stringValue("DescribeScdnDDoSTrafficInfoResponse.TimeScopes["+ i +"].Start"));

			timeScopes.add(timeScope);
		}
		describeScdnDDoSTrafficInfoResponse.setTimeScopes(timeScopes);
	 
	 	return describeScdnDDoSTrafficInfoResponse;
	}
}