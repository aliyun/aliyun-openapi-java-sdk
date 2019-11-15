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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainHttpCodeDataResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainHttpCodeDataResponse.DataModule;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainHttpCodeDataResponse.DataModule.HttpCodeDataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainHttpCodeDataResponseUnmarshaller {

	public static DescribeScdnDomainHttpCodeDataResponse unmarshall(DescribeScdnDomainHttpCodeDataResponse describeScdnDomainHttpCodeDataResponse, UnmarshallerContext _ctx) {
		
		describeScdnDomainHttpCodeDataResponse.setRequestId(_ctx.stringValue("DescribeScdnDomainHttpCodeDataResponse.RequestId"));
		describeScdnDomainHttpCodeDataResponse.setDomainName(_ctx.stringValue("DescribeScdnDomainHttpCodeDataResponse.DomainName"));
		describeScdnDomainHttpCodeDataResponse.setStartTime(_ctx.stringValue("DescribeScdnDomainHttpCodeDataResponse.StartTime"));
		describeScdnDomainHttpCodeDataResponse.setEndTime(_ctx.stringValue("DescribeScdnDomainHttpCodeDataResponse.EndTime"));
		describeScdnDomainHttpCodeDataResponse.setDataInterval(_ctx.stringValue("DescribeScdnDomainHttpCodeDataResponse.DataInterval"));

		List<DataModule> dataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDomainHttpCodeDataResponse.DataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeScdnDomainHttpCodeDataResponse.DataPerInterval["+ i +"].TimeStamp"));

			List<HttpCodeDataModule> httpCodeDataPerInterval = new ArrayList<HttpCodeDataModule>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScdnDomainHttpCodeDataResponse.DataPerInterval["+ i +"].HttpCodeDataPerInterval.Length"); j++) {
				HttpCodeDataModule httpCodeDataModule = new HttpCodeDataModule();
				httpCodeDataModule.setCode(_ctx.stringValue("DescribeScdnDomainHttpCodeDataResponse.DataPerInterval["+ i +"].HttpCodeDataPerInterval["+ j +"].Code"));
				httpCodeDataModule.setProportion(_ctx.stringValue("DescribeScdnDomainHttpCodeDataResponse.DataPerInterval["+ i +"].HttpCodeDataPerInterval["+ j +"].Proportion"));
				httpCodeDataModule.setCount(_ctx.stringValue("DescribeScdnDomainHttpCodeDataResponse.DataPerInterval["+ i +"].HttpCodeDataPerInterval["+ j +"].Count"));

				httpCodeDataPerInterval.add(httpCodeDataModule);
			}
			dataModule.setHttpCodeDataPerInterval(httpCodeDataPerInterval);

			dataPerInterval.add(dataModule);
		}
		describeScdnDomainHttpCodeDataResponse.setDataPerInterval(dataPerInterval);
	 
	 	return describeScdnDomainHttpCodeDataResponse;
	}
}