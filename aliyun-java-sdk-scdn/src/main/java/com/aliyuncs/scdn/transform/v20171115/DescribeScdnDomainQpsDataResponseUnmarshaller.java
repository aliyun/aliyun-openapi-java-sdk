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

	public static DescribeScdnDomainQpsDataResponse unmarshall(DescribeScdnDomainQpsDataResponse describeScdnDomainQpsDataResponse, UnmarshallerContext context) {
		
		describeScdnDomainQpsDataResponse.setRequestId(context.stringValue("DescribeScdnDomainQpsDataResponse.RequestId"));
		describeScdnDomainQpsDataResponse.setDomainName(context.stringValue("DescribeScdnDomainQpsDataResponse.DomainName"));
		describeScdnDomainQpsDataResponse.setStartTime(context.stringValue("DescribeScdnDomainQpsDataResponse.StartTime"));
		describeScdnDomainQpsDataResponse.setEndTime(context.stringValue("DescribeScdnDomainQpsDataResponse.EndTime"));
		describeScdnDomainQpsDataResponse.setDataInterval(context.stringValue("DescribeScdnDomainQpsDataResponse.DataInterval"));

		List<DataModule> qpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeScdnDomainQpsDataResponse.QpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeScdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setQpsValue(context.stringValue("DescribeScdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].QpsValue"));
			dataModule.setHttpQpsValue(context.stringValue("DescribeScdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].HttpQpsValue"));
			dataModule.setHttpsQpsValue(context.stringValue("DescribeScdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].HttpsQpsValue"));
			dataModule.setAccValue(context.stringValue("DescribeScdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].AccValue"));
			dataModule.setHttpAccValue(context.stringValue("DescribeScdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].HttpAccValue"));
			dataModule.setHttpsAccValue(context.stringValue("DescribeScdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].HttpsAccValue"));

			qpsDataPerInterval.add(dataModule);
		}
		describeScdnDomainQpsDataResponse.setQpsDataPerInterval(qpsDataPerInterval);
	 
	 	return describeScdnDomainQpsDataResponse;
	}
}