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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.GetTestcaseListResponse;
import com.aliyuncs.devops.model.v20210625.GetTestcaseListResponse.Workitem;
import com.aliyuncs.devops.model.v20210625.GetTestcaseListResponse.Workitem.AssignedTo;
import com.aliyuncs.devops.model.v20210625.GetTestcaseListResponse.Workitem.CustomFieldsItem;
import com.aliyuncs.devops.model.v20210625.GetTestcaseListResponse.Workitem.Space;
import com.aliyuncs.devops.model.v20210625.GetTestcaseListResponse.Workitem.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTestcaseListResponseUnmarshaller {

	public static GetTestcaseListResponse unmarshall(GetTestcaseListResponse getTestcaseListResponse, UnmarshallerContext _ctx) {
		
		getTestcaseListResponse.setTotalCount(_ctx.longValue("GetTestcaseListResponse.totalCount"));
		getTestcaseListResponse.setNextToken(_ctx.stringValue("GetTestcaseListResponse.nextToken"));
		getTestcaseListResponse.setMaxResults(_ctx.longValue("GetTestcaseListResponse.maxResults"));
		getTestcaseListResponse.setRequestId(_ctx.stringValue("GetTestcaseListResponse.requestId"));
		getTestcaseListResponse.setErrorMsg(_ctx.stringValue("GetTestcaseListResponse.errorMsg"));
		getTestcaseListResponse.setErrorCode(_ctx.stringValue("GetTestcaseListResponse.errorCode"));
		getTestcaseListResponse.setSuccess(_ctx.booleanValue("GetTestcaseListResponse.success"));

		List<Workitem> testcase = new ArrayList<Workitem>();
		for (int i = 0; i < _ctx.lengthValue("GetTestcaseListResponse.testcase.Length"); i++) {
			Workitem workitem = new Workitem();
			workitem.setIdentifier(_ctx.stringValue("GetTestcaseListResponse.testcase["+ i +"].identifier"));
			workitem.setSubject(_ctx.stringValue("GetTestcaseListResponse.testcase["+ i +"].subject"));
			workitem.setCategoryIdentifier(_ctx.stringValue("GetTestcaseListResponse.testcase["+ i +"].categoryIdentifier"));
			workitem.setGmtCreate(_ctx.longValue("GetTestcaseListResponse.testcase["+ i +"].gmtCreate"));

			AssignedTo assignedTo = new AssignedTo();
			assignedTo.setAssignedToIdenttifier(_ctx.stringValue("GetTestcaseListResponse.testcase["+ i +"].assignedTo.assignedToIdenttifier"));
			assignedTo.setName(_ctx.stringValue("GetTestcaseListResponse.testcase["+ i +"].assignedTo.name"));
			workitem.setAssignedTo(assignedTo);

			Space space = new Space();
			space.setSpaceIdentifier(_ctx.stringValue("GetTestcaseListResponse.testcase["+ i +"].space.spaceIdentifier"));
			space.setType(_ctx.stringValue("GetTestcaseListResponse.testcase["+ i +"].space.type"));
			workitem.setSpace(space);

			List<CustomFieldsItem> customFields = new ArrayList<CustomFieldsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetTestcaseListResponse.testcase["+ i +"].customFields.Length"); j++) {
				CustomFieldsItem customFieldsItem = new CustomFieldsItem();
				customFieldsItem.setFieldIdentifier(_ctx.stringValue("GetTestcaseListResponse.testcase["+ i +"].customFields["+ j +"].fieldIdentifier"));
				customFieldsItem.setValue(_ctx.stringValue("GetTestcaseListResponse.testcase["+ i +"].customFields["+ j +"].value"));
				customFieldsItem.setFieldFormat(_ctx.stringValue("GetTestcaseListResponse.testcase["+ i +"].customFields["+ j +"].fieldFormat"));
				customFieldsItem.setFieldClassName(_ctx.stringValue("GetTestcaseListResponse.testcase["+ i +"].customFields["+ j +"].fieldClassName"));

				customFields.add(customFieldsItem);
			}
			workitem.setCustomFields(customFields);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("GetTestcaseListResponse.testcase["+ i +"].tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagIdentifier(_ctx.stringValue("GetTestcaseListResponse.testcase["+ i +"].tags["+ j +"].tagIdentifier"));
				tag.setName(_ctx.stringValue("GetTestcaseListResponse.testcase["+ i +"].tags["+ j +"].name"));

				tags.add(tag);
			}
			workitem.setTags(tags);

			testcase.add(workitem);
		}
		getTestcaseListResponse.setTestcase(testcase);
	 
	 	return getTestcaseListResponse;
	}
}