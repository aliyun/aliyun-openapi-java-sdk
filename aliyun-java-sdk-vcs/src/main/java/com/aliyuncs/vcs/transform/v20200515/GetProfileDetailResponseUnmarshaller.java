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

import com.aliyuncs.vcs.model.v20200515.GetProfileDetailResponse;
import com.aliyuncs.vcs.model.v20200515.GetProfileDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProfileDetailResponseUnmarshaller {

	public static GetProfileDetailResponse unmarshall(GetProfileDetailResponse getProfileDetailResponse, UnmarshallerContext _ctx) {
		
		getProfileDetailResponse.setRequestId(_ctx.stringValue("GetProfileDetailResponse.RequestId"));
		getProfileDetailResponse.setMessage(_ctx.stringValue("GetProfileDetailResponse.Message"));
		getProfileDetailResponse.setCode(_ctx.stringValue("GetProfileDetailResponse.Code"));

		Data data = new Data();
		data.setCatalogId(_ctx.integerValue("GetProfileDetailResponse.Data.CatalogId"));
		data.setProfileId(_ctx.integerValue("GetProfileDetailResponse.Data.ProfileId"));
		data.setIsvSubId(_ctx.stringValue("GetProfileDetailResponse.Data.IsvSubId"));
		data.setGender(_ctx.stringValue("GetProfileDetailResponse.Data.Gender"));
		data.setBizId(_ctx.stringValue("GetProfileDetailResponse.Data.BizId"));
		data.setIdNumber(_ctx.stringValue("GetProfileDetailResponse.Data.IdNumber"));
		data.setSceneType(_ctx.stringValue("GetProfileDetailResponse.Data.SceneType"));
		data.setPhoneNo(_ctx.stringValue("GetProfileDetailResponse.Data.PhoneNo"));
		data.setFaceUrl(_ctx.stringValue("GetProfileDetailResponse.Data.FaceUrl"));
		data.setLiveAddress(_ctx.stringValue("GetProfileDetailResponse.Data.LiveAddress"));
		data.setName(_ctx.stringValue("GetProfileDetailResponse.Data.Name"));
		data.setPersonId(_ctx.stringValue("GetProfileDetailResponse.Data.PersonId"));
		data.setPlateNo(_ctx.stringValue("GetProfileDetailResponse.Data.PlateNo"));
		getProfileDetailResponse.setData(data);
	 
	 	return getProfileDetailResponse;
	}
}