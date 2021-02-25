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

package com.aliyuncs.cdrs.transform.v20201101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdrs.model.v20201101.SearchAggregateObjectResponse;
import com.aliyuncs.cdrs.model.v20201101.SearchAggregateObjectResponse.Data;
import com.aliyuncs.cdrs.model.v20201101.SearchAggregateObjectResponse.Data.BodyListItem;
import com.aliyuncs.cdrs.model.v20201101.SearchAggregateObjectResponse.Data.FaceListItem;
import com.aliyuncs.cdrs.model.v20201101.SearchAggregateObjectResponse.Data.MotorListItem;
import com.aliyuncs.cdrs.model.v20201101.SearchAggregateObjectResponse.Data.NonMotorListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchAggregateObjectResponseUnmarshaller {

	public static SearchAggregateObjectResponse unmarshall(SearchAggregateObjectResponse searchAggregateObjectResponse, UnmarshallerContext _ctx) {
		
		searchAggregateObjectResponse.setRequestId(_ctx.stringValue("SearchAggregateObjectResponse.RequestId"));
		searchAggregateObjectResponse.setCode(_ctx.stringValue("SearchAggregateObjectResponse.Code"));
		searchAggregateObjectResponse.setMessage(_ctx.stringValue("SearchAggregateObjectResponse.Message"));
		searchAggregateObjectResponse.setTotal(_ctx.integerValue("SearchAggregateObjectResponse.Total"));
		searchAggregateObjectResponse.setPageSize(_ctx.longValue("SearchAggregateObjectResponse.PageSize"));
		searchAggregateObjectResponse.setSuccess(_ctx.booleanValue("SearchAggregateObjectResponse.Success"));

		Data data = new Data();

		List<BodyListItem> bodyList = new ArrayList<BodyListItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchAggregateObjectResponse.Data.BodyList.Length"); i++) {
			BodyListItem bodyListItem = new BodyListItem();
			bodyListItem.setDeviceID(_ctx.stringValue("SearchAggregateObjectResponse.Data.BodyList["+ i +"].DeviceID"));
			bodyListItem.setObjectType(_ctx.stringValue("SearchAggregateObjectResponse.Data.BodyList["+ i +"].ObjectType"));
			bodyListItem.setLeftTopX(_ctx.integerValue("SearchAggregateObjectResponse.Data.BodyList["+ i +"].LeftTopX"));
			bodyListItem.setLeftTopY(_ctx.integerValue("SearchAggregateObjectResponse.Data.BodyList["+ i +"].LeftTopY"));
			bodyListItem.setRightBottomX(_ctx.integerValue("SearchAggregateObjectResponse.Data.BodyList["+ i +"].RightBottomX"));
			bodyListItem.setRightBottomY(_ctx.integerValue("SearchAggregateObjectResponse.Data.BodyList["+ i +"].RightBottomY"));
			bodyListItem.setScore(_ctx.floatValue("SearchAggregateObjectResponse.Data.BodyList["+ i +"].Score"));
			bodyListItem.setShotTime(_ctx.stringValue("SearchAggregateObjectResponse.Data.BodyList["+ i +"].ShotTime"));
			bodyListItem.setSourceImageUrl(_ctx.stringValue("SearchAggregateObjectResponse.Data.BodyList["+ i +"].SourceImageUrl"));
			bodyListItem.setTargetImageUrl(_ctx.stringValue("SearchAggregateObjectResponse.Data.BodyList["+ i +"].TargetImageUrl"));
			bodyListItem.setDeviceName(_ctx.stringValue("SearchAggregateObjectResponse.Data.BodyList["+ i +"].DeviceName"));
			bodyListItem.setDeviceLatitude(_ctx.floatValue("SearchAggregateObjectResponse.Data.BodyList["+ i +"].DeviceLatitude"));
			bodyListItem.setDeviceLongitude(_ctx.floatValue("SearchAggregateObjectResponse.Data.BodyList["+ i +"].DeviceLongitude"));
			bodyListItem.setPersonId(_ctx.stringValue("SearchAggregateObjectResponse.Data.BodyList["+ i +"].PersonId"));

			bodyList.add(bodyListItem);
		}
		data.setBodyList(bodyList);

		List<FaceListItem> faceList = new ArrayList<FaceListItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchAggregateObjectResponse.Data.FaceList.Length"); i++) {
			FaceListItem faceListItem = new FaceListItem();
			faceListItem.setDeviceID(_ctx.stringValue("SearchAggregateObjectResponse.Data.FaceList["+ i +"].DeviceID"));
			faceListItem.setObjectType(_ctx.stringValue("SearchAggregateObjectResponse.Data.FaceList["+ i +"].ObjectType"));
			faceListItem.setLeftTopX(_ctx.integerValue("SearchAggregateObjectResponse.Data.FaceList["+ i +"].LeftTopX"));
			faceListItem.setLeftTopY(_ctx.integerValue("SearchAggregateObjectResponse.Data.FaceList["+ i +"].LeftTopY"));
			faceListItem.setRightBottomX(_ctx.integerValue("SearchAggregateObjectResponse.Data.FaceList["+ i +"].RightBottomX"));
			faceListItem.setRightBottomY(_ctx.integerValue("SearchAggregateObjectResponse.Data.FaceList["+ i +"].RightBottomY"));
			faceListItem.setScore(_ctx.floatValue("SearchAggregateObjectResponse.Data.FaceList["+ i +"].Score"));
			faceListItem.setShotTime(_ctx.stringValue("SearchAggregateObjectResponse.Data.FaceList["+ i +"].ShotTime"));
			faceListItem.setSourceImageUrl(_ctx.stringValue("SearchAggregateObjectResponse.Data.FaceList["+ i +"].SourceImageUrl"));
			faceListItem.setTargetImageUrl(_ctx.stringValue("SearchAggregateObjectResponse.Data.FaceList["+ i +"].TargetImageUrl"));
			faceListItem.setDeviceName(_ctx.stringValue("SearchAggregateObjectResponse.Data.FaceList["+ i +"].DeviceName"));
			faceListItem.setDeviceLatitude(_ctx.floatValue("SearchAggregateObjectResponse.Data.FaceList["+ i +"].DeviceLatitude"));
			faceListItem.setDeviceLongitude(_ctx.floatValue("SearchAggregateObjectResponse.Data.FaceList["+ i +"].DeviceLongitude"));
			faceListItem.setPersonId(_ctx.stringValue("SearchAggregateObjectResponse.Data.FaceList["+ i +"].PersonId"));

			faceList.add(faceListItem);
		}
		data.setFaceList(faceList);

		List<MotorListItem> motorList = new ArrayList<MotorListItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchAggregateObjectResponse.Data.MotorList.Length"); i++) {
			MotorListItem motorListItem = new MotorListItem();
			motorListItem.setDeviceID(_ctx.stringValue("SearchAggregateObjectResponse.Data.MotorList["+ i +"].DeviceID"));
			motorListItem.setObjectType(_ctx.stringValue("SearchAggregateObjectResponse.Data.MotorList["+ i +"].ObjectType"));
			motorListItem.setLeftTopX(_ctx.integerValue("SearchAggregateObjectResponse.Data.MotorList["+ i +"].LeftTopX"));
			motorListItem.setLeftTopY(_ctx.integerValue("SearchAggregateObjectResponse.Data.MotorList["+ i +"].LeftTopY"));
			motorListItem.setRightBottomX(_ctx.integerValue("SearchAggregateObjectResponse.Data.MotorList["+ i +"].RightBottomX"));
			motorListItem.setRightBottomY(_ctx.integerValue("SearchAggregateObjectResponse.Data.MotorList["+ i +"].RightBottomY"));
			motorListItem.setScore(_ctx.floatValue("SearchAggregateObjectResponse.Data.MotorList["+ i +"].Score"));
			motorListItem.setShotTime(_ctx.stringValue("SearchAggregateObjectResponse.Data.MotorList["+ i +"].ShotTime"));
			motorListItem.setSourceImageUrl(_ctx.stringValue("SearchAggregateObjectResponse.Data.MotorList["+ i +"].SourceImageUrl"));
			motorListItem.setTargetImageUrl(_ctx.stringValue("SearchAggregateObjectResponse.Data.MotorList["+ i +"].TargetImageUrl"));
			motorListItem.setDeviceName(_ctx.stringValue("SearchAggregateObjectResponse.Data.MotorList["+ i +"].DeviceName"));
			motorListItem.setDeviceLatitude(_ctx.floatValue("SearchAggregateObjectResponse.Data.MotorList["+ i +"].DeviceLatitude"));
			motorListItem.setDeviceLongitude(_ctx.floatValue("SearchAggregateObjectResponse.Data.MotorList["+ i +"].DeviceLongitude"));
			motorListItem.setPersonId(_ctx.stringValue("SearchAggregateObjectResponse.Data.MotorList["+ i +"].PersonId"));

			motorList.add(motorListItem);
		}
		data.setMotorList(motorList);

		List<NonMotorListItem> nonMotorList = new ArrayList<NonMotorListItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchAggregateObjectResponse.Data.NonMotorList.Length"); i++) {
			NonMotorListItem nonMotorListItem = new NonMotorListItem();
			nonMotorListItem.setDeviceID(_ctx.stringValue("SearchAggregateObjectResponse.Data.NonMotorList["+ i +"].DeviceID"));
			nonMotorListItem.setObjectType(_ctx.stringValue("SearchAggregateObjectResponse.Data.NonMotorList["+ i +"].ObjectType"));
			nonMotorListItem.setLeftTopX(_ctx.integerValue("SearchAggregateObjectResponse.Data.NonMotorList["+ i +"].LeftTopX"));
			nonMotorListItem.setLeftTopY(_ctx.integerValue("SearchAggregateObjectResponse.Data.NonMotorList["+ i +"].LeftTopY"));
			nonMotorListItem.setRightBottomX(_ctx.integerValue("SearchAggregateObjectResponse.Data.NonMotorList["+ i +"].RightBottomX"));
			nonMotorListItem.setRightBottomY(_ctx.integerValue("SearchAggregateObjectResponse.Data.NonMotorList["+ i +"].RightBottomY"));
			nonMotorListItem.setScore(_ctx.floatValue("SearchAggregateObjectResponse.Data.NonMotorList["+ i +"].Score"));
			nonMotorListItem.setShotTime(_ctx.stringValue("SearchAggregateObjectResponse.Data.NonMotorList["+ i +"].ShotTime"));
			nonMotorListItem.setSourceImageUrl(_ctx.stringValue("SearchAggregateObjectResponse.Data.NonMotorList["+ i +"].SourceImageUrl"));
			nonMotorListItem.setTargetImageUrl(_ctx.stringValue("SearchAggregateObjectResponse.Data.NonMotorList["+ i +"].TargetImageUrl"));
			nonMotorListItem.setDeviceName(_ctx.stringValue("SearchAggregateObjectResponse.Data.NonMotorList["+ i +"].DeviceName"));
			nonMotorListItem.setDeviceLatitude(_ctx.floatValue("SearchAggregateObjectResponse.Data.NonMotorList["+ i +"].DeviceLatitude"));
			nonMotorListItem.setDeviceLongitude(_ctx.floatValue("SearchAggregateObjectResponse.Data.NonMotorList["+ i +"].DeviceLongitude"));
			nonMotorListItem.setPersonId(_ctx.stringValue("SearchAggregateObjectResponse.Data.NonMotorList["+ i +"].PersonId"));

			nonMotorList.add(nonMotorListItem);
		}
		data.setNonMotorList(nonMotorList);
		searchAggregateObjectResponse.setData(data);
	 
	 	return searchAggregateObjectResponse;
	}
}