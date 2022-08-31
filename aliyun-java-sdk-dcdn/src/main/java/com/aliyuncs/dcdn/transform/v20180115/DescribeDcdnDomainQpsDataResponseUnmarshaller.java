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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainQpsDataResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainQpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainQpsDataResponseUnmarshaller {

	public static DescribeDcdnDomainQpsDataResponse unmarshall(DescribeDcdnDomainQpsDataResponse describeDcdnDomainQpsDataResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainQpsDataResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainQpsDataResponse.RequestId"));
		describeDcdnDomainQpsDataResponse.setEndTime(_ctx.stringValue("DescribeDcdnDomainQpsDataResponse.EndTime"));
		describeDcdnDomainQpsDataResponse.setStartTime(_ctx.stringValue("DescribeDcdnDomainQpsDataResponse.StartTime"));
		describeDcdnDomainQpsDataResponse.setDomainName(_ctx.stringValue("DescribeDcdnDomainQpsDataResponse.DomainName"));
		describeDcdnDomainQpsDataResponse.setDataInterval(_ctx.stringValue("DescribeDcdnDomainQpsDataResponse.DataInterval"));

		List<DataModule> qpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setDynamicHttpsAcc(_ctx.floatValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].DynamicHttpsAcc"));
			dataModule.setDynamicHttpAcc(_ctx.floatValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].DynamicHttpAcc"));
			dataModule.setQps(_ctx.floatValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].Qps"));
			dataModule.setStaticHttpsAcc(_ctx.floatValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].StaticHttpsAcc"));
			dataModule.setStaticHttpQps(_ctx.floatValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].StaticHttpQps"));
			dataModule.setStaticHttpAcc(_ctx.floatValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].StaticHttpAcc"));
			dataModule.setDynamicHttpsQps(_ctx.floatValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].DynamicHttpsQps"));
			dataModule.setAcc(_ctx.floatValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].Acc"));
			dataModule.setStaticHttpsQps(_ctx.floatValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].StaticHttpsQps"));
			dataModule.setDynamicHttpQps(_ctx.floatValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].DynamicHttpQps"));
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].TimeStamp"));

			qpsDataPerInterval.add(dataModule);
		}
		describeDcdnDomainQpsDataResponse.setQpsDataPerInterval(qpsDataPerInterval);
	 
	 	return describeDcdnDomainQpsDataResponse;
	}
}