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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainIspDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainIspDataResponse.IspProportionData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainIspDataResponseUnmarshaller {

	public static DescribeDcdnDomainIspDataResponse unmarshall(DescribeDcdnDomainIspDataResponse describeDcdnDomainIspDataResponse, UnmarshallerContext context) {
		
		describeDcdnDomainIspDataResponse.setRequestId(context.stringValue("DescribeDcdnDomainIspDataResponse.RequestId"));
		describeDcdnDomainIspDataResponse.setDomainName(context.stringValue("DescribeDcdnDomainIspDataResponse.DomainName"));
		describeDcdnDomainIspDataResponse.setDataInterval(context.stringValue("DescribeDcdnDomainIspDataResponse.DataInterval"));
		describeDcdnDomainIspDataResponse.setStartTime(context.stringValue("DescribeDcdnDomainIspDataResponse.StartTime"));
		describeDcdnDomainIspDataResponse.setEndTime(context.stringValue("DescribeDcdnDomainIspDataResponse.EndTime"));

		List<IspProportionData> value = new ArrayList<IspProportionData>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnDomainIspDataResponse.Value.Length"); i++) {
			IspProportionData ispProportionData = new IspProportionData();
			ispProportionData.setIsp(context.stringValue("DescribeDcdnDomainIspDataResponse.Value["+ i +"].Isp"));
			ispProportionData.setProportion(context.stringValue("DescribeDcdnDomainIspDataResponse.Value["+ i +"].Proportion"));
			ispProportionData.setIspEname(context.stringValue("DescribeDcdnDomainIspDataResponse.Value["+ i +"].IspEname"));
			ispProportionData.setAvgObjectSize(context.stringValue("DescribeDcdnDomainIspDataResponse.Value["+ i +"].AvgObjectSize"));
			ispProportionData.setAvgResponseTime(context.stringValue("DescribeDcdnDomainIspDataResponse.Value["+ i +"].AvgResponseTime"));
			ispProportionData.setBps(context.stringValue("DescribeDcdnDomainIspDataResponse.Value["+ i +"].Bps"));
			ispProportionData.setQps(context.stringValue("DescribeDcdnDomainIspDataResponse.Value["+ i +"].Qps"));
			ispProportionData.setAvgResponseRate(context.stringValue("DescribeDcdnDomainIspDataResponse.Value["+ i +"].AvgResponseRate"));
			ispProportionData.setTotalBytes(context.stringValue("DescribeDcdnDomainIspDataResponse.Value["+ i +"].TotalBytes"));
			ispProportionData.setBytesProportion(context.stringValue("DescribeDcdnDomainIspDataResponse.Value["+ i +"].BytesProportion"));
			ispProportionData.setTotalQuery(context.stringValue("DescribeDcdnDomainIspDataResponse.Value["+ i +"].TotalQuery"));

			value.add(ispProportionData);
		}
		describeDcdnDomainIspDataResponse.setValue(value);
	 
	 	return describeDcdnDomainIspDataResponse;
	}
}