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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainIspDataResponseUnmarshaller {

	public static DescribeScdnDomainIspDataResponse unmarshall(DescribeScdnDomainIspDataResponse describeScdnDomainIspDataResponse, UnmarshallerContext _ctx) {
		
		describeScdnDomainIspDataResponse.setRequestId(_ctx.stringValue("DescribeScdnDomainIspDataResponse.RequestId"));
		describeScdnDomainIspDataResponse.setDomainName(_ctx.stringValue("DescribeScdnDomainIspDataResponse.DomainName"));
		describeScdnDomainIspDataResponse.setDataInterval(_ctx.stringValue("DescribeScdnDomainIspDataResponse.DataInterval"));
		describeScdnDomainIspDataResponse.setStartTime(_ctx.stringValue("DescribeScdnDomainIspDataResponse.StartTime"));
		describeScdnDomainIspDataResponse.setEndTime(_ctx.stringValue("DescribeScdnDomainIspDataResponse.EndTime"));

		List<ISPProportionData> value = new ArrayList<ISPProportionData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDomainIspDataResponse.Value.Length"); i++) {
			ISPProportionData iSPProportionData = new ISPProportionData();
			iSPProportionData.setISP(_ctx.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].ISP"));
			iSPProportionData.setProportion(_ctx.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].Proportion"));
			iSPProportionData.setIspEname(_ctx.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].IspEname"));
			iSPProportionData.setAvgObjectSize(_ctx.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].AvgObjectSize"));
			iSPProportionData.setAvgResponseTime(_ctx.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].AvgResponseTime"));
			iSPProportionData.setBps(_ctx.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].Bps"));
			iSPProportionData.setQps(_ctx.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].Qps"));
			iSPProportionData.setAvgResponseRate(_ctx.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].AvgResponseRate"));
			iSPProportionData.setReqErrRate(_ctx.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].ReqErrRate"));
			iSPProportionData.setTotalBytes(_ctx.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].TotalBytes"));
			iSPProportionData.setBytesProportion(_ctx.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].BytesProportion"));
			iSPProportionData.setTotalQuery(_ctx.stringValue("DescribeScdnDomainIspDataResponse.Value["+ i +"].TotalQuery"));

			value.add(iSPProportionData);
		}
		describeScdnDomainIspDataResponse.setValue(value);
	 
	 	return describeScdnDomainIspDataResponse;
	}
}