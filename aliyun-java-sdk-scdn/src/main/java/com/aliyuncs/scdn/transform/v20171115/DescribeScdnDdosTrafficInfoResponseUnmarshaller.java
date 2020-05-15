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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDdosTrafficInfoResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDdosTrafficInfoResponse.TimeScope;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDdosTrafficInfoResponseUnmarshaller {

	public static DescribeScdnDdosTrafficInfoResponse unmarshall(DescribeScdnDdosTrafficInfoResponse describeScdnDdosTrafficInfoResponse, UnmarshallerContext _ctx) {
		
		describeScdnDdosTrafficInfoResponse.setRequestId(_ctx.stringValue("DescribeScdnDdosTrafficInfoResponse.RequestId"));

		List<String> bpsDrops = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDdosTrafficInfoResponse.BpsDrops.Length"); i++) {
			bpsDrops.add(_ctx.stringValue("DescribeScdnDdosTrafficInfoResponse.BpsDrops["+ i +"]"));
		}
		describeScdnDdosTrafficInfoResponse.setBpsDrops(bpsDrops);

		List<String> bpsTotals = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDdosTrafficInfoResponse.BpsTotals.Length"); i++) {
			bpsTotals.add(_ctx.stringValue("DescribeScdnDdosTrafficInfoResponse.BpsTotals["+ i +"]"));
		}
		describeScdnDdosTrafficInfoResponse.setBpsTotals(bpsTotals);

		List<String> ppsTotals = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDdosTrafficInfoResponse.PpsTotals.Length"); i++) {
			ppsTotals.add(_ctx.stringValue("DescribeScdnDdosTrafficInfoResponse.PpsTotals["+ i +"]"));
		}
		describeScdnDdosTrafficInfoResponse.setPpsTotals(ppsTotals);

		List<String> ppsDrops = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDdosTrafficInfoResponse.PpsDrops.Length"); i++) {
			ppsDrops.add(_ctx.stringValue("DescribeScdnDdosTrafficInfoResponse.PpsDrops["+ i +"]"));
		}
		describeScdnDdosTrafficInfoResponse.setPpsDrops(ppsDrops);

		List<TimeScope> timeScopes = new ArrayList<TimeScope>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDdosTrafficInfoResponse.TimeScopes.Length"); i++) {
			TimeScope timeScope = new TimeScope();
			timeScope.setInterval(_ctx.stringValue("DescribeScdnDdosTrafficInfoResponse.TimeScopes["+ i +"].Interval"));
			timeScope.setStart(_ctx.stringValue("DescribeScdnDdosTrafficInfoResponse.TimeScopes["+ i +"].Start"));

			timeScopes.add(timeScope);
		}
		describeScdnDdosTrafficInfoResponse.setTimeScopes(timeScopes);
	 
	 	return describeScdnDdosTrafficInfoResponse;
	}
}