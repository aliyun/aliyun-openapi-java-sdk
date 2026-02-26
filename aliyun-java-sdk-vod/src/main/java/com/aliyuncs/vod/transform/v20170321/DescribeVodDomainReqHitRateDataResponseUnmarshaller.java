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

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainReqHitRateDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainReqHitRateDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainReqHitRateDataResponseUnmarshaller {

	public static DescribeVodDomainReqHitRateDataResponse unmarshall(DescribeVodDomainReqHitRateDataResponse describeVodDomainReqHitRateDataResponse, UnmarshallerContext _ctx) {
		
		describeVodDomainReqHitRateDataResponse.setRequestId(_ctx.stringValue("DescribeVodDomainReqHitRateDataResponse.RequestId"));
		describeVodDomainReqHitRateDataResponse.setEndTime(_ctx.stringValue("DescribeVodDomainReqHitRateDataResponse.EndTime"));
		describeVodDomainReqHitRateDataResponse.setStartTime(_ctx.stringValue("DescribeVodDomainReqHitRateDataResponse.StartTime"));
		describeVodDomainReqHitRateDataResponse.setDomainName(_ctx.stringValue("DescribeVodDomainReqHitRateDataResponse.DomainName"));
		describeVodDomainReqHitRateDataResponse.setDataInterval(_ctx.stringValue("DescribeVodDomainReqHitRateDataResponse.DataInterval"));

		List<DataModule> data = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodDomainReqHitRateDataResponse.Data.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setValue(_ctx.stringValue("DescribeVodDomainReqHitRateDataResponse.Data["+ i +"].Value"));
			dataModule.setTimeStamp(_ctx.stringValue("DescribeVodDomainReqHitRateDataResponse.Data["+ i +"].TimeStamp"));
			dataModule.setHttpsValue(_ctx.stringValue("DescribeVodDomainReqHitRateDataResponse.Data["+ i +"].HttpsValue"));

			data.add(dataModule);
		}
		describeVodDomainReqHitRateDataResponse.setData(data);
	 
	 	return describeVodDomainReqHitRateDataResponse;
	}
}