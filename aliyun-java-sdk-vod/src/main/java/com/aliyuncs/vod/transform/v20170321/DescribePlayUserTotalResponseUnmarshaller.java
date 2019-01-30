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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.DescribePlayUserTotalResponse;
import com.aliyuncs.vod.model.v20170321.DescribePlayUserTotalResponse.UserPlayStatisTotal;
import com.aliyuncs.vod.model.v20170321.DescribePlayUserTotalResponse.UserPlayStatisTotal.UV;
import com.aliyuncs.vod.model.v20170321.DescribePlayUserTotalResponse.UserPlayStatisTotal.VV;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePlayUserTotalResponseUnmarshaller {

	public static DescribePlayUserTotalResponse unmarshall(DescribePlayUserTotalResponse describePlayUserTotalResponse, UnmarshallerContext context) {
		
		describePlayUserTotalResponse.setRequestId(context.stringValue("DescribePlayUserTotalResponse.RequestId"));

		List<UserPlayStatisTotal> userPlayStatisTotals = new ArrayList<UserPlayStatisTotal>();
		for (int i = 0; i < context.lengthValue("DescribePlayUserTotalResponse.UserPlayStatisTotals.Length"); i++) {
			UserPlayStatisTotal userPlayStatisTotal = new UserPlayStatisTotal();
			userPlayStatisTotal.setDate(context.stringValue("DescribePlayUserTotalResponse.UserPlayStatisTotals["+ i +"].Date"));
			userPlayStatisTotal.setPlayDuration(context.stringValue("DescribePlayUserTotalResponse.UserPlayStatisTotals["+ i +"].PlayDuration"));
			userPlayStatisTotal.setPlayRange(context.stringValue("DescribePlayUserTotalResponse.UserPlayStatisTotals["+ i +"].PlayRange"));

			VV vV = new VV();
			vV.setAndroid(context.stringValue("DescribePlayUserTotalResponse.UserPlayStatisTotals["+ i +"].VV.Android"));
			vV.setIOS(context.stringValue("DescribePlayUserTotalResponse.UserPlayStatisTotals["+ i +"].VV.iOS"));
			vV.setFlash(context.stringValue("DescribePlayUserTotalResponse.UserPlayStatisTotals["+ i +"].VV.Flash"));
			vV.setHTML5(context.stringValue("DescribePlayUserTotalResponse.UserPlayStatisTotals["+ i +"].VV.HTML5"));
			userPlayStatisTotal.setVV(vV);

			UV uV = new UV();
			uV.setAndroid(context.stringValue("DescribePlayUserTotalResponse.UserPlayStatisTotals["+ i +"].UV.Android"));
			uV.setIOS(context.stringValue("DescribePlayUserTotalResponse.UserPlayStatisTotals["+ i +"].UV.iOS"));
			uV.setFlash(context.stringValue("DescribePlayUserTotalResponse.UserPlayStatisTotals["+ i +"].UV.Flash"));
			uV.setHTML5(context.stringValue("DescribePlayUserTotalResponse.UserPlayStatisTotals["+ i +"].UV.HTML5"));
			userPlayStatisTotal.setUV(uV);

			userPlayStatisTotals.add(userPlayStatisTotal);
		}
		describePlayUserTotalResponse.setUserPlayStatisTotals(userPlayStatisTotals);
	 
	 	return describePlayUserTotalResponse;
	}
}