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

package com.aliyuncs.cusanalytic_sc_online.transform.v20190524;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cusanalytic_sc_online.model.v20190524.SearchPersonByImgResponse;
import com.aliyuncs.cusanalytic_sc_online.model.v20190524.SearchPersonByImgResponse.PersonSearchResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchPersonByImgResponseUnmarshaller {

	public static SearchPersonByImgResponse unmarshall(SearchPersonByImgResponse searchPersonByImgResponse, UnmarshallerContext _ctx) {
		
		searchPersonByImgResponse.setSuccess(_ctx.booleanValue("SearchPersonByImgResponse.Success"));
		searchPersonByImgResponse.setMsg(_ctx.stringValue("SearchPersonByImgResponse.Msg"));

		List<PersonSearchResultItem> personSearchResultItems = new ArrayList<PersonSearchResultItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchPersonByImgResponse.PersonSearchResultItems.Length"); i++) {
			PersonSearchResultItem personSearchResultItem = new PersonSearchResultItem();
			personSearchResultItem.setFaceId(_ctx.stringValue("SearchPersonByImgResponse.PersonSearchResultItems["+ i +"].FaceId"));
			personSearchResultItem.setUkId(_ctx.stringValue("SearchPersonByImgResponse.PersonSearchResultItems["+ i +"].UkId"));
			personSearchResultItem.setScore(_ctx.floatValue("SearchPersonByImgResponse.PersonSearchResultItems["+ i +"].Score"));

			personSearchResultItems.add(personSearchResultItem);
		}
		searchPersonByImgResponse.setPersonSearchResultItems(personSearchResultItems);
	 
	 	return searchPersonByImgResponse;
	}
}