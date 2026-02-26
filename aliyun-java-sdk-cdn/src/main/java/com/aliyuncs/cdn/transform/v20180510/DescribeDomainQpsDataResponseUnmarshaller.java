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

import com.aliyuncs.cdn.model.v20180510.DescribeDomainQpsDataResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainQpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainQpsDataResponseUnmarshaller {

	public static DescribeDomainQpsDataResponse unmarshall(DescribeDomainQpsDataResponse describeDomainQpsDataResponse, UnmarshallerContext _ctx) {
		
		describeDomainQpsDataResponse.setRequestId(_ctx.stringValue("DescribeDomainQpsDataResponse.RequestId"));
		describeDomainQpsDataResponse.setEndTime(_ctx.stringValue("DescribeDomainQpsDataResponse.EndTime"));
		describeDomainQpsDataResponse.setStartTime(_ctx.stringValue("DescribeDomainQpsDataResponse.StartTime"));
		describeDomainQpsDataResponse.setDomainName(_ctx.stringValue("DescribeDomainQpsDataResponse.DomainName"));
		describeDomainQpsDataResponse.setDataInterval(_ctx.stringValue("DescribeDomainQpsDataResponse.DataInterval"));

		List<DataModule> qpsDataInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainQpsDataResponse.QpsDataInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setAccValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].AccValue"));
			dataModule.setAccDomesticValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].AccDomesticValue"));
			dataModule.setAccOverseasValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].AccOverseasValue"));
			dataModule.setHttpsValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].HttpsValue"));
			dataModule.setHttpsOverseasValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].HttpsOverseasValue"));
			dataModule.setDomesticValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].DomesticValue"));
			dataModule.setHttpsAccOverseasValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].HttpsAccOverseasValue"));
			dataModule.setHttpsDomesticValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].HttpsDomesticValue"));
			dataModule.setHttpsAccValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].HttpsAccValue"));
			dataModule.setValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].Value"));
			dataModule.setOverseasValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].OverseasValue"));
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].TimeStamp"));
			dataModule.setHttpsAccDomesticValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].HttpsAccDomesticValue"));

			qpsDataInterval.add(dataModule);
		}
		describeDomainQpsDataResponse.setQpsDataInterval(qpsDataInterval);
	 
	 	return describeDomainQpsDataResponse;
	}
}