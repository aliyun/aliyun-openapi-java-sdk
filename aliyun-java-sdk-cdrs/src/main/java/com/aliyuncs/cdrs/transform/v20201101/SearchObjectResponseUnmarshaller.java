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

import com.aliyuncs.cdrs.model.v20201101.SearchObjectResponse;
import com.aliyuncs.cdrs.model.v20201101.SearchObjectResponse.Data;
import com.aliyuncs.cdrs.model.v20201101.SearchObjectResponse.Data.BodyListItem;
import com.aliyuncs.cdrs.model.v20201101.SearchObjectResponse.Data.FaceListItem;
import com.aliyuncs.cdrs.model.v20201101.SearchObjectResponse.Data.MotorListItem;
import com.aliyuncs.cdrs.model.v20201101.SearchObjectResponse.Data.NonMotorListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchObjectResponseUnmarshaller {

	public static SearchObjectResponse unmarshall(SearchObjectResponse searchObjectResponse, UnmarshallerContext _ctx) {
		
		searchObjectResponse.setRequestId(_ctx.stringValue("SearchObjectResponse.RequestId"));
		searchObjectResponse.setCode(_ctx.stringValue("SearchObjectResponse.Code"));
		searchObjectResponse.setMessage(_ctx.stringValue("SearchObjectResponse.Message"));
		searchObjectResponse.setTotal(_ctx.integerValue("SearchObjectResponse.Total"));
		searchObjectResponse.setPageSize(_ctx.longValue("SearchObjectResponse.PageSize"));
		searchObjectResponse.setSuccess(_ctx.booleanValue("SearchObjectResponse.Success"));

		Data data = new Data();

		List<BodyListItem> bodyList = new ArrayList<BodyListItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchObjectResponse.Data.BodyList.Length"); i++) {
			BodyListItem bodyListItem = new BodyListItem();
			bodyListItem.setDeviceID(_ctx.stringValue("SearchObjectResponse.Data.BodyList["+ i +"].DeviceID"));
			bodyListItem.setObjectType(_ctx.stringValue("SearchObjectResponse.Data.BodyList["+ i +"].ObjectType"));
			bodyListItem.setLeftTopX(_ctx.integerValue("SearchObjectResponse.Data.BodyList["+ i +"].LeftTopX"));
			bodyListItem.setLeftTopY(_ctx.integerValue("SearchObjectResponse.Data.BodyList["+ i +"].LeftTopY"));
			bodyListItem.setRightBottomX(_ctx.integerValue("SearchObjectResponse.Data.BodyList["+ i +"].RightBottomX"));
			bodyListItem.setRightBottomY(_ctx.integerValue("SearchObjectResponse.Data.BodyList["+ i +"].RightBottomY"));
			bodyListItem.setScore(_ctx.floatValue("SearchObjectResponse.Data.BodyList["+ i +"].Score"));
			bodyListItem.setShotTime(_ctx.stringValue("SearchObjectResponse.Data.BodyList["+ i +"].ShotTime"));
			bodyListItem.setSourceImageUrl(_ctx.stringValue("SearchObjectResponse.Data.BodyList["+ i +"].SourceImageUrl"));
			bodyListItem.setTargetImageUrl(_ctx.stringValue("SearchObjectResponse.Data.BodyList["+ i +"].TargetImageUrl"));

			bodyList.add(bodyListItem);
		}
		data.setBodyList(bodyList);

		List<FaceListItem> faceList = new ArrayList<FaceListItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchObjectResponse.Data.FaceList.Length"); i++) {
			FaceListItem faceListItem = new FaceListItem();
			faceListItem.setDeviceID(_ctx.stringValue("SearchObjectResponse.Data.FaceList["+ i +"].DeviceID"));
			faceListItem.setObjectType(_ctx.stringValue("SearchObjectResponse.Data.FaceList["+ i +"].ObjectType"));
			faceListItem.setLeftTopX(_ctx.integerValue("SearchObjectResponse.Data.FaceList["+ i +"].LeftTopX"));
			faceListItem.setLeftTopY(_ctx.integerValue("SearchObjectResponse.Data.FaceList["+ i +"].LeftTopY"));
			faceListItem.setRightBottomX(_ctx.integerValue("SearchObjectResponse.Data.FaceList["+ i +"].RightBottomX"));
			faceListItem.setRightBottomY(_ctx.integerValue("SearchObjectResponse.Data.FaceList["+ i +"].RightBottomY"));
			faceListItem.setScore(_ctx.floatValue("SearchObjectResponse.Data.FaceList["+ i +"].Score"));
			faceListItem.setShotTime(_ctx.stringValue("SearchObjectResponse.Data.FaceList["+ i +"].ShotTime"));
			faceListItem.setSourceImageUrl(_ctx.stringValue("SearchObjectResponse.Data.FaceList["+ i +"].SourceImageUrl"));
			faceListItem.setTargetImageUrl(_ctx.stringValue("SearchObjectResponse.Data.FaceList["+ i +"].TargetImageUrl"));

			faceList.add(faceListItem);
		}
		data.setFaceList(faceList);

		List<MotorListItem> motorList = new ArrayList<MotorListItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchObjectResponse.Data.MotorList.Length"); i++) {
			MotorListItem motorListItem = new MotorListItem();
			motorListItem.setDeviceID(_ctx.stringValue("SearchObjectResponse.Data.MotorList["+ i +"].DeviceID"));
			motorListItem.setObjectType(_ctx.stringValue("SearchObjectResponse.Data.MotorList["+ i +"].ObjectType"));
			motorListItem.setLeftTopX(_ctx.integerValue("SearchObjectResponse.Data.MotorList["+ i +"].LeftTopX"));
			motorListItem.setLeftTopY(_ctx.integerValue("SearchObjectResponse.Data.MotorList["+ i +"].LeftTopY"));
			motorListItem.setRightBottomX(_ctx.integerValue("SearchObjectResponse.Data.MotorList["+ i +"].RightBottomX"));
			motorListItem.setRightBottomY(_ctx.integerValue("SearchObjectResponse.Data.MotorList["+ i +"].RightBottomY"));
			motorListItem.setScore(_ctx.floatValue("SearchObjectResponse.Data.MotorList["+ i +"].Score"));
			motorListItem.setShotTime(_ctx.stringValue("SearchObjectResponse.Data.MotorList["+ i +"].ShotTime"));
			motorListItem.setSourceImageUrl(_ctx.stringValue("SearchObjectResponse.Data.MotorList["+ i +"].SourceImageUrl"));
			motorListItem.setTargetImageUrl(_ctx.stringValue("SearchObjectResponse.Data.MotorList["+ i +"].TargetImageUrl"));

			motorList.add(motorListItem);
		}
		data.setMotorList(motorList);

		List<NonMotorListItem> nonMotorList = new ArrayList<NonMotorListItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchObjectResponse.Data.NonMotorList.Length"); i++) {
			NonMotorListItem nonMotorListItem = new NonMotorListItem();
			nonMotorListItem.setDeviceID(_ctx.stringValue("SearchObjectResponse.Data.NonMotorList["+ i +"].DeviceID"));
			nonMotorListItem.setObjectType(_ctx.stringValue("SearchObjectResponse.Data.NonMotorList["+ i +"].ObjectType"));
			nonMotorListItem.setLeftTopX(_ctx.integerValue("SearchObjectResponse.Data.NonMotorList["+ i +"].LeftTopX"));
			nonMotorListItem.setLeftTopY(_ctx.integerValue("SearchObjectResponse.Data.NonMotorList["+ i +"].LeftTopY"));
			nonMotorListItem.setRightBottomX(_ctx.integerValue("SearchObjectResponse.Data.NonMotorList["+ i +"].RightBottomX"));
			nonMotorListItem.setRightBottomY(_ctx.integerValue("SearchObjectResponse.Data.NonMotorList["+ i +"].RightBottomY"));
			nonMotorListItem.setScore(_ctx.floatValue("SearchObjectResponse.Data.NonMotorList["+ i +"].Score"));
			nonMotorListItem.setShotTime(_ctx.stringValue("SearchObjectResponse.Data.NonMotorList["+ i +"].ShotTime"));
			nonMotorListItem.setSourceImageUrl(_ctx.stringValue("SearchObjectResponse.Data.NonMotorList["+ i +"].SourceImageUrl"));
			nonMotorListItem.setTargetImageUrl(_ctx.stringValue("SearchObjectResponse.Data.NonMotorList["+ i +"].TargetImageUrl"));

			nonMotorList.add(nonMotorListItem);
		}
		data.setNonMotorList(nonMotorList);
		searchObjectResponse.setData(data);
	 
	 	return searchObjectResponse;
	}
}