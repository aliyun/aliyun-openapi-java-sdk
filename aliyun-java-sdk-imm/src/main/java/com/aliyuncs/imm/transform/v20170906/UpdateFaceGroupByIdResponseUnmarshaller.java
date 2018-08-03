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

import com.aliyuncs.imm.model.v20170906.UpdateFaceGroupByIdResponse;
import com.aliyuncs.imm.model.v20170906.UpdateFaceGroupByIdResponse.FacesItem;
import com.aliyuncs.imm.model.v20170906.UpdateFaceGroupByIdResponse.FailUpdateDetailItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateFaceGroupByIdResponseUnmarshaller {

	public static UpdateFaceGroupByIdResponse unmarshall(UpdateFaceGroupByIdResponse updateFaceGroupByIdResponse, UnmarshallerContext context) {
		
		updateFaceGroupByIdResponse.setRequestId(context.stringValue("UpdateFaceGroupByIdResponse.RequestId"));
		updateFaceGroupByIdResponse.setSetId(context.stringValue("UpdateFaceGroupByIdResponse.SetId"));

		List<FailUpdateDetailItem> failUpdateDetail = new ArrayList<FailUpdateDetailItem>();
		for (int i = 0; i < context.lengthValue("UpdateFaceGroupByIdResponse.FailUpdateDetail.Length"); i++) {
			FailUpdateDetailItem failUpdateDetailItem = new FailUpdateDetailItem();
			failUpdateDetailItem.setFaceId(context.stringValue("UpdateFaceGroupByIdResponse.FailUpdateDetail["+ i +"].FaceId"));
			failUpdateDetailItem.setReason(context.stringValue("UpdateFaceGroupByIdResponse.FailUpdateDetail["+ i +"].Reason"));

			failUpdateDetail.add(failUpdateDetailItem);
		}
		updateFaceGroupByIdResponse.setFailUpdateDetail(failUpdateDetail);

		List<FacesItem> faces = new ArrayList<FacesItem>();
		for (int i = 0; i < context.lengthValue("UpdateFaceGroupByIdResponse.Faces.Length"); i++) {
			FacesItem facesItem = new FacesItem();
			facesItem.setFaceId(context.stringValue("UpdateFaceGroupByIdResponse.Faces["+ i +"].FaceId"));
			facesItem.setGroupId(context.stringValue("UpdateFaceGroupByIdResponse.Faces["+ i +"].GroupId"));

			faces.add(facesItem);
		}
		updateFaceGroupByIdResponse.setFaces(faces);
	 
	 	return updateFaceGroupByIdResponse;
	}
}