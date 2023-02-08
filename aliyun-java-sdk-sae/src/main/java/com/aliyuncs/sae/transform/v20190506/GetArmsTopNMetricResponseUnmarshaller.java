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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.GetArmsTopNMetricResponse;
import com.aliyuncs.sae.model.v20190506.GetArmsTopNMetricResponse.ArmsMetricDto;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetArmsTopNMetricResponseUnmarshaller {

	public static GetArmsTopNMetricResponse unmarshall(GetArmsTopNMetricResponse getArmsTopNMetricResponse, UnmarshallerContext _ctx) {
		
		getArmsTopNMetricResponse.setRequestId(_ctx.stringValue("GetArmsTopNMetricResponse.RequestId"));
		getArmsTopNMetricResponse.setMessage(_ctx.stringValue("GetArmsTopNMetricResponse.Message"));
		getArmsTopNMetricResponse.setCode(_ctx.stringValue("GetArmsTopNMetricResponse.Code"));
		getArmsTopNMetricResponse.setSuccess(_ctx.booleanValue("GetArmsTopNMetricResponse.Success"));

		List<ArmsMetricDto> data = new ArrayList<ArmsMetricDto>();
		for (int i = 0; i < _ctx.lengthValue("GetArmsTopNMetricResponse.Data.Length"); i++) {
			ArmsMetricDto armsMetricDto = new ArmsMetricDto();
			armsMetricDto.setAppId(_ctx.stringValue("GetArmsTopNMetricResponse.Data["+ i +"].AppId"));
			armsMetricDto.setName(_ctx.stringValue("GetArmsTopNMetricResponse.Data["+ i +"].Name"));
			armsMetricDto.setRegionId(_ctx.stringValue("GetArmsTopNMetricResponse.Data["+ i +"].RegionId"));
			armsMetricDto.setCount(_ctx.longValue("GetArmsTopNMetricResponse.Data["+ i +"].Count"));
			armsMetricDto.setError(_ctx.longValue("GetArmsTopNMetricResponse.Data["+ i +"].Error"));
			armsMetricDto.setRt(_ctx.longValue("GetArmsTopNMetricResponse.Data["+ i +"].Rt"));

			data.add(armsMetricDto);
		}
		getArmsTopNMetricResponse.setData(data);
	 
	 	return getArmsTopNMetricResponse;
	}
}