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

	public static DescribeDcdnDomainHttpCodeDataResponse unmarshall(DescribeDcdnDomainHttpCodeDataResponse describeDcdnDomainHttpCodeDataResponse, UnmarshallerContext context) {
		
		describeDcdnDomainHttpCodeDataResponse.setRequestId(context.stringValue("DescribeDcdnDomainHttpCodeDataResponse.RequestId"));
		describeDcdnDomainHttpCodeDataResponse.setDomainName(context.stringValue("DescribeDcdnDomainHttpCodeDataResponse.DomainName"));
		describeDcdnDomainHttpCodeDataResponse.setStartTime(context.stringValue("DescribeDcdnDomainHttpCodeDataResponse.StartTime"));
		describeDcdnDomainHttpCodeDataResponse.setEndTime(context.stringValue("DescribeDcdnDomainHttpCodeDataResponse.EndTime"));
		describeDcdnDomainHttpCodeDataResponse.setDataInterval(context.stringValue("DescribeDcdnDomainHttpCodeDataResponse.DataInterval"));

		List<DataModule> dataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnDomainHttpCodeDataResponse.DataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeDcdnDomainHttpCodeDataResponse.DataPerInterval["+ i +"].TimeStamp"));

			List<HttpCodeDataModule> httpCodeDataPerInterval = new ArrayList<HttpCodeDataModule>();
			for (int j = 0; j < context.lengthValue("DescribeDcdnDomainHttpCodeDataResponse.DataPerInterval["+ i +"].HttpCodeDataPerInterval.Length"); j++) {
				HttpCodeDataModule httpCodeDataModule = new HttpCodeDataModule();
				httpCodeDataModule.setCode(context.integerValue("DescribeDcdnDomainHttpCodeDataResponse.DataPerInterval["+ i +"].HttpCodeDataPerInterval["+ j +"].Code"));
				httpCodeDataModule.setProportion(context.floatValue("DescribeDcdnDomainHttpCodeDataResponse.DataPerInterval["+ i +"].HttpCodeDataPerInterval["+ j +"].Proportion"));
				httpCodeDataModule.setCount(context.floatValue("DescribeDcdnDomainHttpCodeDataResponse.DataPerInterval["+ i +"].HttpCodeDataPerInterval["+ j +"].Count"));

				httpCodeDataPerInterval.add(httpCodeDataModule);
			}
			dataModule.setHttpCodeDataPerInterval(httpCodeDataPerInterval);

			dataPerInterval.add(dataModule);
		}
		describeDcdnDomainHttpCodeDataResponse.setDataPerInterval(dataPerInterval);
	 
	 	return describeDcdnDomainHttpCodeDataResponse;
	}
}