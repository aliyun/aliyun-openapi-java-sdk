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

package com.aliyuncs.facebody.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.facebody.model.v20191230.GetFaceEntityResponse;
import com.aliyuncs.facebody.model.v20191230.GetFaceEntityResponse.Data;
import com.aliyuncs.facebody.model.v20191230.GetFaceEntityResponse.Data.Face;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFaceEntityResponseUnmarshaller {

	public static GetFaceEntityResponse unmarshall(GetFaceEntityResponse getFaceEntityResponse, UnmarshallerContext _ctx) {
		
		getFaceEntityResponse.setRequestId(_ctx.stringValue("GetFaceEntityResponse.RequestId"));

		Data data = new Data();
		data.setEntityId(_ctx.stringValue("GetFaceEntityResponse.Data.EntityId"));
		data.setLabels(_ctx.stringValue("GetFaceEntityResponse.Data.Labels"));
		data.setDbName(_ctx.stringValue("GetFaceEntityResponse.Data.DbName"));

		List<Face> faces = new ArrayList<Face>();
		for (int i = 0; i < _ctx.lengthValue("GetFaceEntityResponse.Data.Faces.Length"); i++) {
			Face face = new Face();
			face.setFaceId(_ctx.stringValue("GetFaceEntityResponse.Data.Faces["+ i +"].FaceId"));

			faces.add(face);
		}
		data.setFaces(faces);
		getFaceEntityResponse.setData(data);
	 
	 	return getFaceEntityResponse;
	}
}