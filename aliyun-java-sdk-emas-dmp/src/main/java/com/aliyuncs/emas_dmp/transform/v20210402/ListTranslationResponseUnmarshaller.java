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

package com.aliyuncs.emas_dmp.transform.v20210402;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emas_dmp.model.v20210402.ListTranslationResponse;
import com.aliyuncs.emas_dmp.model.v20210402.ListTranslationResponse.Data;
import com.aliyuncs.emas_dmp.model.v20210402.ListTranslationResponse.Data.Translation;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTranslationResponseUnmarshaller {

	public static ListTranslationResponse unmarshall(ListTranslationResponse listTranslationResponse, UnmarshallerContext _ctx) {
		
		listTranslationResponse.setRequestId(_ctx.stringValue("ListTranslationResponse.RequestId"));

		Data data = new Data();

		List<Translation> translations = new ArrayList<Translation>();
		for (int i = 0; i < _ctx.lengthValue("ListTranslationResponse.Data.Translations.Length"); i++) {
			Translation translation = new Translation();
			translation.setKey(_ctx.stringValue("ListTranslationResponse.Data.Translations["+ i +"].Key"));
			translation.setName(_ctx.stringValue("ListTranslationResponse.Data.Translations["+ i +"].Name"));

			translations.add(translation);
		}
		data.setTranslations(translations);
		listTranslationResponse.setData(data);
	 
	 	return listTranslationResponse;
	}
}