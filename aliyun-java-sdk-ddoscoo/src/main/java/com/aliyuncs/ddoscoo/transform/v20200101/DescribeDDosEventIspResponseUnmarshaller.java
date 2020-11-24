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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeDDosEventIspResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeDDosEventIspResponse.EventIsp;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDDosEventIspResponseUnmarshaller {

	public static DescribeDDosEventIspResponse unmarshall(DescribeDDosEventIspResponse describeDDosEventIspResponse, UnmarshallerContext _ctx) {
		
		describeDDosEventIspResponse.setRequestId(_ctx.stringValue("DescribeDDosEventIspResponse.RequestId"));

		List<EventIsp> isps = new ArrayList<EventIsp>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDDosEventIspResponse.Isps.Length"); i++) {
			EventIsp eventIsp = new EventIsp();
			eventIsp.setIsp(_ctx.stringValue("DescribeDDosEventIspResponse.Isps["+ i +"].Isp"));
			eventIsp.setInPkts(_ctx.longValue("DescribeDDosEventIspResponse.Isps["+ i +"].InPkts"));

			isps.add(eventIsp);
		}
		describeDDosEventIspResponse.setIsps(isps);
	 
	 	return describeDDosEventIspResponse;
	}
}