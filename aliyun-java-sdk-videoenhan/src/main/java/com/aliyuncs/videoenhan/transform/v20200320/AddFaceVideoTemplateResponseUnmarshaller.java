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

package com.aliyuncs.videoenhan.transform.v20200320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.videoenhan.model.v20200320.AddFaceVideoTemplateResponse;
import com.aliyuncs.videoenhan.model.v20200320.AddFaceVideoTemplateResponse.Date;
import com.aliyuncs.videoenhan.model.v20200320.AddFaceVideoTemplateResponse.Date.FaceInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddFaceVideoTemplateResponseUnmarshaller {

	public static AddFaceVideoTemplateResponse unmarshall(AddFaceVideoTemplateResponse addFaceVideoTemplateResponse, UnmarshallerContext _ctx) {
		
		addFaceVideoTemplateResponse.setRequestId(_ctx.stringValue("AddFaceVideoTemplateResponse.RequestId"));
		addFaceVideoTemplateResponse.setCode(_ctx.stringValue("AddFaceVideoTemplateResponse.Code"));
		addFaceVideoTemplateResponse.setMessage(_ctx.stringValue("AddFaceVideoTemplateResponse.Message"));

		Date date = new Date();
		date.setTemplateId(_ctx.stringValue("AddFaceVideoTemplateResponse.Date.TemplateId"));
		date.setTransResult(_ctx.stringValue("AddFaceVideoTemplateResponse.Date.TransResult"));

		List<FaceInfosItem> faceInfos = new ArrayList<FaceInfosItem>();
		for (int i = 0; i < _ctx.lengthValue("AddFaceVideoTemplateResponse.Date.FaceInfos.Length"); i++) {
			FaceInfosItem faceInfosItem = new FaceInfosItem();
			faceInfosItem.setTemplateFaceID(_ctx.stringValue("AddFaceVideoTemplateResponse.Date.FaceInfos["+ i +"].TemplateFaceID"));
			faceInfosItem.setTemplateFaceURL(_ctx.stringValue("AddFaceVideoTemplateResponse.Date.FaceInfos["+ i +"].TemplateFaceURL"));

			faceInfos.add(faceInfosItem);
		}
		date.setFaceInfos(faceInfos);
		addFaceVideoTemplateResponse.setDate(date);
	 
	 	return addFaceVideoTemplateResponse;
	}
}