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

package com.aliyuncs.imageprocess.transform.v20200320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imageprocess.model.v20200320.DetectHipKeypointXRayResponse;
import com.aliyuncs.imageprocess.model.v20200320.DetectHipKeypointXRayResponse.Data;
import com.aliyuncs.imageprocess.model.v20200320.DetectHipKeypointXRayResponse.Data.KeyPointsItem;
import com.aliyuncs.imageprocess.model.v20200320.DetectHipKeypointXRayResponse.Data.KeyPointsItem.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectHipKeypointXRayResponseUnmarshaller {

	public static DetectHipKeypointXRayResponse unmarshall(DetectHipKeypointXRayResponse detectHipKeypointXRayResponse, UnmarshallerContext _ctx) {
		
		detectHipKeypointXRayResponse.setRequestId(_ctx.stringValue("DetectHipKeypointXRayResponse.RequestId"));

		Data data = new Data();
		data.setImageUrl(_ctx.stringValue("DetectHipKeypointXRayResponse.Data.ImageUrl"));
		data.setOrgId(_ctx.stringValue("DetectHipKeypointXRayResponse.Data.OrgId"));
		data.setOrgName(_ctx.stringValue("DetectHipKeypointXRayResponse.Data.OrgName"));

		List<KeyPointsItem> keyPoints = new ArrayList<KeyPointsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectHipKeypointXRayResponse.Data.KeyPoints.Length"); i++) {
			KeyPointsItem keyPointsItem = new KeyPointsItem();
			keyPointsItem.setValue(_ctx.floatValue("DetectHipKeypointXRayResponse.Data.KeyPoints["+ i +"].Value"));

			List<Integer> coordinates = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("DetectHipKeypointXRayResponse.Data.KeyPoints["+ i +"].Coordinates.Length"); j++) {
				coordinates.add(_ctx.integerValue("DetectHipKeypointXRayResponse.Data.KeyPoints["+ i +"].Coordinates["+ j +"]"));
			}
			keyPointsItem.setCoordinates(coordinates);

			Tag tag = new Tag();
			tag.setDirection(_ctx.stringValue("DetectHipKeypointXRayResponse.Data.KeyPoints["+ i +"].Tag.Direction"));
			tag.setLabel(_ctx.stringValue("DetectHipKeypointXRayResponse.Data.KeyPoints["+ i +"].Tag.Label"));
			keyPointsItem.setTag(tag);

			keyPoints.add(keyPointsItem);
		}
		data.setKeyPoints(keyPoints);
		detectHipKeypointXRayResponse.setData(data);
	 
	 	return detectHipKeypointXRayResponse;
	}
}