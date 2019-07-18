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

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainBpsDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainBpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainBpsDataResponseUnmarshaller {

	public static DescribeVodDomainBpsDataResponse unmarshall(DescribeVodDomainBpsDataResponse describeVodDomainBpsDataResponse, UnmarshallerContext _ctx) {
		
		describeVodDomainBpsDataResponse.setRequestId(_ctx.stringValue("DescribeVodDomainBpsDataResponse.RequestId"));
		describeVodDomainBpsDataResponse.setDomainName(_ctx.stringValue("DescribeVodDomainBpsDataResponse.DomainName"));
		describeVodDomainBpsDataResponse.setStartTime(_ctx.stringValue("DescribeVodDomainBpsDataResponse.StartTime"));
		describeVodDomainBpsDataResponse.setEndTime(_ctx.stringValue("DescribeVodDomainBpsDataResponse.EndTime"));
		describeVodDomainBpsDataResponse.setLocationNameEn(_ctx.stringValue("DescribeVodDomainBpsDataResponse.LocationNameEn"));
		describeVodDomainBpsDataResponse.setIspNameEn(_ctx.stringValue("DescribeVodDomainBpsDataResponse.IspNameEn"));
		describeVodDomainBpsDataResponse.setDataInterval(_ctx.stringValue("DescribeVodDomainBpsDataResponse.DataInterval"));

		List<DataModule> bpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodDomainBpsDataResponse.BpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeVodDomainBpsDataResponse.BpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(_ctx.stringValue("DescribeVodDomainBpsDataResponse.BpsDataPerInterval["+ i +"].Value"));
			dataModule.setDomesticValue(_ctx.stringValue("DescribeVodDomainBpsDataResponse.BpsDataPerInterval["+ i +"].DomesticValue"));
			dataModule.setOverseasValue(_ctx.stringValue("DescribeVodDomainBpsDataResponse.BpsDataPerInterval["+ i +"].OverseasValue"));
			dataModule.setHttpsValue(_ctx.stringValue("DescribeVodDomainBpsDataResponse.BpsDataPerInterval["+ i +"].HttpsValue"));
			dataModule.setHttpsDomesticValue(_ctx.stringValue("DescribeVodDomainBpsDataResponse.BpsDataPerInterval["+ i +"].HttpsDomesticValue"));
			dataModule.setHttpsOverseasValue(_ctx.stringValue("DescribeVodDomainBpsDataResponse.BpsDataPerInterval["+ i +"].HttpsOverseasValue"));

			bpsDataPerInterval.add(dataModule);
		}
		describeVodDomainBpsDataResponse.setBpsDataPerInterval(bpsDataPerInterval);
	 
	 	return describeVodDomainBpsDataResponse;
	}
}