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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.AddProfileResponse;
import com.aliyuncs.vcs.model.v20200515.AddProfileResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddProfileResponseUnmarshaller {

	public static AddProfileResponse unmarshall(AddProfileResponse addProfileResponse, UnmarshallerContext _ctx) {
		
		addProfileResponse.setRequestId(_ctx.stringValue("AddProfileResponse.RequestId"));
		addProfileResponse.setMessage(_ctx.stringValue("AddProfileResponse.Message"));
		addProfileResponse.setCode(_ctx.stringValue("AddProfileResponse.Code"));

		Data data = new Data();
		data.setCatalogId(_ctx.integerValue("AddProfileResponse.Data.CatalogId"));
		data.setProfileId(_ctx.integerValue("AddProfileResponse.Data.ProfileId"));
		data.setIsvSubId(_ctx.stringValue("AddProfileResponse.Data.IsvSubId"));
		data.setGender(_ctx.stringValue("AddProfileResponse.Data.Gender"));
		data.setBizId(_ctx.stringValue("AddProfileResponse.Data.BizId"));
		data.setIdNumber(_ctx.stringValue("AddProfileResponse.Data.IdNumber"));
		data.setSceneType(_ctx.stringValue("AddProfileResponse.Data.SceneType"));
		data.setPhoneNo(_ctx.stringValue("AddProfileResponse.Data.PhoneNo"));
		data.setFaceUrl(_ctx.stringValue("AddProfileResponse.Data.FaceUrl"));
		data.setLiveAddress(_ctx.stringValue("AddProfileResponse.Data.LiveAddress"));
		data.setName(_ctx.stringValue("AddProfileResponse.Data.Name"));
		data.setPlateNo(_ctx.stringValue("AddProfileResponse.Data.PlateNo"));
		addProfileResponse.setData(data);
	 
	 	return addProfileResponse;
	}
}