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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainQpsDataResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainQpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainQpsDataResponseUnmarshaller {

	public static DescribeScdnDomainQpsDataResponse unmarshall(DescribeScdnDomainQpsDataResponse describeScdnDomainQpsDataResponse, UnmarshallerContext _ctx) {
		
		describeScdnDomainQpsDataResponse.setRequestId(_ctx.stringValue("DescribeScdnDomainQpsDataResponse.RequestId"));
		describeScdnDomainQpsDataResponse.setEndTime(_ctx.stringValue("DescribeScdnDomainQpsDataResponse.EndTime"));
		describeScdnDomainQpsDataResponse.setStartTime(_ctx.stringValue("DescribeScdnDomainQpsDataResponse.StartTime"));
		describeScdnDomainQpsDataResponse.setDomainName(_ctx.stringValue("DescribeScdnDomainQpsDataResponse.DomainName"));
		describeScdnDomainQpsDataResponse.setDataInterval(_ctx.stringValue("DescribeScdnDomainQpsDataResponse.DataInterval"));

		List<DataModule> qpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDomainQpsDataResponse.QpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setHttpsAccValue(_ctx.stringValue("DescribeScdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].HttpsAccValue"));
			dataModule.setQpsValue(_ctx.stringValue("DescribeScdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].QpsValue"));
			dataModule.setAccValue(_ctx.stringValue("DescribeScdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].AccValue"));
			dataModule.setHttpQpsValue(_ctx.stringValue("DescribeScdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].HttpQpsValue"));
			dataModule.setTimeStamp(_ctx.stringValue("DescribeScdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setHttpsQpsValue(_ctx.stringValue("DescribeScdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].HttpsQpsValue"));
			dataModule.setHttpAccValue(_ctx.stringValue("DescribeScdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].HttpAccValue"));

			qpsDataPerInterval.add(dataModule);
		}
		describeScdnDomainQpsDataResponse.setQpsDataPerInterval(qpsDataPerInterval);
	 
	 	return describeScdnDomainQpsDataResponse;
	}
}