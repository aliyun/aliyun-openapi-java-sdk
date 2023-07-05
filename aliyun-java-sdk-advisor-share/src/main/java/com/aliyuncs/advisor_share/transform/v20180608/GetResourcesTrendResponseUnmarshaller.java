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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.GetResourcesTrendResponse;
import com.aliyuncs.advisor_share.model.v20180608.GetResourcesTrendResponse.ResourceCountDTO;
import com.aliyuncs.advisor_share.model.v20180608.GetResourcesTrendResponse.ResourceCountDTO.DataPoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResourcesTrendResponseUnmarshaller {

	public static GetResourcesTrendResponse unmarshall(GetResourcesTrendResponse getResourcesTrendResponse, UnmarshallerContext _ctx) {
		
		getResourcesTrendResponse.setRequestId(_ctx.stringValue("GetResourcesTrendResponse.RequestId"));

		List<ResourceCountDTO> data = new ArrayList<ResourceCountDTO>();
		for (int i = 0; i < _ctx.lengthValue("GetResourcesTrendResponse.Data.Length"); i++) {
			ResourceCountDTO resourceCountDTO = new ResourceCountDTO();
			resourceCountDTO.setProduct(_ctx.stringValue("GetResourcesTrendResponse.Data["+ i +"].Product"));

			List<DataPoint> dataPoints = new ArrayList<DataPoint>();
			for (int j = 0; j < _ctx.lengthValue("GetResourcesTrendResponse.Data["+ i +"].DataPoints.Length"); j++) {
				DataPoint dataPoint = new DataPoint();
				dataPoint.setTime(_ctx.stringValue("GetResourcesTrendResponse.Data["+ i +"].DataPoints["+ j +"].Time"));
				dataPoint.setCount(_ctx.integerValue("GetResourcesTrendResponse.Data["+ i +"].DataPoints["+ j +"].Count"));

				dataPoints.add(dataPoint);
			}
			resourceCountDTO.setDataPoints(dataPoints);

			data.add(resourceCountDTO);
		}
		getResourcesTrendResponse.setData(data);
	 
	 	return getResourcesTrendResponse;
	}
}