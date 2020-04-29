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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnCcQpsInfoResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnCcQpsInfoResponse.TimeScope;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnCcQpsInfoResponseUnmarshaller {

	public static DescribeScdnCcQpsInfoResponse unmarshall(DescribeScdnCcQpsInfoResponse describeScdnCcQpsInfoResponse, UnmarshallerContext _ctx) {
		
		describeScdnCcQpsInfoResponse.setRequestId(_ctx.stringValue("DescribeScdnCcQpsInfoResponse.RequestId"));

		List<String> totals = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnCcQpsInfoResponse.Totals.Length"); i++) {
			totals.add(_ctx.stringValue("DescribeScdnCcQpsInfoResponse.Totals["+ i +"]"));
		}
		describeScdnCcQpsInfoResponse.setTotals(totals);

		List<String> attacks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnCcQpsInfoResponse.Attacks.Length"); i++) {
			attacks.add(_ctx.stringValue("DescribeScdnCcQpsInfoResponse.Attacks["+ i +"]"));
		}
		describeScdnCcQpsInfoResponse.setAttacks(attacks);

		List<TimeScope> timeScopes = new ArrayList<TimeScope>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnCcQpsInfoResponse.TimeScopes.Length"); i++) {
			TimeScope timeScope = new TimeScope();
			timeScope.setInterval(_ctx.stringValue("DescribeScdnCcQpsInfoResponse.TimeScopes["+ i +"].Interval"));
			timeScope.setStart(_ctx.stringValue("DescribeScdnCcQpsInfoResponse.TimeScopes["+ i +"].Start"));

			timeScopes.add(timeScope);
		}
		describeScdnCcQpsInfoResponse.setTimeScopes(timeScopes);
	 
	 	return describeScdnCcQpsInfoResponse;
	}
}