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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainHttpCodeDataByLayerResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainHttpCodeDataByLayerResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainHttpCodeDataByLayerResponseUnmarshaller {

	public static DescribeDcdnDomainHttpCodeDataByLayerResponse unmarshall(DescribeDcdnDomainHttpCodeDataByLayerResponse describeDcdnDomainHttpCodeDataByLayerResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainHttpCodeDataByLayerResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainHttpCodeDataByLayerResponse.RequestId"));
		describeDcdnDomainHttpCodeDataByLayerResponse.setDataInterval(_ctx.stringValue("DescribeDcdnDomainHttpCodeDataByLayerResponse.DataInterval"));

		List<DataModule> httpCodeDataInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainHttpCodeDataByLayerResponse.HttpCodeDataInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setValue(_ctx.stringValue("DescribeDcdnDomainHttpCodeDataByLayerResponse.HttpCodeDataInterval["+ i +"].Value"));
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDcdnDomainHttpCodeDataByLayerResponse.HttpCodeDataInterval["+ i +"].TimeStamp"));
			dataModule.setTotalValue(_ctx.stringValue("DescribeDcdnDomainHttpCodeDataByLayerResponse.HttpCodeDataInterval["+ i +"].TotalValue"));

			httpCodeDataInterval.add(dataModule);
		}
		describeDcdnDomainHttpCodeDataByLayerResponse.setHttpCodeDataInterval(httpCodeDataInterval);
	 
	 	return describeDcdnDomainHttpCodeDataByLayerResponse;
	}
}