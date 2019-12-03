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

import com.aliyuncs.multimediaai.model.v20190810.ListFaceGroupsResponse;
import com.aliyuncs.multimediaai.model.v20190810.ListFaceGroupsResponse.FaceGroup;
import com.aliyuncs.multimediaai.model.v20190810.ListFaceGroupsResponse.FaceGroup.TemplatesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFaceGroupsResponseUnmarshaller {

	public static ListFaceGroupsResponse unmarshall(ListFaceGroupsResponse listFaceGroupsResponse, UnmarshallerContext _ctx) {
		
		listFaceGroupsResponse.setRequestId(_ctx.stringValue("ListFaceGroupsResponse.RequestId"));
		listFaceGroupsResponse.setPageNumber(_ctx.integerValue("ListFaceGroupsResponse.PageNumber"));
		listFaceGroupsResponse.setPageSize(_ctx.integerValue("ListFaceGroupsResponse.PageSize"));
		listFaceGroupsResponse.setTotalCount(_ctx.longValue("ListFaceGroupsResponse.TotalCount"));

		List<FaceGroup> faceGroups = new ArrayList<FaceGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListFaceGroupsResponse.FaceGroups.Length"); i++) {
			FaceGroup faceGroup = new FaceGroup();
			faceGroup.setFaceGroupId(_ctx.longValue("ListFaceGroupsResponse.FaceGroups["+ i +"].FaceGroupId"));
			faceGroup.setFaceGroupName(_ctx.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].FaceGroupName"));
			faceGroup.setDescription(_ctx.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].Description"));
			faceGroup.setPersonCount(_ctx.longValue("ListFaceGroupsResponse.FaceGroups["+ i +"].PersonCount"));
			faceGroup.setImageCount(_ctx.longValue("ListFaceGroupsResponse.FaceGroups["+ i +"].ImageCount"));

			List<TemplatesItem> templates = new ArrayList<TemplatesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListFaceGroupsResponse.FaceGroups["+ i +"].Templates.Length"); j++) {
				TemplatesItem templatesItem = new TemplatesItem();
				templatesItem.setId(_ctx.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].Templates["+ j +"].Id"));
				templatesItem.setName(_ctx.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].Templates["+ j +"].Name"));

				templates.add(templatesItem);
			}
			faceGroup.setTemplates(templates);

			faceGroups.add(faceGroup);
		}
		listFaceGroupsResponse.setFaceGroups(faceGroups);
	 
	 	return listFaceGroupsResponse;
	}
}