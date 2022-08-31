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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainISPDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainISPDataResponse.ISPProportionData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainISPDataResponseUnmarshaller {

	public static DescribeDomainISPDataResponse unmarshall(DescribeDomainISPDataResponse describeDomainISPDataResponse, UnmarshallerContext _ctx) {
		
		describeDomainISPDataResponse.setRequestId(_ctx.stringValue("DescribeDomainISPDataResponse.RequestId"));
		describeDomainISPDataResponse.setEndTime(_ctx.stringValue("DescribeDomainISPDataResponse.EndTime"));
		describeDomainISPDataResponse.setStartTime(_ctx.stringValue("DescribeDomainISPDataResponse.StartTime"));
		describeDomainISPDataResponse.setDomainName(_ctx.stringValue("DescribeDomainISPDataResponse.DomainName"));
		describeDomainISPDataResponse.setDataInterval(_ctx.stringValue("DescribeDomainISPDataResponse.DataInterval"));

		List<ISPProportionData> value = new ArrayList<ISPProportionData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainISPDataResponse.Value.Length"); i++) {
			ISPProportionData iSPProportionData = new ISPProportionData();
			iSPProportionData.setTotalQuery(_ctx.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].TotalQuery"));
			iSPProportionData.setByteHitRate(_ctx.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].ByteHitRate"));
			iSPProportionData.setTotalBytes(_ctx.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].TotalBytes"));
			iSPProportionData.setReqHitRate(_ctx.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].ReqHitRate"));
			iSPProportionData.setAvgResponseRate(_ctx.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].AvgResponseRate"));
			iSPProportionData.setAvgResponseTime(_ctx.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].AvgResponseTime"));
			iSPProportionData.setReqErrRate(_ctx.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].ReqErrRate"));
			iSPProportionData.setAvgObjectSize(_ctx.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].AvgObjectSize"));
			iSPProportionData.setBps(_ctx.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].Bps"));
			iSPProportionData.setQps(_ctx.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].Qps"));
			iSPProportionData.setProportion(_ctx.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].Proportion"));
			iSPProportionData.setIspEname(_ctx.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].IspEname"));
			iSPProportionData.setISP(_ctx.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].ISP"));
			iSPProportionData.setBytesProportion(_ctx.stringValue("DescribeDomainISPDataResponse.Value["+ i +"].BytesProportion"));

			value.add(iSPProportionData);
		}
		describeDomainISPDataResponse.setValue(value);
	 
	 	return describeDomainISPDataResponse;
	}
}