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

import com.aliyuncs.ddoscoo.model.v20200101.DescribeDDosEventAreaResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeDDosEventAreaResponse.EventArea;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDDosEventAreaResponseUnmarshaller {

	public static DescribeDDosEventAreaResponse unmarshall(DescribeDDosEventAreaResponse describeDDosEventAreaResponse, UnmarshallerContext _ctx) {
		
		describeDDosEventAreaResponse.setRequestId(_ctx.stringValue("DescribeDDosEventAreaResponse.RequestId"));

		List<EventArea> areas = new ArrayList<EventArea>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDDosEventAreaResponse.Areas.Length"); i++) {
			EventArea eventArea = new EventArea();
			eventArea.setArea(_ctx.stringValue("DescribeDDosEventAreaResponse.Areas["+ i +"].Area"));
			eventArea.setInPkts(_ctx.longValue("DescribeDDosEventAreaResponse.Areas["+ i +"].InPkts"));

			areas.add(eventArea);
		}
		describeDDosEventAreaResponse.setAreas(areas);
	 
	 	return describeDDosEventAreaResponse;
	}
}