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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainHttpCodeDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainHttpCodeDataResponse.DataModule;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainHttpCodeDataResponse.DataModule.HttpCodeDataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainHttpCodeDataResponseUnmarshaller {

	public static DescribeDcdnDomainHttpCodeDataResponse unmarshall(DescribeDcdnDomainHttpCodeDataResponse describeDcdnDomainHttpCodeDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainHttpCodeDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainHttpCodeDataResponse.RequestId"));
		describeDcdnDomainHttpCodeDataResponse.setDomainName(_ctx.stringValue("DescribeDcdnDomainHttpCodeDataResponse.DomainName"));
		describeDcdnDomainHttpCodeDataResponse.setStartTime(_ctx.stringValue("DescribeDcdnDomainHttpCodeDataResponse.StartTime"));
		describeDcdnDomainHttpCodeDataResponse.setEndTime(_ctx.stringValue("DescribeDcdnDomainHttpCodeDataResponse.EndTime"));
		describeDcdnDomainHttpCodeDataResponse.setDataInterval(_ctx.stringValue("DescribeDcdnDomainHttpCodeDataResponse.DataInterval"));

		List<DataModule> dataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainHttpCodeDataResponse.DataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDcdnDomainHttpCodeDataResponse.DataPerInterval["+ i +"].TimeStamp"));

			List<HttpCodeDataModule> httpCodeDataPerInterval = new ArrayList<HttpCodeDataModule>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDcdnDomainHttpCodeDataResponse.DataPerInterval["+ i +"].HttpCodeDataPerInterval.Length"); j++) {
				HttpCodeDataModule httpCodeDataModule = new HttpCodeDataModule();
				httpCodeDataModule.setCode(_ctx.integerValue("DescribeDcdnDomainHttpCodeDataResponse.DataPerInterval["+ i +"].HttpCodeDataPerInterval["+ j +"].Code"));
				httpCodeDataModule.setProportion(_ctx.floatValue("DescribeDcdnDomainHttpCodeDataResponse.DataPerInterval["+ i +"].HttpCodeDataPerInterval["+ j +"].Proportion"));
				httpCodeDataModule.setCount(_ctx.floatValue("DescribeDcdnDomainHttpCodeDataResponse.DataPerInterval["+ i +"].HttpCodeDataPerInterval["+ j +"].Count"));

				httpCodeDataPerInterval.add(httpCodeDataModule);
			}
			dataModule.setHttpCodeDataPerInterval(httpCodeDataPerInterval);

			dataPerInterval.add(dataModule);
		}
		describeDcdnDomainHttpCodeDataResponse.setDataPerInterval(dataPerInterval);
	 
	 	return describeDcdnDomainHttpCodeDataResponse;
	}
}