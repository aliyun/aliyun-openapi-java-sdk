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

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainRealTimeQpsDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainRealTimeQpsDataResponse.QpsModel;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainRealTimeQpsDataResponseUnmarshaller {

	public static DescribeVodDomainRealTimeQpsDataResponse unmarshall(DescribeVodDomainRealTimeQpsDataResponse describeVodDomainRealTimeQpsDataResponse, UnmarshallerContext context) {
		
		describeVodDomainRealTimeQpsDataResponse.setRequestId(context.stringValue("DescribeVodDomainRealTimeQpsDataResponse.RequestId"));

		List<QpsModel> data = new ArrayList<QpsModel>();
		for (int i = 0; i < context.lengthValue("DescribeVodDomainRealTimeQpsDataResponse.Data.Length"); i++) {
			QpsModel qpsModel = new QpsModel();
			qpsModel.setQps(context.floatValue("DescribeVodDomainRealTimeQpsDataResponse.Data["+ i +"].Qps"));
			qpsModel.setTimeStamp(context.stringValue("DescribeVodDomainRealTimeQpsDataResponse.Data["+ i +"].TimeStamp"));

			data.add(qpsModel);
		}
		describeVodDomainRealTimeQpsDataResponse.setData(data);
	 
	 	return describeVodDomainRealTimeQpsDataResponse;
	}
}