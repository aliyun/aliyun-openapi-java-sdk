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

package com.aliyuncs.multimediaai.transform.v20190810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.multimediaai.model.v20190810.ListFacePersonsResponse;
import com.aliyuncs.multimediaai.model.v20190810.ListFacePersonsResponse.FacePerson;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFacePersonsResponseUnmarshaller {

	public static ListFacePersonsResponse unmarshall(ListFacePersonsResponse listFacePersonsResponse, UnmarshallerContext _ctx) {
		
		listFacePersonsResponse.setRequestId(_ctx.stringValue("ListFacePersonsResponse.RequestId"));
		listFacePersonsResponse.setPageNumber(_ctx.integerValue("ListFacePersonsResponse.PageNumber"));
		listFacePersonsResponse.setPageSize(_ctx.integerValue("ListFacePersonsResponse.PageSize"));
		listFacePersonsResponse.setTotalCount(_ctx.longValue("ListFacePersonsResponse.TotalCount"));

		List<FacePerson> facePersons = new ArrayList<FacePerson>();
		for (int i = 0; i < _ctx.lengthValue("ListFacePersonsResponse.FacePersons.Length"); i++) {
			FacePerson facePerson = new FacePerson();
			facePerson.setFacePersonId(_ctx.longValue("ListFacePersonsResponse.FacePersons["+ i +"].FacePersonId"));
			facePerson.setFacePersonName(_ctx.stringValue("ListFacePersonsResponse.FacePersons["+ i +"].FacePersonName"));
			facePerson.setImageUrl(_ctx.stringValue("ListFacePersonsResponse.FacePersons["+ i +"].ImageUrl"));
			facePerson.setImageCount(_ctx.longValue("ListFacePersonsResponse.FacePersons["+ i +"].ImageCount"));

			facePersons.add(facePerson);
		}
		listFacePersonsResponse.setFacePersons(facePersons);
	 
	 	return listFacePersonsResponse;
	}
}