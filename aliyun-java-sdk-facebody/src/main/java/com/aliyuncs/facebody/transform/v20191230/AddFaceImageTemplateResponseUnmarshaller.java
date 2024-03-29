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

import com.aliyuncs.facebody.model.v20191230.AddFaceImageTemplateResponse;
import com.aliyuncs.facebody.model.v20191230.AddFaceImageTemplateResponse.Data;
import com.aliyuncs.facebody.model.v20191230.AddFaceImageTemplateResponse.Data.FaceInfosItem;
import com.aliyuncs.facebody.model.v20191230.AddFaceImageTemplateResponse.Data.FaceInfosItem.FaceRect;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddFaceImageTemplateResponseUnmarshaller {

	public static AddFaceImageTemplateResponse unmarshall(AddFaceImageTemplateResponse addFaceImageTemplateResponse, UnmarshallerContext _ctx) {
		
		addFaceImageTemplateResponse.setRequestId(_ctx.stringValue("AddFaceImageTemplateResponse.RequestId"));
		addFaceImageTemplateResponse.setCode(_ctx.stringValue("AddFaceImageTemplateResponse.Code"));
		addFaceImageTemplateResponse.setMessage(_ctx.stringValue("AddFaceImageTemplateResponse.Message"));

		Data data = new Data();
		data.setTemplateId(_ctx.stringValue("AddFaceImageTemplateResponse.Data.TemplateId"));

		List<FaceInfosItem> faceInfos = new ArrayList<FaceInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("AddFaceImageTemplateResponse.Data.FaceInfos.Length"); i++) {
			FaceInfosItem faceInfosItem = new FaceInfosItem();
			faceInfosItem.setTemplateFaceID(_ctx.stringValue("AddFaceImageTemplateResponse.Data.FaceInfos["+ i +"].TemplateFaceID"));

			FaceRect faceRect = new FaceRect();
			faceRect.setX(_ctx.stringValue("AddFaceImageTemplateResponse.Data.FaceInfos["+ i +"].FaceRect.X"));
			faceRect.setY(_ctx.stringValue("AddFaceImageTemplateResponse.Data.FaceInfos["+ i +"].FaceRect.Y"));
			faceRect.setHeight(_ctx.stringValue("AddFaceImageTemplateResponse.Data.FaceInfos["+ i +"].FaceRect.Height"));
			faceRect.setWidth(_ctx.stringValue("AddFaceImageTemplateResponse.Data.FaceInfos["+ i +"].FaceRect.Width"));
			faceInfosItem.setFaceRect(faceRect);

			faceInfos.add(faceInfosItem);
		}
		data.setFaceInfos(faceInfos);
		addFaceImageTemplateResponse.setData(data);
	 
	 	return addFaceImageTemplateResponse;
	}
}