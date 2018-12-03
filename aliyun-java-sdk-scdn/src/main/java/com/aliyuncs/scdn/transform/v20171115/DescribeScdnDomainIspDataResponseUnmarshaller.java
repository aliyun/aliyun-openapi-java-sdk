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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainIspDataResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainIspDataResponse.ISPProportionData;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainIspDataResponseUnmarshaller {

	public static DescribeScdnDomainIspDataResponse unmarshall(DescribeScdnDomainIspDataResponse describeScdnDomainIspDataResponse, UnmarshallerContext context) {
		
		describeScdnDomainIspDataResponse.setRequestId(context.stringValue("DescribeScdnDomainIspDataResponse.RequestId"));
		describeScdnDomainIspDataResponse.setDomainName(context.stringValue("DescribeScdnDomainIspDataResponse.DomainName"));
		describeScdnDomainIspDataResponse.setDataInterval(context.stringValue("DescribeScdnDomainIspDataResponse.DataInterval"));
		describeScdnDomainIspDataResponse.setStartTime(context.stringValue("DescribeScdnDomainIspDataResponse.StartTime"));
		describeScdnDomainIspDataResponse.setEndTime(context.stringValue("DescribeScdnDomainIspDataResponse.EndTime"));

		List<ISPProportionData> value = new ArrayList<ISPProportionData>();
		for (int i = 0; i < context.lengthValue("DescribeScdnDomainIspDataResponse.Value.Length"); i++) {
			ISPProportionData iSPProportionData = new ISPProportionData();
			iSPProportionData.setISP(context.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].ISP"));
			iSPProportionData.setProportion(context.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].Proportion"));
			iSPProportionData.setIspEname(context.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].IspEname"));
			iSPProportionData.setAvgObjectSize(context.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].AvgObjectSize"));
			iSPProportionData.setAvgResponseTime(context.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].AvgResponseTime"));
			iSPProportionData.setBps(context.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].Bps"));
			iSPProportionData.setQps(context.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].Qps"));
			iSPProportionData.setAvgResponseRate(context.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].AvgResponseRate"));
			iSPProportionData.setReqErrRate(context.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].ReqErrRate"));
			iSPProportionData.setTotalBytes(context.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].TotalBytes"));
			iSPProportionData.setBytesProportion(context.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].BytesProportion"));
			iSPProportionData.setTotalQuery(context.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].TotalQuery"));

			value.add(iSPProportionData);
		}
		describeScdnDomainIspDataResponse.setValue(value);
	 
	 	return describeScdnDomainIspDataResponse;
	}
}