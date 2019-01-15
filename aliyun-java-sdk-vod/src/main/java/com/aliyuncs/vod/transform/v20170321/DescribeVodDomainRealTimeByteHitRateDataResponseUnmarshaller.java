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

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainRealTimeByteHitRateDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainRealTimeByteHitRateDataResponse.ByteHitRateDataModel;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainRealTimeByteHitRateDataResponseUnmarshaller {

	public static DescribeVodDomainRealTimeByteHitRateDataResponse unmarshall(DescribeVodDomainRealTimeByteHitRateDataResponse describeVodDomainRealTimeByteHitRateDataResponse, UnmarshallerContext context) {
		
		describeVodDomainRealTimeByteHitRateDataResponse.setRequestId(context.stringValue("DescribeVodDomainRealTimeByteHitRateDataResponse.RequestId"));

		List<ByteHitRateDataModel> data = new ArrayList<ByteHitRateDataModel>();
		for (int i = 0; i < context.lengthValue("DescribeVodDomainRealTimeByteHitRateDataResponse.Data.Length"); i++) {
			ByteHitRateDataModel byteHitRateDataModel = new ByteHitRateDataModel();
			byteHitRateDataModel.setByteHitRate(context.floatValue("DescribeVodDomainRealTimeByteHitRateDataResponse.Data["+ i +"].ByteHitRate"));
			byteHitRateDataModel.setTimeStamp(context.stringValue("DescribeVodDomainRealTimeByteHitRateDataResponse.Data["+ i +"].TimeStamp"));

			data.add(byteHitRateDataModel);
		}
		describeVodDomainRealTimeByteHitRateDataResponse.setData(data);
	 
	 	return describeVodDomainRealTimeByteHitRateDataResponse;
	}
}