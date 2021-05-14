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

package com.aliyuncs.facebody.transform.v20191230;

import com.aliyuncs.facebody.model.v20191230.MonitorExaminationResponse;
import com.aliyuncs.facebody.model.v20191230.MonitorExaminationResponse.Data;
import com.aliyuncs.facebody.model.v20191230.MonitorExaminationResponse.Data.FaceInfo;
import com.aliyuncs.facebody.model.v20191230.MonitorExaminationResponse.Data.FaceInfo.Pose;
import com.aliyuncs.facebody.model.v20191230.MonitorExaminationResponse.Data.PersonInfo;
import com.aliyuncs.facebody.model.v20191230.MonitorExaminationResponse.Data.PersonInfo.CellPhone;
import com.aliyuncs.facebody.model.v20191230.MonitorExaminationResponse.Data.PersonInfo.EarPhone;
import com.aliyuncs.transform.UnmarshallerContext;


public class MonitorExaminationResponseUnmarshaller {

	public static MonitorExaminationResponse unmarshall(MonitorExaminationResponse monitorExaminationResponse, UnmarshallerContext _ctx) {
		
		monitorExaminationResponse.setRequestId(_ctx.stringValue("MonitorExaminationResponse.RequestId"));
		monitorExaminationResponse.setMessage(_ctx.stringValue("MonitorExaminationResponse.Message"));
		monitorExaminationResponse.setCode(_ctx.stringValue("MonitorExaminationResponse.Code"));

		Data data = new Data();
		data.setChatScore(_ctx.floatValue("MonitorExaminationResponse.Data.ChatScore"));
		data.setThreshold(_ctx.floatValue("MonitorExaminationResponse.Data.Threshold"));

		FaceInfo faceInfo = new FaceInfo();
		faceInfo.setCompleteness(_ctx.longValue("MonitorExaminationResponse.Data.FaceInfo.Completeness"));
		faceInfo.setFaceNumber(_ctx.longValue("MonitorExaminationResponse.Data.FaceInfo.FaceNumber"));

		Pose pose = new Pose();
		pose.setPitch(_ctx.floatValue("MonitorExaminationResponse.Data.FaceInfo.Pose.Pitch"));
		pose.setRoll(_ctx.floatValue("MonitorExaminationResponse.Data.FaceInfo.Pose.Roll"));
		pose.setYaw(_ctx.floatValue("MonitorExaminationResponse.Data.FaceInfo.Pose.Yaw"));
		faceInfo.setPose(pose);
		data.setFaceInfo(faceInfo);

		PersonInfo personInfo = new PersonInfo();
		personInfo.setPersonNumber(_ctx.longValue("MonitorExaminationResponse.Data.PersonInfo.PersonNumber"));

		CellPhone cellPhone = new CellPhone();
		cellPhone.setScore(_ctx.floatValue("MonitorExaminationResponse.Data.PersonInfo.CellPhone.Score"));
		cellPhone.setThreshold(_ctx.floatValue("MonitorExaminationResponse.Data.PersonInfo.CellPhone.Threshold"));
		personInfo.setCellPhone(cellPhone);

		EarPhone earPhone = new EarPhone();
		earPhone.setScore(_ctx.floatValue("MonitorExaminationResponse.Data.PersonInfo.EarPhone.Score"));
		earPhone.setThreshold(_ctx.floatValue("MonitorExaminationResponse.Data.PersonInfo.EarPhone.Threshold"));
		personInfo.setEarPhone(earPhone);
		data.setPersonInfo(personInfo);
		monitorExaminationResponse.setData(data);
	 
	 	return monitorExaminationResponse;
	}
}