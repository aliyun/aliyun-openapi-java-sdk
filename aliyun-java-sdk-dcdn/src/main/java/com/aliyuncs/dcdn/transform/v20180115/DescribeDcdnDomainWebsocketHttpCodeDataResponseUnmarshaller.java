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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainWebsocketHttpCodeDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainWebsocketHttpCodeDataResponse.DataModule;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainWebsocketHttpCodeDataResponse.DataModule.HttpCodeDataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainWebsocketHttpCodeDataResponseUnmarshaller {

	public static DescribeDcdnDomainWebsocketHttpCodeDataResponse unmarshall(DescribeDcdnDomainWebsocketHttpCodeDataResponse describeDcdnDomainWebsocketHttpCodeDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainWebsocketHttpCodeDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainWebsocketHttpCodeDataResponse.RequestId"));
		describeDcdnDomainWebsocketHttpCodeDataResponse.setDomainName(_ctx.stringValue("DescribeDcdnDomainWebsocketHttpCodeDataResponse.DomainName"));
		describeDcdnDomainWebsocketHttpCodeDataResponse.setStartTime(_ctx.stringValue("DescribeDcdnDomainWebsocketHttpCodeDataResponse.StartTime"));
		describeDcdnDomainWebsocketHttpCodeDataResponse.setEndTime(_ctx.stringValue("DescribeDcdnDomainWebsocketHttpCodeDataResponse.EndTime"));
		describeDcdnDomainWebsocketHttpCodeDataResponse.setDataInterval(_ctx.stringValue("DescribeDcdnDomainWebsocketHttpCodeDataResponse.DataInterval"));

		List<DataModule> dataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainWebsocketHttpCodeDataResponse.DataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDcdnDomainWebsocketHttpCodeDataResponse.DataPerInterval["+ i +"].TimeStamp"));

			List<HttpCodeDataModule> websocketHttpCodeDataPerInterval = new ArrayList<HttpCodeDataModule>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDcdnDomainWebsocketHttpCodeDataResponse.DataPerInterval["+ i +"].WebsocketHttpCodeDataPerInterval.Length"); j++) {
				HttpCodeDataModule httpCodeDataModule = new HttpCodeDataModule();
				httpCodeDataModule.setCode(_ctx.integerValue("DescribeDcdnDomainWebsocketHttpCodeDataResponse.DataPerInterval["+ i +"].WebsocketHttpCodeDataPerInterval["+ j +"].Code"));
				httpCodeDataModule.setProportion(_ctx.floatValue("DescribeDcdnDomainWebsocketHttpCodeDataResponse.DataPerInterval["+ i +"].WebsocketHttpCodeDataPerInterval["+ j +"].Proportion"));
				httpCodeDataModule.setCount(_ctx.floatValue("DescribeDcdnDomainWebsocketHttpCodeDataResponse.DataPerInterval["+ i +"].WebsocketHttpCodeDataPerInterval["+ j +"].Count"));

				websocketHttpCodeDataPerInterval.add(httpCodeDataModule);
			}
			dataModule.setWebsocketHttpCodeDataPerInterval(websocketHttpCodeDataPerInterval);

			dataPerInterval.add(dataModule);
		}
		describeDcdnDomainWebsocketHttpCodeDataResponse.setDataPerInterval(dataPerInterval);
	 
	 	return describeDcdnDomainWebsocketHttpCodeDataResponse;
	}
}