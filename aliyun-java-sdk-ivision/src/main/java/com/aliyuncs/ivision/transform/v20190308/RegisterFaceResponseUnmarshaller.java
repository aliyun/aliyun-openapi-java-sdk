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

package com.aliyuncs.ivision.transform.v20190308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ivision.model.v20190308.RegisterFaceResponse;
import com.aliyuncs.ivision.model.v20190308.RegisterFaceResponse.Face;
import com.aliyuncs.ivision.model.v20190308.RegisterFaceResponse.Face.Rect;
import com.aliyuncs.transform.UnmarshallerContext;


public class RegisterFaceResponseUnmarshaller {

	public static RegisterFaceResponse unmarshall(RegisterFaceResponse registerFaceResponse, UnmarshallerContext _ctx) {
		
		registerFaceResponse.setRequestId(_ctx.stringValue("RegisterFaceResponse.RequestId"));
		registerFaceResponse.setGroupId(_ctx.stringValue("RegisterFaceResponse.GroupId"));

		List<Face> faces = new ArrayList<Face>();
		for (int i = 0; i < _ctx.lengthValue("RegisterFaceResponse.Faces.Length"); i++) {
			Face face = new Face();
			face.setFaceToken(_ctx.stringValue("RegisterFaceResponse.Faces["+ i +"].FaceToken"));

			Rect rect = new Rect();
			rect.setTop(_ctx.integerValue("RegisterFaceResponse.Faces["+ i +"].Rect.Top"));
			rect.setWidth(_ctx.integerValue("RegisterFaceResponse.Faces["+ i +"].Rect.Width"));
			rect.setHeight(_ctx.integerValue("RegisterFaceResponse.Faces["+ i +"].Rect.Height"));
			rect.setLeft(_ctx.integerValue("RegisterFaceResponse.Faces["+ i +"].Rect.Left"));
			face.setRect(rect);

			faces.add(face);
		}
		registerFaceResponse.setFaces(faces);
	 
	 	return registerFaceResponse;
	}
}