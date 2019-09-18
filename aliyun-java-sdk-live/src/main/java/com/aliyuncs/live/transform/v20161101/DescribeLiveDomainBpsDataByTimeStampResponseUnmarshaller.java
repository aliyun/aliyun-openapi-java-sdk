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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainBpsDataByTimeStampResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainBpsDataByTimeStampResponse.BpsDataModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainBpsDataByTimeStampResponseUnmarshaller {

	public static DescribeLiveDomainBpsDataByTimeStampResponse unmarshall(DescribeLiveDomainBpsDataByTimeStampResponse describeLiveDomainBpsDataByTimeStampResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainBpsDataByTimeStampResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainBpsDataByTimeStampResponse.RequestId"));
		describeLiveDomainBpsDataByTimeStampResponse.setDomainName(_ctx.stringValue("DescribeLiveDomainBpsDataByTimeStampResponse.DomainName"));
		describeLiveDomainBpsDataByTimeStampResponse.setTimeStamp(_ctx.stringValue("DescribeLiveDomainBpsDataByTimeStampResponse.TimeStamp"));

		List<BpsDataModel> bpsDataList = new ArrayList<BpsDataModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainBpsDataByTimeStampResponse.BpsDataList.Length"); i++) {
			BpsDataModel bpsDataModel = new BpsDataModel();
			bpsDataModel.setTimeStamp(_ctx.stringValue("DescribeLiveDomainBpsDataByTimeStampResponse.BpsDataList["+ i +"].TimeStamp"));
			bpsDataModel.setLocationName(_ctx.stringValue("DescribeLiveDomainBpsDataByTimeStampResponse.BpsDataList["+ i +"].LocationName"));
			bpsDataModel.setIspName(_ctx.stringValue("DescribeLiveDomainBpsDataByTimeStampResponse.BpsDataList["+ i +"].IspName"));
			bpsDataModel.setBps(_ctx.longValue("DescribeLiveDomainBpsDataByTimeStampResponse.BpsDataList["+ i +"].Bps"));

			bpsDataList.add(bpsDataModel);
		}
		describeLiveDomainBpsDataByTimeStampResponse.setBpsDataList(bpsDataList);
	 
	 	return describeLiveDomainBpsDataByTimeStampResponse;
	}
}