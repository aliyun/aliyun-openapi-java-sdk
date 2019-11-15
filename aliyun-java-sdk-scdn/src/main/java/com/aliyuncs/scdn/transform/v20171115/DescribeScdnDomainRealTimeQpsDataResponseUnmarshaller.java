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

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainRealTimeQpsDataResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainRealTimeQpsDataResponse.QpsModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainRealTimeQpsDataResponseUnmarshaller {

	public static DescribeScdnDomainRealTimeQpsDataResponse unmarshall(DescribeScdnDomainRealTimeQpsDataResponse describeScdnDomainRealTimeQpsDataResponse, UnmarshallerContext _ctx) {
		
		describeScdnDomainRealTimeQpsDataResponse.setRequestId(_ctx.stringValue("DescribeScdnDomainRealTimeQpsDataResponse.RequestId"));

		List<QpsModel> data = new ArrayList<QpsModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnDomainRealTimeQpsDataResponse.Data.Length"); i++) {
			QpsModel qpsModel = new QpsModel();
			qpsModel.setQps(_ctx.floatValue("DescribeScdnDomainRealTimeQpsDataResponse.Data["+ i +"].Qps"));
			qpsModel.setTimeStamp(_ctx.stringValue("DescribeScdnDomainRealTimeQpsDataResponse.Data["+ i +"].TimeStamp"));

			data.add(qpsModel);
		}
		describeScdnDomainRealTimeQpsDataResponse.setData(data);
	 
	 	return describeScdnDomainRealTimeQpsDataResponse;
	}
}