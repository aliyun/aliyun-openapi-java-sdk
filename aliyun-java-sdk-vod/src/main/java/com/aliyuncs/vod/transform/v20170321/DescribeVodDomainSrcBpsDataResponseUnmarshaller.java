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

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainSrcBpsDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainSrcBpsDataResponse.DataModule;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainSrcBpsDataResponseUnmarshaller {

	public static DescribeVodDomainSrcBpsDataResponse unmarshall(DescribeVodDomainSrcBpsDataResponse describeVodDomainSrcBpsDataResponse, UnmarshallerContext context) {
		
		describeVodDomainSrcBpsDataResponse.setRequestId(context.stringValue("DescribeVodDomainSrcBpsDataResponse.RequestId"));
		describeVodDomainSrcBpsDataResponse.setDomainName(context.stringValue("DescribeVodDomainSrcBpsDataResponse.DomainName"));
		describeVodDomainSrcBpsDataResponse.setStartTime(context.stringValue("DescribeVodDomainSrcBpsDataResponse.StartTime"));
		describeVodDomainSrcBpsDataResponse.setEndTime(context.stringValue("DescribeVodDomainSrcBpsDataResponse.EndTime"));
		describeVodDomainSrcBpsDataResponse.setDataInterval(context.stringValue("DescribeVodDomainSrcBpsDataResponse.DataInterval"));

		List<DataModule> srcBpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeVodDomainSrcBpsDataResponse.SrcBpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeVodDomainSrcBpsDataResponse.SrcBpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeVodDomainSrcBpsDataResponse.SrcBpsDataPerInterval["+ i +"].Value"));
			dataModule.setHttpsValue(context.stringValue("DescribeVodDomainSrcBpsDataResponse.SrcBpsDataPerInterval["+ i +"].HttpsValue"));

			srcBpsDataPerInterval.add(dataModule);
		}
		describeVodDomainSrcBpsDataResponse.setSrcBpsDataPerInterval(srcBpsDataPerInterval);
	 
	 	return describeVodDomainSrcBpsDataResponse;
	}
}