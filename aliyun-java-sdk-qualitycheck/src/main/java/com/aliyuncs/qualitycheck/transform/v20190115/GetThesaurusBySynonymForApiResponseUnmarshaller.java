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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.GetThesaurusBySynonymForApiResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetThesaurusBySynonymForApiResponse.ThesaurusPo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetThesaurusBySynonymForApiResponseUnmarshaller {

	public static GetThesaurusBySynonymForApiResponse unmarshall(GetThesaurusBySynonymForApiResponse getThesaurusBySynonymForApiResponse, UnmarshallerContext context) {
		
		getThesaurusBySynonymForApiResponse.setRequestId(context.stringValue("GetThesaurusBySynonymForApiResponse.RequestId"));
		getThesaurusBySynonymForApiResponse.setSuccess(context.booleanValue("GetThesaurusBySynonymForApiResponse.Success"));
		getThesaurusBySynonymForApiResponse.setCode(context.stringValue("GetThesaurusBySynonymForApiResponse.Code"));
		getThesaurusBySynonymForApiResponse.setMessage(context.stringValue("GetThesaurusBySynonymForApiResponse.Message"));

		List<ThesaurusPo> data = new ArrayList<ThesaurusPo>();
		for (int i = 0; i < context.lengthValue("GetThesaurusBySynonymForApiResponse.Data.Length"); i++) {
			ThesaurusPo thesaurusPo = new ThesaurusPo();
			thesaurusPo.setId(context.longValue("GetThesaurusBySynonymForApiResponse.Data["+ i +"].Id"));
			thesaurusPo.setBusiness(context.stringValue("GetThesaurusBySynonymForApiResponse.Data["+ i +"].Business"));

			List<String> synonymList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("GetThesaurusBySynonymForApiResponse.Data["+ i +"].SynonymList.Length"); j++) {
				synonymList.add(context.stringValue("GetThesaurusBySynonymForApiResponse.Data["+ i +"].SynonymList["+ j +"]"));
			}
			thesaurusPo.setSynonymList(synonymList);

			data.add(thesaurusPo);
		}
		getThesaurusBySynonymForApiResponse.setData(data);
	 
	 	return getThesaurusBySynonymForApiResponse;
	}
}