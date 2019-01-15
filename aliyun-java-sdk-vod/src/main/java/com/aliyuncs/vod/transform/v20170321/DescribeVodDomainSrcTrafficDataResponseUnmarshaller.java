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

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainSrcTrafficDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainSrcTrafficDataResponse.DataModule;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainSrcTrafficDataResponseUnmarshaller {

	public static DescribeVodDomainSrcTrafficDataResponse unmarshall(DescribeVodDomainSrcTrafficDataResponse describeVodDomainSrcTrafficDataResponse, UnmarshallerContext context) {
		
		describeVodDomainSrcTrafficDataResponse.setRequestId(context.stringValue("DescribeVodDomainSrcTrafficDataResponse.RequestId"));
		describeVodDomainSrcTrafficDataResponse.setDomainName(context.stringValue("DescribeVodDomainSrcTrafficDataResponse.DomainName"));
		describeVodDomainSrcTrafficDataResponse.setStartTime(context.stringValue("DescribeVodDomainSrcTrafficDataResponse.StartTime"));
		describeVodDomainSrcTrafficDataResponse.setEndTime(context.stringValue("DescribeVodDomainSrcTrafficDataResponse.EndTime"));
		describeVodDomainSrcTrafficDataResponse.setDataInterval(context.stringValue("DescribeVodDomainSrcTrafficDataResponse.DataInterval"));

		List<DataModule> srcTrafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeVodDomainSrcTrafficDataResponse.SrcTrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeVodDomainSrcTrafficDataResponse.SrcTrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeVodDomainSrcTrafficDataResponse.SrcTrafficDataPerInterval["+ i +"].Value"));
			dataModule.setHttpsValue(context.stringValue("DescribeVodDomainSrcTrafficDataResponse.SrcTrafficDataPerInterval["+ i +"].HttpsValue"));

			srcTrafficDataPerInterval.add(dataModule);
		}
		describeVodDomainSrcTrafficDataResponse.setSrcTrafficDataPerInterval(srcTrafficDataPerInterval);
	 
	 	return describeVodDomainSrcTrafficDataResponse;
	}
}