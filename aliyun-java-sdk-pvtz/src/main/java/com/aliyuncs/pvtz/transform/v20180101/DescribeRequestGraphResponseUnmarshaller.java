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

package com.aliyuncs.pvtz.transform.v20180101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pvtz.model.v20180101.DescribeRequestGraphResponse;
import com.aliyuncs.pvtz.model.v20180101.DescribeRequestGraphResponse.ZoneRequestTop;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRequestGraphResponseUnmarshaller {

	public static DescribeRequestGraphResponse unmarshall(DescribeRequestGraphResponse describeRequestGraphResponse, UnmarshallerContext context) {
		
		describeRequestGraphResponse.setRequestId(context.stringValue("DescribeRequestGraphResponse.RequestId"));

		List<ZoneRequestTop> requestDetails = new ArrayList<ZoneRequestTop>();
		for (int i = 0; i < context.lengthValue("DescribeRequestGraphResponse.RequestDetails.Length"); i++) {
			ZoneRequestTop zoneRequestTop = new ZoneRequestTop();
			zoneRequestTop.setTime(context.stringValue("DescribeRequestGraphResponse.RequestDetails["+ i +"].Time"));
			zoneRequestTop.setTimestamp(context.longValue("DescribeRequestGraphResponse.RequestDetails["+ i +"].Timestamp"));
			zoneRequestTop.setRequestCount(context.longValue("DescribeRequestGraphResponse.RequestDetails["+ i +"].RequestCount"));

			requestDetails.add(zoneRequestTop);
		}
		describeRequestGraphResponse.setRequestDetails(requestDetails);
	 
	 	return describeRequestGraphResponse;
	}
}