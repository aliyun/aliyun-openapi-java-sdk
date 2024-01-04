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

import com.aliyuncs.devops.model.v20210625.GetWorkItemInfoResponse;
import com.aliyuncs.devops.model.v20210625.GetWorkItemInfoResponse.Workitem;
import com.aliyuncs.devops.model.v20210625.GetWorkItemInfoResponse.Workitem.CustomField;
import com.aliyuncs.devops.model.v20210625.GetWorkItemInfoResponse.Workitem.CustomField.Value;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWorkItemInfoResponseUnmarshaller {

	public static GetWorkItemInfoResponse unmarshall(GetWorkItemInfoResponse getWorkItemInfoResponse, UnmarshallerContext _ctx) {
		
		getWorkItemInfoResponse.setRequestId(_ctx.stringValue("GetWorkItemInfoResponse.requestId"));
		getWorkItemInfoResponse.setErrorCode(_ctx.stringValue("GetWorkItemInfoResponse.errorCode"));
		getWorkItemInfoResponse.setErrorMessage(_ctx.stringValue("GetWorkItemInfoResponse.errorMessage"));
		getWorkItemInfoResponse.setSuccess(_ctx.booleanValue("GetWorkItemInfoResponse.success"));

		Workitem workitem = new Workitem();
		workitem.setIdentifier(_ctx.stringValue("GetWorkItemInfoResponse.workitem.identifier"));
		workitem.setSubject(_ctx.stringValue("GetWorkItemInfoResponse.workitem.subject"));
		workitem.setDocument(_ctx.stringValue("GetWorkItemInfoResponse.workitem.document"));
		workitem.setAssignedTo(_ctx.stringValue("GetWorkItemInfoResponse.workitem.assignedTo"));
		workitem.setStatus(_ctx.stringValue("GetWorkItemInfoResponse.workitem.status"));
		workitem.setStatusStageIdentifier(_ctx.stringValue("GetWorkItemInfoResponse.workitem.statusStageIdentifier"));
		workitem.setSpaceIdentifier(_ctx.stringValue("GetWorkItemInfoResponse.workitem.spaceIdentifier"));
		workitem.setSpaceName(_ctx.stringValue("GetWorkItemInfoResponse.workitem.spaceName"));
		workitem.setSpaceType(_ctx.stringValue("GetWorkItemInfoResponse.workitem.spaceType"));
		workitem.setLogicalStatus(_ctx.stringValue("GetWorkItemInfoResponse.workitem.logicalStatus"));
		workitem.setCategoryIdentifier(_ctx.stringValue("GetWorkItemInfoResponse.workitem.categoryIdentifier"));
		workitem.setParentIdentifier(_ctx.stringValue("GetWorkItemInfoResponse.workitem.parentIdentifier"));
		workitem.setWorkitemTypeIdentifier(_ctx.stringValue("GetWorkItemInfoResponse.workitem.workitemTypeIdentifier"));
		workitem.setUpdateStatusAt(_ctx.longValue("GetWorkItemInfoResponse.workitem.updateStatusAt"));
		workitem.setSerialNumber(_ctx.stringValue("GetWorkItemInfoResponse.workitem.serialNumber"));
		workitem.setGmtCreate(_ctx.longValue("GetWorkItemInfoResponse.workitem.gmtCreate"));
		workitem.setGmtModified(_ctx.longValue("GetWorkItemInfoResponse.workitem.gmtModified"));
		workitem.setCreator(_ctx.stringValue("GetWorkItemInfoResponse.workitem.creator"));
		workitem.setModifier(_ctx.stringValue("GetWorkItemInfoResponse.workitem.modifier"));
		workitem.setStatusIdentifier(_ctx.stringValue("GetWorkItemInfoResponse.workitem.statusIdentifier"));
		workitem.setFinishTime(_ctx.longValue("GetWorkItemInfoResponse.workitem.finishTime"));

		List<String> sprint = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetWorkItemInfoResponse.workitem.sprint.Length"); i++) {
			sprint.add(_ctx.stringValue("GetWorkItemInfoResponse.workitem.sprint["+ i +"]"));
		}
		workitem.setSprint(sprint);

		List<String> tag = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetWorkItemInfoResponse.workitem.tag.Length"); i++) {
			tag.add(_ctx.stringValue("GetWorkItemInfoResponse.workitem.tag["+ i +"]"));
		}
		workitem.setTag(tag);

		List<String> participant = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetWorkItemInfoResponse.workitem.participant.Length"); i++) {
			participant.add(_ctx.stringValue("GetWorkItemInfoResponse.workitem.participant["+ i +"]"));
		}
		workitem.setParticipant(participant);

		List<String> tracker = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetWorkItemInfoResponse.workitem.tracker.Length"); i++) {
			tracker.add(_ctx.stringValue("GetWorkItemInfoResponse.workitem.tracker["+ i +"]"));
		}
		workitem.setTracker(tracker);

		List<String> verifier = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetWorkItemInfoResponse.workitem.verifier.Length"); i++) {
			verifier.add(_ctx.stringValue("GetWorkItemInfoResponse.workitem.verifier["+ i +"]"));
		}
		workitem.setVerifier(verifier);

		List<CustomField> customFields = new ArrayList<CustomField>();
		for (int i = 0; i < _ctx.lengthValue("GetWorkItemInfoResponse.workitem.customFields.Length"); i++) {
			CustomField customField = new CustomField();
			customField.setFieldIdentifier(_ctx.stringValue("GetWorkItemInfoResponse.workitem.customFields["+ i +"].fieldIdentifier"));
			customField.setFieldFormat(_ctx.stringValue("GetWorkItemInfoResponse.workitem.customFields["+ i +"].fieldFormat"));
			customField.setFieldClassName(_ctx.stringValue("GetWorkItemInfoResponse.workitem.customFields["+ i +"].fieldClassName"));
			customField.setObjectValue(_ctx.stringValue("GetWorkItemInfoResponse.workitem.customFields["+ i +"].objectValue"));
			customField.setValue(_ctx.stringValue("GetWorkItemInfoResponse.workitem.customFields["+ i +"].value"));
			customField.setWorkitemIdentifier(_ctx.stringValue("GetWorkItemInfoResponse.workitem.customFields["+ i +"].workitemIdentifier"));
			customField.setPosition(_ctx.longValue("GetWorkItemInfoResponse.workitem.customFields["+ i +"].position"));
			customField.setLevel(_ctx.longValue("GetWorkItemInfoResponse.workitem.customFields["+ i +"].level"));

			List<Value> valueList = new ArrayList<Value>();
			for (int j = 0; j < _ctx.lengthValue("GetWorkItemInfoResponse.workitem.customFields["+ i +"].valueList.Length"); j++) {
				Value value = new Value();
				value.setValue(_ctx.stringValue("GetWorkItemInfoResponse.workitem.customFields["+ i +"].valueList["+ j +"].value"));
				value.setValueEn(_ctx.stringValue("GetWorkItemInfoResponse.workitem.customFields["+ i +"].valueList["+ j +"].valueEn"));
				value.setDisplayValue(_ctx.stringValue("GetWorkItemInfoResponse.workitem.customFields["+ i +"].valueList["+ j +"].displayValue"));
				value.setIdentifier(_ctx.stringValue("GetWorkItemInfoResponse.workitem.customFields["+ i +"].valueList["+ j +"].identifier"));
				value.setLevel(_ctx.longValue("GetWorkItemInfoResponse.workitem.customFields["+ i +"].valueList["+ j +"].level"));

				valueList.add(value);
			}
			customField.setValueList(valueList);

			customFields.add(customField);
		}
		workitem.setCustomFields(customFields);
		getWorkItemInfoResponse.setWorkitem(workitem);
	 
	 	return getWorkItemInfoResponse;
	}
}