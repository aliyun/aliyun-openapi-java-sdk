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
import com.aliyuncs.imm.model.v20170906.FindSimilarFacesResponse.FacesItem.FaceAttributes.FaceBoundary2;
import com.aliyuncs.imm.model.v20170906.FindSimilarFacesResponse.FacesItem.SimilarFacesItem;
import com.aliyuncs.imm.model.v20170906.FindSimilarFacesResponse.FacesItem.SimilarFacesItem.FaceAttributes1;
import com.aliyuncs.imm.model.v20170906.FindSimilarFacesResponse.FacesItem.SimilarFacesItem.FaceAttributes1.FaceBoundary;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindSimilarFacesResponseUnmarshaller {

	public static FindSimilarFacesResponse unmarshall(FindSimilarFacesResponse findSimilarFacesResponse, UnmarshallerContext _ctx) {
		
		findSimilarFacesResponse.setRequestId(_ctx.stringValue("FindSimilarFacesResponse.RequestId"));

		List<FacesItem> faces = new ArrayList<FacesItem>();
		for (int i = 0; i < _ctx.lengthValue("FindSimilarFacesResponse.Faces.Length"); i++) {
			FacesItem facesItem = new FacesItem();
			facesItem.setFaceId(_ctx.stringValue("FindSimilarFacesResponse.Faces["+ i +"].FaceId"));
			facesItem.setImageUri(_ctx.stringValue("FindSimilarFacesResponse.Faces["+ i +"].ImageUri"));
			facesItem.setSimilarity(_ctx.floatValue("FindSimilarFacesResponse.Faces["+ i +"].Similarity"));
			facesItem.setExternalId(_ctx.stringValue("FindSimilarFacesResponse.Faces["+ i +"].ExternalId"));

			FaceAttributes faceAttributes = new FaceAttributes();

			FaceBoundary2 faceBoundary2 = new FaceBoundary2();
			faceBoundary2.setLeft(_ctx.integerValue("FindSimilarFacesResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Left"));
			faceBoundary2.setTop(_ctx.integerValue("FindSimilarFacesResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Top"));
			faceBoundary2.setWidth(_ctx.integerValue("FindSimilarFacesResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Width"));
			faceBoundary2.setHeight(_ctx.integerValue("FindSimilarFacesResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Height"));
			faceAttributes.setFaceBoundary2(faceBoundary2);
			facesItem.setFaceAttributes(faceAttributes);

			List<SimilarFacesItem> similarFaces = new ArrayList<SimilarFacesItem>();
			for (int j = 0; j < _ctx.lengthValue("FindSimilarFacesResponse.Faces["+ i +"].SimilarFaces.Length"); j++) {
				SimilarFacesItem similarFacesItem = new SimilarFacesItem();
				similarFacesItem.setFaceId(_ctx.stringValue("FindSimilarFacesResponse.Faces["+ i +"].SimilarFaces["+ j +"].FaceId"));
				similarFacesItem.setImageUri(_ctx.stringValue("FindSimilarFacesResponse.Faces["+ i +"].SimilarFaces["+ j +"].ImageUri"));
				similarFacesItem.setSimilarity(_ctx.floatValue("FindSimilarFacesResponse.Faces["+ i +"].SimilarFaces["+ j +"].Similarity"));
				similarFacesItem.setExternalId(_ctx.stringValue("FindSimilarFacesResponse.Faces["+ i +"].SimilarFaces["+ j +"].ExternalId"));

				FaceAttributes1 faceAttributes1 = new FaceAttributes1();

				FaceBoundary faceBoundary = new FaceBoundary();
				faceBoundary.setLeft(_ctx.integerValue("FindSimilarFacesResponse.Faces["+ i +"].SimilarFaces["+ j +"].FaceAttributes.FaceBoundary.Left"));
				faceBoundary.setTop(_ctx.integerValue("FindSimilarFacesResponse.Faces["+ i +"].SimilarFaces["+ j +"].FaceAttributes.FaceBoundary.Top"));
				faceBoundary.setWidth(_ctx.integerValue("FindSimilarFacesResponse.Faces["+ i +"].SimilarFaces["+ j +"].FaceAttributes.FaceBoundary.Width"));
				faceBoundary.setHeight(_ctx.integerValue("FindSimilarFacesResponse.Faces["+ i +"].SimilarFaces["+ j +"].FaceAttributes.FaceBoundary.Height"));
				faceAttributes1.setFaceBoundary(faceBoundary);
				similarFacesItem.setFaceAttributes1(faceAttributes1);

				similarFaces.add(similarFacesItem);
			}
			facesItem.setSimilarFaces(similarFaces);

			faces.add(facesItem);
		}
		findSimilarFacesResponse.setFaces(faces);
	 
	 	return findSimilarFacesResponse;
	}
}