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
import com.aliyuncs.green.model.v20170823.DescribeBizTypeSettingResponse.Ad;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeSettingResponse.Antispam;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeSettingResponse.Porn;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeSettingResponse.Terrorism;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBizTypeSettingResponseUnmarshaller {

	public static DescribeBizTypeSettingResponse unmarshall(DescribeBizTypeSettingResponse describeBizTypeSettingResponse, UnmarshallerContext _ctx) {
		
		describeBizTypeSettingResponse.setRequestId(_ctx.stringValue("DescribeBizTypeSettingResponse.RequestId"));

		Terrorism terrorism = new Terrorism();

		List<String> categories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeSettingResponse.Terrorism.Categories.Length"); i++) {
			categories.add(_ctx.stringValue("DescribeBizTypeSettingResponse.Terrorism.Categories["+ i +"]"));
		}
		terrorism.setCategories(categories);
		describeBizTypeSettingResponse.setTerrorism(terrorism);

		Porn porn = new Porn();

		List<String> categories1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeSettingResponse.Porn.Categories.Length"); i++) {
			categories1.add(_ctx.stringValue("DescribeBizTypeSettingResponse.Porn.Categories["+ i +"]"));
		}
		porn.setCategories1(categories1);
		describeBizTypeSettingResponse.setPorn(porn);

		Antispam antispam = new Antispam();

		List<String> categories2 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeSettingResponse.Antispam.Categories.Length"); i++) {
			categories2.add(_ctx.stringValue("DescribeBizTypeSettingResponse.Antispam.Categories["+ i +"]"));
		}
		antispam.setCategories2(categories2);
		describeBizTypeSettingResponse.setAntispam(antispam);

		Ad ad = new Ad();

		List<String> categories3 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeSettingResponse.Ad.Categories.Length"); i++) {
			categories3.add(_ctx.stringValue("DescribeBizTypeSettingResponse.Ad.Categories["+ i +"]"));
		}
		ad.setCategories3(categories3);
		describeBizTypeSettingResponse.setAd(ad);
	 
	 	return describeBizTypeSettingResponse;
	}
}