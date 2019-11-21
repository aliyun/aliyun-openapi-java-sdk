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
import com.aliyuncs.reid.model.v20190928.ListActionDataResponse.Action.FacePositionInImage;
import com.aliyuncs.reid.model.v20190928.ListActionDataResponse.Action.PointInMap;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListActionDataResponseUnmarshaller {

	public static ListActionDataResponse unmarshall(ListActionDataResponse listActionDataResponse, UnmarshallerContext _ctx) {
		
		listActionDataResponse.setRequestId(_ctx.stringValue("ListActionDataResponse.RequestId"));
		listActionDataResponse.setErrorCode(_ctx.stringValue("ListActionDataResponse.ErrorCode"));
		listActionDataResponse.setErrorMessage(_ctx.stringValue("ListActionDataResponse.ErrorMessage"));
		listActionDataResponse.setPageNumber(_ctx.integerValue("ListActionDataResponse.PageNumber"));
		listActionDataResponse.setMessage(_ctx.stringValue("ListActionDataResponse.Message"));
		listActionDataResponse.setCode(_ctx.stringValue("ListActionDataResponse.Code"));
		listActionDataResponse.setTotalCount(_ctx.longValue("ListActionDataResponse.TotalCount"));
		listActionDataResponse.setDynamicCode(_ctx.stringValue("ListActionDataResponse.DynamicCode"));
		listActionDataResponse.setPageSize(_ctx.integerValue("ListActionDataResponse.PageSize"));
		listActionDataResponse.setSuccess(_ctx.booleanValue("ListActionDataResponse.Success"));
		listActionDataResponse.setDynamicMessage(_ctx.stringValue("ListActionDataResponse.DynamicMessage"));

		List<Action> actions = new ArrayList<Action>();
		for (int i = 0; i < _ctx.lengthValue("ListActionDataResponse.actions.Length"); i++) {
			Action action = new Action();
			action.setStoreId(_ctx.longValue("ListActionDataResponse.actions["+ i +"].StoreId"));
			action.setGmtCreate(_ctx.longValue("ListActionDataResponse.actions["+ i +"].GmtCreate"));
			action.setLocationLayerType(_ctx.stringValue("ListActionDataResponse.actions["+ i +"].LocationLayerType"));
			action.setStayValid(_ctx.booleanValue("ListActionDataResponse.actions["+ i +"].StayValid"));
			action.setGender(_ctx.stringValue("ListActionDataResponse.actions["+ i +"].Gender"));
			action.setUkId(_ctx.longValue("ListActionDataResponse.actions["+ i +"].UkId"));
			action.setArriveTimeStamp(_ctx.longValue("ListActionDataResponse.actions["+ i +"].ArriveTimeStamp"));
			action.setGmtModified(_ctx.longValue("ListActionDataResponse.actions["+ i +"].GmtModified"));
			action.setImageType(_ctx.stringValue("ListActionDataResponse.actions["+ i +"].ImageType"));
			action.setStatus(_ctx.integerValue("ListActionDataResponse.actions["+ i +"].Status"));
			action.setAge(_ctx.integerValue("ListActionDataResponse.actions["+ i +"].Age"));
			action.setImageUrl(_ctx.stringValue("ListActionDataResponse.actions["+ i +"].ImageUrl"));
			action.setLocationId(_ctx.longValue("ListActionDataResponse.actions["+ i +"].LocationId"));
			action.setStayPeriod(_ctx.integerValue("ListActionDataResponse.actions["+ i +"].StayPeriod"));
			action.setLeaveTimeStamp(_ctx.longValue("ListActionDataResponse.actions["+ i +"].LeaveTimeStamp"));
			action.setScore(_ctx.floatValue("ListActionDataResponse.actions["+ i +"].Score"));
			action.setSpecialType(_ctx.stringValue("ListActionDataResponse.actions["+ i +"].SpecialType"));
			action.setImageObjectKey(_ctx.stringValue("ListActionDataResponse.actions["+ i +"].ImageObjectKey"));

			FacePositionInImage facePositionInImage = new FacePositionInImage();
			facePositionInImage.setBottom(_ctx.floatValue("ListActionDataResponse.actions["+ i +"].facePositionInImage.Bottom"));
			facePositionInImage.setLeft(_ctx.floatValue("ListActionDataResponse.actions["+ i +"].facePositionInImage.Left"));
			facePositionInImage.setTop(_ctx.floatValue("ListActionDataResponse.actions["+ i +"].facePositionInImage.Top"));
			facePositionInImage.setRight(_ctx.floatValue("ListActionDataResponse.actions["+ i +"].facePositionInImage.Right"));
			action.setFacePositionInImage(facePositionInImage);

			PointInMap pointInMap = new PointInMap();
			pointInMap.setX(_ctx.floatValue("ListActionDataResponse.actions["+ i +"].pointInMap.X"));
			pointInMap.setY(_ctx.floatValue("ListActionDataResponse.actions["+ i +"].pointInMap.Y"));
			action.setPointInMap(pointInMap);

			actions.add(action);
		}
		listActionDataResponse.setActions(actions);
	 
	 	return listActionDataResponse;
	}
}