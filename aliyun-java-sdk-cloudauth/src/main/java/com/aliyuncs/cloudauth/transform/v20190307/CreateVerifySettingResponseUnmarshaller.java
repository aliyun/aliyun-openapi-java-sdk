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

import com.aliyuncs.cloudauth.model.v20190307.CreateVerifySettingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateVerifySettingResponseUnmarshaller {

	public static CreateVerifySettingResponse unmarshall(CreateVerifySettingResponse createVerifySettingResponse, UnmarshallerContext _ctx) {
		
		createVerifySettingResponse.setRequestId(_ctx.stringValue("CreateVerifySettingResponse.RequestId"));
		createVerifySettingResponse.setBizType(_ctx.stringValue("CreateVerifySettingResponse.BizType"));
		createVerifySettingResponse.setBizName(_ctx.stringValue("CreateVerifySettingResponse.BizName"));
		createVerifySettingResponse.setSolution(_ctx.stringValue("CreateVerifySettingResponse.Solution"));

		List<String> stepList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateVerifySettingResponse.StepList.Length"); i++) {
			stepList.add(_ctx.stringValue("CreateVerifySettingResponse.StepList["+ i +"]"));
		}
		createVerifySettingResponse.setStepList(stepList);
	 
	 	return createVerifySettingResponse;
	}
}