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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainBpsDataByTimeStampResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainBpsDataByTimeStampResponse.BpsDataModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainBpsDataByTimeStampResponseUnmarshaller {

	public static DescribeDomainBpsDataByTimeStampResponse unmarshall(DescribeDomainBpsDataByTimeStampResponse describeDomainBpsDataByTimeStampResponse, UnmarshallerContext _ctx) {
		
		describeDomainBpsDataByTimeStampResponse.setRequestId(_ctx.stringValue("DescribeDomainBpsDataByTimeStampResponse.RequestId"));
		describeDomainBpsDataByTimeStampResponse.setDomainName(_ctx.stringValue("DescribeDomainBpsDataByTimeStampResponse.DomainName"));
		describeDomainBpsDataByTimeStampResponse.setTimeStamp(_ctx.stringValue("DescribeDomainBpsDataByTimeStampResponse.TimeStamp"));

		List<BpsDataModel> bpsDataList = new ArrayList<BpsDataModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainBpsDataByTimeStampResponse.BpsDataList.Length"); i++) {
			BpsDataModel bpsDataModel = new BpsDataModel();
			bpsDataModel.setTimeStamp(_ctx.stringValue("DescribeDomainBpsDataByTimeStampResponse.BpsDataList["+ i +"].TimeStamp"));
			bpsDataModel.setLocationName(_ctx.stringValue("DescribeDomainBpsDataByTimeStampResponse.BpsDataList["+ i +"].LocationName"));
			bpsDataModel.setIspName(_ctx.stringValue("DescribeDomainBpsDataByTimeStampResponse.BpsDataList["+ i +"].IspName"));
			bpsDataModel.setBps(_ctx.longValue("DescribeDomainBpsDataByTimeStampResponse.BpsDataList["+ i +"].Bps"));

			bpsDataList.add(bpsDataModel);
		}
		describeDomainBpsDataByTimeStampResponse.setBpsDataList(bpsDataList);
	 
	 	return describeDomainBpsDataByTimeStampResponse;
	}
}