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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainQpsDataResponseUnmarshaller {

	public static DescribeDcdnDomainQpsDataResponse unmarshall(DescribeDcdnDomainQpsDataResponse describeDcdnDomainQpsDataResponse, UnmarshallerContext context) {
		
		describeDcdnDomainQpsDataResponse.setRequestId(context.stringValue("DescribeDcdnDomainQpsDataResponse.RequestId"));
		describeDcdnDomainQpsDataResponse.setDomainName(context.stringValue("DescribeDcdnDomainQpsDataResponse.DomainName"));
		describeDcdnDomainQpsDataResponse.setStartTime(context.stringValue("DescribeDcdnDomainQpsDataResponse.StartTime"));
		describeDcdnDomainQpsDataResponse.setEndTime(context.stringValue("DescribeDcdnDomainQpsDataResponse.EndTime"));
		describeDcdnDomainQpsDataResponse.setDataInterval(context.stringValue("DescribeDcdnDomainQpsDataResponse.DataInterval"));

		List<DataModule> qpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setQps(context.floatValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].Qps"));
			dataModule.setDynamicHttpQps(context.floatValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].DynamicHttpQps"));
			dataModule.setDynamicHttpsQps(context.floatValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].DynamicHttpsQps"));
			dataModule.setStaticHttpQps(context.floatValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].StaticHttpQps"));
			dataModule.setStaticHttpsQps(context.floatValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].StaticHttpsQps"));
			dataModule.setAcc(context.floatValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].Acc"));
			dataModule.setDynamicHttpAcc(context.floatValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].DynamicHttpAcc"));
			dataModule.setDynamicHttpsAcc(context.floatValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].DynamicHttpsAcc"));
			dataModule.setStaticHttpAcc(context.floatValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].StaticHttpAcc"));
			dataModule.setStaticHttpsAcc(context.floatValue("DescribeDcdnDomainQpsDataResponse.QpsDataPerInterval["+ i +"].StaticHttpsAcc"));

			qpsDataPerInterval.add(dataModule);
		}
		describeDcdnDomainQpsDataResponse.setQpsDataPerInterval(qpsDataPerInterval);
	 
	 	return describeDcdnDomainQpsDataResponse;
	}
}