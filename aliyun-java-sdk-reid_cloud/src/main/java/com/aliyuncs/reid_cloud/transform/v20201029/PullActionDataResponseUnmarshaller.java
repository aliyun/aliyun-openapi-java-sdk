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

package com.aliyuncs.reid_cloud.transform.v20201029;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.reid_cloud.model.v20201029.PullActionDataResponse;
import com.aliyuncs.reid_cloud.model.v20201029.PullActionDataResponse.Action;
import com.aliyuncs.reid_cloud.model.v20201029.PullActionDataResponse.Action.ObjectPositionInImage;
import com.aliyuncs.reid_cloud.model.v20201029.PullActionDataResponse.Action.PointInMap;
import com.aliyuncs.transform.UnmarshallerContext;


public class PullActionDataResponseUnmarshaller {

	public static PullActionDataResponse unmarshall(PullActionDataResponse pullActionDataResponse, UnmarshallerContext _ctx) {
		
		pullActionDataResponse.setRequestId(_ctx.stringValue("PullActionDataResponse.RequestId"));
		pullActionDataResponse.setErrorCode(_ctx.stringValue("PullActionDataResponse.ErrorCode"));
		pullActionDataResponse.setErrorMessage(_ctx.stringValue("PullActionDataResponse.ErrorMessage"));
		pullActionDataResponse.setMessage(_ctx.stringValue("PullActionDataResponse.Message"));
		pullActionDataResponse.setCode(_ctx.stringValue("PullActionDataResponse.Code"));
		pullActionDataResponse.setDynamicCode(_ctx.stringValue("PullActionDataResponse.DynamicCode"));
		pullActionDataResponse.setPartitionIndex(_ctx.integerValue("PullActionDataResponse.PartitionIndex"));
		pullActionDataResponse.setSuccess(_ctx.booleanValue("PullActionDataResponse.Success"));
		pullActionDataResponse.setNextMessageId(_ctx.longValue("PullActionDataResponse.NextMessageId"));
		pullActionDataResponse.setDynamicMessage(_ctx.stringValue("PullActionDataResponse.DynamicMessage"));

		List<Action> actions = new ArrayList<Action>();
		for (int i = 0; i < _ctx.lengthValue("PullActionDataResponse.Actions.Length"); i++) {
			Action action = new Action();
			action.setStoreId(_ctx.longValue("PullActionDataResponse.Actions["+ i +"].StoreId"));
			action.setGmtCreate(_ctx.longValue("PullActionDataResponse.Actions["+ i +"].GmtCreate"));
			action.setLeaveTimestamp(_ctx.longValue("PullActionDataResponse.Actions["+ i +"].LeaveTimestamp"));
			action.setLocationLayerType(_ctx.stringValue("PullActionDataResponse.Actions["+ i +"].LocationLayerType"));
			action.setStayValid(_ctx.booleanValue("PullActionDataResponse.Actions["+ i +"].StayValid"));
			action.setGender(_ctx.stringValue("PullActionDataResponse.Actions["+ i +"].Gender"));
			action.setUkId(_ctx.longValue("PullActionDataResponse.Actions["+ i +"].UkId"));
			action.setArriveTimestamp(_ctx.longValue("PullActionDataResponse.Actions["+ i +"].ArriveTimestamp"));
			action.setGmtModified(_ctx.longValue("PullActionDataResponse.Actions["+ i +"].GmtModified"));
			action.setImageType(_ctx.stringValue("PullActionDataResponse.Actions["+ i +"].ImageType"));
			action.setInStay(_ctx.longValue("PullActionDataResponse.Actions["+ i +"].InStay"));
			action.setStatus(_ctx.integerValue("PullActionDataResponse.Actions["+ i +"].Status"));
			action.setAge(_ctx.integerValue("PullActionDataResponse.Actions["+ i +"].Age"));
			action.setId(_ctx.longValue("PullActionDataResponse.Actions["+ i +"].Id"));
			action.setBodyPointNumber(_ctx.integerValue("PullActionDataResponse.Actions["+ i +"].BodyPointNumber"));
			action.setImageUrl(_ctx.stringValue("PullActionDataResponse.Actions["+ i +"].ImageUrl"));
			action.setLocationId(_ctx.longValue("PullActionDataResponse.Actions["+ i +"].LocationId"));
			action.setStayPeriod(_ctx.integerValue("PullActionDataResponse.Actions["+ i +"].StayPeriod"));
			action.setFacePointNumber(_ctx.integerValue("PullActionDataResponse.Actions["+ i +"].FacePointNumber"));
			action.setScore(_ctx.floatValue("PullActionDataResponse.Actions["+ i +"].Score"));
			action.setSpecialType(_ctx.stringValue("PullActionDataResponse.Actions["+ i +"].SpecialType"));
			action.setImageObjectKey(_ctx.stringValue("PullActionDataResponse.Actions["+ i +"].ImageObjectKey"));

			ObjectPositionInImage objectPositionInImage = new ObjectPositionInImage();
			objectPositionInImage.setBottom(_ctx.floatValue("PullActionDataResponse.Actions["+ i +"].ObjectPositionInImage.Bottom"));
			objectPositionInImage.setLeft(_ctx.floatValue("PullActionDataResponse.Actions["+ i +"].ObjectPositionInImage.Left"));
			objectPositionInImage.setTop(_ctx.floatValue("PullActionDataResponse.Actions["+ i +"].ObjectPositionInImage.Top"));
			objectPositionInImage.setRight(_ctx.floatValue("PullActionDataResponse.Actions["+ i +"].ObjectPositionInImage.Right"));
			action.setObjectPositionInImage(objectPositionInImage);

			PointInMap pointInMap = new PointInMap();
			pointInMap.setX(_ctx.floatValue("PullActionDataResponse.Actions["+ i +"].PointInMap.X"));
			pointInMap.setY(_ctx.floatValue("PullActionDataResponse.Actions["+ i +"].PointInMap.Y"));
			action.setPointInMap(pointInMap);

			actions.add(action);
		}
		pullActionDataResponse.setActions(actions);
	 
	 	return pullActionDataResponse;
	}
}