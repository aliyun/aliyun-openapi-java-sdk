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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeVsDomainRegionDataResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsDomainRegionDataResponse.RegionProportionData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsDomainRegionDataResponseUnmarshaller {

	public static DescribeVsDomainRegionDataResponse unmarshall(DescribeVsDomainRegionDataResponse describeVsDomainRegionDataResponse, UnmarshallerContext _ctx) {
		
		describeVsDomainRegionDataResponse.setRequestId(_ctx.stringValue("DescribeVsDomainRegionDataResponse.RequestId"));
		describeVsDomainRegionDataResponse.setDomainName(_ctx.stringValue("DescribeVsDomainRegionDataResponse.DomainName"));
		describeVsDomainRegionDataResponse.setDataInterval(_ctx.stringValue("DescribeVsDomainRegionDataResponse.DataInterval"));
		describeVsDomainRegionDataResponse.setStartTime(_ctx.stringValue("DescribeVsDomainRegionDataResponse.StartTime"));
		describeVsDomainRegionDataResponse.setEndTime(_ctx.stringValue("DescribeVsDomainRegionDataResponse.EndTime"));

		List<RegionProportionData> value = new ArrayList<RegionProportionData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVsDomainRegionDataResponse.Value.Length"); i++) {
			RegionProportionData regionProportionData = new RegionProportionData();
			regionProportionData.setRegion(_ctx.stringValue("DescribeVsDomainRegionDataResponse.Value["+ i +"].Region"));
			regionProportionData.setProportion(_ctx.stringValue("DescribeVsDomainRegionDataResponse.Value["+ i +"].Proportion"));
			regionProportionData.setRegionEname(_ctx.stringValue("DescribeVsDomainRegionDataResponse.Value["+ i +"].RegionEname"));
			regionProportionData.setAvgObjectSize(_ctx.stringValue("DescribeVsDomainRegionDataResponse.Value["+ i +"].AvgObjectSize"));
			regionProportionData.setAvgResponseTime(_ctx.stringValue("DescribeVsDomainRegionDataResponse.Value["+ i +"].AvgResponseTime"));
			regionProportionData.setBps(_ctx.stringValue("DescribeVsDomainRegionDataResponse.Value["+ i +"].Bps"));
			regionProportionData.setQps(_ctx.stringValue("DescribeVsDomainRegionDataResponse.Value["+ i +"].Qps"));
			regionProportionData.setAvgResponseRate(_ctx.stringValue("DescribeVsDomainRegionDataResponse.Value["+ i +"].AvgResponseRate"));
			regionProportionData.setReqErrRate(_ctx.stringValue("DescribeVsDomainRegionDataResponse.Value["+ i +"].ReqErrRate"));
			regionProportionData.setTotalBytes(_ctx.stringValue("DescribeVsDomainRegionDataResponse.Value["+ i +"].TotalBytes"));
			regionProportionData.setBytesProportion(_ctx.stringValue("DescribeVsDomainRegionDataResponse.Value["+ i +"].BytesProportion"));
			regionProportionData.setTotalQuery(_ctx.stringValue("DescribeVsDomainRegionDataResponse.Value["+ i +"].TotalQuery"));

			value.add(regionProportionData);
		}
		describeVsDomainRegionDataResponse.setValue(value);
	 
	 	return describeVsDomainRegionDataResponse;
	}
}