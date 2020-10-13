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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeVsDomainPvUvDataResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsDomainPvUvDataResponse.PvUvDataInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsDomainPvUvDataResponseUnmarshaller {

	public static DescribeVsDomainPvUvDataResponse unmarshall(DescribeVsDomainPvUvDataResponse describeVsDomainPvUvDataResponse, UnmarshallerContext _ctx) {
		
		describeVsDomainPvUvDataResponse.setRequestId(_ctx.stringValue("DescribeVsDomainPvUvDataResponse.RequestId"));
		describeVsDomainPvUvDataResponse.setDomainName(_ctx.stringValue("DescribeVsDomainPvUvDataResponse.DomainName"));
		describeVsDomainPvUvDataResponse.setStartTime(_ctx.stringValue("DescribeVsDomainPvUvDataResponse.StartTime"));

		List<PvUvDataInfo> pvUvDataInfos = new ArrayList<PvUvDataInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVsDomainPvUvDataResponse.PvUvDataInfos.Length"); i++) {
			PvUvDataInfo pvUvDataInfo = new PvUvDataInfo();
			pvUvDataInfo.setPV(_ctx.stringValue("DescribeVsDomainPvUvDataResponse.PvUvDataInfos["+ i +"].PV"));
			pvUvDataInfo.setUV(_ctx.stringValue("DescribeVsDomainPvUvDataResponse.PvUvDataInfos["+ i +"].UV"));
			pvUvDataInfo.setTimeStamp(_ctx.stringValue("DescribeVsDomainPvUvDataResponse.PvUvDataInfos["+ i +"].TimeStamp"));

			pvUvDataInfos.add(pvUvDataInfo);
		}
		describeVsDomainPvUvDataResponse.setPvUvDataInfos(pvUvDataInfos);
	 
	 	return describeVsDomainPvUvDataResponse;
	}
}