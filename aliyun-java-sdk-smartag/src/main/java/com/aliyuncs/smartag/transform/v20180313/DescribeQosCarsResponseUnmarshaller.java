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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeQosCarsResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeQosCarsResponse.QosCar;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeQosCarsResponseUnmarshaller {

	public static DescribeQosCarsResponse unmarshall(DescribeQosCarsResponse describeQosCarsResponse, UnmarshallerContext _ctx) {
		
		describeQosCarsResponse.setRequestId(_ctx.stringValue("DescribeQosCarsResponse.RequestId"));
		describeQosCarsResponse.setTotalCount(_ctx.integerValue("DescribeQosCarsResponse.TotalCount"));
		describeQosCarsResponse.setPageSize(_ctx.integerValue("DescribeQosCarsResponse.PageSize"));
		describeQosCarsResponse.setPageNumber(_ctx.integerValue("DescribeQosCarsResponse.PageNumber"));

		List<QosCar> qosCars = new ArrayList<QosCar>();
		for (int i = 0; i < _ctx.lengthValue("DescribeQosCarsResponse.QosCars.Length"); i++) {
			QosCar qosCar = new QosCar();
			qosCar.setMinBandwidthAbs(_ctx.integerValue("DescribeQosCarsResponse.QosCars["+ i +"].MinBandwidthAbs"));
			qosCar.setDescription(_ctx.stringValue("DescribeQosCarsResponse.QosCars["+ i +"].Description"));
			qosCar.setQosCarId(_ctx.stringValue("DescribeQosCarsResponse.QosCars["+ i +"].QosCarId"));
			qosCar.setPriority(_ctx.integerValue("DescribeQosCarsResponse.QosCars["+ i +"].Priority"));
			qosCar.setMaxBandwidthPercent(_ctx.integerValue("DescribeQosCarsResponse.QosCars["+ i +"].MaxBandwidthPercent"));
			qosCar.setMaxBandwidthAbs(_ctx.integerValue("DescribeQosCarsResponse.QosCars["+ i +"].MaxBandwidthAbs"));
			qosCar.setQosId(_ctx.stringValue("DescribeQosCarsResponse.QosCars["+ i +"].QosId"));
			qosCar.setPercentSourceType(_ctx.stringValue("DescribeQosCarsResponse.QosCars["+ i +"].PercentSourceType"));
			qosCar.setMinBandwidthPercent(_ctx.integerValue("DescribeQosCarsResponse.QosCars["+ i +"].MinBandwidthPercent"));
			qosCar.setLimitType(_ctx.stringValue("DescribeQosCarsResponse.QosCars["+ i +"].LimitType"));
			qosCar.setName(_ctx.stringValue("DescribeQosCarsResponse.QosCars["+ i +"].Name"));

			qosCars.add(qosCar);
		}
		describeQosCarsResponse.setQosCars(qosCars);
	 
	 	return describeQosCarsResponse;
	}
}