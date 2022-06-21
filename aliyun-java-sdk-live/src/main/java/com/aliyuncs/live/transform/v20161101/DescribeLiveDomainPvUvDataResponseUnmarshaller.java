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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainPvUvDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainPvUvDataResponse.PvUvDataInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainPvUvDataResponseUnmarshaller {

	public static DescribeLiveDomainPvUvDataResponse unmarshall(DescribeLiveDomainPvUvDataResponse describeLiveDomainPvUvDataResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainPvUvDataResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainPvUvDataResponse.RequestId"));
		describeLiveDomainPvUvDataResponse.setDomainName(_ctx.stringValue("DescribeLiveDomainPvUvDataResponse.DomainName"));
		describeLiveDomainPvUvDataResponse.setStartTime(_ctx.stringValue("DescribeLiveDomainPvUvDataResponse.StartTime"));
		describeLiveDomainPvUvDataResponse.setEndTime(_ctx.stringValue("DescribeLiveDomainPvUvDataResponse.EndTime"));
		describeLiveDomainPvUvDataResponse.setDataInterval(_ctx.stringValue("DescribeLiveDomainPvUvDataResponse.DataInterval"));

		List<PvUvDataInfo> pvUvDataInfos = new ArrayList<PvUvDataInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainPvUvDataResponse.PvUvDataInfos.Length"); i++) {
			PvUvDataInfo pvUvDataInfo = new PvUvDataInfo();
			pvUvDataInfo.setPV(_ctx.stringValue("DescribeLiveDomainPvUvDataResponse.PvUvDataInfos["+ i +"].PV"));
			pvUvDataInfo.setUV(_ctx.stringValue("DescribeLiveDomainPvUvDataResponse.PvUvDataInfos["+ i +"].UV"));
			pvUvDataInfo.setTimeStamp(_ctx.stringValue("DescribeLiveDomainPvUvDataResponse.PvUvDataInfos["+ i +"].TimeStamp"));

			pvUvDataInfos.add(pvUvDataInfo);
		}
		describeLiveDomainPvUvDataResponse.setPvUvDataInfos(pvUvDataInfos);
	 
	 	return describeLiveDomainPvUvDataResponse;
	}
}