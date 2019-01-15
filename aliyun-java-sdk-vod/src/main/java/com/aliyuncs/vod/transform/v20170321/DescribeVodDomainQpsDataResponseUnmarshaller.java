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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainQpsDataResponseUnmarshaller {

	public static DescribeVodDomainQpsDataResponse unmarshall(DescribeVodDomainQpsDataResponse describeVodDomainQpsDataResponse, UnmarshallerContext context) {
		
		describeVodDomainQpsDataResponse.setRequestId(context.stringValue("DescribeVodDomainQpsDataResponse.RequestId"));
		describeVodDomainQpsDataResponse.setDomainName(context.stringValue("DescribeVodDomainQpsDataResponse.DomainName"));
		describeVodDomainQpsDataResponse.setStartTime(context.stringValue("DescribeVodDomainQpsDataResponse.StartTime"));
		describeVodDomainQpsDataResponse.setEndTime(context.stringValue("DescribeVodDomainQpsDataResponse.EndTime"));
		describeVodDomainQpsDataResponse.setDataInterval(context.stringValue("DescribeVodDomainQpsDataResponse.DataInterval"));

		List<DataModule> qpsDataInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeVodDomainQpsDataResponse.QpsDataInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].Value"));
			dataModule.setDomesticValue(context.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].DomesticValue"));
			dataModule.setOverseasValue(context.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].OverseasValue"));
			dataModule.setAccValue(context.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].AccValue"));
			dataModule.setAccDomesticValue(context.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].AccDomesticValue"));
			dataModule.setAccOverseasValue(context.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].AccOverseasValue"));
			dataModule.setHttpsValue(context.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].HttpsValue"));
			dataModule.setHttpsDomesticValue(context.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].HttpsDomesticValue"));
			dataModule.setHttpsOverseasValue(context.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].HttpsOverseasValue"));
			dataModule.setHttpsAccValue(context.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].HttpsAccValue"));
			dataModule.setHttpsAccDomesticValue(context.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].HttpsAccDomesticValue"));
			dataModule.setHttpsAccOverseasValue(context.stringValue("DescribeVodDomainQpsDataResponse.QpsDataInterval["+ i +"].HttpsAccOverseasValue"));

			qpsDataInterval.add(dataModule);
		}
		describeVodDomainQpsDataResponse.setQpsDataInterval(qpsDataInterval);
	 
	 	return describeVodDomainQpsDataResponse;
	}
}