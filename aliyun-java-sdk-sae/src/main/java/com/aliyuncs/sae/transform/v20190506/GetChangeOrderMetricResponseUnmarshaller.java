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

import com.aliyuncs.sae.model.v20190506.GetChangeOrderMetricResponse;
import com.aliyuncs.sae.model.v20190506.GetChangeOrderMetricResponse.ChangeOrderMetricDto;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetChangeOrderMetricResponseUnmarshaller {

	public static GetChangeOrderMetricResponse unmarshall(GetChangeOrderMetricResponse getChangeOrderMetricResponse, UnmarshallerContext _ctx) {
		
		getChangeOrderMetricResponse.setRequestId(_ctx.stringValue("GetChangeOrderMetricResponse.RequestId"));
		getChangeOrderMetricResponse.setMessage(_ctx.stringValue("GetChangeOrderMetricResponse.Message"));
		getChangeOrderMetricResponse.setCode(_ctx.stringValue("GetChangeOrderMetricResponse.Code"));
		getChangeOrderMetricResponse.setSuccess(_ctx.booleanValue("GetChangeOrderMetricResponse.Success"));

		List<ChangeOrderMetricDto> data = new ArrayList<ChangeOrderMetricDto>();
		for (int i = 0; i < _ctx.lengthValue("GetChangeOrderMetricResponse.Data.Length"); i++) {
			ChangeOrderMetricDto changeOrderMetricDto = new ChangeOrderMetricDto();
			changeOrderMetricDto.setAppId(_ctx.stringValue("GetChangeOrderMetricResponse.Data["+ i +"].AppId"));
			changeOrderMetricDto.setName(_ctx.stringValue("GetChangeOrderMetricResponse.Data["+ i +"].Name"));
			changeOrderMetricDto.setRegionId(_ctx.stringValue("GetChangeOrderMetricResponse.Data["+ i +"].RegionId"));
			changeOrderMetricDto.setTotal(_ctx.longValue("GetChangeOrderMetricResponse.Data["+ i +"].Total"));
			changeOrderMetricDto.setError(_ctx.longValue("GetChangeOrderMetricResponse.Data["+ i +"].Error"));
			changeOrderMetricDto.setErrorPercent(_ctx.floatValue("GetChangeOrderMetricResponse.Data["+ i +"].ErrorPercent"));

			data.add(changeOrderMetricDto);
		}
		getChangeOrderMetricResponse.setData(data);
	 
	 	return getChangeOrderMetricResponse;
	}
}