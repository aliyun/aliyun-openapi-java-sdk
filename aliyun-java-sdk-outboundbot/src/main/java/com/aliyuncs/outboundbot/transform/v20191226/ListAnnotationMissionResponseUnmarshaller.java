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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.ListAnnotationMissionResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListAnnotationMissionResponse.Data;
import com.aliyuncs.outboundbot.model.v20191226.ListAnnotationMissionResponse.Data.AnnotationMissionListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAnnotationMissionResponseUnmarshaller {

	public static ListAnnotationMissionResponse unmarshall(ListAnnotationMissionResponse listAnnotationMissionResponse, UnmarshallerContext _ctx) {
		
		listAnnotationMissionResponse.setRequestId(_ctx.stringValue("ListAnnotationMissionResponse.RequestId"));
		listAnnotationMissionResponse.setSuccess(_ctx.booleanValue("ListAnnotationMissionResponse.Success"));
		listAnnotationMissionResponse.setCode(_ctx.stringValue("ListAnnotationMissionResponse.Code"));
		listAnnotationMissionResponse.setMessage(_ctx.stringValue("ListAnnotationMissionResponse.Message"));
		listAnnotationMissionResponse.setHttpStatusCode(_ctx.integerValue("ListAnnotationMissionResponse.HttpStatusCode"));

		Data data = new Data();
		data.setPageIndex(_ctx.longValue("ListAnnotationMissionResponse.Data.PageIndex"));
		data.setPageSize(_ctx.longValue("ListAnnotationMissionResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("ListAnnotationMissionResponse.Data.TotalCount"));
		data.setTotalPageCount(_ctx.longValue("ListAnnotationMissionResponse.Data.TotalPageCount"));
		data.setSuccess(_ctx.booleanValue("ListAnnotationMissionResponse.Data.Success"));
		data.setMessage(_ctx.stringValue("ListAnnotationMissionResponse.Data.Message"));

		List<AnnotationMissionListItem> annotationMissionList = new ArrayList<AnnotationMissionListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAnnotationMissionResponse.Data.AnnotationMissionList.Length"); i++) {
			AnnotationMissionListItem annotationMissionListItem = new AnnotationMissionListItem();
			annotationMissionListItem.setAnnotationMissionDataSourceType(_ctx.integerValue("ListAnnotationMissionResponse.Data.AnnotationMissionList["+ i +"].AnnotationMissionDataSourceType"));
			annotationMissionListItem.setInstanceId(_ctx.stringValue("ListAnnotationMissionResponse.Data.AnnotationMissionList["+ i +"].InstanceId"));
			annotationMissionListItem.setAnnotationMissionId(_ctx.stringValue("ListAnnotationMissionResponse.Data.AnnotationMissionList["+ i +"].AnnotationMissionId"));
			annotationMissionListItem.setAnnotationMissionName(_ctx.stringValue("ListAnnotationMissionResponse.Data.AnnotationMissionList["+ i +"].AnnotationMissionName"));
			annotationMissionListItem.setAnnotationStatus(_ctx.integerValue("ListAnnotationMissionResponse.Data.AnnotationMissionList["+ i +"].AnnotationStatus"));
			annotationMissionListItem.setCreateTime(_ctx.longValue("ListAnnotationMissionResponse.Data.AnnotationMissionList["+ i +"].CreateTime"));
			annotationMissionListItem.setSessionTotalCount(_ctx.integerValue("ListAnnotationMissionResponse.Data.AnnotationMissionList["+ i +"].SessionTotalCount"));
			annotationMissionListItem.setSessionFinishCount(_ctx.integerValue("ListAnnotationMissionResponse.Data.AnnotationMissionList["+ i +"].SessionFinishCount"));
			annotationMissionListItem.setFinishTime(_ctx.longValue("ListAnnotationMissionResponse.Data.AnnotationMissionList["+ i +"].FinishTime"));
			annotationMissionListItem.setExcludeOtherMissionSession(_ctx.booleanValue("ListAnnotationMissionResponse.Data.AnnotationMissionList["+ i +"].ExcludeOtherMissionSession"));
			annotationMissionListItem.setConversationTimeStartFilter(_ctx.longValue("ListAnnotationMissionResponse.Data.AnnotationMissionList["+ i +"].ConversationTimeStartFilter"));
			annotationMissionListItem.setConversationTimeEndFilter(_ctx.longValue("ListAnnotationMissionResponse.Data.AnnotationMissionList["+ i +"].ConversationTimeEndFilter"));
			annotationMissionListItem.setSamplingType(_ctx.integerValue("ListAnnotationMissionResponse.Data.AnnotationMissionList["+ i +"].SamplingType"));
			annotationMissionListItem.setSamplingRate(_ctx.integerValue("ListAnnotationMissionResponse.Data.AnnotationMissionList["+ i +"].SamplingRate"));
			annotationMissionListItem.setSamplingCount(_ctx.integerValue("ListAnnotationMissionResponse.Data.AnnotationMissionList["+ i +"].SamplingCount"));
			annotationMissionListItem.setSamplingDescription(_ctx.stringValue("ListAnnotationMissionResponse.Data.AnnotationMissionList["+ i +"].SamplingDescription"));

			List<Integer> sessionEndReasonFilterList = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("ListAnnotationMissionResponse.Data.AnnotationMissionList["+ i +"].SessionEndReasonFilterList.Length"); j++) {
				sessionEndReasonFilterList.add(_ctx.integerValue("ListAnnotationMissionResponse.Data.AnnotationMissionList["+ i +"].SessionEndReasonFilterList["+ j +"]"));
			}
			annotationMissionListItem.setSessionEndReasonFilterList(sessionEndReasonFilterList);

			List<Integer> annotationMissionDebugDataSourceList = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("ListAnnotationMissionResponse.Data.AnnotationMissionList["+ i +"].AnnotationMissionDebugDataSourceList.Length"); j++) {
				annotationMissionDebugDataSourceList.add(_ctx.integerValue("ListAnnotationMissionResponse.Data.AnnotationMissionList["+ i +"].AnnotationMissionDebugDataSourceList["+ j +"]"));
			}
			annotationMissionListItem.setAnnotationMissionDebugDataSourceList(annotationMissionDebugDataSourceList);

			annotationMissionList.add(annotationMissionListItem);
		}
		data.setAnnotationMissionList(annotationMissionList);
		listAnnotationMissionResponse.setData(data);
	 
	 	return listAnnotationMissionResponse;
	}
}