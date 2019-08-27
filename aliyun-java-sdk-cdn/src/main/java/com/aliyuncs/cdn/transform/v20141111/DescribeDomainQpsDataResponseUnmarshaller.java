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

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeDomainQpsDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainQpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainQpsDataResponseUnmarshaller {

	public static DescribeDomainQpsDataResponse unmarshall(DescribeDomainQpsDataResponse describeDomainQpsDataResponse, UnmarshallerContext _ctx) {
		
		describeDomainQpsDataResponse.setRequestId(_ctx.stringValue("DescribeDomainQpsDataResponse.RequestId"));
		describeDomainQpsDataResponse.setDomainName(_ctx.stringValue("DescribeDomainQpsDataResponse.DomainName"));
		describeDomainQpsDataResponse.setStartTime(_ctx.stringValue("DescribeDomainQpsDataResponse.StartTime"));
		describeDomainQpsDataResponse.setEndTime(_ctx.stringValue("DescribeDomainQpsDataResponse.EndTime"));
		describeDomainQpsDataResponse.setDataInterval(_ctx.stringValue("DescribeDomainQpsDataResponse.DataInterval"));

		List<DataModule> qpsDataInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainQpsDataResponse.QpsDataInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].TimeStamp"));
			dataModule.setValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].Value"));
			dataModule.setDomesticValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].DomesticValue"));
			dataModule.setOverseasValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].OverseasValue"));
			dataModule.setAccValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].AccValue"));
			dataModule.setAccDomesticValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].AccDomesticValue"));
			dataModule.setAccOverseasValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].AccOverseasValue"));
			dataModule.setDynamicValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].DynamicValue"));
			dataModule.setDynamicDomesticValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].DynamicDomesticValue"));
			dataModule.setDynamicOverseasValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].DynamicOverseasValue"));
			dataModule.setStaticValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].StaticValue"));
			dataModule.setStaticDomesticValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].StaticDomesticValue"));
			dataModule.setStaticOverseasValue(_ctx.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].StaticOverseasValue"));

			qpsDataInterval.add(dataModule);
		}
		describeDomainQpsDataResponse.setQpsDataInterval(qpsDataInterval);
	 
	 	return describeDomainQpsDataResponse;
	}
}