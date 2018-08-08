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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainRegionDataResponseUnmarshaller {

	public static DescribeDomainRegionDataResponse unmarshall(DescribeDomainRegionDataResponse describeDomainRegionDataResponse, UnmarshallerContext context) {
		
		describeDomainRegionDataResponse.setRequestId(context.stringValue("DescribeDomainRegionDataResponse.RequestId"));
		describeDomainRegionDataResponse.setDomainName(context.stringValue("DescribeDomainRegionDataResponse.DomainName"));
		describeDomainRegionDataResponse.setDataInterval(context.stringValue("DescribeDomainRegionDataResponse.DataInterval"));
		describeDomainRegionDataResponse.setStartTime(context.stringValue("DescribeDomainRegionDataResponse.StartTime"));
		describeDomainRegionDataResponse.setEndTime(context.stringValue("DescribeDomainRegionDataResponse.EndTime"));

		List<RegionProportionData> value = new ArrayList<RegionProportionData>();
		for (int i = 0; i < context.lengthValue("DescribeDomainRegionDataResponse.Value.Length"); i++) {
			RegionProportionData regionProportionData = new RegionProportionData();
			regionProportionData.setRegion(context.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].Region"));
			regionProportionData.setProportion(context.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].Proportion"));
			regionProportionData.setRegionEname(context.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].RegionEname"));
			regionProportionData.setAvgObjectSize(context.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].AvgObjectSize"));
			regionProportionData.setAvgResponseTime(context.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].AvgResponseTime"));
			regionProportionData.setBps(context.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].Bps"));
			regionProportionData.setByteHitRate(context.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].ByteHitRate"));
			regionProportionData.setQps(context.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].Qps"));
			regionProportionData.setReqErrRate(context.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].ReqErrRate"));
			regionProportionData.setReqHitRate(context.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].ReqHitRate"));
			regionProportionData.setAvgResponseRate(context.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].AvgResponseRate"));
			regionProportionData.setTotalBytes(context.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].TotalBytes"));
			regionProportionData.setBytesProportion(context.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].BytesProportion"));
			regionProportionData.setTotalQuery(context.stringValue("DescribeDomainRegionDataResponse.Value["+ i +"].TotalQuery"));

			value.add(regionProportionData);
		}
		describeDomainRegionDataResponse.setValue(value);
	 
	 	return describeDomainRegionDataResponse;
	}
}