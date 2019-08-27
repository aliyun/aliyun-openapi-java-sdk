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

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeDomainRegionDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainRegionDataResponse.RegionProportionData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainRegionDataResponseUnmarshaller {

	public static DescribeDomainRegionDataResponse unmarshall(DescribeDomainRegionDataResponse describeDomainRegionDataResponse, UnmarshallerContext _ctx) {
		
		describeDomainRegionDataResponse.setRequestId(_ctx.stringValue("DescribeDomainRegionDataResponse.RequestId"));
		describeDomainRegionDataResponse.setDomainName(_ctx.stringValue("DescribeDomainRegionDataResponse.DomainName"));
		describeDomainRegionDataResponse.setDataInterval(_ctx.stringValue("DescribeDomainRegionDataResponse.DataInterval"));
		describeDomainRegionDataResponse.setStartTime(_ctx.stringValue("DescribeDomainRegionDataResponse.StartTime"));
		describeDomainRegionDataResponse.setEndTime(_ctx.stringValue("DescribeDomainRegionDataResponse.EndTime"));

		List<RegionProportionData> value = new ArrayList<RegionProportionData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainRegionDataResponse.Value.Length"); i++) {
			RegionProportionData regionProportionData = new RegionProportionData();
			regionProportionData.setRegion(_ctx.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].Region"));
			regionProportionData.setProportion(_ctx.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].Proportion"));
			regionProportionData.setRegionEname(_ctx.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].RegionEname"));
			regionProportionData.setAvgObjectSize(_ctx.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].AvgObjectSize"));
			regionProportionData.setAvgResponseTime(_ctx.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].AvgResponseTime"));
			regionProportionData.setBps(_ctx.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].Bps"));
			regionProportionData.setQps(_ctx.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].Qps"));
			regionProportionData.setAvgResponseRate(_ctx.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].AvgResponseRate"));
			regionProportionData.setByteHitRate(_ctx.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].ByteHitRate"));
			regionProportionData.setReqHitRate(_ctx.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].ReqHitRate"));
			regionProportionData.setReqErrRate(_ctx.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].ReqErrRate"));
			regionProportionData.setTotalBytes(_ctx.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].TotalBytes"));
			regionProportionData.setBytesProportion(_ctx.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].BytesProportion"));
			regionProportionData.setTotalQuery(_ctx.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].TotalQuery"));

			value.add(regionProportionData);
		}
		describeDomainRegionDataResponse.setValue(value);
	 
	 	return describeDomainRegionDataResponse;
	}
}