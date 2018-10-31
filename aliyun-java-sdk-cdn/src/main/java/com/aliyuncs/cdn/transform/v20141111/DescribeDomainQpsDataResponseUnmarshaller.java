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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainQpsDataResponseUnmarshaller {

	public static DescribeDomainQpsDataResponse unmarshall(DescribeDomainQpsDataResponse describeDomainQpsDataResponse, UnmarshallerContext context) {
		
		describeDomainQpsDataResponse.setRequestId(context.stringValue("DescribeDomainQpsDataResponse.RequestId"));
		describeDomainQpsDataResponse.setDomainName(context.stringValue("DescribeDomainQpsDataResponse.DomainName"));
		describeDomainQpsDataResponse.setDataInterval(context.stringValue("DescribeDomainQpsDataResponse.DataInterval"));
		describeDomainQpsDataResponse.setStartTime(context.stringValue("DescribeDomainQpsDataResponse.StartTime"));
		describeDomainQpsDataResponse.setEndTime(context.stringValue("DescribeDomainQpsDataResponse.EndTime"));

		List<DataModule> qpsDataInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeDomainQpsDataResponse.QpsDataInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].Value"));
			dataModule.setDomesticValue(context.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].DomesticValue"));
			dataModule.setOverseasValue(context.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].OverseasValue"));
			dataModule.setAccValue(context.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].AccValue"));
			dataModule.setAccDomesticValue(context.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].AccDomesticValue"));
			dataModule.setAccOverseasValue(context.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].AccOverseasValue"));
			dataModule.setDynamicValue(context.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].DynamicValue"));
			dataModule.setDynamicDomesticValue(context.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].DynamicDomesticValue"));
			dataModule.setDynamicOverseasValue(context.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].DynamicOverseasValue"));
			dataModule.setStaticValue(context.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].StaticValue"));
			dataModule.setStaticDomesticValue(context.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].StaticDomesticValue"));
			dataModule.setStaticOverseasValue(context.stringValue("DescribeDomainQpsDataResponse.QpsDataInterval["+ i +"].StaticOverseasValue"));

			qpsDataInterval.add(dataModule);
		}
		describeDomainQpsDataResponse.setQpsDataInterval(qpsDataInterval);
	 
	 	return describeDomainQpsDataResponse;
	}
}