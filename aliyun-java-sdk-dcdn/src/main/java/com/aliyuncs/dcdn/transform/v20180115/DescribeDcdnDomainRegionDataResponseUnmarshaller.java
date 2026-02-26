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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainRegionDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainRegionDataResponse.RegionProportionData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainRegionDataResponseUnmarshaller {

	public static DescribeDcdnDomainRegionDataResponse unmarshall(DescribeDcdnDomainRegionDataResponse describeDcdnDomainRegionDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainRegionDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainRegionDataResponse.RequestId"));
		describeDcdnDomainRegionDataResponse.setEndTime(_ctx.stringValue("DescribeDcdnDomainRegionDataResponse.EndTime"));
		describeDcdnDomainRegionDataResponse.setStartTime(_ctx.stringValue("DescribeDcdnDomainRegionDataResponse.StartTime"));
		describeDcdnDomainRegionDataResponse.setDomainName(_ctx.stringValue("DescribeDcdnDomainRegionDataResponse.DomainName"));
		describeDcdnDomainRegionDataResponse.setDataInterval(_ctx.stringValue("DescribeDcdnDomainRegionDataResponse.DataInterval"));

		List<RegionProportionData> value = new ArrayList<RegionProportionData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainRegionDataResponse.Value.Length"); i++) {
			RegionProportionData regionProportionData = new RegionProportionData();
			regionProportionData.setQps(_ctx.stringValue("DescribeDcdnDomainRegionDataResponse.Value["+ i +"].Qps"));
			regionProportionData.setTotalQuery(_ctx.stringValue("DescribeDcdnDomainRegionDataResponse.Value["+ i +"].TotalQuery"));
			regionProportionData.setTotalBytes(_ctx.stringValue("DescribeDcdnDomainRegionDataResponse.Value["+ i +"].TotalBytes"));
			regionProportionData.setRegionEname(_ctx.stringValue("DescribeDcdnDomainRegionDataResponse.Value["+ i +"].RegionEname"));
			regionProportionData.setRegion(_ctx.stringValue("DescribeDcdnDomainRegionDataResponse.Value["+ i +"].Region"));
			regionProportionData.setAvgResponseRate(_ctx.stringValue("DescribeDcdnDomainRegionDataResponse.Value["+ i +"].AvgResponseRate"));
			regionProportionData.setAvgResponseTime(_ctx.stringValue("DescribeDcdnDomainRegionDataResponse.Value["+ i +"].AvgResponseTime"));
			regionProportionData.setProportion(_ctx.stringValue("DescribeDcdnDomainRegionDataResponse.Value["+ i +"].Proportion"));
			regionProportionData.setAvgObjectSize(_ctx.stringValue("DescribeDcdnDomainRegionDataResponse.Value["+ i +"].AvgObjectSize"));
			regionProportionData.setBps(_ctx.stringValue("DescribeDcdnDomainRegionDataResponse.Value["+ i +"].Bps"));
			regionProportionData.setBytesProportion(_ctx.stringValue("DescribeDcdnDomainRegionDataResponse.Value["+ i +"].BytesProportion"));

			value.add(regionProportionData);
		}
		describeDcdnDomainRegionDataResponse.setValue(value);
	 
	 	return describeDcdnDomainRegionDataResponse;
	}
}