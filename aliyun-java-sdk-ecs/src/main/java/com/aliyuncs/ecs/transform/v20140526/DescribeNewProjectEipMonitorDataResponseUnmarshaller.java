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

import com.aliyuncs.ecs.model.v20140526.DescribeNewProjectEipMonitorDataResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeNewProjectEipMonitorDataResponse.EipMonitorData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNewProjectEipMonitorDataResponseUnmarshaller {

	public static DescribeNewProjectEipMonitorDataResponse unmarshall(DescribeNewProjectEipMonitorDataResponse describeNewProjectEipMonitorDataResponse, UnmarshallerContext context) {
		
		describeNewProjectEipMonitorDataResponse.setRequestId(context.stringValue("DescribeNewProjectEipMonitorDataResponse.RequestId"));

		List<EipMonitorData> eipMonitorDatas = new ArrayList<EipMonitorData>();
		for (int i = 0; i < context.lengthValue("DescribeNewProjectEipMonitorDataResponse.EipMonitorDatas.Length"); i++) {
			EipMonitorData eipMonitorData = new EipMonitorData();
			eipMonitorData.setEipRX(context.integerValue("DescribeNewProjectEipMonitorDataResponse.EipMonitorDatas["+ i +"].EipRX"));
			eipMonitorData.setEipTX(context.integerValue("DescribeNewProjectEipMonitorDataResponse.EipMonitorDatas["+ i +"].EipTX"));
			eipMonitorData.setEipFlow(context.integerValue("DescribeNewProjectEipMonitorDataResponse.EipMonitorDatas["+ i +"].EipFlow"));
			eipMonitorData.setEipBandwidth(context.integerValue("DescribeNewProjectEipMonitorDataResponse.EipMonitorDatas["+ i +"].EipBandwidth"));
			eipMonitorData.setEipPackets(context.integerValue("DescribeNewProjectEipMonitorDataResponse.EipMonitorDatas["+ i +"].EipPackets"));
			eipMonitorData.setTimeStamp(context.stringValue("DescribeNewProjectEipMonitorDataResponse.EipMonitorDatas["+ i +"].TimeStamp"));

			eipMonitorDatas.add(eipMonitorData);
		}
		describeNewProjectEipMonitorDataResponse.setEipMonitorDatas(eipMonitorDatas);
	 
	 	return describeNewProjectEipMonitorDataResponse;
	}
}