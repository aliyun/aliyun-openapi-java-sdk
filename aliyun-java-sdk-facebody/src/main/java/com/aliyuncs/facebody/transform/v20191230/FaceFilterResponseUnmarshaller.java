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

import com.aliyuncs.facebody.model.v20191230.FaceFilterResponse;
import com.aliyuncs.facebody.model.v20191230.FaceFilterResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class FaceFilterResponseUnmarshaller {

	public static FaceFilterResponse unmarshall(FaceFilterResponse faceFilterResponse, UnmarshallerContext _ctx) {
		
		faceFilterResponse.setRequestId(_ctx.stringValue("FaceFilterResponse.RequestId"));

		Data data = new Data();
		data.setImageURL(_ctx.stringValue("FaceFilterResponse.Data.ImageURL"));
		faceFilterResponse.setData(data);
	 
	 	return faceFilterResponse;
	}
}