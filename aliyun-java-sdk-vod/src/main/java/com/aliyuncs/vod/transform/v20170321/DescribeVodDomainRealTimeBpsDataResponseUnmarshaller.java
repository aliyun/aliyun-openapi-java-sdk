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

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainRealTimeBpsDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainRealTimeBpsDataResponse.BpsModel;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainRealTimeBpsDataResponseUnmarshaller {

	public static DescribeVodDomainRealTimeBpsDataResponse unmarshall(DescribeVodDomainRealTimeBpsDataResponse describeVodDomainRealTimeBpsDataResponse, UnmarshallerContext context) {
		
		describeVodDomainRealTimeBpsDataResponse.setRequestId(context.stringValue("DescribeVodDomainRealTimeBpsDataResponse.RequestId"));

		List<BpsModel> data = new ArrayList<BpsModel>();
		for (int i = 0; i < context.lengthValue("DescribeVodDomainRealTimeBpsDataResponse.Data.Length"); i++) {
			BpsModel bpsModel = new BpsModel();
			bpsModel.setBps(context.floatValue("DescribeVodDomainRealTimeBpsDataResponse.Data["+ i +"].Bps"));
			bpsModel.setTimeStamp(context.stringValue("DescribeVodDomainRealTimeBpsDataResponse.Data["+ i +"].TimeStamp"));

			data.add(bpsModel);
		}
		describeVodDomainRealTimeBpsDataResponse.setData(data);
	 
	 	return describeVodDomainRealTimeBpsDataResponse;
	}
}