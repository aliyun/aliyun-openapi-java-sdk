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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainQpsDataByLayerResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainQpsDataByLayerResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainQpsDataByLayerResponseUnmarshaller {

	public static DescribeDcdnDomainQpsDataByLayerResponse unmarshall(DescribeDcdnDomainQpsDataByLayerResponse describeDcdnDomainQpsDataByLayerResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainQpsDataByLayerResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainQpsDataByLayerResponse.RequestId"));
		describeDcdnDomainQpsDataByLayerResponse.setEndTime(_ctx.stringValue("DescribeDcdnDomainQpsDataByLayerResponse.EndTime"));
		describeDcdnDomainQpsDataByLayerResponse.setStartTime(_ctx.stringValue("DescribeDcdnDomainQpsDataByLayerResponse.StartTime"));
		describeDcdnDomainQpsDataByLayerResponse.setLayer(_ctx.stringValue("DescribeDcdnDomainQpsDataByLayerResponse.Layer"));
		describeDcdnDomainQpsDataByLayerResponse.setDomainName(_ctx.stringValue("DescribeDcdnDomainQpsDataByLayerResponse.DomainName"));
		describeDcdnDomainQpsDataByLayerResponse.setDataInterval(_ctx.stringValue("DescribeDcdnDomainQpsDataByLayerResponse.DataInterval"));

		List<DataModule> qpsDataInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainQpsDataByLayerResponse.QpsDataInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setValue(_ctx.stringValue("DescribeDcdnDomainQpsDataByLayerResponse.QpsDataInterval["+ i +"].Value"));
			dataModule.setAccValue(_ctx.stringValue("DescribeDcdnDomainQpsDataByLayerResponse.QpsDataInterval["+ i +"].AccValue"));
			dataModule.setAccDomesticValue(_ctx.stringValue("DescribeDcdnDomainQpsDataByLayerResponse.QpsDataInterval["+ i +"].AccDomesticValue"));
			dataModule.setOverseasValue(_ctx.stringValue("DescribeDcdnDomainQpsDataByLayerResponse.QpsDataInterval["+ i +"].OverseasValue"));
			dataModule.setAccOverseasValue(_ctx.stringValue("DescribeDcdnDomainQpsDataByLayerResponse.QpsDataInterval["+ i +"].AccOverseasValue"));
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDcdnDomainQpsDataByLayerResponse.QpsDataInterval["+ i +"].TimeStamp"));
			dataModule.setDomesticValue(_ctx.stringValue("DescribeDcdnDomainQpsDataByLayerResponse.QpsDataInterval["+ i +"].DomesticValue"));

			qpsDataInterval.add(dataModule);
		}
		describeDcdnDomainQpsDataByLayerResponse.setQpsDataInterval(qpsDataInterval);
	 
	 	return describeDcdnDomainQpsDataByLayerResponse;
	}
}