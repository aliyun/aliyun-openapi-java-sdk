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
		describeDcdnDomainWebsocketHttpCodeDataResponse.setEndTime(_ctx.stringValue("DescribeDcdnDomainWebsocketHttpCodeDataResponse.EndTime"));
		describeDcdnDomainWebsocketHttpCodeDataResponse.setStartTime(_ctx.stringValue("DescribeDcdnDomainWebsocketHttpCodeDataResponse.StartTime"));
		describeDcdnDomainWebsocketHttpCodeDataResponse.setDomainName(_ctx.stringValue("DescribeDcdnDomainWebsocketHttpCodeDataResponse.DomainName"));
		describeDcdnDomainWebsocketHttpCodeDataResponse.setDataInterval(_ctx.stringValue("DescribeDcdnDomainWebsocketHttpCodeDataResponse.DataInterval"));

		List<DataModule> httpCodeDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainWebsocketHttpCodeDataResponse.HttpCodeDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDcdnDomainWebsocketHttpCodeDataResponse.HttpCodeDataPerInterval["+ i +"].TimeStamp"));

			List<HttpCodeDataModule> websocketHttpCode = new ArrayList<HttpCodeDataModule>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDcdnDomainWebsocketHttpCodeDataResponse.HttpCodeDataPerInterval["+ i +"].WebsocketHttpCode.Length"); j++) {
				HttpCodeDataModule httpCodeDataModule = new HttpCodeDataModule();
				httpCodeDataModule.setCode(_ctx.integerValue("DescribeDcdnDomainWebsocketHttpCodeDataResponse.HttpCodeDataPerInterval["+ i +"].WebsocketHttpCode["+ j +"].Code"));
				httpCodeDataModule.setProportion(_ctx.floatValue("DescribeDcdnDomainWebsocketHttpCodeDataResponse.HttpCodeDataPerInterval["+ i +"].WebsocketHttpCode["+ j +"].Proportion"));
				httpCodeDataModule.setCount(_ctx.floatValue("DescribeDcdnDomainWebsocketHttpCodeDataResponse.HttpCodeDataPerInterval["+ i +"].WebsocketHttpCode["+ j +"].Count"));

				websocketHttpCode.add(httpCodeDataModule);
			}
			dataModule.setWebsocketHttpCode(websocketHttpCode);

			httpCodeDataPerInterval.add(dataModule);
		}
		describeDcdnDomainWebsocketHttpCodeDataResponse.setHttpCodeDataPerInterval(httpCodeDataPerInterval);
	 
	 	return describeDcdnDomainWebsocketHttpCodeDataResponse;
	}
}