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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeEipMonitorDataResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeEipMonitorDataResponse.EipMonitorData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEipMonitorDataResponseUnmarshaller {

	public static DescribeEipMonitorDataResponse unmarshall(DescribeEipMonitorDataResponse describeEipMonitorDataResponse, UnmarshallerContext _ctx) {
		
		describeEipMonitorDataResponse.setRequestId(_ctx.stringValue("DescribeEipMonitorDataResponse.RequestId"));

		List<EipMonitorData> eipMonitorDatas = new ArrayList<EipMonitorData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEipMonitorDataResponse.EipMonitorDatas.Length"); i++) {
			EipMonitorData eipMonitorData = new EipMonitorData();
			eipMonitorData.setEipRX(_ctx.integerValue("DescribeEipMonitorDataResponse.EipMonitorDatas["+ i +"].EipRX"));
			eipMonitorData.setEipTX(_ctx.integerValue("DescribeEipMonitorDataResponse.EipMonitorDatas["+ i +"].EipTX"));
			eipMonitorData.setEipFlow(_ctx.integerValue("DescribeEipMonitorDataResponse.EipMonitorDatas["+ i +"].EipFlow"));
			eipMonitorData.setEipBandwidth(_ctx.integerValue("DescribeEipMonitorDataResponse.EipMonitorDatas["+ i +"].EipBandwidth"));
			eipMonitorData.setEipPackets(_ctx.integerValue("DescribeEipMonitorDataResponse.EipMonitorDatas["+ i +"].EipPackets"));
			eipMonitorData.setTimeStamp(_ctx.stringValue("DescribeEipMonitorDataResponse.EipMonitorDatas["+ i +"].TimeStamp"));

			eipMonitorDatas.add(eipMonitorData);
		}
		describeEipMonitorDataResponse.setEipMonitorDatas(eipMonitorDatas);
	 
	 	return describeEipMonitorDataResponse;
	}
}