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

package com.aliyuncs.trademark.transform.v20190902;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20190902.ListClassificationsResponse;
import com.aliyuncs.trademark.model.v20190902.ListClassificationsResponse.Classification;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClassificationsResponseUnmarshaller {

	public static ListClassificationsResponse unmarshall(ListClassificationsResponse listClassificationsResponse, UnmarshallerContext _ctx) {
		
		listClassificationsResponse.setRequestId(_ctx.stringValue("ListClassificationsResponse.RequestId"));
		listClassificationsResponse.setTotalCount(_ctx.integerValue("ListClassificationsResponse.TotalCount"));

		List<Classification> classifications = new ArrayList<Classification>();
		for (int i = 0; i < _ctx.lengthValue("ListClassificationsResponse.Classifications.Length"); i++) {
			Classification classification = new Classification();
			classification.setClassificationCode(_ctx.stringValue("ListClassificationsResponse.Classifications["+ i +"].ClassificationCode"));
			classification.setClassificationName(_ctx.stringValue("ListClassificationsResponse.Classifications["+ i +"].ClassificationName"));
			classification.setLevel(_ctx.integerValue("ListClassificationsResponse.Classifications["+ i +"].Level"));
			classification.setParentCode(_ctx.stringValue("ListClassificationsResponse.Classifications["+ i +"].ParentCode"));
			classification.setOfficialCode(_ctx.stringValue("ListClassificationsResponse.Classifications["+ i +"].OfficialCode"));

			classifications.add(classification);
		}
		listClassificationsResponse.setClassifications(classifications);
	 
	 	return listClassificationsResponse;
	}
}