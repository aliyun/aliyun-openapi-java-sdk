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

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.ListFaceGroupsResponse;
import com.aliyuncs.imm.model.v20170906.ListFaceGroupsResponse.FaceGroupsItem;
import com.aliyuncs.imm.model.v20170906.ListFaceGroupsResponse.FaceGroupsItem.GroupCoverFace;
import com.aliyuncs.imm.model.v20170906.ListFaceGroupsResponse.FaceGroupsItem.GroupCoverFace.FaceBoundary;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFaceGroupsResponseUnmarshaller {

	public static ListFaceGroupsResponse unmarshall(ListFaceGroupsResponse listFaceGroupsResponse, UnmarshallerContext context) {
		
		listFaceGroupsResponse.setRequestId(context.stringValue("ListFaceGroupsResponse.RequestId"));
		listFaceGroupsResponse.setNextMarker(context.stringValue("ListFaceGroupsResponse.NextMarker"));

		List<FaceGroupsItem> faceGroups = new ArrayList<FaceGroupsItem>();
		for (int i = 0; i < context.lengthValue("ListFaceGroupsResponse.FaceGroups.Length"); i++) {
			FaceGroupsItem faceGroupsItem = new FaceGroupsItem();
			faceGroupsItem.setGroupId(context.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].GroupId"));
			faceGroupsItem.setGroupName(context.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].GroupName"));
			faceGroupsItem.setFaceCount(context.integerValue("ListFaceGroupsResponse.FaceGroups["+ i +"].FaceCount"));
			faceGroupsItem.setCreateTime(context.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].CreateTime"));
			faceGroupsItem.setModifyTime(context.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].ModifyTime"));

			GroupCoverFace groupCoverFace = new GroupCoverFace();
			groupCoverFace.setFaceId(context.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].GroupCoverFace.FaceId"));
			groupCoverFace.setImageUri(context.stringValue("ListFaceGroupsResponse.FaceGroups["+ i +"].GroupCoverFace.ImageUri"));

			FaceBoundary faceBoundary = new FaceBoundary();
			faceBoundary.setLeft(context.integerValue("ListFaceGroupsResponse.FaceGroups["+ i +"].GroupCoverFace.FaceBoundary.Left"));
			faceBoundary.setTop(context.integerValue("ListFaceGroupsResponse.FaceGroups["+ i +"].GroupCoverFace.FaceBoundary.Top"));
			faceBoundary.setWidth(context.integerValue("ListFaceGroupsResponse.FaceGroups["+ i +"].GroupCoverFace.FaceBoundary.Width"));
			faceBoundary.setHeight(context.integerValue("ListFaceGroupsResponse.FaceGroups["+ i +"].GroupCoverFace.FaceBoundary.Height"));
			groupCoverFace.setFaceBoundary(faceBoundary);
			faceGroupsItem.setGroupCoverFace(groupCoverFace);

			faceGroups.add(faceGroupsItem);
		}
		listFaceGroupsResponse.setFaceGroups(faceGroups);
	 
	 	return listFaceGroupsResponse;
	}
}