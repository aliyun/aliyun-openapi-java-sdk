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

import com.aliyuncs.cdn.model.v20180510.DescribeDomainSrcQpsDataResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainSrcQpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainSrcQpsDataResponseUnmarshaller {

	public static DescribeDomainSrcQpsDataResponse unmarshall(DescribeDomainSrcQpsDataResponse describeDomainSrcQpsDataResponse, UnmarshallerContext _ctx) {
		
		describeDomainSrcQpsDataResponse.setRequestId(_ctx.stringValue("DescribeDomainSrcQpsDataResponse.RequestId"));
		describeDomainSrcQpsDataResponse.setDomainName(_ctx.stringValue("DescribeDomainSrcQpsDataResponse.DomainName"));
		describeDomainSrcQpsDataResponse.setStartTime(_ctx.stringValue("DescribeDomainSrcQpsDataResponse.StartTime"));
		describeDomainSrcQpsDataResponse.setEndTime(_ctx.stringValue("DescribeDomainSrcQpsDataResponse.EndTime"));
		describeDomainSrcQpsDataResponse.setDataInterval(_ctx.stringValue("DescribeDomainSrcQpsDataResponse.DataInterval"));

		List<DataModule> srcQpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainSrcQpsDataResponse.SrcQpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeDomainSrcQpsDataResponse.SrcQpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(_ctx.stringValue("DescribeDomainSrcQpsDataResponse.SrcQpsDataPerInterval["+ i +"].Value"));

			srcQpsDataPerInterval.add(dataModule);
		}
		describeDomainSrcQpsDataResponse.setSrcQpsDataPerInterval(srcQpsDataPerInterval);
	 
	 	return describeDomainSrcQpsDataResponse;
	}
}