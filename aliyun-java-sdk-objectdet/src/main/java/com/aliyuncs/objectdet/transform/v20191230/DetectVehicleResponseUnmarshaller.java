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

package com.aliyuncs.objectdet.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.objectdet.model.v20191230.DetectVehicleResponse;
import com.aliyuncs.objectdet.model.v20191230.DetectVehicleResponse.Data;
import com.aliyuncs.objectdet.model.v20191230.DetectVehicleResponse.Data.DetectObjectInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectVehicleResponseUnmarshaller {

	public static DetectVehicleResponse unmarshall(DetectVehicleResponse detectVehicleResponse, UnmarshallerContext _ctx) {
		
		detectVehicleResponse.setRequestId(_ctx.stringValue("DetectVehicleResponse.RequestId"));

		Data data = new Data();
		data.setWidth(_ctx.integerValue("DetectVehicleResponse.Data.Width"));
		data.setHeight(_ctx.integerValue("DetectVehicleResponse.Data.Height"));

		List<DetectObjectInfo> detectObjectInfoList = new ArrayList<DetectObjectInfo>();
		for (int i = 0; i < _ctx.lengthValue("DetectVehicleResponse.Data.DetectObjectInfoList.Length"); i++) {
			DetectObjectInfo detectObjectInfo = new DetectObjectInfo();
			detectObjectInfo.setScore(_ctx.floatValue("DetectVehicleResponse.Data.DetectObjectInfoList["+ i +"].Score"));
			detectObjectInfo.setType(_ctx.stringValue("DetectVehicleResponse.Data.DetectObjectInfoList["+ i +"].Type"));
			detectObjectInfo.setId(_ctx.integerValue("DetectVehicleResponse.Data.DetectObjectInfoList["+ i +"].Id"));

			List<Integer> boxes = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("DetectVehicleResponse.Data.DetectObjectInfoList["+ i +"].Boxes.Length"); j++) {
				boxes.add(_ctx.integerValue("DetectVehicleResponse.Data.DetectObjectInfoList["+ i +"].Boxes["+ j +"]"));
			}
			detectObjectInfo.setBoxes(boxes);

			detectObjectInfoList.add(detectObjectInfo);
		}
		data.setDetectObjectInfoList(detectObjectInfoList);
		detectVehicleResponse.setData(data);
	 
	 	return detectVehicleResponse;
	}
}