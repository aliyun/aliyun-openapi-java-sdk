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

import com.aliyuncs.vod.model.v20170321.DescribePlayUserAvgResponse;
import com.aliyuncs.vod.model.v20170321.DescribePlayUserAvgResponse.UserPlayStatisAvg;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePlayUserAvgResponseUnmarshaller {

	public static DescribePlayUserAvgResponse unmarshall(DescribePlayUserAvgResponse describePlayUserAvgResponse, UnmarshallerContext _ctx) {
		
		describePlayUserAvgResponse.setRequestId(_ctx.stringValue("DescribePlayUserAvgResponse.RequestId"));

		List<UserPlayStatisAvg> userPlayStatisAvgs = new ArrayList<UserPlayStatisAvg>();
		for (int i = 0; i < _ctx.lengthValue("DescribePlayUserAvgResponse.UserPlayStatisAvgs.Length"); i++) {
			UserPlayStatisAvg userPlayStatisAvg = new UserPlayStatisAvg();
			userPlayStatisAvg.setDate(_ctx.stringValue("DescribePlayUserAvgResponse.UserPlayStatisAvgs["+ i +"].Date"));
			userPlayStatisAvg.setAvgPlayDuration(_ctx.stringValue("DescribePlayUserAvgResponse.UserPlayStatisAvgs["+ i +"].AvgPlayDuration"));
			userPlayStatisAvg.setAvgPlayCount(_ctx.stringValue("DescribePlayUserAvgResponse.UserPlayStatisAvgs["+ i +"].AvgPlayCount"));

			userPlayStatisAvgs.add(userPlayStatisAvg);
		}
		describePlayUserAvgResponse.setUserPlayStatisAvgs(userPlayStatisAvgs);
	 
	 	return describePlayUserAvgResponse;
	}
}