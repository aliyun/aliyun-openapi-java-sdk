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

import com.aliyuncs.scdn.model.v20171115.TestAmpDescribeScdnDomainIspDataResponse;
import com.aliyuncs.scdn.model.v20171115.TestAmpDescribeScdnDomainIspDataResponse.ISPProportionData;
import com.aliyuncs.transform.UnmarshallerContext;


public class TestAmpDescribeScdnDomainIspDataResponseUnmarshaller {

	public static TestAmpDescribeScdnDomainIspDataResponse unmarshall(TestAmpDescribeScdnDomainIspDataResponse testAmpDescribeScdnDomainIspDataResponse, UnmarshallerContext _ctx) {
		
		testAmpDescribeScdnDomainIspDataResponse.setRequestId(_ctx.stringValue("TestAmpDescribeScdnDomainIspDataResponse.RequestId"));
		testAmpDescribeScdnDomainIspDataResponse.setEndTime(_ctx.stringValue("TestAmpDescribeScdnDomainIspDataResponse.EndTime"));
		testAmpDescribeScdnDomainIspDataResponse.setStartTime(_ctx.stringValue("TestAmpDescribeScdnDomainIspDataResponse.StartTime"));
		testAmpDescribeScdnDomainIspDataResponse.setDomainName(_ctx.stringValue("TestAmpDescribeScdnDomainIspDataResponse.DomainName"));
		testAmpDescribeScdnDomainIspDataResponse.setDataInterval(_ctx.stringValue("TestAmpDescribeScdnDomainIspDataResponse.DataInterval"));

		List<ISPProportionData> value = new ArrayList<ISPProportionData>();
		for (int i = 0; i < _ctx.lengthValue("TestAmpDescribeScdnDomainIspDataResponse.Value.Length"); i++) {
			ISPProportionData iSPProportionData = new ISPProportionData();
			iSPProportionData.setTotalQuery(_ctx.stringValue("TestAmpDescribeScdnDomainIspDataResponse.Value["+ i +"].TotalQuery"));
			iSPProportionData.setTotalBytes(_ctx.stringValue("TestAmpDescribeScdnDomainIspDataResponse.Value["+ i +"].TotalBytes"));
			iSPProportionData.setAvgResponseRate(_ctx.stringValue("TestAmpDescribeScdnDomainIspDataResponse.Value["+ i +"].AvgResponseRate"));
			iSPProportionData.setAvgResponseTime(_ctx.stringValue("TestAmpDescribeScdnDomainIspDataResponse.Value["+ i +"].AvgResponseTime"));
			iSPProportionData.setReqErrRate(_ctx.stringValue("TestAmpDescribeScdnDomainIspDataResponse.Value["+ i +"].ReqErrRate"));
			iSPProportionData.setAvgObjectSize(_ctx.stringValue("TestAmpDescribeScdnDomainIspDataResponse.Value["+ i +"].AvgObjectSize"));
			iSPProportionData.setBps(_ctx.stringValue("TestAmpDescribeScdnDomainIspDataResponse.Value["+ i +"].Bps"));
			iSPProportionData.setQps(_ctx.stringValue("TestAmpDescribeScdnDomainIspDataResponse.Value["+ i +"].Qps"));
			iSPProportionData.setProportion(_ctx.stringValue("TestAmpDescribeScdnDomainIspDataResponse.Value["+ i +"].Proportion"));
			iSPProportionData.setIspEname(_ctx.stringValue("TestAmpDescribeScdnDomainIspDataResponse.Value["+ i +"].IspEname"));
			iSPProportionData.setISP(_ctx.stringValue("TestAmpDescribeScdnDomainIspDataResponse.Value["+ i +"].ISP"));
			iSPProportionData.setBytesProportion(_ctx.stringValue("TestAmpDescribeScdnDomainIspDataResponse.Value["+ i +"].BytesProportion"));

			value.add(iSPProportionData);
		}
		testAmpDescribeScdnDomainIspDataResponse.setValue(value);
	 
	 	return testAmpDescribeScdnDomainIspDataResponse;
	}
}