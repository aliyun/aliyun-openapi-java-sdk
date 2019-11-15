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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainRegionDataResponseUnmarshaller {

	public static DescribeScdnDomainRegionDataResponse unmarshall(DescribeScdnDomainRegionDataResponse describeScdnDomainRegionDataResponse, UnmarshallerContext _ctx) {
		
		describeScdnDomainRegionDataResponse.setRequestId(_ctx.stringValue("DescribeScdnDomainRegionDataResponse.RequestId"));
		describeScdnDomainRegionDataResponse.setDomainName(_ctx.stringValue("DescribeScdnDomainRegionDataResponse.DomainName"));
		describeScdnDomainRegionDataResponse.setDataInterval(_ctx.stringValue("DescribeScdnDomainRegionDataResponse.DataInterval"));
		describeScdnDomainRegionDataResponse.setStartTime(_ctx.stringValue("DescribeScdnDomainRegionDataResponse.StartTime"));
		describeScdnDomainRegionDataResponse.setEndTime(_ctx.stringValue("DescribeScdnDomainRegionDataResponse.EndTime"));

		List<RegionProportionData> value = new ArrayList<RegionProportionData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDomainRegionDataResponse.Value.Length"); i++) {
			RegionProportionData regionProportionData = new RegionProportionData();
			regionProportionData.setRegion(_ctx.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].Region"));
			regionProportionData.setProportion(_ctx.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].Proportion"));
			regionProportionData.setRegionEname(_ctx.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].RegionEname"));
			regionProportionData.setAvgObjectSize(_ctx.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].AvgObjectSize"));
			regionProportionData.setAvgResponseTime(_ctx.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].AvgResponseTime"));
			regionProportionData.setBps(_ctx.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].Bps"));
			regionProportionData.setQps(_ctx.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].Qps"));
			regionProportionData.setAvgResponseRate(_ctx.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].AvgResponseRate"));
			regionProportionData.setReqErrRate(_ctx.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].ReqErrRate"));
			regionProportionData.setTotalBytes(_ctx.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].TotalBytes"));
			regionProportionData.setBytesProportion(_ctx.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].BytesProportion"));
			regionProportionData.setTotalQuery(_ctx.stringValue("DescribeScdnDomainRegionDataResponse.Value["+ i +"].TotalQuery"));

			value.add(regionProportionData);
		}
		describeScdnDomainRegionDataResponse.setValue(value);
	 
	 	return describeScdnDomainRegionDataResponse;
	}
}