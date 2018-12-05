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

import com.aliyuncs.imm.model.v20170906.ListImageFacesResponse;
import com.aliyuncs.imm.model.v20170906.ListImageFacesResponse.FacesItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListImageFacesResponseUnmarshaller {

	public static ListImageFacesResponse unmarshall(ListImageFacesResponse listImageFacesResponse, UnmarshallerContext context) {
		
		listImageFacesResponse.setRequestId(context.stringValue("ListImageFacesResponse.RequestId"));
		listImageFacesResponse.setNextMarker(context.stringValue("ListImageFacesResponse.NextMarker"));

		List<FacesItem> faces = new ArrayList<FacesItem>();
		for (int i = 0; i < context.lengthValue("ListImageFacesResponse.Faces.Length"); i++) {
			FacesItem facesItem = new FacesItem();
			facesItem.setGroupId(context.stringValue("ListImageFacesResponse.Faces["+ i +"].GroupId"));
			facesItem.setFaceId(context.stringValue("ListImageFacesResponse.Faces["+ i +"].FaceId"));
			facesItem.setUnGroupReason(context.stringValue("ListImageFacesResponse.Faces["+ i +"].UnGroupReason"));

			faces.add(facesItem);
		}
		listImageFacesResponse.setFaces(faces);
	 
	 	return listImageFacesResponse;
	}
}