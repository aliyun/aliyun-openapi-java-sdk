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

import com.aliyuncs.sae.model.v20190506.GetScaleAppMetricResponse;
import com.aliyuncs.sae.model.v20190506.GetScaleAppMetricResponse.ScaleAppMetricDto;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetScaleAppMetricResponseUnmarshaller {

	public static GetScaleAppMetricResponse unmarshall(GetScaleAppMetricResponse getScaleAppMetricResponse, UnmarshallerContext _ctx) {
		
		getScaleAppMetricResponse.setRequestId(_ctx.stringValue("GetScaleAppMetricResponse.RequestId"));
		getScaleAppMetricResponse.setMessage(_ctx.stringValue("GetScaleAppMetricResponse.Message"));
		getScaleAppMetricResponse.setCode(_ctx.stringValue("GetScaleAppMetricResponse.Code"));
		getScaleAppMetricResponse.setSuccess(_ctx.booleanValue("GetScaleAppMetricResponse.Success"));

		List<ScaleAppMetricDto> data = new ArrayList<ScaleAppMetricDto>();
		for (int i = 0; i < _ctx.lengthValue("GetScaleAppMetricResponse.Data.Length"); i++) {
			ScaleAppMetricDto scaleAppMetricDto = new ScaleAppMetricDto();
			scaleAppMetricDto.setAppId(_ctx.stringValue("GetScaleAppMetricResponse.Data["+ i +"].AppId"));
			scaleAppMetricDto.setName(_ctx.stringValue("GetScaleAppMetricResponse.Data["+ i +"].Name"));
			scaleAppMetricDto.setRegionId(_ctx.stringValue("GetScaleAppMetricResponse.Data["+ i +"].RegionId"));
			scaleAppMetricDto.setRunnings(_ctx.longValue("GetScaleAppMetricResponse.Data["+ i +"].Runnings"));
			scaleAppMetricDto.setMaxReplicas(_ctx.longValue("GetScaleAppMetricResponse.Data["+ i +"].MaxReplicas"));

			data.add(scaleAppMetricDto);
		}
		getScaleAppMetricResponse.setData(data);
	 
	 	return getScaleAppMetricResponse;
	}
}