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

import com.aliyuncs.imm.model.v20170906.CompareImageFacesResponse;
import com.aliyuncs.imm.model.v20170906.CompareImageFacesResponse.FaceA;
import com.aliyuncs.imm.model.v20170906.CompareImageFacesResponse.FaceA.FaceAttributes;
import com.aliyuncs.imm.model.v20170906.CompareImageFacesResponse.FaceA.FaceAttributes.FaceBoundary;
import com.aliyuncs.imm.model.v20170906.CompareImageFacesResponse.FaceB;
import com.aliyuncs.imm.model.v20170906.CompareImageFacesResponse.FaceB.FaceAttributes1;
import com.aliyuncs.imm.model.v20170906.CompareImageFacesResponse.FaceB.FaceAttributes1.FaceBoundary2;
import com.aliyuncs.transform.UnmarshallerContext;


public class CompareImageFacesResponseUnmarshaller {

	public static CompareImageFacesResponse unmarshall(CompareImageFacesResponse compareImageFacesResponse, UnmarshallerContext _ctx) {
		
		compareImageFacesResponse.setRequestId(_ctx.stringValue("CompareImageFacesResponse.RequestId"));
		compareImageFacesResponse.setSetId(_ctx.stringValue("CompareImageFacesResponse.SetId"));
		compareImageFacesResponse.setSimilarity(_ctx.floatValue("CompareImageFacesResponse.Similarity"));

		FaceA faceA = new FaceA();
		faceA.setFaceId(_ctx.stringValue("CompareImageFacesResponse.FaceA.FaceId"));

		FaceAttributes faceAttributes = new FaceAttributes();

		FaceBoundary faceBoundary = new FaceBoundary();
		faceBoundary.setLeft(_ctx.integerValue("CompareImageFacesResponse.FaceA.FaceAttributes.FaceBoundary.Left"));
		faceBoundary.setTop(_ctx.integerValue("CompareImageFacesResponse.FaceA.FaceAttributes.FaceBoundary.Top"));
		faceBoundary.setWidth(_ctx.integerValue("CompareImageFacesResponse.FaceA.FaceAttributes.FaceBoundary.Width"));
		faceBoundary.setHeight(_ctx.integerValue("CompareImageFacesResponse.FaceA.FaceAttributes.FaceBoundary.Height"));
		faceAttributes.setFaceBoundary(faceBoundary);
		faceA.setFaceAttributes(faceAttributes);
		compareImageFacesResponse.setFaceA(faceA);

		FaceB faceB = new FaceB();
		faceB.setFaceId(_ctx.stringValue("CompareImageFacesResponse.FaceB.FaceId"));

		FaceAttributes1 faceAttributes1 = new FaceAttributes1();

		FaceBoundary2 faceBoundary2 = new FaceBoundary2();
		faceBoundary2.setLeft(_ctx.integerValue("CompareImageFacesResponse.FaceB.FaceAttributes.FaceBoundary.Left"));
		faceBoundary2.setTop(_ctx.integerValue("CompareImageFacesResponse.FaceB.FaceAttributes.FaceBoundary.Top"));
		faceBoundary2.setWidth(_ctx.integerValue("CompareImageFacesResponse.FaceB.FaceAttributes.FaceBoundary.Width"));
		faceBoundary2.setHeight(_ctx.integerValue("CompareImageFacesResponse.FaceB.FaceAttributes.FaceBoundary.Height"));
		faceAttributes1.setFaceBoundary2(faceBoundary2);
		faceB.setFaceAttributes1(faceAttributes1);
		compareImageFacesResponse.setFaceB(faceB);
	 
	 	return compareImageFacesResponse;
	}
}