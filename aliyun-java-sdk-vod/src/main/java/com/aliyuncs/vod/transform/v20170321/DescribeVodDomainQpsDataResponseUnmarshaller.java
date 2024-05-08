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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainQpsDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainQpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainQpsDataResponseUnmarshaller {

	public static DescribeVodDomainQpsDataResponse unmarshall(DescribeVodDomainQpsDataResponse describeVodDomainQpsDataResponse, UnmarshallerContext _ctx) {
		
		describeVodDomainQpsDataResponse.setRequestId(_ctx.stringValue("DescribeVodDomainQpsDataResponse.RequestId"));
		describeVodDomainQpsDataResponse.setEndTime(_ctx.stringValue("DescribeVodDomainQpsDataResponse.EndTime"));
		describeVodDomainQpsDataResponse.setStartTime(_ctx.stringValue("DescribeVodDomainQpsDataResponse.StartTime"));
		describeVodDomainQpsDataResponse.setDomainName(_ctx.stringValue("DescribeVodDomainQpsDataResponse.DomainName"));
		describeVodDomainQpsDataResponse.setDataInterval(_ctx.stringValue("DescribeVodDomainQpsDataResponse.DataInterval"));

		List<DataModule> qpsDataInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodDomainQpsDataResponse.QpsDataInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setAccValue(_ctx.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].AccValue"));
			dataModule.setAccDomesticValue(_ctx.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].AccDomesticValue"));
			dataModule.setAccOverseasValue(_ctx.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].AccOverseasValue"));
			dataModule.setHttpsValue(_ctx.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].HttpsValue"));
			dataModule.setHttpsOverseasValue(_ctx.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].HttpsOverseasValue"));
			dataModule.setDomesticValue(_ctx.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].DomesticValue"));
			dataModule.setHttpsAccOverseasValue(_ctx.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].HttpsAccOverseasValue"));
			dataModule.setHttpsDomesticValue(_ctx.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].HttpsDomesticValue"));
			dataModule.setHttpsAccValue(_ctx.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].HttpsAccValue"));
			dataModule.setValue(_ctx.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].Value"));
			dataModule.setOverseasValue(_ctx.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].OverseasValue"));
			dataModule.setTimeStamp(_ctx.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].TimeStamp"));
			dataModule.setHttpsAccDomesticValue(_ctx.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].HttpsAccDomesticValue"));

			qpsDataInterval.add(dataModule);
		}
		describeVodDomainQpsDataResponse.setQpsDataInterval(qpsDataInterval);
	 
	 	return describeVodDomainQpsDataResponse;
	}
}