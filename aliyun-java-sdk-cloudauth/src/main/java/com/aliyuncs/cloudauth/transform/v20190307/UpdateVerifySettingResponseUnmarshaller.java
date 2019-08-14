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

package com.aliyuncs.cloudauth.transform.v20190307;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudauth.model.v20190307.UpdateVerifySettingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateVerifySettingResponseUnmarshaller {

	public static UpdateVerifySettingResponse unmarshall(UpdateVerifySettingResponse updateVerifySettingResponse, UnmarshallerContext _ctx) {
		
		updateVerifySettingResponse.setRequestId(_ctx.stringValue("UpdateVerifySettingResponse.RequestId"));
		updateVerifySettingResponse.setBizType(_ctx.stringValue("UpdateVerifySettingResponse.BizType"));
		updateVerifySettingResponse.setBizName(_ctx.stringValue("UpdateVerifySettingResponse.BizName"));
		updateVerifySettingResponse.setSolution(_ctx.stringValue("UpdateVerifySettingResponse.Solution"));

		List<String> stepList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateVerifySettingResponse.StepList.Length"); i++) {
			stepList.add(_ctx.stringValue("UpdateVerifySettingResponse.StepList["+ i +"]"));
		}
		updateVerifySettingResponse.setStepList(stepList);
	 
	 	return updateVerifySettingResponse;
	}
}