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

package com.aliyuncs.reid.transform.v20190928;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.reid.model.v20190928.GetHeatMapResponse;
import com.aliyuncs.reid.model.v20190928.GetHeatMapResponse.HeatMapPoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHeatMapResponseUnmarshaller {

	public static GetHeatMapResponse unmarshall(GetHeatMapResponse getHeatMapResponse, UnmarshallerContext _ctx) {
		
		getHeatMapResponse.setRequestId(_ctx.stringValue("GetHeatMapResponse.RequestId"));
		getHeatMapResponse.setErrorCode(_ctx.stringValue("GetHeatMapResponse.ErrorCode"));
		getHeatMapResponse.setErrorMessage(_ctx.stringValue("GetHeatMapResponse.ErrorMessage"));
		getHeatMapResponse.setMessage(_ctx.stringValue("GetHeatMapResponse.Message"));
		getHeatMapResponse.setCode(_ctx.stringValue("GetHeatMapResponse.Code"));
		getHeatMapResponse.setDynamicCode(_ctx.stringValue("GetHeatMapResponse.DynamicCode"));
		getHeatMapResponse.setSuccess(_ctx.booleanValue("GetHeatMapResponse.Success"));
		getHeatMapResponse.setDynamicMessage(_ctx.stringValue("GetHeatMapResponse.DynamicMessage"));

		List<HeatMapPoint> heatMapPoints = new ArrayList<HeatMapPoint>();
		for (int i = 0; i < _ctx.lengthValue("GetHeatMapResponse.HeatMapPoints.Length"); i++) {
			HeatMapPoint heatMapPoint = new HeatMapPoint();
			heatMapPoint.setY(_ctx.floatValue("GetHeatMapResponse.HeatMapPoints["+ i +"].Y"));
			heatMapPoint.setWeight(_ctx.integerValue("GetHeatMapResponse.HeatMapPoints["+ i +"].Weight"));
			heatMapPoint.setX(_ctx.floatValue("GetHeatMapResponse.HeatMapPoints["+ i +"].X"));

			heatMapPoints.add(heatMapPoint);
		}
		getHeatMapResponse.setHeatMapPoints(heatMapPoints);
	 
	 	return getHeatMapResponse;
	}
}