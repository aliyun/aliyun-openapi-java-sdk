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

package com.aliyuncs.trademark_inner.transform.v20180801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark_inner.model.v20180801.SearchClassificationResponse;
import com.aliyuncs.trademark_inner.model.v20180801.SearchClassificationResponse.DataItem;
import com.aliyuncs.trademark_inner.model.v20180801.SearchClassificationResponse.DataItem.SecondClassificationItem;
import com.aliyuncs.trademark_inner.model.v20180801.SearchClassificationResponse.DataItem.SecondClassificationItem.ChildrenItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchClassificationResponseUnmarshaller {

	public static SearchClassificationResponse unmarshall(SearchClassificationResponse searchClassificationResponse, UnmarshallerContext context) {
		
		searchClassificationResponse.setRequestId(context.stringValue("SearchClassificationResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < context.lengthValue("SearchClassificationResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setClassificationCode(context.stringValue("SearchClassificationResponse.Data["+ i +"].ClassificationCode"));
			dataItem.setClassificationName(context.stringValue("SearchClassificationResponse.Data["+ i +"].ClassificationName"));
			dataItem.setLevel(context.integerValue("SearchClassificationResponse.Data["+ i +"].Level"));
			dataItem.setOfficialCode(context.stringValue("SearchClassificationResponse.Data["+ i +"].OfficialCode"));
			dataItem.setId(context.integerValue("SearchClassificationResponse.Data["+ i +"].Id"));

			List<SecondClassificationItem> secondClassification = new ArrayList<SecondClassificationItem>();
			for (int j = 0; j < context.lengthValue("SearchClassificationResponse.Data["+ i +"].SecondClassification.Length"); j++) {
				SecondClassificationItem secondClassificationItem = new SecondClassificationItem();
				secondClassificationItem.setClassificationCode(context.stringValue("SearchClassificationResponse.Data["+ i +"].SecondClassification["+ j +"].ClassificationCode"));
				secondClassificationItem.setClassificationName(context.stringValue("SearchClassificationResponse.Data["+ i +"].SecondClassification["+ j +"].ClassificationName"));
				secondClassificationItem.setLevel(context.integerValue("SearchClassificationResponse.Data["+ i +"].SecondClassification["+ j +"].Level"));
				secondClassificationItem.setParentCode(context.stringValue("SearchClassificationResponse.Data["+ i +"].SecondClassification["+ j +"].ParentCode"));
				secondClassificationItem.setOfficialCode(context.stringValue("SearchClassificationResponse.Data["+ i +"].SecondClassification["+ j +"].OfficialCode"));
				secondClassificationItem.setId(context.integerValue("SearchClassificationResponse.Data["+ i +"].SecondClassification["+ j +"].Id"));

				List<ChildrenItem> children = new ArrayList<ChildrenItem>();
				for (int k = 0; k < context.lengthValue("SearchClassificationResponse.Data["+ i +"].SecondClassification["+ j +"].Children.Length"); k++) {
					ChildrenItem childrenItem = new ChildrenItem();
					childrenItem.setClassificationCode(context.stringValue("SearchClassificationResponse.Data["+ i +"].SecondClassification["+ j +"].Children["+ k +"].ClassificationCode"));
					childrenItem.setClassificationName(context.stringValue("SearchClassificationResponse.Data["+ i +"].SecondClassification["+ j +"].Children["+ k +"].ClassificationName"));
					childrenItem.setLevel(context.integerValue("SearchClassificationResponse.Data["+ i +"].SecondClassification["+ j +"].Children["+ k +"].Level"));
					childrenItem.setParentCode(context.stringValue("SearchClassificationResponse.Data["+ i +"].SecondClassification["+ j +"].Children["+ k +"].ParentCode"));
					childrenItem.setOfficialCode(context.stringValue("SearchClassificationResponse.Data["+ i +"].SecondClassification["+ j +"].Children["+ k +"].OfficialCode"));
					childrenItem.setId(context.integerValue("SearchClassificationResponse.Data["+ i +"].SecondClassification["+ j +"].Children["+ k +"].Id"));

					children.add(childrenItem);
				}
				secondClassificationItem.setChildren(children);

				secondClassification.add(secondClassificationItem);
			}
			dataItem.setSecondClassification(secondClassification);

			data.add(dataItem);
		}
		searchClassificationResponse.setData(data);
	 
	 	return searchClassificationResponse;
	}
}