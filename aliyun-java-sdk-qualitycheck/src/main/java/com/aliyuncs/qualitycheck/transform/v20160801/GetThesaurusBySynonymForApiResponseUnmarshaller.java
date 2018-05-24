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

package com.aliyuncs.qualitycheck.transform.v20160801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20160801.GetThesaurusBySynonymForApiResponse;
import com.aliyuncs.qualitycheck.model.v20160801.GetThesaurusBySynonymForApiResponse.ThesaurusPo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetThesaurusBySynonymForApiResponseUnmarshaller {

	public static GetThesaurusBySynonymForApiResponse unmarshall(GetThesaurusBySynonymForApiResponse getThesaurusBySynonymForApiResponse, UnmarshallerContext context) {
		
		getThesaurusBySynonymForApiResponse.setRequestId(context.stringValue("GetThesaurusBySynonymForApiResponse.requestId"));
		getThesaurusBySynonymForApiResponse.setSuccess(context.booleanValue("GetThesaurusBySynonymForApiResponse.success"));
		getThesaurusBySynonymForApiResponse.setCode(context.stringValue("GetThesaurusBySynonymForApiResponse.code"));
		getThesaurusBySynonymForApiResponse.setMessage(context.stringValue("GetThesaurusBySynonymForApiResponse.message"));

		List<ThesaurusPo> data = new ArrayList<ThesaurusPo>();
		for (int i = 0; i < context.lengthValue("GetThesaurusBySynonymForApiResponse.data.Length"); i++) {
			ThesaurusPo thesaurusPo = new ThesaurusPo();
			thesaurusPo.setId(context.longValue("GetThesaurusBySynonymForApiResponse.data["+ i +"].id"));
			thesaurusPo.setBusiness(context.stringValue("GetThesaurusBySynonymForApiResponse.data["+ i +"].business"));

			List<String> synonymList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("GetThesaurusBySynonymForApiResponse.data["+ i +"].synonymList.Length"); j++) {
				synonymList.add(context.stringValue("GetThesaurusBySynonymForApiResponse.data["+ i +"].synonymList["+ j +"]"));
			}
			thesaurusPo.setSynonymList(synonymList);

			data.add(thesaurusPo);
		}
		getThesaurusBySynonymForApiResponse.setData(data);
	 
	 	return getThesaurusBySynonymForApiResponse;
	}
}