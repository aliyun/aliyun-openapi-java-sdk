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

package com.aliyuncs.scdn.transform.v20171115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainRegionDataResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainRegionDataResponse.RegionProportionData;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainRegionDataResponseUnmarshaller {

	public static DescribeScdnDomainRegionDataResponse unmarshall(DescribeScdnDomainRegionDataResponse describeScdnDomainRegionDataResponse, UnmarshallerContext context) {
		
		describeScdnDomainRegionDataResponse.setRequestId(context.stringValue("DescribeScdnDomainRegionDataResponse.RequestId"));
		describeScdnDomainRegionDataResponse.setDomainName(context.stringValue("DescribeScdnDomainRegionDataResponse.DomainName"));
		describeScdnDomainRegionDataResponse.setDataInterval(context.stringValue("DescribeScdnDomainRegionDataResponse.DataInterval"));
		describeScdnDomainRegionDataResponse.setStartTime(context.stringValue("DescribeScdnDomainRegionDataResponse.StartTime"));
		describeScdnDomainRegionDataResponse.setEndTime(context.stringValue("DescribeScdnDomainRegionDataResponse.EndTime"));

		List<RegionProportionData> value = new ArrayList<RegionProportionData>();
		for (int i = 0; i < context.lengthValue("DescribeScdnDomainRegionDataResponse.Value.Length"); i++) {
			RegionProportionData regionProportionData = new RegionProportionData();
			regionProportionData.setRegion(context.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].Region"));
			regionProportionData.setProportion(context.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].Proportion"));
			regionProportionData.setRegionEname(context.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].RegionEname"));
			regionProportionData.setAvgObjectSize(context.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].AvgObjectSize"));
			regionProportionData.setAvgResponseTime(context.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].AvgResponseTime"));
			regionProportionData.setBps(context.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].Bps"));
			regionProportionData.setQps(context.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].Qps"));
			regionProportionData.setAvgResponseRate(context.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].AvgResponseRate"));
			regionProportionData.setReqErrRate(context.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].ReqErrRate"));
			regionProportionData.setTotalBytes(context.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].TotalBytes"));
			regionProportionData.setBytesProportion(context.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].BytesProportion"));
			regionProportionData.setTotalQuery(context.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].TotalQuery"));

			value.add(regionProportionData);
		}
		describeScdnDomainRegionDataResponse.setValue(value);
	 
	 	return describeScdnDomainRegionDataResponse;
	}
}