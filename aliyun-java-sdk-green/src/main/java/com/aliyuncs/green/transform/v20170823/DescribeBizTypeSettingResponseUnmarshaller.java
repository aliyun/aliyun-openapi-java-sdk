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

package com.aliyuncs.green.transform.v20170823;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20170823.DescribeBizTypeSettingResponse;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeSettingResponse.Porn;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeSettingResponse.Terrorism;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBizTypeSettingResponseUnmarshaller {

	public static DescribeBizTypeSettingResponse unmarshall(DescribeBizTypeSettingResponse describeBizTypeSettingResponse, UnmarshallerContext context) {
		
		describeBizTypeSettingResponse.setRequestId(context.stringValue("DescribeBizTypeSettingResponse.RequestId"));

		Terrorism terrorism = new Terrorism();

		List<String> categories = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeBizTypeSettingResponse.Terrorism.Categories.Length"); i++) {
			categories.add(context.stringValue("DescribeBizTypeSettingResponse.Terrorism.Categories["+ i +"]"));
		}
		terrorism.setCategories(categories);
		describeBizTypeSettingResponse.setTerrorism(terrorism);

		Porn porn = new Porn();

		List<String> categories1 = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeBizTypeSettingResponse.Porn.Categories.Length"); i++) {
			categories1.add(context.stringValue("DescribeBizTypeSettingResponse.Porn.Categories["+ i +"]"));
		}
		porn.setCategories1(categories1);
		describeBizTypeSettingResponse.setPorn(porn);
	 
	 	return describeBizTypeSettingResponse;
	}
}