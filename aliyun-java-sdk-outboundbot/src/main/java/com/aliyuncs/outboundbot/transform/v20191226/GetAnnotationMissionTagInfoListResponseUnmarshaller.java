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

import com.aliyuncs.outboundbot.model.v20191226.GetAnnotationMissionTagInfoListResponse;
import com.aliyuncs.outboundbot.model.v20191226.GetAnnotationMissionTagInfoListResponse.Data;
import com.aliyuncs.outboundbot.model.v20191226.GetAnnotationMissionTagInfoListResponse.Data.AnnotationMissionTagInfoListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAnnotationMissionTagInfoListResponseUnmarshaller {

	public static GetAnnotationMissionTagInfoListResponse unmarshall(GetAnnotationMissionTagInfoListResponse getAnnotationMissionTagInfoListResponse, UnmarshallerContext _ctx) {
		
		getAnnotationMissionTagInfoListResponse.setRequestId(_ctx.stringValue("GetAnnotationMissionTagInfoListResponse.RequestId"));
		getAnnotationMissionTagInfoListResponse.setSuccess(_ctx.booleanValue("GetAnnotationMissionTagInfoListResponse.Success"));
		getAnnotationMissionTagInfoListResponse.setCode(_ctx.stringValue("GetAnnotationMissionTagInfoListResponse.Code"));
		getAnnotationMissionTagInfoListResponse.setMessage(_ctx.stringValue("GetAnnotationMissionTagInfoListResponse.Message"));
		getAnnotationMissionTagInfoListResponse.setHttpStatusCode(_ctx.integerValue("GetAnnotationMissionTagInfoListResponse.HttpStatusCode"));

		Data data = new Data();
		data.setSuccess(_ctx.booleanValue("GetAnnotationMissionTagInfoListResponse.Data.Success"));
		data.setMessage(_ctx.stringValue("GetAnnotationMissionTagInfoListResponse.Data.Message"));

		List<AnnotationMissionTagInfoListItem> annotationMissionTagInfoList = new ArrayList<AnnotationMissionTagInfoListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAnnotationMissionTagInfoListResponse.Data.AnnotationMissionTagInfoList.Length"); i++) {
			AnnotationMissionTagInfoListItem annotationMissionTagInfoListItem = new AnnotationMissionTagInfoListItem();
			annotationMissionTagInfoListItem.setAnnotationMissionTagInfoId(_ctx.stringValue("GetAnnotationMissionTagInfoListResponse.Data.AnnotationMissionTagInfoList["+ i +"].AnnotationMissionTagInfoId"));
			annotationMissionTagInfoListItem.setInstanceId(_ctx.stringValue("GetAnnotationMissionTagInfoListResponse.Data.AnnotationMissionTagInfoList["+ i +"].InstanceId"));
			annotationMissionTagInfoListItem.setTenantId(_ctx.stringValue("GetAnnotationMissionTagInfoListResponse.Data.AnnotationMissionTagInfoList["+ i +"].TenantId"));
			annotationMissionTagInfoListItem.setAnnotationMissionTagInfoName(_ctx.stringValue("GetAnnotationMissionTagInfoListResponse.Data.AnnotationMissionTagInfoList["+ i +"].AnnotationMissionTagInfoName"));
			annotationMissionTagInfoListItem.setAnnotationMissionTagInfoDescription(_ctx.stringValue("GetAnnotationMissionTagInfoListResponse.Data.AnnotationMissionTagInfoList["+ i +"].AnnotationMissionTagInfoDescription"));
			annotationMissionTagInfoListItem.setDelete(_ctx.booleanValue("GetAnnotationMissionTagInfoListResponse.Data.AnnotationMissionTagInfoList["+ i +"].Delete"));

			annotationMissionTagInfoList.add(annotationMissionTagInfoListItem);
		}
		data.setAnnotationMissionTagInfoList(annotationMissionTagInfoList);
		getAnnotationMissionTagInfoListResponse.setData(data);
	 
	 	return getAnnotationMissionTagInfoListResponse;
	}
}