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

import com.aliyuncs.facebody.model.v20191230.LiquifyFaceResponse;
import com.aliyuncs.facebody.model.v20191230.LiquifyFaceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class LiquifyFaceResponseUnmarshaller {

	public static LiquifyFaceResponse unmarshall(LiquifyFaceResponse liquifyFaceResponse, UnmarshallerContext _ctx) {
		
		liquifyFaceResponse.setRequestId(_ctx.stringValue("LiquifyFaceResponse.RequestId"));
		liquifyFaceResponse.setCode(_ctx.stringValue("LiquifyFaceResponse.Code"));
		liquifyFaceResponse.setMessage(_ctx.stringValue("LiquifyFaceResponse.Message"));

		Data data = new Data();
		data.setImageURL(_ctx.stringValue("LiquifyFaceResponse.Data.ImageURL"));
		liquifyFaceResponse.setData(data);
	 
	 	return liquifyFaceResponse;
	}
}