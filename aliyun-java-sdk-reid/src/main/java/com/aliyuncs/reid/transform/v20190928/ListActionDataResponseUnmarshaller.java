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

import com.aliyuncs.reid.model.v20190928.ListActionDataResponse;
import com.aliyuncs.reid.model.v20190928.ListActionDataResponse.Action;
import com.aliyuncs.reid.model.v20190928.ListActionDataResponse.Action.ObjectPositionInImage;
import com.aliyuncs.reid.model.v20190928.ListActionDataResponse.Action.PointInMap;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListActionDataResponseUnmarshaller {

	public static ListActionDataResponse unmarshall(ListActionDataResponse listActionDataResponse, UnmarshallerContext _ctx) {
		
		listActionDataResponse.setRequestId(_ctx.stringValue("ListActionDataResponse.RequestId"));
		listActionDataResponse.setSuccess(_ctx.booleanValue("ListActionDataResponse.Success"));
		listActionDataResponse.setCursorTime(_ctx.longValue("ListActionDataResponse.CursorTime"));
		listActionDataResponse.setErrorCode(_ctx.stringValue("ListActionDataResponse.ErrorCode"));
		listActionDataResponse.setErrorMessage(_ctx.stringValue("ListActionDataResponse.ErrorMessage"));
		listActionDataResponse.setPageNumber(_ctx.integerValue("ListActionDataResponse.PageNumber"));
		listActionDataResponse.setTotalCount(_ctx.longValue("ListActionDataResponse.TotalCount"));
		listActionDataResponse.setPageSize(_ctx.integerValue("ListActionDataResponse.PageSize"));

		List<Action> actions = new ArrayList<Action>();
		for (int i = 0; i < _ctx.lengthValue("ListActionDataResponse.Actions.Length"); i++) {
			Action action = new Action();
			action.setStoreId(_ctx.longValue("ListActionDataResponse.Actions["+ i +"].StoreId"));
			action.setGmtCreate(_ctx.longValue("ListActionDataResponse.Actions["+ i +"].GmtCreate"));
			action.setLeaveTimestamp(_ctx.longValue("ListActionDataResponse.Actions["+ i +"].LeaveTimestamp"));
			action.setLocationLayerType(_ctx.stringValue("ListActionDataResponse.Actions["+ i +"].LocationLayerType"));
			action.setStayValid(_ctx.booleanValue("ListActionDataResponse.Actions["+ i +"].StayValid"));
			action.setGender(_ctx.stringValue("ListActionDataResponse.Actions["+ i +"].Gender"));
			action.setUkId(_ctx.longValue("ListActionDataResponse.Actions["+ i +"].UkId"));
			action.setArriveTimestamp(_ctx.longValue("ListActionDataResponse.Actions["+ i +"].ArriveTimestamp"));
			action.setGmtModified(_ctx.longValue("ListActionDataResponse.Actions["+ i +"].GmtModified"));
			action.setImageType(_ctx.stringValue("ListActionDataResponse.Actions["+ i +"].ImageType"));
			action.setInStay(_ctx.longValue("ListActionDataResponse.Actions["+ i +"].InStay"));
			action.setStatus(_ctx.integerValue("ListActionDataResponse.Actions["+ i +"].Status"));
			action.setAge(_ctx.integerValue("ListActionDataResponse.Actions["+ i +"].Age"));
			action.setId(_ctx.longValue("ListActionDataResponse.Actions["+ i +"].Id"));
			action.setImageUrl(_ctx.stringValue("ListActionDataResponse.Actions["+ i +"].ImageUrl"));
			action.setLocationId(_ctx.longValue("ListActionDataResponse.Actions["+ i +"].LocationId"));
			action.setStayPeriod(_ctx.integerValue("ListActionDataResponse.Actions["+ i +"].StayPeriod"));
			action.setScore(_ctx.floatValue("ListActionDataResponse.Actions["+ i +"].Score"));
			action.setSpecialType(_ctx.stringValue("ListActionDataResponse.Actions["+ i +"].SpecialType"));
			action.setImageObjectKey(_ctx.stringValue("ListActionDataResponse.Actions["+ i +"].ImageObjectKey"));
			action.setFacePointNumber(_ctx.integerValue("ListActionDataResponse.Actions["+ i +"].FacePointNumber"));
			action.setBodyPointNumber(_ctx.integerValue("ListActionDataResponse.Actions["+ i +"].BodyPointNumber"));

			ObjectPositionInImage objectPositionInImage = new ObjectPositionInImage();
			objectPositionInImage.setBottom(_ctx.floatValue("ListActionDataResponse.Actions["+ i +"].ObjectPositionInImage.Bottom"));
			objectPositionInImage.setLeft(_ctx.floatValue("ListActionDataResponse.Actions["+ i +"].ObjectPositionInImage.Left"));
			objectPositionInImage.setTop(_ctx.floatValue("ListActionDataResponse.Actions["+ i +"].ObjectPositionInImage.Top"));
			objectPositionInImage.setRight(_ctx.floatValue("ListActionDataResponse.Actions["+ i +"].ObjectPositionInImage.Right"));
			action.setObjectPositionInImage(objectPositionInImage);

			PointInMap pointInMap = new PointInMap();
			pointInMap.setX(_ctx.floatValue("ListActionDataResponse.Actions["+ i +"].PointInMap.X"));
			pointInMap.setY(_ctx.floatValue("ListActionDataResponse.Actions["+ i +"].PointInMap.Y"));
			action.setPointInMap(pointInMap);

			actions.add(action);
		}
		listActionDataResponse.setActions(actions);
	 
	 	return listActionDataResponse;
	}
}