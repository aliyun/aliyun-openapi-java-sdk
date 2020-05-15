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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeDomainHttpCodeDataByLayerResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainHttpCodeDataByLayerResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainHttpCodeDataByLayerResponseUnmarshaller {

	public static DescribeDomainHttpCodeDataByLayerResponse unmarshall(DescribeDomainHttpCodeDataByLayerResponse describeDomainHttpCodeDataByLayerResponse, UnmarshallerContext _ctx) {
		
		describeDomainHttpCodeDataByLayerResponse.setRequestId(_ctx.stringValue("DescribeDomainHttpCodeDataByLayerResponse.RequestId"));
		describeDomainHttpCodeDataByLayerResponse.setDataInterval(_ctx.stringValue("DescribeDomainHttpCodeDataByLayerResponse.DataInterval"));

		List<DataModule> httpCodeDataInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainHttpCodeDataByLayerResponse.HttpCodeDataInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDomainHttpCodeDataByLayerResponse.HttpCodeDataInterval["+ i +"].TimeStamp"));
			dataModule.setValue(_ctx.stringValue("DescribeDomainHttpCodeDataByLayerResponse.HttpCodeDataInterval["+ i +"].Value"));
			dataModule.setTotalValue(_ctx.stringValue("DescribeDomainHttpCodeDataByLayerResponse.HttpCodeDataInterval["+ i +"].TotalValue"));

			httpCodeDataInterval.add(dataModule);
		}
		describeDomainHttpCodeDataByLayerResponse.setHttpCodeDataInterval(httpCodeDataInterval);
	 
	 	return describeDomainHttpCodeDataByLayerResponse;
	}
}