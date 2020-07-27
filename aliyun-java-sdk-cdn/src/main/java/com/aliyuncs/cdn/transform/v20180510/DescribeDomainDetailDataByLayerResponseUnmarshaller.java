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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeDomainDetailDataByLayerResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainDetailDataByLayerResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainDetailDataByLayerResponseUnmarshaller {

	public static DescribeDomainDetailDataByLayerResponse unmarshall(DescribeDomainDetailDataByLayerResponse describeDomainDetailDataByLayerResponse, UnmarshallerContext _ctx) {
		
		describeDomainDetailDataByLayerResponse.setRequestId(_ctx.stringValue("DescribeDomainDetailDataByLayerResponse.RequestId"));

		List<DataModule> data = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainDetailDataByLayerResponse.Data.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDomainDetailDataByLayerResponse.Data["+ i +"].TimeStamp"));
			dataModule.setDomainName(_ctx.stringValue("DescribeDomainDetailDataByLayerResponse.Data["+ i +"].DomainName"));
			dataModule.setBps(_ctx.floatValue("DescribeDomainDetailDataByLayerResponse.Data["+ i +"].Bps"));
			dataModule.setQps(_ctx.floatValue("DescribeDomainDetailDataByLayerResponse.Data["+ i +"].Qps"));
			dataModule.setTraf(_ctx.longValue("DescribeDomainDetailDataByLayerResponse.Data["+ i +"].Traf"));
			dataModule.setAcc(_ctx.longValue("DescribeDomainDetailDataByLayerResponse.Data["+ i +"].Acc"));
			dataModule.setIpv6Traf(_ctx.longValue("DescribeDomainDetailDataByLayerResponse.Data["+ i +"].Ipv6Traf"));
			dataModule.setIpv6Bps(_ctx.floatValue("DescribeDomainDetailDataByLayerResponse.Data["+ i +"].Ipv6Bps"));
			dataModule.setIpv6Acc(_ctx.longValue("DescribeDomainDetailDataByLayerResponse.Data["+ i +"].Ipv6Acc"));
			dataModule.setIpv6Qps(_ctx.floatValue("DescribeDomainDetailDataByLayerResponse.Data["+ i +"].Ipv6Qps"));
			dataModule.setHttpCode(_ctx.stringValue("DescribeDomainDetailDataByLayerResponse.Data["+ i +"].HttpCode"));

			data.add(dataModule);
		}
		describeDomainDetailDataByLayerResponse.setData(data);
	 
	 	return describeDomainDetailDataByLayerResponse;
	}
}