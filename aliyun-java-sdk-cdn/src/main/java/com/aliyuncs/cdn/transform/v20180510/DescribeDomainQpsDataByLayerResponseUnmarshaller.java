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

import com.aliyuncs.cdn.model.v20180510.DescribeDomainQpsDataByLayerResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainQpsDataByLayerResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainQpsDataByLayerResponseUnmarshaller {

	public static DescribeDomainQpsDataByLayerResponse unmarshall(DescribeDomainQpsDataByLayerResponse describeDomainQpsDataByLayerResponse, UnmarshallerContext _ctx) {
		
		describeDomainQpsDataByLayerResponse.setRequestId(_ctx.stringValue("DescribeDomainQpsDataByLayerResponse.RequestId"));
		describeDomainQpsDataByLayerResponse.setDomainName(_ctx.stringValue("DescribeDomainQpsDataByLayerResponse.DomainName"));
		describeDomainQpsDataByLayerResponse.setStartTime(_ctx.stringValue("DescribeDomainQpsDataByLayerResponse.StartTime"));
		describeDomainQpsDataByLayerResponse.setEndTime(_ctx.stringValue("DescribeDomainQpsDataByLayerResponse.EndTime"));
		describeDomainQpsDataByLayerResponse.setDataInterval(_ctx.stringValue("DescribeDomainQpsDataByLayerResponse.DataInterval"));
		describeDomainQpsDataByLayerResponse.setLayer(_ctx.stringValue("DescribeDomainQpsDataByLayerResponse.Layer"));

		List<DataModule> qpsDataInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainQpsDataByLayerResponse.QpsDataInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDomainQpsDataByLayerResponse.QpsDataInterval["+ i +"].TimeStamp"));
			dataModule.setValue(_ctx.stringValue("DescribeDomainQpsDataByLayerResponse.QpsDataInterval["+ i +"].Value"));
			dataModule.setDomesticValue(_ctx.stringValue("DescribeDomainQpsDataByLayerResponse.QpsDataInterval["+ i +"].DomesticValue"));
			dataModule.setOverseasValue(_ctx.stringValue("DescribeDomainQpsDataByLayerResponse.QpsDataInterval["+ i +"].OverseasValue"));
			dataModule.setAccValue(_ctx.stringValue("DescribeDomainQpsDataByLayerResponse.QpsDataInterval["+ i +"].AccValue"));
			dataModule.setAccDomesticValue(_ctx.stringValue("DescribeDomainQpsDataByLayerResponse.QpsDataInterval["+ i +"].AccDomesticValue"));
			dataModule.setAccOverseasValue(_ctx.stringValue("DescribeDomainQpsDataByLayerResponse.QpsDataInterval["+ i +"].AccOverseasValue"));

			qpsDataInterval.add(dataModule);
		}
		describeDomainQpsDataByLayerResponse.setQpsDataInterval(qpsDataInterval);
	 
	 	return describeDomainQpsDataByLayerResponse;
	}
}