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

import com.aliyuncs.imm.model.v20170906.FindSimilarFacesResponse;
import com.aliyuncs.imm.model.v20170906.FindSimilarFacesResponse.FacesItem;
import com.aliyuncs.imm.model.v20170906.FindSimilarFacesResponse.FacesItem.FaceAttributes;
import com.aliyuncs.imm.model.v20170906.FindSimilarFacesResponse.FacesItem.FaceAttributes.FaceBoundary;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindSimilarFacesResponseUnmarshaller {

	public static FindSimilarFacesResponse unmarshall(FindSimilarFacesResponse findSimilarFacesResponse, UnmarshallerContext context) {
		
		findSimilarFacesResponse.setRequestId(context.stringValue("FindSimilarFacesResponse.RequestId"));

		List<FacesItem> faces = new ArrayList<FacesItem>();
		for (int i = 0; i < context.lengthValue("FindSimilarFacesResponse.Faces.Length"); i++) {
			FacesItem facesItem = new FacesItem();
			facesItem.setFaceId(context.stringValue("FindSimilarFacesResponse.Faces["+ i +"].FaceId"));
			facesItem.setImageUri(context.stringValue("FindSimilarFacesResponse.Faces["+ i +"].ImageUri"));
			facesItem.setSimilarity(context.floatValue("FindSimilarFacesResponse.Faces["+ i +"].Similarity"));

			FaceAttributes faceAttributes = new FaceAttributes();

			FaceBoundary faceBoundary = new FaceBoundary();
			faceBoundary.setLeft(context.integerValue("FindSimilarFacesResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Left"));
			faceBoundary.setTop(context.integerValue("FindSimilarFacesResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Top"));
			faceBoundary.setWidth(context.integerValue("FindSimilarFacesResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Width"));
			faceBoundary.setHeight(context.integerValue("FindSimilarFacesResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Height"));
			faceAttributes.setFaceBoundary(faceBoundary);
			facesItem.setFaceAttributes(faceAttributes);

			faces.add(facesItem);
		}
		findSimilarFacesResponse.setFaces(faces);
	 
	 	return findSimilarFacesResponse;
	}
}