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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.SaveClassificationConditionsResponse;
import com.aliyuncs.trademark.model.v20180724.SaveClassificationConditionsResponse.InvalidListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveClassificationConditionsResponseUnmarshaller {

	public static SaveClassificationConditionsResponse unmarshall(SaveClassificationConditionsResponse saveClassificationConditionsResponse, UnmarshallerContext _ctx) {
		
		saveClassificationConditionsResponse.setRequestId(_ctx.stringValue("SaveClassificationConditionsResponse.RequestId"));
		saveClassificationConditionsResponse.setErrorMsg(_ctx.stringValue("SaveClassificationConditionsResponse.ErrorMsg"));
		saveClassificationConditionsResponse.setTagName(_ctx.stringValue("SaveClassificationConditionsResponse.TagName"));
		saveClassificationConditionsResponse.setSuccess(_ctx.booleanValue("SaveClassificationConditionsResponse.Success"));

		List<InvalidListItem> invalidList = new ArrayList<InvalidListItem>();
		for (int i = 0; i < _ctx.lengthValue("SaveClassificationConditionsResponse.InvalidList.Length"); i++) {
			InvalidListItem invalidListItem = new InvalidListItem();
			invalidListItem.setParentCode(_ctx.stringValue("SaveClassificationConditionsResponse.InvalidList["+ i +"].ParentCode"));
			invalidListItem.setOfficialCode(_ctx.stringValue("SaveClassificationConditionsResponse.InvalidList["+ i +"].OfficialCode"));
			invalidListItem.setClassificationName(_ctx.stringValue("SaveClassificationConditionsResponse.InvalidList["+ i +"].ClassificationName"));
			invalidListItem.setClassificationCode(_ctx.stringValue("SaveClassificationConditionsResponse.InvalidList["+ i +"].ClassificationCode"));

			invalidList.add(invalidListItem);
		}
		saveClassificationConditionsResponse.setInvalidList(invalidList);
	 
	 	return saveClassificationConditionsResponse;
	}
}