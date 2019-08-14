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

import com.aliyuncs.cloudauth.model.v20190307.DescribeVerifySettingResponse;
import com.aliyuncs.cloudauth.model.v20190307.DescribeVerifySettingResponse.VerifySetting;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVerifySettingResponseUnmarshaller {

	public static DescribeVerifySettingResponse unmarshall(DescribeVerifySettingResponse describeVerifySettingResponse, UnmarshallerContext _ctx) {
		
		describeVerifySettingResponse.setRequestId(_ctx.stringValue("DescribeVerifySettingResponse.RequestId"));

		List<VerifySetting> verifySettingList = new ArrayList<VerifySetting>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVerifySettingResponse.VerifySettingList.Length"); i++) {
			VerifySetting verifySetting = new VerifySetting();
			verifySetting.setBizType(_ctx.stringValue("DescribeVerifySettingResponse.VerifySettingList["+ i +"].BizType"));
			verifySetting.setBizName(_ctx.stringValue("DescribeVerifySettingResponse.VerifySettingList["+ i +"].BizName"));
			verifySetting.setSolution(_ctx.stringValue("DescribeVerifySettingResponse.VerifySettingList["+ i +"].Solution"));

			List<String> stepList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVerifySettingResponse.VerifySettingList["+ i +"].StepList.Length"); j++) {
				stepList.add(_ctx.stringValue("DescribeVerifySettingResponse.VerifySettingList["+ i +"].StepList["+ j +"]"));
			}
			verifySetting.setStepList(stepList);

			verifySettingList.add(verifySetting);
		}
		describeVerifySettingResponse.setVerifySettingList(verifySettingList);
	 
	 	return describeVerifySettingResponse;
	}
}